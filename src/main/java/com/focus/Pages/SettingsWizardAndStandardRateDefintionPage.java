package com.focus.Pages;


import static org.testng.Assert.expectThrows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;
import com.gargoylesoftware.htmlunit.WaitingRefreshHandler;
import com.steadystate.css.parser.selectors.SyntheticElementSelectorImpl;


public class SettingsWizardAndStandardRateDefintionPage extends BaseEngine 
{
	
	@FindBy(xpath="//div[contains(text(),'Settings')]")
	private static WebElement  settingsmenuBtn;

	 @FindBy(xpath="//*[@id='0']")
	 private static WebElement generalInSettingwizard;
	
	 @FindBy(xpath="//*[@id='1']")
	 private static WebElement vatInSettingwizard;
	
	 @FindBy(xpath="//*[@id='SettingWizardUL']/li[2]/a")
	 private static WebElement posInSettingwizard;
		 
	 @FindBy(xpath="//*[@id='SettingWizardUL']/li[3]/a")
	 private static WebElement inventoryInSettingwizard;
	 
	 @FindBy(xpath="//*[@id='SettingWizardUL']/li[4]/a")
	 private static WebElement financialInSettingwizard;

	 @FindBy(xpath="//*[@id='SettingWizardUL']/li[5]/a")
	 private static WebElement tdsInSettingwizard;
	
	 @FindBy(xpath="//*[@id='SettingWizardUL']/li[6]/a")
	 private static WebElement wmsInSettingwizard;
	
	 @FindBy(xpath="//*[@id='SettingWizardUL']/li[7]/a")
	 private static WebElement gstInSettingwizard;
	
	 @FindBy(xpath="//*[@id='SettingWizardUL']/li[8]/a")
	 private static WebElement mrpOneInSettingwizard;
	
	 @FindBy(xpath="//*[@id='SettingWizardUL']/li[9]/a")
	 private static WebElement mrpTwoInSettingwizard;
	

	 @FindBy(xpath="//*[@id='SettingWizardUL']/li")
	 private static List<WebElement> settingWizardULList;
	 
	 
	 @FindBy(xpath="//*[@id='105']/span")
	 private static WebElement  settingsSettingsWizard;
	 
	 //Validation and Confirmation messages
	 @FindBy(xpath="//div[@class='theme_color font-6']")
	 public static WebElement errorMessage;
	 
	 @FindBy(xpath="//span[@class='icon-reject2 theme_color']")
	 public static WebElement errorMessageCloseBtn;
	
	 //Dash board Page
	 @FindBy(xpath="//*[@id='dashName']")
     private static WebElement labelDashboard ;
	
	 @FindBy(xpath="//*[@id='Select_dash']")
	 private static WebElement selectDashboard ;
		
	 @FindBy(xpath="//*[@id='Dashboard_AddDash']")
     private static WebElement newAddDashBoard;
	 
     @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
     private static WebElement dashboardCustomizationSettings;
     
     @FindBy(xpath = "//*[@id='txtUsername']")
 	 private static WebElement username;
	 
     @FindBy(id="txtPassword")
	 private static WebElement password;
	 
	 
	 private static String xlfile;
	 private static String resPass="Pass";
	 private static String resFail="Fail";
	 private static ExcelReader excelReader;
	 
	 private static String xlSheetName = "SettingsWizardAndStandardRate";
	 
	 

	  public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	  {
		try
		{
			getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
			String actErrorMessage=errorMessage.getText();
			String expErrorMessage=ExpMessage;
			
			try
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
				errorMessageCloseBtn.click();
				
				System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
				
				return actErrorMessage;
			}
			catch(Exception ee)
			{
				
				System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
				
				return actErrorMessage;
			}
		}
		catch(Exception e)
		{
			System.err.println("Error Message NOT Found or NOT Clickable");
			System.err.println(e.getMessage());
	                
			String Exception=e.getMessage();
			
			return Exception;	
		} 
	  }	
	
	  
	  
	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboard;
	  
	public boolean checkLoginToCheckMasterSettingWizardVATAndStandardRate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
    {
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		/* getDriver().navigate().refresh();
		 Thread.sleep(3000);
		 
		 getDriver().navigate().refresh();
		 Thread.sleep(3000);
		*/	
		
		LoginPage lp=new LoginPage(getDriver()); 
			
	    String unamelt="su";
	      
	    String pawslt="su";
	      
        lp.enterUserName(unamelt);

        lp.enterPassword(pawslt);
 
        lp.clickOnSignInBtn();         
        Thread.sleep(9000); 
       
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
 		String actUserInfo                      = userNameDisplay.getText();
 		String expUserInfo                      ="SU";
 		
 		System.out.println("User Name Display Value Actual                   : " + actUserInfo +             " Value Expected : " + expUserInfo);
	
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
	   companyLogo.click();
	   String actLoginCompanyTxt=companyName.getText();
	      	 
	   String getLoginCompanyName=actLoginCompanyTxt.substring(0, 19);
	   String expLoginCompanyTxt="Automation Company ";
	   	 
	   System.out.println("User Name Display Value Actual                   : " + getLoginCompanyName +             " Value Expected : " + expLoginCompanyTxt);
	
	   System.out.println("company name :"+ getLoginCompanyName);
	   companyLogo.click();
	   	
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
	   String actGetDashboard =dashboard.getText();
	   String expGetDashboard ="Dashboard";
	   
	   System.out.println("User Name Display Value Actual                   : " + actGetDashboard +             " Value Expected : " + expGetDashboard);

		  if(actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.equalsIgnoreCase(expLoginCompanyTxt) &&
				  actGetDashboard.equalsIgnoreCase(expGetDashboard))
		  {
				excelReader.setCellData(xlfile, "Sheet1", 7, 9, resPass);
				return true;
		  }
		  else
		  {
				excelReader.setCellData(xlfile, "Sheet1", 7, 9, resFail);
				return true;
		  }
  }
		
	
	
	@FindBy(xpath="//*[@id='txtSearchMenu_MainLayout']")
    private static WebElement serachMenuTextHomePage;
	
	@FindBy(xpath="//li/span")
    private static WebElement searchMenuTextClick;
	
	  
		 
	public boolean checkOpenSettingWizardPageIsOpen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		System.out.println("********************* checkOpenSettingWizardPageIsOpen Method Executes.............   *****************************");
		
		try
		{		
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
			System.out.println("Setting buton is  enabled");
			serachMenuTextHomePage.click();
			serachMenuTextHomePage.sendKeys("Settings Wizard");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
			searchMenuTextClick.click();
	    	 
	    	 
			Thread.sleep(2000);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mrpTwoInSettingwizard));
			
			boolean actGeneralOption                    = generalInSettingwizard.isDisplayed();
			boolean actVatOption                        = vatInSettingwizard.isDisplayed();
			boolean actPosOption                        = posInSettingwizard.isDisplayed();
			boolean actInventoryOption                  = inventoryInSettingwizard.isDisplayed();
			boolean actFinancialOption                  = financialInSettingwizard.isDisplayed();
			boolean actTdsOption                        = tdsInSettingwizard.isDisplayed();       
			boolean actwmsOption                        = wmsInSettingwizard.isDisplayed();       
			boolean actgstOption                        = gstInSettingwizard.isDisplayed();       
			boolean actmrpOneOption                     = mrpOneInSettingwizard.isDisplayed();
			boolean actmrpTwoOption                     = mrpTwoInSettingwizard.isDisplayed();       
	     
			boolean expGeneralOption                    = true;
			boolean expVatOption                        = true;
			boolean expPosOption                        = true;
			boolean expInventoryOption                  = true;
			boolean expFinancialOption                  = true;
			boolean expTdsOption                        = true;       
			boolean expwmsOption                        = true;       
			boolean expgstOption                        = true;       
			boolean expmrpOneOption                     = true;
			boolean expmrpTwoOption                     = true;;      
	      
			System.out.println("General Value Actual                  : " + actGeneralOption +      " Value Expected : " + expGeneralOption);
			System.out.println("VAT Value Actual                      : " + actVatOption +          " Value Expected : " + expVatOption);
			System.out.println("POS Value Actual                      : " + actPosOption +          " Value Expected : " + expPosOption);
			System.out.println("Inventory Value Actual                : " + actInventoryOption +    " Value Expected : " + expInventoryOption);
			System.out.println("Financial Value Actual                : " + actFinancialOption +    " Value Expected : " + expFinancialOption);
			System.out.println("TDS Value Actual                      : " + actTdsOption +          " Value Expected : " + expTdsOption);     
			System.out.println("WMS Value Actual                      : " + actwmsOption +          " Value Expected : " + expwmsOption);
			System.out.println("GST Value Actual                      : " + actgstOption +          " Value Expected : " + expgstOption);
			System.out.println("MRP One Value Actual                  : " + actmrpOneOption +       " Value Expected : " + expmrpOneOption);
			System.out.println("MRP Two Value Actual                  : " + actmrpTwoOption +       " Value Expected : " + expmrpTwoOption);
			
	      
			ArrayList<String>actsettingWizardULList=new ArrayList<String>();
			
			int settingWizardULListCount=settingWizardULList.size();
				
			System.out.println(" settingWizardULListCount  :  "+settingWizardULListCount);
				
			for (int i = 0; i < settingWizardULListCount; i++)
			{
				String data=settingWizardULList.get(i).getText();
				actsettingWizardULList.add(data);
			}
				
			String actsettingWizardUL=actsettingWizardULList.toString();
			String expsettingWizardUL=excelReader.getCellData(xlSheetName, 8, 7);
				
			System.err.println("  Actual settingWizardULList : "+actsettingWizardUL);
			System.err.println("  Expected  settingWizardULList : "+expsettingWizardUL);
				
			excelReader.setCellData(xlfile, xlSheetName, 8, 8, actsettingWizardUL);
	      
	      
			if(actGeneralOption==expGeneralOption && actVatOption==expVatOption 
		
					&& actPosOption==expPosOption && actInventoryOption==expInventoryOption 
					&& actFinancialOption==expFinancialOption && actTdsOption==expTdsOption
					&& actwmsOption==expwmsOption && actgstOption==expgstOption 
					&& expgstOption==expmrpOneOption && actmrpTwoOption==expmrpTwoOption && 
					
					actsettingWizardUL.endsWith(expsettingWizardUL)) 
			{
				excelReader.setCellData(xlfile, xlSheetName, 7, 9, resPass);
				return true;
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 7, 9, resFail);
				return false;
			}
		}
		catch (Exception e) 
		{
			excelReader.setExceptionInExcel(xlfile, xlSheetName, 7, 10, e.getMessage());
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
			return false;
		}	
	}

	
	@FindBy(xpath="//div[@id='dvSettingWizard']//li[1]/a")
	private static WebElement  settingsWizardGeneralBtn;
	
	@FindBy(xpath="//div[@id='dvSettingWizard']//li[2]/a")
	private static WebElement  settingsWizardVATBtn;
	
	@FindBy(xpath="//div[@id='dvSettingWizard']//li[3]/a")
	private static WebElement  settingsWizardPOSBtn;
	
	@FindBy(xpath="//div[@id='dvSettingWizard']//li[4]/a")
	private static WebElement  settingsWizardInventoryBtn;
	
	@FindBy(xpath="//div[@id='dvSettingWizard']//li[5]/a")
	private static WebElement  settingsWizardFinancialBtn;
	
	@FindBy(xpath="//div[@id='dvSettingWizard']//li[6]/a")
	private static WebElement  settingsWizardTDSBtn;
	
	@FindBy(xpath="//div[@id='dvSettingWizard']//li[7]/a")
	private static WebElement  settingsWizardWMSBtn;
	
	@FindBy(xpath="//div[@id='dvSettingWizard']//li[8]/a")
	private static WebElement  settingsWizardGSTBtn;
	
	@FindBy(xpath="//div[@id='dvSettingWizard']//li[9]/a")
	private static WebElement  settingsWizardMRP1Btn;
	
	@FindBy(xpath="//div[@id='dvSettingWizard']//li[10]/a")
	private static WebElement  settingsWizardMRP2Btn;
	
	@FindBy(xpath="//div[@class='Fcheckbox col-xs-12 col-sm-8']//label[1]/input")
	private static WebElement  settingsWizardVATActivateVATChkbox;
	
	@FindBy(xpath="//div[@id='dvRightSettingWizard']/div[2]/div[1]/div/div/label")
	private static List<WebElement> settingsWizardVATVouchersList;
	
	@FindBy(xpath="//div[@id='dvRightSettingWizard']/div[2]/div[1]/div/div/label/input")
	private static List<WebElement> settingsWizardVATVoucherChkboxList;
	
	@FindBy(xpath="//div[@id='dvSelectedVouchers']/div/label")
	private static List<WebElement> settingsWizardVATSelectedVouchersList;
	
	@FindBy(xpath="//div[@id='dvSelectedVouchers']")
	private static WebElement settingsWizardVATSelectedVouchersListEmpty;
	
	
	@FindBy(xpath="//label[contains(text(),'Gross')]/input")
	private static WebElement settingsWizardVATGrossChkbox;
	
	@FindBy(xpath="//label[contains(text(),'RD')]/input")
	private static WebElement settingsWizardVATRDChkbox;
	
	@FindBy(xpath="//label[(text()='Avg Rate')]/input")
	private static WebElement settingsWizardVATAvgRateChkbox;
	
	@FindBy(xpath="//label[(text()='Avg Rate(O)')]/input")
	private static WebElement settingsWizardVATAvgRateOChkbox;
	
	@FindBy(xpath="//label[(text()='AQ')]/input")
	private static WebElement settingsWizardVATAQChkbox;
	
	@FindBy(xpath="//label[(text()='FQ')]/input")
	private static WebElement settingsWizardVATFQChkbox;
	
	@FindBy(xpath="//label[(text()='VAT')]/input")
	private static WebElement settingsWizardVATChkbox;
	
	@FindBy(xpath="//label[(text()='Taxable')]/input")
	private static WebElement settingsWizardTaxableChkbox;
	
	@FindBy(xpath="//span[@class='icon-update icon-font6']")
	private static WebElement settingsWizardUpdateBtn;
	
	@FindBy(xpath="//*[@id='myNavbarVATAuditFile']/ul/li/div[2]/div[1]/span")
	private static WebElement settingsWizardVAtCloseBtn;
	
	@FindBy(xpath="//input[@id='chkVATInclusive']")
	private static WebElement settingsWizardVATInclusiveChkbox;
	
	
		
		
	
	
	
	public boolean checkSaveVatOptionsInSettingsWizard() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		 
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		try
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVATBtn));
			settingsWizardVATBtn.click();
			
			Thread.sleep(5000);
			
			int actVouchersCount		=settingsWizardVATVouchersList.size();
			int expVouchersCount		=56;//57
			
			for (int i = 0; i < actVouchersCount; i++) 
			{
				String data=settingsWizardVATVouchersList.get(i).getText();
				
				int sl=i+1;
				
				
				if (data.contains("VAT")) 
				{
					System.out.println("VAT VOUCHER LIST :"+settingsWizardVATVouchersList.get(i).getText());
					settingsWizardVATVouchersList.get(i).click();
				}
			}
			
			
			int actVoucherChkboxList			=settingsWizardVATVoucherChkboxList.size();
			
			int selectedVouchersCount			=0;
			
			for (int i = 0; i < actVoucherChkboxList; i++) 
			{
				boolean selected=settingsWizardVATVoucherChkboxList.get(i).isSelected();
				
				if (selected) 
				{
					selectedVouchersCount=selectedVouchersCount+1;
				}
			}
			
			int actSelectedVouchersCount		=selectedVouchersCount;
			int expSelectedVouchersCount		=settingsWizardVATSelectedVouchersList.size();
			
			boolean actVouchersSelected=true;
			boolean expVouchersSelected=true;
		
			if (actSelectedVouchersCount==expSelectedVouchersCount) 
			{
				Set<String> expSelectedVouchersList= new HashSet<String>();
				  
				expSelectedVouchersList.add("Receipts VAT");
				expSelectedVouchersList.add("Payments VAT");
				expSelectedVouchersList.add("PDR VAT");
				expSelectedVouchersList.add("PDP VAT");
				expSelectedVouchersList.add("Purchase Voucher VAT");
				expSelectedVouchersList.add("Sales invoice VAT");
				expSelectedVouchersList.add("Debit Notes VAT");
				expSelectedVouchersList.add("Credit Notes VAT");
				expSelectedVouchersList.add("JV VAT View");
				  
			  Set<String> actSelectedVouchersList=new HashSet<String>();
			  
			  for (int i = 0; i < expSelectedVouchersCount; i++) 
			  {
				  String voucher=settingsWizardVATSelectedVouchersList.get(i).getText();
				  System.err.println(voucher);
				  actSelectedVouchersList.add(voucher);
			  }
			  
			  System.out.println(actSelectedVouchersList);
			  System.out.println(expSelectedVouchersList);
			  
			  
			  actVouchersSelected=actSelectedVouchersList.equals(expSelectedVouchersList);
			}
			
			
			
			
			for (int i = 0; i < expSelectedVouchersCount; i++) 
			{
			  String voucher=settingsWizardVATSelectedVouchersList.get(i).getText();
			  
			  if (voucher.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 10, 6))) 
			  {
				  settingsWizardVATSelectedVouchersList.get(i).click();
				  break;
			  }
			}
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVATGrossChkbox));
			
			boolean actPurchasesVoucherVATGross				=settingsWizardVATGrossChkbox.isDisplayed();
			
			boolean expPurchasesVoucherVATGross				=true;
			
			settingsWizardVATGrossChkbox.click();
			
			
			
			
			for (int i = 0; i < expSelectedVouchersCount; i++) 
			{
			  String voucher=settingsWizardVATSelectedVouchersList.get(i).getText();
			  
			  if (voucher.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 11, 6))) 
			  {
				  settingsWizardVATSelectedVouchersList.get(i).click();
				  break;
			  }
			}
			
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVATGrossChkbox));
			boolean actPurchasesReturnsVATGross				=settingsWizardVATGrossChkbox.isDisplayed();
			
			boolean expPurchasesReturnsVATGross				=true;
			
			
			settingsWizardVATGrossChkbox.click();
			
			
			
			
			for (int i = 0; i < expSelectedVouchersCount; i++) 
			{
			  String voucher=settingsWizardVATSelectedVouchersList.get(i).getText();
			  
			  if (voucher.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 12, 6))) 
			  {
				  System.err.println("Voucher : "+voucher);
				  settingsWizardVATSelectedVouchersList.get(i).click();
				  break;
			  }
			}
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVATGrossChkbox));
			boolean actSalesInvoiceVATGross				=settingsWizardVATGrossChkbox.isDisplayed();
			
			boolean expSalesInvoiceVATGross				=true;
			
			settingsWizardVATGrossChkbox.click();
		
			
			
			for (int i = 0; i < expSelectedVouchersCount; i++) 
			{
			  String voucher=settingsWizardVATSelectedVouchersList.get(i).getText();
			  
			  if (voucher.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 13, 6))) 
			  {
				  settingsWizardVATSelectedVouchersList.get(i).click();
				  break;
			  }
			}
			
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVATGrossChkbox));
			boolean actSalesReturnsVATGross				=settingsWizardVATGrossChkbox.isDisplayed();
			
			boolean expSalesReturnsVATGross				=true;
			
			settingsWizardVATGrossChkbox.click();
			
			
			
			
			for (int i = 0; i < expSelectedVouchersCount; i++) 
			{
			  String voucher=settingsWizardVATSelectedVouchersList.get(i).getText();
			  
			  if (voucher.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 14, 6))) 
			  {
				  settingsWizardVATSelectedVouchersList.get(i).click();
				  break;
			  }
			}
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVATGrossChkbox));
			
			boolean actReceiptsVATGross				=settingsWizardVATGrossChkbox.isDisplayed();
			
			boolean expReceiptsVATGross				=true;
			
			settingsWizardVATGrossChkbox.click();
			
			
			for (int i = 0; i < expSelectedVouchersCount; i++) 
			{
			  String voucher=settingsWizardVATSelectedVouchersList.get(i).getText();
			  
			  if (voucher.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 15, 6))) 
			  {
				  settingsWizardVATSelectedVouchersList.get(i).click();
				  break;
			  }
			}
			
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVATGrossChkbox));
			
			boolean actPaymentsVATGross				=settingsWizardVATGrossChkbox.isDisplayed();
			
			boolean expPaymentsVATGross				=true;
			
			settingsWizardVATGrossChkbox.click();
			
			
			
			for (int i = 0; i < expSelectedVouchersCount; i++) 
			{
			  String voucher=settingsWizardVATSelectedVouchersList.get(i).getText();
			  
			  if (voucher.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 16, 6))) 
			  {
				  System.err.println("Voucher : "+voucher);
				  settingsWizardVATSelectedVouchersList.get(i).click();
				  break;
			  }
			}
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVATGrossChkbox));
			
			
			boolean actPettyCashVATGross				=settingsWizardVATGrossChkbox.isDisplayed();
			
			boolean expPettyCashVATGross				=true;
			
			settingsWizardVATGrossChkbox.click();
			
			for (int i = 0; i < expSelectedVouchersCount; i++) 
			{
			  String voucher=settingsWizardVATSelectedVouchersList.get(i).getText();
			  
			  if (voucher.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 17, 6))) 
			  {
				  System.err.println("Voucher : "+voucher);
				  settingsWizardVATSelectedVouchersList.get(i).click();
				  break;
			  }
			}
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVATGrossChkbox));
			
			boolean actJVVATGross				=settingsWizardVATGrossChkbox.isDisplayed();
			
			boolean expJVVATGross				=true;
			
			settingsWizardVATGrossChkbox.click();
			
			
			
			for (int i = 0; i < expSelectedVouchersCount; i++) 
			{
			  String voucher=settingsWizardVATSelectedVouchersList.get(i).getText();
			  
			  if (voucher.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 18, 6))) 
			  {
				  System.err.println("Voucher : "+voucher);
				  settingsWizardVATSelectedVouchersList.get(i).click();
				  break;
			  }
			}
			
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVATGrossChkbox));
			
			boolean actNonJVVATGross				=settingsWizardVATGrossChkbox.isDisplayed();
			
			boolean expNonJVVATGross				=true;
			
			settingsWizardVATGrossChkbox.click();
			
			
			
			for (int i = 0; i < expSelectedVouchersCount; i++) 
			{
			  String voucher=settingsWizardVATSelectedVouchersList.get(i).getText();
			  
			  if (voucher.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 19, 6))) 
			  {
				  System.err.println("Voucher : "+voucher);
				  settingsWizardVATSelectedVouchersList.get(i).click();
				  break;
			  }
			}
			
			Thread.sleep(1000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVATGrossChkbox));
			
			boolean actDebitNotesVATGross				=settingsWizardVATGrossChkbox.isDisplayed();
			
			boolean expDebitNotesVATGross				=true;
			
			settingsWizardVATGrossChkbox.click();
			
			
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardUpdateBtn));
			settingsWizardUpdateBtn.click();
			
			String expSaveSettingWizardVATmessage = excelReader.getCellData(xlSheetName, 20, 7);
			 
			 String actSaveSettingWizardVATmessage = checkValidationMessage(expSaveSettingWizardVATmessage);
			 
			 excelReader.setCellData(xlfile, xlSheetName, 20, 8, actSaveSettingWizardVATmessage);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVAtCloseBtn));
			settingsWizardVAtCloseBtn.click();
			
			System.out.println("****************************************************checkSettingsWizard****************************************************");
			
			System.out.println("settingsWizardVATVouchersListCount    : " + actVouchersCount                         + "  value expected  " + expVouchersCount);
			System.out.println("SelectedVouchersCount                 : " + actSelectedVouchersCount                 + "  value expected  " + expSelectedVouchersCount);
			System.out.println("VouchersSelected                      : " + actVouchersSelected                      + "  value expected  " + expVouchersSelected);
			System.out.println("PurchasesVoucherVATGross              : " + actPurchasesVoucherVATGross              + "  value expected  " + expPurchasesVoucherVATGross);
			System.out.println("PurchasesReturnsVATGross              : " + actPurchasesReturnsVATGross              + "  value expected  " + expPurchasesReturnsVATGross);
			System.out.println("SalesInvoiceVATGross                  : " + actSalesInvoiceVATGross                  + "  value expected  " + expSalesInvoiceVATGross);
			System.out.println("SalesReturnsVATGross                  : " + actSalesReturnsVATGross                  + "  value expected  " + expSalesReturnsVATGross);
			System.out.println("ReceiptsVATGross                      : " + actReceiptsVATGross                      + "  value expected  " + expReceiptsVATGross);
			System.out.println("PaymentsVATGross                      : " + actPaymentsVATGross                      + "  value expected  " + expPaymentsVATGross);
			System.out.println("PettyCashVATGross                     : " + actPettyCashVATGross                     + "  value expected  " + expPettyCashVATGross);
			System.out.println("JVVATGross                            : " + actJVVATGross                            + "  value expected  " + expJVVATGross);
			System.out.println("NonJVVATGross                         : " + actNonJVVATGross                         + "  value expected  " + expNonJVVATGross);
			System.out.println("DebitNotesVATGross                    : " + actDebitNotesVATGross                    + "  value expected  " + expDebitNotesVATGross);
			System.out.println("Error Message                         : " + actSaveSettingWizardVATmessage           + "  value expected  " + expSaveSettingWizardVATmessage);
			
			
			boolean displayResult= actSelectedVouchersCount==expSelectedVouchersCount && actVouchersSelected==expVouchersSelected &&
					 actPurchasesVoucherVATGross==expPurchasesVoucherVATGross &&
					 actPurchasesReturnsVATGross==expPurchasesReturnsVATGross && actSalesInvoiceVATGross==expSalesInvoiceVATGross &&
					 actSalesReturnsVATGross==expSalesReturnsVATGross && actReceiptsVATGross==expReceiptsVATGross &&
					 actPaymentsVATGross==expPaymentsVATGross && actPettyCashVATGross==expPettyCashVATGross && actJVVATGross==expJVVATGross && actNonJVVATGross==expNonJVVATGross &&
					 actDebitNotesVATGross==expDebitNotesVATGross ;
			
			
			String actDisplayResult=Boolean.toString(displayResult);
			String expDisplayResult=excelReader.getCellData(xlSheetName, 21, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 21, 8, actDisplayResult);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
			System.out.println("Setting buton is  enabled");
			serachMenuTextHomePage.click();
			serachMenuTextHomePage.sendKeys("Settings Wizard");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
			searchMenuTextClick.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVATBtn));
			settingsWizardVATBtn.click();

			Thread.sleep(5000);
			
			int actVouchersCountAfterSelection		=settingsWizardVATVouchersList.size();
 			
			for (int i = 0; i < actVouchersCountAfterSelection; i++) 
			{
				String data=settingsWizardVATVouchersList.get(i).getText();
				
				int sl=i+1;
				
				
				if (data.contains("VAT") && settingsWizardVATVoucherChkboxList.get(i).isSelected()==false ) 
				{
					settingsWizardVATVouchersList.get(i).click();
				}
			}
			
			
			boolean actsettingsWizardVATSelectedVouchersListEmpty = settingsWizardVATSelectedVouchersListEmpty.getText().isEmpty();
			boolean expsettingsWizardVATSelectedVouchersListEmpty = true;
			
			
			
			
			if (actDisplayResult.equalsIgnoreCase(expDisplayResult) && actSaveSettingWizardVATmessage.equalsIgnoreCase(expSaveSettingWizardVATmessage)
					&& actsettingsWizardVATSelectedVouchersListEmpty==expsettingsWizardVATSelectedVouchersListEmpty) 
			{
				
				excelReader.setCellData(xlfile, xlSheetName, 9, 9, resPass);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVAtCloseBtn));
				settingsWizardVAtCloseBtn.click();
		        
				return true;
			} 
			else 
			{
				excelReader.setCellData(xlfile, xlSheetName, 9, 9, resFail);
				
				int settingsWizardVATSelectedVouchersListCount = settingsWizardVATSelectedVouchersList.size();
				
				for(int i=0;i<settingsWizardVATSelectedVouchersListCount;i++)
				{
					settingsWizardVATSelectedVouchersList.get(i).click();
					
					Thread.sleep(1000);
					
					settingsWizardVATGrossChkbox.click();
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardUpdateBtn));
				settingsWizardUpdateBtn.click();
				
				 
				 String actSaveSettingWizardVATmessage1 = checkValidationMessage(expSaveSettingWizardVATmessage);
				 
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsWizardVAtCloseBtn));
				settingsWizardVAtCloseBtn.click();
				
				System.out.println("");
				
				return false;
			}
		}
		catch (Exception e) 
		{
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 9, 10, e.getMessage());
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		}	
	}
		
	
	@FindBy (xpath="//*[@id='1']/div/span")
	public static WebElement homeMenu;
			
	@FindBy (xpath="//*[@id='1000']/span")
	public static WebElement mastersMenu;  
	
	//CHECKING TAXCODE PLACE OF SUPPLY AND JURISDICTION MASTERS ON UPDATING ABOVE SETTINGSIN VAT
	
	@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[10]")
	private static List<WebElement> nameList;
	
	@FindBy(xpath="//span[contains(text(),'Place of supply')]")
	private static WebElement placeOfSupply;
	
	@FindBy(xpath="//span[contains(text(),'Jurisdiction')]")
	private static WebElement jurisdiction;
	
	@FindBy(xpath ="//*[@id='LandingGridBody']/tr/td[10]")
	public static List<WebElement> masterTaxCodeList;
	
	@FindBy (xpath="//*[@id='1161']/span")
	private static WebElement taxCode;
	
	@FindBy(xpath = "//span[@id='btnClose']")
	private static WebElement cancelIcon;
	
	
	/*@FindBy(xpath="//span[@class='hidden-xs']")
	private static WebElement userNameDisplay;*/
	
	@FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[6]/a/i")
	private static WebElement userNameDisplay;

    
   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
	private static WebElement userNameDisplay;*/

	@FindBy(xpath="//*[@id='companyLogo']")
	private static WebElement companyLogo;

	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;

    @FindBy(xpath="//*[@id='userprofile']/li/span[2]")//*[@id='userprofile']/li/span[2]
	private static WebElement logoutOption;

	
	
	public boolean checkVATMastersTaxCode() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	{
	 excelReader = new ExcelReader(POJOUtility.getExcelPath());
	 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
	 System.out.println("******************** checkVATMastersTaxCode Method Executes.............   *****************************");
	
		 try
		 {
			   
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			 homeMenu.click();
			   
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu)); 
			 mastersMenu.click();
				
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(taxCode));
			 taxCode.click();
			
			
			
			Thread.sleep(2000);
			
			int actTaxCodeNameListCount					=nameList.size();
			int expTaxCodeNameListCount					=27; //19
			
			
			Set<String> actNameList = new HashSet<String>();
			
			for (int i = 0; i < actTaxCodeNameListCount; i++) 
			{
				String data = nameList.get(i).getText();
				System.err.println("data : "+data);
				actNameList.add(data);
			}
			
			System.out.println("*************************************checkVATMastersTaxCode***************************************");
			
			System.out.println("TaxCodeNameListCount : "+actTaxCodeNameListCount+"  value expected  "+expTaxCodeNameListCount);
			
			String actmasterTaxCode=actNameList.toString();
			String expmasterTaxCode="[Standard Rated Purchase - Non-Recoverable, SR-REC5, Intra GCC, Amendments, Import VAT, Import 5%, Out of scope - Sales, SD, Reverse charge, Import Tax, SJ, Std rate 5%, Standard Rated Purchase - Recoverable, Amendments to input tax, Std Rate, Zero Rate, Reverse charge for expenses, Exports, Tourist Tax, RCM 5, NA, Exempted purchases, Exempted, Zero rated purchases, RCM Sales, Correction or prev Qtr, Amendments to output tax]";
			
			System.out.println("masterTaxCode Actual   : "+ actmasterTaxCode);
			System.out.println("masterTaxCode Expected : "+ expmasterTaxCode);
			
			excelReader.setCellData(xlfile, xlSheetName, 23, 8, actmasterTaxCode);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelIcon));
			cancelIcon.click();
			
			if (actmasterTaxCode.equalsIgnoreCase(expmasterTaxCode) && actTaxCodeNameListCount==expTaxCodeNameListCount)
			{
				excelReader.setCellData(xlfile, xlSheetName, 22, 9, resPass);
				return true;
			}
			else
			{
				
				excelReader.setCellData(xlfile, xlSheetName, 22, 9, resFail);
				return false;
			}
		 }
		 catch (Exception e) 
		 {
			 String exception =e.getMessage();
			 excelReader.setExceptionInExcel(xlfile, xlSheetName, 22, 10, exception);
			 System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			 return false;
		 }
	}

	
		
	//STANDARD RATE
	
	@FindBy (xpath="//*[@id='21']/span")  
	private static WebElement calendar;
	
	@FindBy (xpath="//*[@id='153']/span")
	private static WebElement currentlyOpenReports;
	
	@FindBy (xpath="//*[@id='22']/span")
	private static WebElement reportDesigner;
	
	@FindBy (xpath="//*[@id='143']/span")
	private static WebElement batchReportPrinting;
	
	@FindBy (xpath="//*[@id='23']/span")
	private static WebElement scheduleReport;
	
	@FindBy (xpath="//*[@id='112']/span")
	private static WebElement renumberVouchers;
	
	@FindBy (xpath="//*[@id='114']/span")
	private static WebElement repostVouchers;
	
	@FindBy (xpath="//*[@id='122']/span")
	private static WebElement adjustForeginExchange;
	
	@FindBy (xpath="//*[@id='128']/span")
	private static WebElement transactionImport;
	
	@FindBy (xpath="//*[@id='106']/span")
	private static WebElement dataStatistics;
			
	@FindBy (xpath="//*[@id='149']/span")
	private static WebElement ediGeneration;
	
	@FindBy (xpath="//span[contains(text(),'Standard Rate')]")
	private static WebElement standardRate;
	
	@FindBy (xpath="//*[@id='250']/span")
	private static WebElement taskManager;
	
	@FindBy (xpath="//*[@id='647']/span")
	private static WebElement authorizationDetails;
	
	@FindBy (xpath="//*[@id='37']/span")
	private static WebElement autoAdjust;
	
	@FindBy (xpath="//*[@id='259']/span")
	private static WebElement regroup;
	
	@FindBy (xpath="//*[@id='3316']/span")
	private static WebElement manualAdjustment;
	
	@FindBy (xpath="//*[@id='3319']/span")
	private static WebElement releaseReveration;
	
	@FindBy (xpath="//*[@id='3323']/span")
	private static WebElement authorizationAuditReport;
	
	@FindBy (xpath="//*[@id='3326']/span")
	private static WebElement integrations;
	
	@FindBy (xpath="//*[@id='LandingGridBody']/tr/td[10]")
	private static List<WebElement> placeOfSupplyList;
	
	
	
	public static boolean checkVATMastersPlaceOfSupply() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
		try
		{
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
			 userNameDisplay.click();
				
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			 logoutOption.click();
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
			 
			 LoginPage lp                          = new LoginPage(getDriver());
			 
			 String unamelt                        = excelReader.getCellData(xlSheetName, 7, 6);
			 String pawslt                         = excelReader.getCellData(xlSheetName, 8, 6);
			 
			 LoginPage.enterUserName(unamelt);
			 LoginPage.enterPassword(pawslt);
			 
			 LoginPage.clickOnSignInBtn();
			 
			 Thread.sleep(2000);
				
				
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		 	homeMenu.click();
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		 	mastersMenu.click();
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeOfSupply));
		 	placeOfSupply.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	int actPlaceOfSupplyNameListCount					=nameList.size();
		 	int expPlaceOfSupplyNameListCount					=7;
		 	
		 	
		 	ArrayList<String> actplaceOfSupplyList=new ArrayList<String>();
			
			int placeOfSupplyListCount =placeOfSupplyList.size();
			
			System.err.println("placeOfSupplyListCount   :  "+placeOfSupplyListCount);
			
			for (int i = 0; i < placeOfSupplyListCount; i++) 
			{
				String data=placeOfSupplyList.get(i).getText();
				actplaceOfSupplyList.add(data);
			}
			
			
			
			String actplaceOfSupply=actplaceOfSupplyList.toString();
			String expplaceOfSupply=excelReader.getCellData(xlSheetName, 25, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 25, 8, actplaceOfSupply);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelIcon));
		 	cancelIcon.click();
		 	
		 	System.out.println("PlaceOfSupplyNameListCount : "+actPlaceOfSupplyNameListCount+"  value expected  "+expPlaceOfSupplyNameListCount);
		 	System.out.println("actplaceOfSupply           : "+actplaceOfSupply             +"  value expected  "+expplaceOfSupply);
		 	
		 	if (actPlaceOfSupplyNameListCount==expPlaceOfSupplyNameListCount &&  actplaceOfSupply.equalsIgnoreCase(expplaceOfSupply))
		 	{
		 		
		 		excelReader.setCellData(xlfile, xlSheetName, 24, 9, resPass);
		 		return true;
		 	}
		 	else
		 	{
		 		excelReader.setCellData(xlfile, xlSheetName, 24, 9, resFail);
		 		return false;
		 	}
		  }
		catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 24, 10, exception);
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			  return false;
		  }
	}	
	
	
	/* @FindBy (xpath="//*[@id='LandingGridBody']/tr/td[10]")
	private static List<WebElement> jurisdictionList;*/
	
	
	public static boolean checkVATMastersJurisdiction() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		try
		{
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		 	homeMenu.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		 	mastersMenu.click();
		 	
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdiction));
		 	jurisdiction.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	int actJurisdictionNameListCount					=nameList.size();
		 	int expJurisdictionNameListCount					=7;
		 	
	      ArrayList<String> actactJurisdictionNameList=new ArrayList<String>();
			
			int JurisdictionNameListCount =placeOfSupplyList.size();
			
			System.err.println("JurisdictionNameListCount   :  "+JurisdictionNameListCount);
			
			for (int i = 0; i < JurisdictionNameListCount; i++) 
			{
				String data=placeOfSupplyList.get(i).getText();
				actactJurisdictionNameList.add(data);
			}
			
	
			String actJurisdiction=actactJurisdictionNameList.toString();
			String expJurisdiction=excelReader.getCellData(xlSheetName, 27, 7);
			
			excelReader.setCellData(xlfile, xlSheetName, 27, 8, actJurisdiction);
		 	
			
			System.out.println("actJurisdictionNameListCount : "+actJurisdictionNameListCount+"  value expected  "+expJurisdictionNameListCount);
			System.out.println("actJurisdiction              : "+actJurisdiction             +"  value expected  "+expJurisdiction);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelIcon));
		 	cancelIcon.click();
		 	
		 	if (actJurisdictionNameListCount==expJurisdictionNameListCount && 
		 			actJurisdiction.equalsIgnoreCase(expJurisdiction))
		 	{
		 		excelReader.setCellData(xlfile, xlSheetName, 26, 9, resPass);
		 		return true;
		 	}
		 	else
		 	{
		 		
		 		excelReader.setCellData(xlfile, xlSheetName, 26, 9, resFail);
		 		return false;
		 	}
		 	
		}
		catch (Exception e) 
		{
			String exception =e.getMessage();
			excelReader.setExceptionInExcel(xlfile, xlSheetName, 26, 10, exception);
			System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
			return false;
		}
	}	
	
	

	  @FindBy (xpath="//*[@id='navigation_menu']/li[1]/ul/li[5]/ul/li")
	  private static List<WebElement> utilitesList;
	  
	  @FindBy(xpath="//a[@id='20']//span[contains(text(),'Utilities')]")
		private static WebElement  utilities;

	  
	 //STANDARD RATE DEFINE
	   
	 public static boolean checkUtilitiesSubMenu() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	 {
		
	  excelReader=new ExcelReader(POJOUtility.getExcelPath());
	  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
	  try
	  {
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
		utilities.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(releaseReveration));
			
		ArrayList<String> actutilitesList=new ArrayList<String>();
		
		int utilitesListCount =utilitesList.size();
		
		System.err.println("utilitesListCount   :  "+utilitesListCount);
		
		for (int i = 0; i < utilitesListCount; i++) 
		{
			String data=utilitesList.get(i).getText();
			actutilitesList.add(data);
		}
		
																					//	||
		String actutilites=actutilitesList.toString();//Download RDP setup is missing   \/
		String exputilites="[Calendar, Currently open reports, Focus RDP, Download RDP Setup, External Reports, Report Designer, Batch Report Printing, Schedule Report, Renumber Vouchers, Repost Vouchers, Adjust Foreign Exchange, Transaction Import, Data Statistics, App Menus Customization, Resource Manager, Electronic data interchange, EDI Generation, Standard Rate, Task Manager, Authorization Details, Auto Adjust, ReGroup, Manual Adjustment, Release Reservation, Authorization Audit Report, Integrations, Mount/Unmount Database, Document oreder, Release Reservation]";
		
		excelReader.setCellData(xlfile, xlSheetName, 30, 8, actutilites);
		
		System.out.println("actutilites : "+actutilites);
		System.out.println("exputilites : "+exputilites);
		
		
		if(actutilites.equalsIgnoreCase(exputilites))
		{
			excelReader.setCellData(xlfile, xlSheetName, 28, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 28, 9, resFail);
			return false;
		}
	  }
	  catch (Exception e) 
	  {
		  String exception =e.getMessage();
		  excelReader.setExceptionInExcel(xlfile, xlSheetName, 28, 10, exception);
		  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ exception);
		  return false;
	  }
		
	 }


	 
	    @FindBy(xpath="//div[@id='myNavbar']/ul/li/span/i")
		public static WebElement closeBtnInStandardRate;
		
		@FindBy(xpath="//tbody[@id='OptProductId_table_body']/tr/td[2]")
		public static List<WebElement> standardRateItemComboList;
		
		@FindBy(xpath="//input[@id='OptProductId']")
		public static WebElement standardRateItemCombo;
		
		@FindBy(xpath="//input[@id='txtEffectiveDate']")
		public static WebElement standardRateEffectiveDateTxt;
		
		@FindBy(xpath="//input[@id='txtrate']")
		public static WebElement standardRateRateTxt;
		
		@FindBy(xpath="//span[@id='id_EdtAdd']/i")
		public static WebElement standardRateAddBtn;
		
		@FindBy(xpath="//td[@id='id_StandardRate_col_1-2']")
		public static WebElement standardRateTableRow1EffectiveDate;
		
		@FindBy(xpath="//td[@id='id_StandardRate_col_1-3']")
		public static WebElement standardRateTableRow1Rate;
		
		@FindBy(xpath="//td[@id='id_StandardRate_col_2-2']")
		public static WebElement standardRateTableRow2EffectiveDate;
		
		@FindBy(xpath="//td[@id='id_StandardRate_col_2-3']")
		public static WebElement standardRateTableRow2Rate;
		
		@FindBy(xpath="//*[@id='btnEdit_Id_1']")
		public static WebElement standardRateEditRow1;
		
		@FindBy(xpath="//*[@id='id_Edt']/i")
		public static WebElement standardRateEditBtn;
		
		@FindBy(xpath="//*[@id='btnDelete_Id_1']")
		public static WebElement standardRateDeleteRow1;
		
		
		
		
		public static boolean checkOpenStandardRatePageSaveRate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		 	excelReader=new ExcelReader(POJOUtility.getExcelPath());
	 	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 	
	 	try
	 	{
		 	
		 	Thread.sleep(3000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(standardRate));
		 	standardRate.click();
		 	
		 	Thread.sleep(5000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(standardRateItemCombo));
		 	standardRateItemCombo.click();
		 	Thread.sleep(2000);
		 	standardRateItemCombo.sendKeys("STD RATE COGS ITEM");
		 	Thread.sleep(2000);
		 	standardRateItemCombo.sendKeys(Keys.TAB);
		 	
		 	int count=standardRateItemComboList.size();
		 	
		 	/*for (int i = 0; i < count; i++) 
		 	{
		 		String data = standardRateItemComboList.get(i).getText();
		 		
		 		if (data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 32, 6))) 
		 		{
		 			standardRateItemComboList.get(i).click();
		 			standardRateItemCombo.sendKeys(Keys.TAB);
		 			break;
				}
			}*/
		 	
		 	
		 	
		 	Calendar cal=Calendar.getInstance();
			SimpleDateFormat formatOfVoucherDate = new SimpleDateFormat("dd/MM/yyyy");
			String presentDate = formatOfVoucherDate.format(cal.getTime());
			
		 	standardRateEffectiveDateTxt.click();
		 	standardRateEffectiveDateTxt.sendKeys(Keys.HOME,presentDate);
		 	standardRateEffectiveDateTxt.sendKeys(Keys.TAB);
		 	
		 	standardRateRateTxt.sendKeys(Keys.END);
		 	standardRateRateTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		 	standardRateRateTxt.sendKeys(excelReader.getCellData(xlSheetName, 33, 6));
		 	standardRateRateTxt.sendKeys(Keys.TAB);
		 	System.err.println("6");
		 	standardRateAddBtn.click();
		 	
		 	String actstandardRateItemCombo					 = standardRateItemCombo.getAttribute("value");
		 	
		 	excelReader.setCellData(xlfile, xlSheetName, 34, 8, actstandardRateItemCombo);
		 	
		 	String actstandardRateEffectiveDateTxt			 = standardRateEffectiveDateTxt.getAttribute("value");
		 	excelReader.setCellData(xlfile, xlSheetName, 35, 8, actstandardRateEffectiveDateTxt);
		 	
		 	String actstandardRateTableRow1EffectiveDate	 = standardRateTableRow1EffectiveDate.getText();
		 	excelReader.setCellData(xlfile, xlSheetName, 36, 8, actstandardRateTableRow1EffectiveDate);
		 	
		 	String actstandardRateTableRow1Rate				 = standardRateTableRow1Rate.getText();
		 	excelReader.setCellData(xlfile, xlSheetName, 37, 8, actstandardRateTableRow1Rate);
		 	
		 	String expstandardRateItemCombo					 = excelReader.getCellData(xlSheetName, 34, 7);
		 	String expstandardRateEffectiveDateTxt			 = excelReader.getCellData(xlSheetName, 35, 7);
		 	String expstandardRateTableRow1EffectiveDate	 = excelReader.getCellData(xlSheetName, 36, 7);
		 	String expstandardRateTableRow1Rate				 = excelReader.getCellData(xlSheetName, 37, 7);
		 	System.err.println("7");
		 	System.out.println("*************************************checkStandardRate***************************************");
		 	
		 	System.out.println("StandardRateItemComboTxt             : "+actstandardRateItemCombo               +"  value expected  "+expstandardRateItemCombo);
		 	System.out.println("StandardRateEffectiveDateTxt         : "+actstandardRateEffectiveDateTxt        +"  value expected  "+expstandardRateEffectiveDateTxt);
		 	System.out.println("StandardRateTableRow1EffectiveDate   : "+actstandardRateTableRow1EffectiveDate  +"  value expected  "+expstandardRateTableRow1EffectiveDate);
		 	System.out.println("StandardRateTableRow1Rate            : "+actstandardRateTableRow1Rate           +"  value expected  "+expstandardRateTableRow1Rate);
		 	System.err.println("8");
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInStandardRate));
		 	closeBtnInStandardRate.click();
		 	
		 	System.err.println("9");
		 	if (actstandardRateItemCombo.equalsIgnoreCase(expstandardRateItemCombo) /*&& actstandardRateEffectiveDateTxt.equalsIgnoreCase(expstandardRateEffectiveDateTxt) &&
				  actstandardRateTableRow1EffectiveDate.equalsIgnoreCase(expstandardRateTableRow1EffectiveDate)*/ && actstandardRateTableRow1Rate.equalsIgnoreCase(expstandardRateTableRow1Rate))
		 	{
		 		
		 		excelReader.setCellData(xlfile, xlSheetName, 31, 9, resPass);
		 		return true;
		 	}
		 	else
		 	{
		 		
		 		excelReader.setCellData(xlfile, xlSheetName, 31, 9, resFail);
		 		return false;
		 	}
		 }
		 catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 31, 10, e.getMessage());
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
			  return false;
		  }
		 }
		
	 
		
		
		//Editing the Standard Rate
		
		 public static boolean checkEditOptionInStandardRateUpdateValue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
			
		  excelReader=new ExcelReader(POJOUtility.getExcelPath());
		  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		  try
		  {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
			utilities.click();
			
            Thread.sleep(3000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(standardRate));
		 	standardRate.click();
		 	
		 	Thread.sleep(3000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(standardRateItemCombo));
		 	standardRateItemCombo.click();
		 	Thread.sleep(200);
		 	standardRateItemCombo.sendKeys(Keys.SPACE);
		 	
		 	standardRateItemCombo.sendKeys("STD RATE COGS ITEM");
			standardRateItemCombo.click();
			Thread.sleep(1000);
		 	
		 	standardRateItemCombo.sendKeys(Keys.TAB);
		 /*	int count=standardRateItemComboList.size();
		 	
		 	for (int i = 0; i < count; i++) 
		 	{
		 		String data = standardRateItemComboList.get(i).getText();
		 		System.out.println(data);
		 		
		 		if (data.equalsIgnoreCase("STD RATE COGS ITEM")excelReader.getCellData(xlSheetName, 32, 6)) 
		 			
		 		{
		 			
		 			((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", data);
		 			Thread.sleep(1000);
		 			standardRateItemComboList.get(i).click();
		 			Thread.sleep(1000);
		 			standardRateItemCombo.sendKeys(Keys.TAB);
		 			break;
				}
		 	}*/
		 	
            String actstandardRateItemCombo					 = standardRateItemCombo.getAttribute("value");
		 	
		 	excelReader.setCellData(xlfile, xlSheetName, 34, 8, actstandardRateItemCombo);
		 	
		 	String actstandardRateEffectiveDateTxt			 = standardRateEffectiveDateTxt.getAttribute("value");
		 	excelReader.setCellData(xlfile, xlSheetName, 35, 8, actstandardRateEffectiveDateTxt);
		 	
		 	String actstandardRateTableRow1EffectiveDate	 = standardRateTableRow1EffectiveDate.getText();
		 	excelReader.setCellData(xlfile, xlSheetName, 36, 8, actstandardRateTableRow1EffectiveDate);
		 	
		 	String actstandardRateTableRow1Rate				 = standardRateTableRow1Rate.getText();
		 	excelReader.setCellData(xlfile, xlSheetName, 37, 8, actstandardRateTableRow1Rate);
		 	
		 	String expstandardRateItemCombo					 = excelReader.getCellData(xlSheetName, 34, 7);
		 	String expstandardRateEffectiveDateTxt			 = excelReader.getCellData(xlSheetName, 35, 7);
		 	String expstandardRateTableRow1EffectiveDate	 = excelReader.getCellData(xlSheetName, 36, 7);
		 	String expstandardRateTableRow1Rate				 = excelReader.getCellData(xlSheetName, 37, 7);
		 	System.err.println("7");
		 	System.out.println("*************************************checkStandardRate***************************************");
		 	
		 	System.out.println("StandardRateItemComboTxt             : "+actstandardRateItemCombo               +"  value expected  "+expstandardRateItemCombo);
		 	System.out.println("StandardRateEffectiveDateTxt         : "+actstandardRateEffectiveDateTxt        +"  value expected  "+expstandardRateEffectiveDateTxt);
		 	System.out.println("StandardRateTableRow1EffectiveDate   : "+actstandardRateTableRow1EffectiveDate  +"  value expected  "+expstandardRateTableRow1EffectiveDate);
		 	System.out.println("StandardRateTableRow1Rate            : "+actstandardRateTableRow1Rate           +"  value expected  "+expstandardRateTableRow1Rate);
		 	System.err.println("8");
		 	
		 	
		 	
		 	if (actstandardRateItemCombo.equalsIgnoreCase(expstandardRateItemCombo) /*&& actstandardRateEffectiveDateTxt.equalsIgnoreCase(expstandardRateEffectiveDateTxt) &&
					  actstandardRateTableRow1EffectiveDate.equalsIgnoreCase(expstandardRateTableRow1EffectiveDate)*/ && actstandardRateTableRow1Rate.equalsIgnoreCase(expstandardRateTableRow1Rate))
			 	{
			 		
			 		excelReader.setCellData(xlfile, xlSheetName, 31, 9, resPass);
			 		return true;
			 	}
			 	else
			 	{
			 		
			 		excelReader.setCellData(xlfile, xlSheetName, 31, 9, resFail);
			 		return false;
			 	}

		 	
		  }
		  catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 31, 10, e.getMessage());
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
			  return false;
		  }
		  
			
	 }
		
	
		 
		 
		 
		 
		 public static boolean checkUpdateStandardRate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		 {
			    excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 	
		 	try
		 	{
		 		
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(standardRateEditRow1));
		 		standardRateEditRow1.click();
			 	 		
		 		standardRateRateTxt.click();
		 		Thread.sleep(2000);
			 	standardRateRateTxt.sendKeys(Keys.END);
			 	Thread.sleep(2000);
			 	standardRateRateTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			 	Thread.sleep(2000);
			 	standardRateRateTxt.sendKeys("120");
			 	standardRateRateTxt.sendKeys(Keys.TAB);
			 	System.err.println("6");
			 	standardRateEditBtn.click();
			 	
			 	String actstandardRateItemCombo					 = standardRateItemCombo.getAttribute("value");
			 	
			 	excelReader.setCellData(xlfile, xlSheetName, 39, 8, actstandardRateItemCombo);
			 	
			 	String actstandardRateEffectiveDateTxt			 = standardRateEffectiveDateTxt.getAttribute("value");
			 	excelReader.setCellData(xlfile, xlSheetName, 40, 8, actstandardRateEffectiveDateTxt);
			
			 	String actstandardRateTableRow1EffectiveDate	 = standardRateTableRow1EffectiveDate.getText();
			 	excelReader.setCellData(xlfile, xlSheetName, 41, 8, actstandardRateTableRow1EffectiveDate);
			 	
			 	String actstandardRateTableRow1Rate				 = standardRateTableRow1Rate.getText();
			 	excelReader.setCellData(xlfile, xlSheetName, 42, 8, actstandardRateTableRow1Rate);
			 	
			 	String expstandardRateItemCombo					 = excelReader.getCellData(xlSheetName, 39, 7);
			 	String expstandardRateEffectiveDateTxt			 = excelReader.getCellData(xlSheetName, 40, 7);
			 	String expstandardRateTableRow1EffectiveDate	 = excelReader.getCellData(xlSheetName, 41, 7);
			 	String expstandardRateTableRow1Rate				 = excelReader.getCellData(xlSheetName, 42, 7);
			 	System.err.println("7");
			 	System.out.println("*************************************checkStandardRate***************************************");
			 	
			 	System.out.println("StandardRateItemComboTxt             : "+actstandardRateItemCombo               +"  value expected  "+expstandardRateItemCombo);
			 	System.out.println("StandardRateEffectiveDateTxt         : "+actstandardRateEffectiveDateTxt        +"  value expected  "+expstandardRateEffectiveDateTxt);
			 	System.out.println("StandardRateTableRow1EffectiveDate   : "+actstandardRateTableRow1EffectiveDate  +"  value expected  "+expstandardRateTableRow1EffectiveDate);
			 	System.out.println("StandardRateTableRow1Rate            : "+actstandardRateTableRow1Rate           +"  value expected  "+expstandardRateTableRow1Rate);
			 	System.err.println("8");
			 	
			 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInStandardRate));
			 	closeBtnInStandardRate.click();
			 	System.err.println("9");
			 	
			 	
			 	if (actstandardRateItemCombo.equalsIgnoreCase(expstandardRateItemCombo) && actstandardRateTableRow1Rate.equalsIgnoreCase(expstandardRateTableRow1Rate))
			 	{
			 		
			 		excelReader.setCellData(xlfile, xlSheetName, 31, 9, resPass);
			 		return true;
			 	}
			 	else
			 	{
			 		
			 		excelReader.setCellData(xlfile, xlSheetName, 31, 9, resFail);
			 		return false;
			 	}
			 }
			 catch (Exception e) 
			 {
				  String exception =e.getMessage();
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 31, 10, e.getMessage());
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				  return false;
			  }
		}
 
		 
		 public static boolean checkEditOptionInStandardOptionRate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
			
		  excelReader=new ExcelReader(POJOUtility.getExcelPath());
		  xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
		  try
		  {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			 
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
			utilities.click();
			
            Thread.sleep(3000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(standardRate));
		 	standardRate.click();
		 	
		 	Thread.sleep(3000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(standardRateItemCombo));
		 	standardRateItemCombo.click();
		 	Thread.sleep(2000);
		 	standardRateItemCombo.sendKeys(Keys.SPACE);
		 
		 	
		 	standardRateItemCombo.sendKeys("STD RATE COGS ITEM");
		 	standardRateItemCombo.click();
		 	Thread.sleep(2000);
		 	standardRateItemCombo.sendKeys(Keys.TAB);
		 	Thread.sleep(2000);
		 	
		 	
		 	/*int count=standardRateItemComboList.size();
		 	
		 	for (int i = 0; i < count; i++) 
		 	{
		 		String data = standardRateItemComboList.get(i).getText();
		 		
		 		if (data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 32, 6))) 
		 		{
		 			standardRateItemComboList.get(i).click();
		 			standardRateItemCombo.sendKeys(Keys.TAB);
		 			break;
				}
		 	}
		 	*/
            String actstandardRateItemCombo					 = standardRateItemCombo.getAttribute("value");
		 	
		 	excelReader.setCellData(xlfile, xlSheetName, 39, 8, actstandardRateItemCombo);
		 	
		 	String actstandardRateEffectiveDateTxt			 = standardRateEffectiveDateTxt.getAttribute("value");
		 	excelReader.setCellData(xlfile, xlSheetName, 40, 8, actstandardRateEffectiveDateTxt);
		 	
		 	String actstandardRateTableRow1EffectiveDate	 = standardRateTableRow1EffectiveDate.getText();
		 	excelReader.setCellData(xlfile, xlSheetName, 41, 8, actstandardRateTableRow1EffectiveDate);
		 	
		 	String actstandardRateTableRow1Rate				 = standardRateTableRow1Rate.getText();
		 	excelReader.setCellData(xlfile, xlSheetName, 42, 8, actstandardRateTableRow1Rate);
		 	
		 	String expstandardRateItemCombo					 = excelReader.getCellData(xlSheetName, 39, 7);
		 	String expstandardRateEffectiveDateTxt			 = excelReader.getCellData(xlSheetName, 40, 7);
		 	String expstandardRateTableRow1EffectiveDate	 = excelReader.getCellData(xlSheetName, 41, 7);
		 	String expstandardRateTableRow1Rate				 = excelReader.getCellData(xlSheetName, 42, 7);
		 	System.err.println("7");
		 	System.out.println("*************************************checkStandardRate***************************************");
		 	
		 	System.out.println("StandardRateItemComboTxt             : "+actstandardRateItemCombo               +"  value expected  "+expstandardRateItemCombo);
		 	System.out.println("StandardRateEffectiveDateTxt         : "+actstandardRateEffectiveDateTxt        +"  value expected  "+expstandardRateEffectiveDateTxt);
		 	System.out.println("StandardRateTableRow1EffectiveDate   : "+actstandardRateTableRow1EffectiveDate  +"  value expected  "+expstandardRateTableRow1EffectiveDate);
		 	System.out.println("StandardRateTableRow1Rate            : "+actstandardRateTableRow1Rate           +"  value expected  "+expstandardRateTableRow1Rate);
		 	System.err.println("8");
		 	
		 	
		 	if (actstandardRateItemCombo.equalsIgnoreCase(expstandardRateItemCombo) && actstandardRateTableRow1Rate.equalsIgnoreCase(expstandardRateTableRow1Rate))
			 	{
			 		
			 		excelReader.setCellData(xlfile, xlSheetName, 31, 9, resPass);
			 		return true;
			 	}
			 	else
			 	{
			 		
			 		excelReader.setCellData(xlfile, xlSheetName, 31, 9, resFail);
			 		return false;
			 	}
		  }
		  catch (Exception e) 
		  {
			  String exception =e.getMessage();
			  excelReader.setExceptionInExcel(xlfile, xlSheetName, 31, 10, e.getMessage());
			  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
			  return false;
		  }
		  
			
	 }

		 
		 public static boolean checkOptionDeleteRowInStandardRate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		 {
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 	
		 	try
		 	{
		 		
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(standardRateEditRow1));
		 		standardRateEditRow1.click();
		 			 		
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(standardRateDeleteRow1));
		 		standardRateDeleteRow1.click();	 		
		 		
		 		getWaitForAlert();
				getDriver().switchTo().alert().accept();
				
				Thread.sleep(3999);
	
				String actstandardRateTableRow1Rate				 = standardRateRateTxt.getAttribute("value");

			 	String expstandardRateTableRow1Rate				 = "0";
			
			 	System.out.println("*************************************checkStandardRate***************************************");
			  	System.out.println("StandardRateTableRow1Rate            : "+actstandardRateTableRow1Rate           +"  value expected  "+expstandardRateTableRow1Rate);

			 	
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInStandardRate));
			 	closeBtnInStandardRate.click();
			  	
			 	if (actstandardRateTableRow1Rate.equalsIgnoreCase(expstandardRateTableRow1Rate))
			 	{
			 		
			 		excelReader.setCellData(xlfile, xlSheetName, 31, 9, resPass);
			 		return true;
			 	}
			 	else
			 	{
			 		
			 		excelReader.setCellData(xlfile, xlSheetName, 31, 9, resFail);
			 		return false;
			 	}
			 }
			 catch (Exception e) 
			 {
				  String exception =e.getMessage();
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 31, 10, e.getMessage());
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				  return false;
			 }
		}
		 
		 
		 
		 public static boolean checkSaveStandardRatePageOnDeleteExistingRate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
			 	excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 	    xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 	
		 	try
		 	{
			 	
		
			 	
			 	Thread.sleep(3000);
			 	
			 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				 
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
				utilities.click();
				
	            Thread.sleep(3000);
			 	
			 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(standardRate));
			 	standardRate.click();
			 	
			 	Thread.sleep(3000);
			 	
			 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(standardRateItemCombo));
			 	standardRateItemCombo.click();
			 	Thread.sleep(2000);
			 	standardRateItemCombo.sendKeys(Keys.SPACE);
			 	
			 	
				standardRateItemCombo.sendKeys("STD RATE COGS ITEM");
				standardRateItemCombo.click();
			 	Thread.sleep(2000);
			 	standardRateItemCombo.sendKeys(Keys.TAB);
			 	Thread.sleep(2000);
			 	
			 	
			 /*	
			 	int count=standardRateItemComboList.size();
			 	
			 	for (int i = 0; i < count; i++) 
			 	{
			 		String data = standardRateItemComboList.get(i).getText();
			 		
			 		if (data.equalsIgnoreCase(excelReader.getCellData(xlSheetName, 32, 6))) 
			 		{
			 			standardRateItemComboList.get(i).click();
			 			standardRateItemCombo.sendKeys(Keys.TAB);
			 			break;
					}
			 	}
			 	*/
	 
			 	
			 	Calendar cal=Calendar.getInstance();
				SimpleDateFormat formatOfVoucherDate = new SimpleDateFormat("dd/MM/yyyy");
				String presentDate = formatOfVoucherDate.format(cal.getTime());
				
			 	standardRateEffectiveDateTxt.click();
			 	standardRateEffectiveDateTxt.sendKeys(Keys.HOME,presentDate);
			 	standardRateEffectiveDateTxt.sendKeys(Keys.TAB);
			 	
			 	standardRateRateTxt.sendKeys(Keys.END);
			 	standardRateRateTxt.sendKeys(Keys.SHIFT,Keys.HOME);
			 	standardRateRateTxt.sendKeys(excelReader.getCellData(xlSheetName, 43, 6));
			 	standardRateRateTxt.sendKeys(Keys.TAB);
			 	System.err.println("6");
			 	standardRateAddBtn.click();
			 	
			 	String actstandardRateItemCombo					 = standardRateItemCombo.getAttribute("value");
			 	
			 	excelReader.setCellData(xlfile, xlSheetName, 44, 8, actstandardRateItemCombo);
			 	
			 	String actstandardRateEffectiveDateTxt			 = standardRateEffectiveDateTxt.getAttribute("value");
			 	excelReader.setCellData(xlfile, xlSheetName, 45, 8, actstandardRateEffectiveDateTxt);
			 	
			 	String actstandardRateTableRow1EffectiveDate	 = standardRateTableRow1EffectiveDate.getText();
			 	excelReader.setCellData(xlfile, xlSheetName, 46, 8, actstandardRateTableRow1EffectiveDate);
			 	
			 	String actstandardRateTableRow1Rate				 = standardRateTableRow1Rate.getText();
			 	excelReader.setCellData(xlfile, xlSheetName, 47, 8, actstandardRateTableRow1Rate);
			 	
			 	String expstandardRateItemCombo					 = excelReader.getCellData(xlSheetName, 44, 7);
			 	String expstandardRateEffectiveDateTxt			 = excelReader.getCellData(xlSheetName, 45, 7);
			 	String expstandardRateTableRow1EffectiveDate	 = excelReader.getCellData(xlSheetName, 46, 7);
			 	String expstandardRateTableRow1Rate				 = excelReader.getCellData(xlSheetName, 47, 7);
			 	System.err.println("7");
			 	System.out.println("*************************************checkStandardRate***************************************");
			 	
			 	System.out.println("StandardRateItemComboTxt             : "+actstandardRateItemCombo               +"  value expected  "+expstandardRateItemCombo);
			 	System.out.println("StandardRateEffectiveDateTxt         : "+actstandardRateEffectiveDateTxt        +"  value expected  "+expstandardRateEffectiveDateTxt);
			 	System.out.println("StandardRateTableRow1EffectiveDate   : "+actstandardRateTableRow1EffectiveDate  +"  value expected  "+expstandardRateTableRow1EffectiveDate);
			 	System.out.println("StandardRateTableRow1Rate            : "+actstandardRateTableRow1Rate           +"  value expected  "+expstandardRateTableRow1Rate);
			 	System.err.println("8");
			 	
			 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInStandardRate));
			 	closeBtnInStandardRate.click();
			 	
			 	System.err.println("9");
			 	if (actstandardRateItemCombo.equalsIgnoreCase(expstandardRateItemCombo) /*&& actstandardRateEffectiveDateTxt.equalsIgnoreCase(expstandardRateEffectiveDateTxt) &&
					  actstandardRateTableRow1EffectiveDate.equalsIgnoreCase(expstandardRateTableRow1EffectiveDate)*/ && actstandardRateTableRow1Rate.equalsIgnoreCase(expstandardRateTableRow1Rate))
			 	{	
			 		excelReader.setCellData(xlfile, xlSheetName, 31, 9, resPass);
			 		return true;
			 	}
			 	else
			 	{
			 		excelReader.setCellData(xlfile, xlSheetName, 31, 9, resFail);
			 		return false;
			 	}
			 }
			 catch (Exception e) 
			 {
				  excelReader.setExceptionInExcel(xlfile, xlSheetName, 31, 10, e.getMessage());
				  System.err.println("CATCH BLOCK : EXECPTION MESSAGE IS DISPLAY : "+ e.getMessage());
				  return false;
			 }
		}		 
		 
		 
		 
		 
		 
			
		@FindBy(xpath="//*[@id='257']/span")
		private static WebElement  settingsVATTaxCode;
	 	
	 	@FindBy(xpath="//tbody[@id='grid_VatTaxCode_body']/tr[1]/td[3]")
		private static WebElement  vatTaxCodeBodyGrid;
	 	
	 	@FindBy(xpath="//span[@class='icon-import-from-excel icon-font7']")
		private static WebElement  vatTaxCodeImportBtn;
	 	
	 	/*@FindBy(xpath="//span[@class='icon-exportexcel icon-font7']")
		private static WebElement  vatTaxCodeExportBtn;*/
	 	
	 	@FindBy(xpath="(//span[@class='icon-exportexcel icon-font7'])[2]")
		private static WebElement  vatTaxCodeExportBtn;
	 	
	 	@FindBy(xpath="//span[@class='icon-edit icon-font7']")
		private static WebElement  vatTaxCodeSaveBtn;
	 	
	 	@FindBy(xpath="//span[@class='icon-close icon-font7']")
		private static WebElement  vatTaxCodeCloseBtn;
	 	
	 	@FindBy(xpath="//li[@class='clsSheetName']")
		private static WebElement  vatTaxCodeSelectSheetList;
	 	
	 	@FindBy(xpath="//button[@id='btnSheetOk']")
		private static WebElement  vatTaxCodeSelectSheetOkBtn;
	 	
	 	@FindBy(xpath="//a[@id='25']//span[contains(text(),'Data Management')]")
		private static WebElement  dataManagementMenu;
	 	
	 	@FindBy(xpath="//span[contains(text(),'Reindex')]")
		private static WebElement  reindexMenu;
	 	
	 	@FindBy(xpath="//input[@id='chk_fullReindex']")
		private static WebElement  fullReindexChkBox;
	 	
	 	@FindBy(xpath="//span[@class='icon-ok icon-font6']")
		private static WebElement  reindexOkBtn;
	 	
	 	@FindBy(xpath="//div[@class='col-sm-12 btnheader_img']//span[@class='icon-close icon-font6']")
		private static WebElement  reindexCancelBtn;
	 	
	 	private static boolean taxcode = false;
	 

		public boolean checkVatTaxCode() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
			settingsmenuBtn.click();
			Thread.sleep(2000);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsVATTaxCode));
			settingsVATTaxCode.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatTaxCodeImportBtn));
			
			boolean actvatTaxCodeImportBtn = vatTaxCodeImportBtn.isDisplayed();
			boolean actvatTaxCodeExportBtn = vatTaxCodeExportBtn.isDisplayed();
			boolean actvatTaxCodeSaveBtn   = vatTaxCodeSaveBtn.isDisplayed();
			boolean actvatTaxCodeCloseBtn  = vatTaxCodeCloseBtn.isDisplayed();
			
			boolean expvatTaxCodeImportBtn = true;
			boolean expvatTaxCodeExportBtn = true;
			boolean expvatTaxCodeSaveBtn   = true;
			boolean expvatTaxCodeCloseBtn  = true;
			
			boolean res = actvatTaxCodeImportBtn==expvatTaxCodeImportBtn && actvatTaxCodeExportBtn==expvatTaxCodeExportBtn
					&& actvatTaxCodeSaveBtn==expvatTaxCodeSaveBtn && actvatTaxCodeCloseBtn==expvatTaxCodeCloseBtn;
			
			
			String actvatTaxCodeBodyGrid = vatTaxCodeBodyGrid.getText();
			String expvatTaxCodeBodyGrid = "All";
			
			
			System.out.println("vatTaxCodeBodyGrid : "+actvatTaxCodeBodyGrid+" Value Expected : "+expvatTaxCodeBodyGrid);
			System.out.println("res                : "+res);
			
			
			if(actvatTaxCodeBodyGrid.equalsIgnoreCase(expvatTaxCodeBodyGrid) && res==true)
			{
				System.out.println("Test Pass : Batch fields are As expected ");
				excelReader.setCellData(xlfile, "Sheet6", 11, 9, resPass);
	    
				taxcode = true;
				
				return true;
			}
			else
			{
				
				excelReader.setCellData(xlfile, "Sheet6", 11, 9, resFail);
				
				taxcode = false;
				
				return false;
			}
		}
	 
		
		
		@FindBy(xpath="//td[@id='vatTaxDate_input_image']//span[@class='icon-calender theme_color-inverse datecontrol_arrow_margin datecontrol_arrow']")
		private static WebElement  affectiveDateCalenderBtn;
		
		@FindBy(xpath="//select[@id='vatTaxDate_year']")
		private static WebElement  affectiveDateyearDropDown;
		
		@FindBy(xpath="//select[@id='vatTaxDate_month']")
		private static WebElement  affectiveDateMonthDropDown;
		
		@FindBy(xpath="//*[@id='vatTaxDate_day_grid']")
		private static WebElement  calDates;
		
		
		private static boolean importing = false;
		

		public boolean checkVatTaxCodeImporting() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
			settingsmenuBtn.click();
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsVATTaxCode));
			settingsVATTaxCode.click();
			
			Thread.sleep(3000);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(affectiveDateCalenderBtn));
			affectiveDateCalenderBtn.click();
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(affectiveDateMonthDropDown));
	        Select mon=new Select(affectiveDateMonthDropDown);
	        mon.selectByVisibleText("January");
	        
	        
	        int  year = Calendar.getInstance().get(Calendar.YEAR);
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(affectiveDateyearDropDown));
	        Select yr=new Select(affectiveDateyearDropDown);
	        
	        String stringyear=Integer.toString(year);
	        
	        yr.selectByVisibleText(stringyear);
	        
	        
	        
	        String date="1";
	        
	         java.util.List<WebElement> columns=calDates.findElements(By.tagName("td"));  
	                
		     for (WebElement cell : columns)
		     {
		        if (cell.getText().equals(date))
		        {
		           cell.click();
		           break;
		        }
		     }
	        
	        
	       Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatTaxCodeImportBtn));
			vatTaxCodeImportBtn.click();
			
			Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\TaxCodeImport.exe");
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatTaxCodeSelectSheetList));
			vatTaxCodeSelectSheetList.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatTaxCodeSelectSheetOkBtn));
			vatTaxCodeSelectSheetOkBtn.click();
			
			Thread.sleep(10000);
			
			String expMessageonImport = "Tax Code Imported Successfully";
			String actMessageonImport = checkValidationMessage(expMessageonImport);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatTaxCodeSaveBtn));
			vatTaxCodeSaveBtn.click();
			
			String expMessage = "Saved SucessFully";
			String actMessage = checkValidationMessage(expMessage);
			
			
			
			if( actMessageonImport.equalsIgnoreCase(expMessageonImport) && actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Test Pass : Batch fields are As expected ");
				excelReader.setCellData(xlfile, "Sheet6", 11, 9, resPass);
				
				importing = true;
				
				return true;
			}
			else
			{
				
				System.out.println("Test Pass : Batch fields are As expected ");
				excelReader.setCellData(xlfile, "Sheet6", 11, 9, resFail);
				
				importing = false;
				
				return false;
			}
		}
	 
		 

		public boolean checkImportedVatTaxCode() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
					
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(affectiveDateCalenderBtn));
			affectiveDateCalenderBtn.click();		
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(affectiveDateMonthDropDown));
	        Select mon=new Select(affectiveDateMonthDropDown);
	        mon.selectByVisibleText("January");
	       	        
	        int  year = Calendar.getInstance().get(Calendar.YEAR);
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(affectiveDateyearDropDown));
	        Select yr=new Select(affectiveDateyearDropDown);
	        
	        String stringyear=Integer.toString(year);
	        
	        yr.selectByVisibleText(stringyear);
	        
	              
	        String date="1";
	        
	         java.util.List<WebElement> columns=calDates.findElements(By.tagName("td"));  
	                
		     for (WebElement cell : columns)
		     {
		        if (cell.getText().equals(date))
		        {
		           cell.click();
		           break;
		        }
		     }
	        
	        
	       Thread.sleep(2000);
			
			
	       String actvatTaxCodeBodyGrid = vatTaxCodeBodyGrid.getText();
			String expvatTaxCodeBodyGrid = "All";
			
			
			System.out.println("vatTaxCodeBodyGrid : "+actvatTaxCodeBodyGrid+" Value Expected : "+expvatTaxCodeBodyGrid);
			
			
			if(actvatTaxCodeBodyGrid.equalsIgnoreCase(expvatTaxCodeBodyGrid))
			{
				System.out.println("Test Pass : Batch fields are As expected ");
				excelReader.setCellData(xlfile, "Sheet6", 11, 9, resPass);
	    
				
				return true;
			}
			else
			{
				
				System.out.println("Test Pass : Batch fields are As expected ");
				excelReader.setCellData(xlfile, "Sheet6", 11, 9, resFail);
				
				if(taxcode== false || importing==false)
				{
					System.out.println("Test FAIL : REINDEXING FOR VAT TAX CODE ");
					excelReader.setCellData(xlfile, "Sheet6", 11, 9, resFail);
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
					homeMenu.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataManagementMenu));
					dataManagementMenu.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reindexMenu));
					reindexMenu.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fullReindexChkBox));
					fullReindexChkBox.click();
					
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reindexOkBtn));
					reindexOkBtn.click();
					
					if(getIsAlertPresent())
					{
						getWaitForAlert();
						
						getAlert().accept();
					}
					
					Thread.sleep(180000);
					
					Thread.sleep(110000);
					/*getWaitForAlert();
					
					getAlert().accept();*/
									
					System.out.println("Test FAIL : REINDEXING COMPLETED ");
				}
				
				
				return false;
			}
		}
	 
		 

		

		public boolean checkVatTaxCodeExporting() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(3000);
			
			 //Thread.sleep(130000);
			 
			 getDriver().navigate().refresh();
			 Thread.sleep(3000);
			 
			 getDriver().navigate().refresh();
			 Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
			settingsmenuBtn.click();
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsVATTaxCode));
			settingsVATTaxCode.click();	
			
					
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(affectiveDateCalenderBtn));
			affectiveDateCalenderBtn.click();
			
			int  month = Calendar.getInstance().get(Calendar.MONTH);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(affectiveDateMonthDropDown));
	        Select mon=new Select(affectiveDateMonthDropDown);
	        mon.selectByIndex(month);
	        
	        
	        int  year = Calendar.getInstance().get(Calendar.YEAR);
	        
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(affectiveDateyearDropDown));
	        Select yr=new Select(affectiveDateyearDropDown);
	        
	        String stringyear=Integer.toString(year);
	        
	        yr.selectByVisibleText(stringyear);
	        
	        
	        int date=Calendar.getInstance().get(Calendar.DATE);
	        
	        System.err.println("stringdate "+date);
	        
	        String stringdate=Integer.toString(date);
	        
	        System.err.println("stringdate "+stringdate);
	        
	         java.util.List<WebElement> columns=calDates.findElements(By.tagName("td"));  
	                
		     for (WebElement cell : columns)
		     {
		        if (cell.getText().equals(date))
		        {
		           cell.click();
		           break;
		        }
		     }
	        
	        
	       Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatTaxCodeExportBtn));
			vatTaxCodeExportBtn.click();
			
			if(getIsAlertPresent())
			{
				getAlert().accept();
			}
			
			
			Thread.sleep(5000);
			
			Robot robot = new Robot();                          
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_CONTROL); 
			robot.keyRelease(KeyEvent.VK_J);
			
			Thread.sleep(5000);
			
			robot.keyPress(KeyEvent.VK_CONTROL); 
			robot.keyPress(KeyEvent.VK_W); 
			robot.keyRelease(KeyEvent.VK_CONTROL); 
			robot.keyRelease(KeyEvent.VK_W);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vatTaxCodeCloseBtn));
			vatTaxCodeCloseBtn.click();
			
			
			if(dashboard.isDisplayed())
			{
				System.out.println("Test Pass : Batch fields are As expected ");
				excelReader.setCellData(xlfile, "Sheet6", 11, 9, resPass);
	    
				
				return true;
			}
			else
			{
				
				System.out.println("Test Pass : Batch fields are As expected ");
				excelReader.setCellData(xlfile, "Sheet6", 11, 9, resFail);
				
				
				return false;
			}
		}
	 
		 
		
		
		 
		 
		 
		 public boolean checkLogoutSettingWizardOptionnVATAndStandardRatePage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		   {
			 excelReader=new ExcelReader(POJOUtility.getExcelPath());
			 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			 
			 try
				{
				 
				 
				 
				 getDriver().navigate().refresh();
				 Thread.sleep(3000);
				 
				 
				 
				 
				  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
				  userNameDisplay.click();
				 
				  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
				  logoutOption.click();
				  
				  Thread.sleep(2000);
				  
				  boolean actUserLoginPage              = username.isDisplayed() && username.isEnabled()
		                                                  && password.isDisplayed() && password.isEnabled();
		                                         
				  boolean expUserLoginPage              = true;
				  
				  if(actUserLoginPage==expUserLoginPage)  
			      {
					System.out.println("***Test Pass: Login Successfull***");
					//excelReader.setCellData(xlfile, xlSheetName, 285, 9, resPass);
					return true;
				  }
			      else
			      {
					System.out.println("***Test Fail: Login Not Successfull***");
					//excelReader.setCellData(xlfile, xlSheetName, 285, 9, resFail);
					return false;
				  }
				}
				catch (Exception e)
				{
				 	//excelReader.setCellData(xlfile, xlSheetName, 285, 10, e.getMessage());	
				 	System.out.println(e.getMessage());
					return false;
				}
			}
		
		
	
	public SettingsWizardAndStandardRateDefintionPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
		

 }




