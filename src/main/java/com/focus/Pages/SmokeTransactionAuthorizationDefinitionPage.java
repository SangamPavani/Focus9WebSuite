package com.focus.Pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;

import com.focus.base.BaseEngine;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;




public class SmokeTransactionAuthorizationDefinitionPage extends BaseEngine
{

	@FindBy(xpath="//*[@id='id_Authorization_container']/div/div/nav/div[1]/a/div/span[2]")
	private static WebElement transAuthorLabel; 
	
	@FindBy(xpath="//*[@id='txtDoc']")
	private static WebElement documentNameDropdown; 
	
	    @FindBy(xpath="//*[@id='id_menu_tree_Receipts']/a/span")
	    private static WebElement receipts; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Payments']/a/span")
	    private static WebElement payments; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Petty Cash']/a/span")
	    private static WebElement pettyCash; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Post-Dated Receipts']/a/span")
	    private static WebElement postDatedReceipts; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Post-Dated Payments']/a/span")
	    private static WebElement postDatedPayments; 
		
	    @FindBy(xpath="//span[@class='treemenu_item_content_group_text col-xs-9'][contains(text(),'Purchases Vouchers')]")
	    private static WebElement purchasesVouchers; 
	    
		    @FindBy(xpath="//*[@id='id_menu_tree_Stock adjustment']/a/span")
		    private static WebElement stockAdjustment; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Purchases Returns']/a/span")
	    private static WebElement purchasesReturns; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Purchases Orders']/a/span")
	    private static WebElement purchasesOrders; 
		
		    @FindBy(xpath="//*[@id='id_menu_tree_Job orders']/a/span")
		    private static WebElement jobOrders; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Material Receipt Notes']/a/span")
	    private static WebElement materialReceiptNotes; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Sales Invoices']/a/span")
	    private static WebElement salesInvoices; 
		
		    @FindBy(xpath="//*[@id='id_menu_tree_Cash Sales']/a/span")
		    private static WebElement cashSales; 
			
		    @FindBy(xpath="//*[@id='id_menu_tree_Hire-Purchase Sales']/a/span")
		    private static WebElement hirePurchaseSales; 
			
		    @FindBy(xpath="//*[@id='id_menu_tree_POS Sales']/a/span")
		    private static WebElement posSales; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Sales Returns']/a/span")
	    private static WebElement salesReturns; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Sales Orders']/a/span")
	    private static WebElement salesOrders; 
		
		    @FindBy(xpath="//*[@id='id_menu_tree_Production Order']/a/span")
		    private static WebElement productionOrder; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Delivery Notes']/a/span")
	    private static WebElement deliveryNotes; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Non-Standard Journal Entries']/a/span")
	    private static WebElement nonStandardJournalEntries; 
		
		    @FindBy(xpath="//*[@id='id_menu_tree_Inter-Departmental JV']/a/span")
		    private static WebElement interDepartmentalJV; 
			
		    @FindBy(xpath="//*[@id='id_menu_tree_Debit Notes (Linewise)']/a/span")
		    private static WebElement debitNotes_LineWise; 
			
		    @FindBy(xpath="//*[@id='id_menu_tree_Credit Notes (Linewise)/Payroll']/a/span")
		    private static WebElement creditNotes_Linewise_Payroll ; 
			
		    @FindBy(xpath="//*[@id='id_menu_tree_Fixed Asset Depreciation Voucher']/a/span")
		    private static WebElement fixedAssetDepreciationVoucher; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Journal Entries']/a/span")
	    private static WebElement journalEntries; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Debit Notes']/a/span")
	    private static WebElement debitNotes; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Credit Notes']/a/span")
	    private static WebElement creditNotes; 
		
		    @FindBy(xpath="//*[@id='id_menu_tree_Payroll Postings']/a/span")
		    private static WebElement payrollPostings; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Opening Balances']/a/span")
	    private static WebElement openingBalances; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Shortages in Stock']/a/span")
	    private static WebElement shortagesInStock; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Excesses in Stocks']/a/span")
	    private static WebElement excessesInStocks; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Stock Transfers']/a/span")
	    private static WebElement stockTransfers; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Opening Stocks']/a/span")
	    private static WebElement openingStocks; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Issues to Production']/a/span")
	    private static WebElement issuesToProduction; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Receipts from production']/a/span")
	    private static WebElement receiptsFromProduction; 
		
		    @FindBy(xpath="//*[@id='id_menu_tree_Returns from Shop Floor']/a/span")
		    private static WebElement returnsFromShopFloor; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Job Work Issues']/a/span")
	    private static WebElement jobWorkIssues; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Job Work Receipts']/a/span")
	    private static WebElement jobWorkReceipts; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Purchases Quotations']/a/span")
	    private static WebElement purchasesQuotations; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Sales Quotations']/a/span")
	    private static WebElement salesQuotations; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Job Order']/a/span")
	    private static WebElement jobOrder; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Production Process']/a/span")
	    private static WebElement productionProcess; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Material Requisition']/a/span")
	    private static WebElement materialRequisition; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Request For Quote']/a/span")
	    private static WebElement requestForQuote; 
		
	    @FindBy(xpath="//*[@id='id_menu_tree_Forex JV']/a/span")
	    private static WebElement forexJV; 

	
	//////Name Text Field   
		
	@FindBy(xpath="//*[@id='ctrlAuthorizationH']")
	private static WebElement nameTxt; 
	
	@FindBy(xpath="//*[@id='ctrlAuthorizationH_input_settings']/span")
	private static WebElement nameSettingBtn; 

	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_heading']")
	    private static WebElement nameSettingPop_CustomizeDisplayColoumnLabel;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_container']")
	    private static WebElement nameSettingPop_sAuthorizationTxt;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[1]")
	    private static WebElement nameSettingPop_StandardFieldsBtn;
	
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_list']")
		    private static WebElement nameSettingPop_StandardFields_FiledDropdown;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_header']")
		    private static WebElement nameSettingPop_StandardFields_HeaderTxt;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_alignment']")
		    private static WebElement nameSettingPop_StandardFields_AlignmentDropdown;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_standardfields_width']")
		    private static WebElement nameSettingPop_StandardFields_WidthTxt;
		
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[3]")
			private static WebElement nameSettingPop_StandardFields_OkBtn;
			
			@FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[4]")
			private static WebElement nameSettingPop_StandardFields_CancelBtn;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[2]")
	    private static WebElement nameSettingPop_DeleteColoumnBtn;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[3]")
	    private static WebElement nameSettingPop_OkBtn;
	
	    @FindBy(xpath="//*[@id='ctrlAuthorizationH_customize_popup_footer']/div/div/input[4]")
	    private static WebElement nameSettingPop_CancelBtn;
		
	@FindBy(xpath="//*[@id='chkActive']")
	private static WebElement activeChkBox;  
	
	@FindBy(xpath="//*[@id='chkAlwaysauthorizationstartsfromfirstlevel']")
	private static WebElement alwaysauthorizationstartsfromfirstlevelChkBox; 
		
	
	//Transaction Authorization Clear,Delete,Save,Cancel
	
	@FindBy(xpath="//*[@id='ulAuthBtns']/li[1]/span/i")
	private static WebElement clearbtn; 
	
	@FindBy(xpath="//span[@id='spndeleteProfile']")
	private static WebElement deleteBtn; 
	
	@FindBy(xpath="//*[@id='btnSaveAuthorization']/i")
	private static WebElement saveBtn; 
	
	@FindBy(xpath="//*[@id='ulAuthBtns']/li[5]/span/i")
	private static WebElement cancelBtn; 
		

	//Action On Initial Rejection
	    
	@FindBy(xpath="//*[@id='chkFinancialAccountingMain']")
	private static WebElement financialAccountingChkBox; 
	
	@FindBy(xpath="//*[@id='chkBaseLinkMain']")
	private static WebElement linksBaseChkBox; 
	
	@FindBy(xpath="//*[@id='chkLinksMain']")
	private static WebElement linksChkBox; 
	
	@FindBy(xpath="//*[@id='spnAddLevel']/i")
	private static WebElement addLevelBtn; 
	
	@FindBy(xpath="//*[@id='spnAddParallel'']/i")
	private static WebElement addParallel;    
	
	@FindBy(xpath="//i[@id='id_StartNode']")
	private static WebElement startPointBtn; 
		
	
	//After Clicking On AddLevel/Add Parallel Button The Authorization Definition POp Rises--Related Fields 
	
	@FindBy(xpath="//*[@id='id_report_popup_heading']")
	private static WebElement authDefLabel; 
		
	@FindBy(xpath="//*[@id='id_report_popup_body']/div[2]/div/div[1]/ul/li[1]/a/span")
	private static WebElement conditionTab; 
		
	//Description Fields
	
	@FindBy(xpath="//*[@id='txtDescription']")
	private static WebElement descriptionTxt; 
		
	@FindBy(xpath="//*[@id='chkConditionNotRequired']")
	private static WebElement conditionNotRequiredChkBox; 

	
	@FindBy(xpath="//*[@id='chkCreditLimitExceeded']")
	private static WebElement creditLimitExceededChkBox; 
		
	@FindBy(xpath="//*[@id='chkBudgetExceeded']")
	private static WebElement budgetExceededChkBox; 
		
	@FindBy(xpath="//*[@id='chkNegativeCashCheck']")
	private static WebElement negativeCashCheckChkBox; 
		
	@FindBy(xpath="//*[@id='chkLineWiseAuthorization']")
	private static WebElement lineWiseAuthorizationChkBox; 
		
	@FindBy(xpath="//*[@id='chkCreditDaysExceeded']")
	private static WebElement creditDaysExceededChkBox; 
		
	@FindBy(xpath="//*[@id='chkNegativeStockCheck']")
	private static WebElement negativeStockCheckChkBox; 
		
	@FindBy(xpath="//*[@id='chkDateRange']")
	private static WebElement dateRangeChkBox; 
		
	@FindBy(xpath="//*[@id='dpFromDate']")
	private static WebElement fromDateTxt; 
		
	@FindBy(xpath="//*[@id='dpToDate']")
	private static WebElement toDateTxt; 
	
	@FindBy(xpath="//*[@id='chkTimeRange']")
	private static WebElement timeRangeChkBox;
		
	@FindBy(xpath="//*[@id='chkTimeRange']")
	private static WebElement fromTimeTxt; 
		
	@FindBy(xpath="//*[@id='tpToTime']")
	private static WebElement totimeTxt; 
		
	//Condition------Condition Fields
	
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr/td[1]/select")
	private static WebElement ConjunctionDropdown; 
		
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr/td[2]/input")
	private static WebElement SelectFieldTxt; 
	
	
	    //Selection Field  Inner Fields
	
		@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='1']")
		private static WebElement  DocNo;
		
		@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='2']")
		private static WebElement  Date;
		
		@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='80']")
		private static WebElement  Time;
					
		//Cash Bank AC
					
		@FindBy(xpath="//*[@id='4']")
		private static WebElement  CashBankACExpandBtn;
		
			@FindBy(xpath="//*[@id='5002']")
			private static WebElement  CashBankAC_Name;
			
			@FindBy(xpath="//*[@id='5003']")
			private static WebElement  CashBankAC_Code;
			
			@FindBy(xpath="//*[@id='127']")
			private static WebElement  CashBankAC_Alias;
			
			@FindBy(xpath="//*[@id='5004']")
			private static WebElement  CashBankAC_AccountType;
			
			@FindBy(xpath="//*[@id='300023']")
			private static WebElement  CashBankAC_Address;
			
			@FindBy(xpath="//*[@id='303786']")
			private static WebElement  CashBankAC_AllowCustomerPortal;
			
			@FindBy(xpath="//*[@id='302968']")
			private static WebElement  CashBankAC_BankAC;
			
			@FindBy(xpath="//*[@id='303935']")
			private static WebElement  CashBankAC_BankAccountName;
			
			@FindBy(xpath="//*[@id='303936']")
			private static WebElement  CashBankAC_BankAccountNumber;
			
			@FindBy(xpath="//*[@id='302774']")
			private static WebElement  CashBankAC_ChequeDiscountlimit;
			
			@FindBy(xpath="//*[@id='300083']")
			private static WebElement  CashBankAC_City1;
			
			@FindBy(xpath="//*[@id='300084']")
			private static WebElement  CashBankAC_City2;
			
			@FindBy(xpath="//*[@id='300018']")
			private static WebElement  CashBankAC_ConsolidationMethod;
			
			@FindBy(xpath="//*[@id='5006']")
			private static WebElement  CashBankAC_CreditDays;
			
			@FindBy(xpath="//*[@id='5005']")
			private static WebElement  CashBankAC_CreditLimit;
			
			@FindBy(xpath="//*[@id='300012']")
			private static WebElement  CashBankAC_DebitCreditproposal;
			
			@FindBy(xpath="//*[@id='300013']")
			private static WebElement  CashBankAC_DebitCreditRequired;
			
			@FindBy(xpath="//*[@id='300024']")
			private static WebElement  CashBankAC_DeliveryAddress;
			
			@FindBy(xpath="//*[@id='300249']")
			private static WebElement  CashBankAC_Email;
			
			@FindBy(xpath="//*[@id='300014']")
			private static WebElement  CashBankAC_ExchangeAdjustmentGainAC;
			
			@FindBy(xpath="//*[@id='300015']")
			private static WebElement  CashBankAC_ExchangeAdjustmentLossAC;
			
			@FindBy(xpath="//*[@id='303574']")
			private static WebElement  CashBankAC_Faxno;
			
			@FindBy(xpath="//*[@id='304269']")
			private static WebElement  CashBankAC_FinanceEmail;
			
			@FindBy(xpath="//*[@id='303937']")
			private static WebElement  CashBankAC_IFSCcode;
			
			@FindBy(xpath="//*[@id='303785']")
			private static WebElement  CashBankAC_Password;
			
			@FindBy(xpath="//*[@id='304047']")
			private static WebElement  CashBankAC_PaymentType;
			
			@FindBy(xpath="//*[@id='304157']")
			private static WebElement  CashBankAC_PDCdiscountedAmount;
			
			@FindBy(xpath="//*[@id='300027']")
			private static WebElement  CashBankAC_Pin1;
			
			@FindBy(xpath="//*[@id='300028']")
			private static WebElement  CashBankAC_Pin2;
			
			@FindBy(xpath="//*[@id='304379']")
			private static WebElement  CashBankAC_Portalemail;
			
			@FindBy(xpath="//*[@id='300016']")
			private static WebElement  CashBankAC_PrimaryAccount;
			
			@FindBy(xpath="//*[@id='302870']")
			private static WebElement  CashBankAC_RateOFInterest;
			
			@FindBy(xpath="//*[@id='300250']")
			private static WebElement  CashBankAC_SendEmailtoCustomer;
			
			@FindBy(xpath="//*[@id='303573']")
			private static WebElement  CashBankAC_TelNo;
			
			@FindBy(xpath="//*[@id='8388609']")
			private static WebElement  CashBankAC_GroupLevel;
									
			@FindBy(xpath="//*[@id='8388864']")
			private static WebElement  CashBankAC_GroupLevelCode;
			
			@FindBy(xpath="//*[@id='8388610']")
			private static WebElement  CashBankAC_GroupLeve2;
			
			@FindBy(xpath="//*[@id='8388865']")
			private static WebElement  CashBankAC_GroupLeve2Code;
			
			@FindBy(xpath="//*[@id='8388611']")
			private static WebElement  CashBankAC_GroupLeve3;
			
			@FindBy(xpath="//*[@id='8388866']")
			private static WebElement  CashBankAC_GroupLeve3Code;
			
			/////
			@FindBy(xpath="//*[@id='8388612']")
			private static WebElement  CashBankAC_GroupLeve4;
			
			@FindBy(xpath="//*[@id='8388867']")
			private static WebElement  CashBankAC_GroupLeve4Code;
						
			@FindBy(xpath="//*[@id='8388613']")
			private static WebElement  CashBankAC_GroupLeve5;
			
			@FindBy(xpath="//*[@id='8388868']")
			private static WebElement  CashBankAC_GroupLeve5Code;
						
			@FindBy(xpath="//*[@id='8388614']")
			private static WebElement  CashBankAC_GroupLeve6;
			
			@FindBy(xpath="//*[@id='8388869']")
			private static WebElement  CashBankAC_GroupLeve6Code;
						
			@FindBy(xpath="//*[@id='8388615']")
			private static WebElement  CashBankAC_GroupLeve7;
			
			@FindBy(xpath="//*[@id='8388870']")
			private static WebElement  CashBankAC_GroupLeve7Code;
						
			@FindBy(xpath="//*[@id='5154']")
			private static WebElement  CashBankAC_Name2;			
				
			@FindBy(xpath="//*[@id='5155']")
			private static WebElement  CashBankAC_Code2;			
				
			@FindBy(xpath="//*[@id='300568']")
			private static WebElement  CashBankAC_State;			
				
			@FindBy(xpath="//*[@id='8388609']")
			private static WebElement  CashBankAC_GroupLevel1;			
				
			@FindBy(xpath="//*[@id='8388864']")
			private static WebElement  CashBankAC_GroupLevel1Code;			
					
					
			//Department
			
			@FindBy(xpath="//*[@id='268435459']")
			private static WebElement  DepartmentExpansion;
			
				@FindBy(xpath="//*[@id='5042']")
				private static WebElement  Dept_Name;
				
				@FindBy(xpath="//*[@id='5043']")
				private static WebElement  Dept_Code;
				
				@FindBy(xpath="//*[@id='8388609']")
				private static WebElement  Dept_GroupLevel1;
				
				@FindBy(xpath="//*[@id='8388864']")
				private static WebElement  Dept_GroupLevel1Code;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='67108883']")
			private static WebElement  SNarration;	
			
			@FindBy(xpath="//*[@id='67108869']")
			private static WebElement  sChequeNo;
			
			@FindBy(xpath="//*[@id='12']")
			private static WebElement  AccountExansiion;
				
				@FindBy(xpath="//*[@id='5002']")
				private static WebElement  Account_Name;
				
				@FindBy(xpath="//*[@id='5003']")
				private static WebElement  Account_Code;
				
				@FindBy(xpath="//*[@id='127']")
				private static WebElement  Account_Alias;
				
				@FindBy(xpath="//*[@id='5004']")
				private static WebElement  Account_AccountType;
				
				@FindBy(xpath="//*[@id='300023']")
				private static WebElement  Account_Address;
				
				@FindBy(xpath="//*[@id='303786']")
				private static WebElement  Account_AllowCustomerPortal;
				
				@FindBy(xpath="//*[@id='302968']")
				private static WebElement  Account_BankAC;
				
				@FindBy(xpath="//*[@id='303935']")
				private static WebElement  Account_BankAccountName;
				
				@FindBy(xpath="//*[@id='303936']")
				private static WebElement  Account_BankAccountNumber;
				
				@FindBy(xpath="//*[@id='302774']")
				private static WebElement  Account_ChequeDiscountlimit;
				
				@FindBy(xpath="//*[@id='300083']")
				private static WebElement  Account_City1;
				
				@FindBy(xpath="//*[@id='300084']")
				private static WebElement  Account_City2;
				
				@FindBy(xpath="//*[@id='300018']")
				private static WebElement  Account_ConsolidationMethod;
				
				@FindBy(xpath="//*[@id='5006']")
				private static WebElement  Account_CreditDays;
				
				@FindBy(xpath="//*[@id='5005']")
				private static WebElement  Account_CreditLimit;
				
				@FindBy(xpath="//*[@id='300012']")
				private static WebElement  Account_DebitCreditproposal;
				
				@FindBy(xpath="//*[@id='300013']")
				private static WebElement  Account_DebitCreditRequired;
				
				@FindBy(xpath="//*[@id='300024']")
				private static WebElement  Account_DeliveryAddress;
				
				@FindBy(xpath="//*[@id='300249']")
				private static WebElement  Account_Email;
				
				@FindBy(xpath="//*[@id='300014']")
				private static WebElement  Account_ExchangeAdjustmentGainAC;
				
				@FindBy(xpath="//*[@id='300015']")
				private static WebElement  Account_ExchangeAdjustmentLossAC;
				
				@FindBy(xpath="//*[@id='303574']")
				private static WebElement  Account_Faxno;
				
				@FindBy(xpath="//*[@id='304269']")
				private static WebElement  Account_FinanceEmail;
				
				@FindBy(xpath="//*[@id='303937']")
				private static WebElement  Account_IFSCcode;
				
				@FindBy(xpath="//*[@id='303785']")
				private static WebElement  Account_Password;
				
				@FindBy(xpath="//*[@id='304047']")
				private static WebElement  Account_PaymentType;
				
				@FindBy(xpath="//*[@id='304157']")
				private static WebElement  Account_PDCdiscountedAmount;
				
				@FindBy(xpath="//*[@id='300027']")
				private static WebElement  Account_Pin1;
				
				@FindBy(xpath="//*[@id='300028']")
				private static WebElement  Account_Pin2;
				
				@FindBy(xpath="//*[@id='304379']")
				private static WebElement  Account_Portalemail;
				
				@FindBy(xpath="//*[@id='300016']")
				private static WebElement  Account_PrimaryAccount;
				
				@FindBy(xpath="//*[@id='302870']")
				private static WebElement  Account_RateOFInterest;
				
				@FindBy(xpath="//*[@id='300250']")
				private static WebElement  Account_SendEmailtoCustomer;
				
				@FindBy(xpath="//*[@id='303573']")
				private static WebElement  Account_TelNo;
				
				@FindBy(xpath="//*[@id='8388609']")
				private static WebElement  Account_GroupLevel;
										
				@FindBy(xpath="//*[@id='8388864']")
				private static WebElement  Account_GroupLevelCode;
				
				@FindBy(xpath="//*[@id='8388610']")
				private static WebElement  Account_GroupLeve2;
				
				@FindBy(xpath="//*[@id='8388865']")
				private static WebElement  Account_GroupLeve2Code;
				
				@FindBy(xpath="//*[@id='8388611']")
				private static WebElement  Account_GroupLeve3;
				
				@FindBy(xpath="//*[@id='8388866']")
				private static WebElement  Account_GroupLeve3Code;
	
				@FindBy(xpath="//*[@id='8388612']")
				private static WebElement  Account_GroupLeve4;
				
				@FindBy(xpath="//*[@id='8388867']")
				private static WebElement  Account_GroupLeve4Code;
							
				@FindBy(xpath="//*[@id='8388613']")
				private static WebElement  Account_GroupLeve5;
				
				@FindBy(xpath="//*[@id='8388868']")
				private static WebElement  Account_GroupLeve5Code;
							
				@FindBy(xpath="//*[@id='8388614']")
				private static WebElement  Account_GroupLeve6;
				
				@FindBy(xpath="//*[@id='8388869']")
				private static WebElement  Account_GroupLeve6Code;
							
				@FindBy(xpath="//*[@id='8388615']")
				private static WebElement  Account_GroupLeve7;
				
				@FindBy(xpath="//*[@id='8388870']")
				private static WebElement  Account_GroupLeve7Code;
							
				@FindBy(xpath="//*[@id='5154']")
				private static WebElement  Account_Name2;			
					
				@FindBy(xpath="//*[@id='5155']")
				private static WebElement  Account_Code2;			
					
				@FindBy(xpath="//*[@id='300568']")
				private static WebElement  Account_State;			
					
				@FindBy(xpath="//*[@id='8388609']")
				private static WebElement  Account_GroupLevel1;			
					
				@FindBy(xpath="//*[@id='8388864']")
				private static WebElement  Account_GroupLevel1Code;	
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='4']")
			private static WebElement  vendorAC;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='536870916']")
			private static WebElement  warehouse;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='23']")
			private static WebElement  item;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='24']")
			private static WebElement  unit;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='33554437']")
			private static WebElement  RD;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='1107296261']")
			private static WebElement  voucherRD;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='35']")
			private static WebElement  LpurchaseVoucherN;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='26']")
			private static WebElement  Quantity;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='27']")
			private static WebElement  Rate;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='28']")
			private static WebElement  Gross;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='1073741852']")
			private static WebElement  VoucherGross;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='13']")
			private static WebElement  Batch;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='85']")
			private static WebElement  Bins;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='37']")
			private static WebElement  ExpDate;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='38']")
			private static WebElement  RMA;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='134217734']")
			private static WebElement  FD;
			
			@FindBy(xpath="//*[@id='16']")
			private static WebElement  Amount;
			
			@FindBy(xpath="//*[@id='83']")
			private static WebElement  Reference;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='75']")
			private static WebElement  Net;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='78']")
			private static WebElement  User;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='147']")
			private static WebElement  Role;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='148']")
			private static WebElement  UserVal1;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='149']")
			private static WebElement  UserVal2;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='150']")
			private static WebElement  UserVal3;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='151']")
			private static WebElement  UserVal4;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='152']")
			private static WebElement  UserVal5;
			
			@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter']//a[@id='67108920']")
			private static WebElement  sRemarks;
			
		//Completion Inner Fields			
      
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr/td[3]/select")
	private static WebElement SelectOperatorDropdown; 
		
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr/td[4]/select")
	private static WebElement CompareWithDropdown; 
		
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr/td[5]/input")
	private static WebElement ValueTxt; 
		
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr/td[6]/span")
	private static WebElement DeleteRow1Btn; 
		
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr/td[7]/span")
	private static WebElement AddRowBtn; 
		
	@FindBy(xpath="//*[@id='68_0_AdvanceFilter_']/table/tbody/tr[2]/td[6]/span")
	private static WebElement SecondRowBtn; 
	
	
	///status Update----------
	
	@FindBy(xpath="//*[@id='id_txtStatusUpdate']")
	private static WebElement statusUpdateDropdown; 
		
	@FindBy(xpath="//*[@id='txtAuthDefReason']")
	private static WebElement reasonTxt; 
		
	@FindBy(xpath="//*[@id='chkFinancialAccounting']")
	private static WebElement keepUnpostedfinancialAccountingChkBox; 
		
	@FindBy(xpath="//*[@id='chkLinkBase']")
	private static WebElement keepUnpostedlinkBaseChkBox; 
		
	@FindBy(xpath="//*[@id='chkReferences']")
	private static WebElement keepUnpostedReferencesChkBox; 
		
	@FindBy(xpath="//*[@id='chkLinks']")
	private static WebElement keepUnpostedLinksChkBox;
	
	@FindBy(xpath="//*[@id='chkReservation']")
	private static WebElement keepUnpostedReservationChkBox;
	
	@FindBy(xpath="//input[@id='chkInventory']")
	private static WebElement keepUnpostedInventoryChkBox;
	
	
	//Authorization MOde
	
	@FindBy(xpath="//*[@id='chkFullAuthorization']")
	private static WebElement fullAuthorizationChkBox;
	
	@FindBy(xpath="//*[@id='chkAskRemarksonapproval']")
	private static WebElement askRemarksOnapprovalChkBox;
	
	@FindBy(xpath="//*[@id='chkmakeAskRemarksonapproval']")
	private static WebElement makeApprovalRemarksmandatoryChkBox;
	
	@FindBy(xpath="//*[@id='chkAskremarksonRejection']")
	private static WebElement askRemarksOnRejectionChkBox;
	
	@FindBy(xpath="//*[@id='chkmakeAskRemarksonRejection']")
	private static WebElement makeRejectionRemarksMandatoryChkBox;
	
	
	//Undo Authorization On Editing
	
	@FindBy(xpath="//*[@id='chkAnyValueChange']")
	private static WebElement anyValueChangeChkBox;
	
	@FindBy(xpath="//*[@id='chkAmountsOrQuantityOrNumeric']")
	private static WebElement amountsOrQuantityOrNumericChkBox;
	
	@FindBy(xpath="//*[@id='chkBillAdjustments']")
	private static WebElement billAdjustmentsChkBox;
	
	@FindBy(xpath="//*[@id='chkUndoReservation']")
	private static WebElement undoReservationChkBox;
	
	@FindBy(xpath="//*[@id='chkUndoLinks']")
	private static WebElement undoLinksChkBox;
	
	@FindBy(xpath="//*[@id='chkBatchRMABins']")
	private static WebElement batchRMABinChkBox;
	
	@FindBy(xpath="//*[@id='ddlUndoAuthEditing']")
	private static WebElement undoAuthorizationEditingDropdown;
	
	//Last Dropdown In Condition Screen
	
	
	
	//TransactionAuthorization------UserSelection Tab
	
	
	@FindBy(xpath="//*[@id='id_report_popup_body']/div[2]/div/div[1]/ul/li[2]/a/span")
	private static WebElement userSelectionTab;
	
	@FindBy(xpath="//*[@id='ddlUserSelection']")
	private static WebElement userselectionDropdown;
	
	@FindBy(xpath="//*[@id='ddlCriteria']")
	private static WebElement criteriaDropdown;
	
	
	//User Selection----Grid Fields
	
	@FindBy(xpath="//*[@id='id_tblUserSelection_User']")
	private static WebElement userDropdown;
	
	@FindBy(xpath="//td[@id='id_tblUserSelection_col_1-1']")
	private static WebElement userrow1;
	
	@FindBy(xpath="//td[@id='id_tblUserSelection_col_2-1']")
	private static WebElement userrow2;
	
	@FindBy(xpath="//*[@id='id_tblUserSelection_col_1-3']")
	private static WebElement limitDefinitionrow1;
	
		@FindBy(xpath="//*[@id='divCondtionModal']/div/div/div[1]/div[1]/h4]")
		private static WebElement GridLimitDef_ConditionLabel;
		
		@FindBy(xpath="//*[@id='ddlLimiton']")
		private static WebElement GridLimitDef_LimitOnDropdown;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr/td[1]/select")
		private static WebElement GridLimitDef_ConjunctionDropdown;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr/td[2]/input")
		private static WebElement GridLimitDef_SelectFieldTxt;
		
			@FindBy(xpath="//*[@id='4']")
			private static WebElement GridLimitDef_SelectField_CashAndBankAc;
			
			@FindBy(xpath="//*[@id='268435459']")
			private static WebElement GridLimitDef_SelectField_Department;
			
			@FindBy(xpath="//*[@id='12']")
			private static WebElement GridLimitDef_SelectField_Account;
			
			@FindBy(xpath="//*[@id='268435462']")
			private static WebElement GridLimitDef_SelectFieldLocation;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr/td[3]/select")
		private static WebElement GridLimitDef_SelectOperatorDropdown;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr/td[4]/select")
		private static WebElement GridLimitDef_CompareWithDropDown;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr/td[5]/input")
		private static WebElement GridLimitDef_ValueTxt;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr/td[6]/span")
		private static WebElement GridLimitDef_CloseRow1Btn;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr/td[7]/span")
		private static WebElement GridLimitDef_AddRow1Btn;
		
		@FindBy(xpath="//*[@id='68_1_AdvanceFilter']/table/tbody/tr[2]/td[6]/span")
		private static WebElement GridLimitDef_CloseRow2Btn;
		
		@FindBy(xpath="//*[@id='divCondtionModal']/div/div/div[2]/div[1]/div[4]/span/i")
		private static WebElement GridLimitDef_OkBtn;
		
		@FindBy(xpath="//*[@id='btnCancel']/i")
		private static WebElement GridLimitDef_CancelIcon;
	
	
	@FindBy(xpath="//td[@id='id_tblUserSelection_col_1-4']")
	private static WebElement limitValue1;	
		
	@FindBy(xpath="//td[@id='id_tblUserSelection_col_1-5']")
	private static WebElement resetFrequency1;	
			
	@FindBy(xpath="//*[@id='id_tblUserSelection_LimitValue']")
	private static WebElement limitValueTxt;	
		
	@FindBy(xpath="//*[@id='id_tblUserSelection_ResetFrequency']")
	private static WebElement resetFrequencyDropdown;	
	
	
	
	
	//Alert Tab Fields
		
	@FindBy(xpath="//*[@id='id_report_popup_body']/div[2]/div/div[1]/ul/li[3]/a/span")
	private static WebElement alertsTab;	
		
	//Grid
	
	@FindBy(xpath="//*[@id='chkReceived']")
	private static WebElement receivedChkBox;	
		
	@FindBy(xpath="//*[@id='chkApproved']")
	private static WebElement approvedChkBox;	
		
	@FindBy(xpath="//*[@id='chkRejected']")
	private static WebElement rejectedChkBox;	
		
	@FindBy(xpath="//*[@id='chkStopped']")
	private static WebElement stoppedChkBox;	
		
	//EmailHeaderTemplate
	
	@FindBy(xpath="//*[@id='id_tblAlerts_control_heading_2']/div/u")
	private static WebElement emailHeaderTemplateBtn;	
	
		@FindBy(xpath="//*[@id='id_SMSTemplate']/div/nav/div/div[1]/a/div/span[2]")
		private static WebElement emailHeaderTemplate_CustomizeTemplateLabel;	
		
		//Header Fields Of Customize Template Pop
		
		@FindBy(xpath="//*[@id='btnNewSmsTemplate']")
		private static WebElement customizeTemplateNewBtn;	
		
		@FindBy(xpath="//*[@id='btnSaveSmsTemplate']")
		private static WebElement customizeTemplateSaveBtn;	
			
		@FindBy(xpath="//*[@id='btnCloseSMSModal']")
		private static WebElement customizeTemplateCloseBtn;	
			
		@FindBy(xpath="//*[@id='smsTemplateOptCtrl']")
		private static WebElement customizeTemplateTemplatestxt;	
			
		@FindBy(xpath="//*[@id='smsTemplateOptCtrl_input_settings']/span")
		private static WebElement customizeTemplate_TemplatesSettingBtn;	
			
			
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_heading']")
			private static WebElement templateSettingPop_CustomizeDisplayColoumnLabel;
			         
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_container']")
			private static WebElement templateSettingPop_sTemplateNameTxt;
	
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[1]")
			private static WebElement templateSettingPop_StandardFieldsBtn;
		
				@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_list']")
			    private static WebElement templateSettingPop_StandardFields_FiledDropdown;
			
				@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_header']")
			    private static WebElement templateSettingPop_StandardFields_HeaderTxt;
			
				@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_alignment']")
			    private static WebElement templateSettingPop_StandardFields_AlignmentDropdown;
			
				@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_standardfields_width']")
			    private static WebElement templateSettingPop_StandardFields_WidthTxt;
			
				@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[3]")
				private static WebElement templateSettingPop_StandardFields_OkBtn;
				
				@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[4]")
				private static WebElement templateSettingPop_StandardFields_CancelBtn;
		
			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[2]")
			private static WebElement templateSettingPop_DeleteColoumnBtn;

			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[3]")
			private static WebElement templateSettingPop_OkBtn;

			@FindBy(xpath="//*[@id='smsTemplateOptCtrl_customize_popup_footer']/div/div/input[4]")
			private static WebElement templateSettingPop_CancelBtn;
		
	
	//Email Template Tab			
					
	//Header Fields
			
	@FindBy(xpath="//u[contains(text(),'Email Template')]")
	private static WebElement emailTemplateBtn;	
					
	@FindBy(xpath="//*[@id='forHf']/span[1]/span/i[1]")
	private static WebElement emailTemplateNewBtn;	
	
	@FindBy(xpath="//i[@class='icon-font6 icon-new']")
	private static WebElement  Newdropdown;
	
		@FindBy(xpath="//*[@id='forHf']/span[1]/ul/li/a[1]")
		private static WebElement  New_LayoutBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[1]/ul/li/a[2]")
		private static WebElement  New_PageBtn;
	
	@FindBy(xpath="//i[@class='icon-font6 icon-open']")
	private static WebElement  Opendropdown;
	
		@FindBy(xpath="//*[@id='forHf']/span[2]/ul/li/a[1]")
		private static WebElement  OpenBtn;
	
	   //Pop
	    @FindBy(xpath="//*[@id='1']")
	    private static WebElement  Open_Selct1Option;
	
	    @FindBy(xpath="//button[@id='btn_PopUpOk']")
		private static WebElement  OpenBtn_OkBtn;
		
		@FindBy(xpath="//*[@id='id_PopUp']/div/div/div[3]/button[2]")
		private static WebElement  OpenBtn_CancelBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[2]/ul/li/a[2]")
	private static WebElement FromXMLBtn;
	
	@FindBy(xpath="//i[@class='icon-font6 icon-save']")
	private static WebElement  Savedropdown;

		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[1]")
		private static WebElement  PrintSaveBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[2]")
		private static WebElement  SaveAsBtn; 
		
		@FindBy(xpath="//input[@id='id_PopuplayoutName']")
		private static WebElement  SaveTxtField;
		
		@FindBy(xpath="//input[@id='id_PopuplayoutName']")
		private static WebElement  Save_OkBtn;
		
		@FindBy(xpath="//*[@id='id_PopUp']/div/div/div[3]/button[2]")
		private static WebElement  Save_CancekBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[3]")
		private static WebElement  SaveAsImageBtn; //No Response
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[4]")
		private static WebElement  SaveAsXMLBtn; // Downloads xml file
		
		@FindBy(xpath="//*[@id='forHf']/span[3]/ul/li/a[5]")
		private static WebElement  SaveAsHTMLBtn; 
	
	@FindBy(xpath="//*[@id='forHf']/span[4]")
	private static WebElement  Removedropdown;
	
		@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[1]")
		private static WebElement  RemoveBtn;  
		
		@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[2]")
		private static WebElement  RemoveCurrentPageBtn; 
                          
		//popup Error MEssage 
		@FindBy(xpath="//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[1]")
		private static WebElement  ErrorMessage;//This Is only Page.You Not Delete this Page --Message while using RemovecurrentPAgeBtn 
		
		@FindBy(xpath="//*[@id='forHf']/span[4]/ul/li/a[3]")
		private static WebElement  RemoveControlBtn;				
	
	@FindBy(xpath="//*[@id='forHf']/span[5]")
	private static WebElement  PageNo;
	
	@FindBy(xpath="//*[@id='forHf']/span[6]")
	private static WebElement  Controldrpdown;
			
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[1]")
		private static WebElement  StaticTextBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[2]")
		private static WebElement  BitmapBtn;
		
		@FindBy(xpath="//a[contains(text(),'Body Grid')]")
		private static WebElement  BodyGridBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[4]")
		private static WebElement  RectangleBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[5]")
		private static WebElement  EcllipseBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[6]")
		private static WebElement  LineBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[7]")
		private static WebElement  AreaBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[8]")
		private static WebElement  TableBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[6]/ul/li/a[9]")
		private static WebElement  ApprovalHistoryBtn;

	@FindBy(xpath="//*[@id='forHf']/span[7]/span/i[1]")
	private static WebElement  Alignmentdropdown;
			
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[1]")
		private static WebElement  LeftAlignmentBtn;
					
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[2]")
		private static WebElement  RightAlignmentBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[3]")
		private static WebElement  TopAlignmentBtn;	
		
		@FindBy(xpath="//*[@id='forHf']/span[7]/ul/li/a[4]")
		private static WebElement  BottomAlignmentBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[8]")
	private static WebElement  Sizedropdown;
	
		@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[1]")
		private static WebElement  SameSizeBtn;
					
		@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[2]")
		private static WebElement  SameWidthBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[8]/ul/li/a[3]")
		private static WebElement  SameHeightBtn;
	
	@FindBy(xpath="//*[@id='forHf']/span[9]")
	private static WebElement  Printdropdown;
	
	@FindBy(xpath="//*[@id='menu-print']")
	private static WebElement  Print_PrintBtn;
						
		@FindBy(xpath="//*[@id='menu-preview']	")
		private static WebElement  Print_PreviewBtn;
		
		@FindBy(xpath="//*[@id='fit-button']")
		private static WebElement  Preview_FitToWidthBtn;
		
		@FindBy(xpath="//*[@id='zoom-in-button']")
		private static WebElement  PreviewZ_ZoomInBtn;
		
		@FindBy(xpath="//*[@id='zoom-out-button']")
		private static WebElement  Preview_ZoomOutBtn;
		
		@FindBy(xpath="//*[@id='forHf']/span[9]/ul/li/a[3]")
		private static WebElement  PageSetUpBtn;
		
		@FindBy(xpath="//*[@id='id_PageSetUpPreview']")
		private static WebElement  PageSetupPagePreviewField;
		
		@FindBy(xpath="//*[@id='id_PageType']")
		private static WebElement  PageSetupPaperSizedropdown;
		
		@FindBy(xpath="//*[@id='id_PaperOrientation'][@value='0']")
		private static WebElement  PageSetupPotraitRadio;
		
		@FindBy(xpath="//*[@id='id_PaperOrientation'][@value='1']")
		private static WebElement  PageSetupLandScapeRadio;
		
		@FindBy(xpath="//*[@id='id_PaperUnit'][@value='0']")
		private static WebElement  PageSetupCentimetersRadio;
		
		@FindBy(xpath="//*[@id='id_PaperUnit'][@value='1']")
		private static WebElement  PageSetupInchesRadio;
		
		@FindBy(xpath="//*[@id='id_PageSizeLeftMarginDisplay']")
		private static WebElement  PageSetupLeftTxt;
		
		@FindBy(xpath="//*[@id='id_PageSizeRightMarginDisplay']")
		private static WebElement  PageSetupRightTxt;
		
		@FindBy(xpath="//*[@id='id_PageSizeTopMarginDisplay']")
		private static WebElement  PageSetupTopTxt;
		
		@FindBy(xpath="//*[@id='id_PageSizeTopMarginDisplay']")
		private static WebElement  PageSetupBottomTxt;
		
		@FindBy(xpath="//*[@id='id_PageSetupOkBtn']")
		private static WebElement  PageSetupOkBtn;
		
		@FindBy(xpath="//*[@id='id_PageSetupCancelBtn']")
		private static WebElement  PageSetUpCancelBtn;
                  
	@FindBy(xpath="//*[@id='id_InvoiceDesingCancel']/i")
	private static WebElement  ExitBtn;	
	
	//Header Elements
	
	@FindBy(xpath="//*[@id='li_InvoicePageSetup']/a")
	private static WebElement  headerPageSetUpTab;
	
	@FindBy(xpath="//*[@id='li_InvoiceDesigner']/a")
	private static WebElement headerDesignerTab;
	
	@FindBy(xpath="//*[@id='li_InvoicePreview']/a")
	private static WebElement  headerPreviewTab;
	
	//Fields  
	
	@FindBy(xpath="//*[@id='LiDesignField']/a")
	private static WebElement  headerFieldsTab;
	
	@FindBy(xpath="//*[@id='LiProp']/a")
	private static WebElement  headerPropertiesTab;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/a")
	private static WebElement  fields_CompanyExpandBtn;
	
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[1]")
		private static WebElement  fields_Company_CompanyName;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[2]")
		private static WebElement  fields_Company_CompanyCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]")
		private static WebElement  fields_Company_AccountingDate;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]")
		private static WebElement  fields_Company_Address1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[5]")
		private static WebElement  fields_Company_Address2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[6]")
		private static WebElement  fields_Company_City;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[7]")
		private static WebElement  fields_Company_Zipcode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[8]")
		private static WebElement  fields_Company_Country;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[9]")
		private static WebElement  fields_Company_PhoneNumber1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[10]")
		private static WebElement  fields_Company_PhoneNumber2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[11]")
		private static WebElement  fields_Company_Fax;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[12]")
		private static WebElement  fields_Company_TaxRegestrationNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[13]")
		private static WebElement  fields_Company_ExciseRegistrationNumber;

	@FindBy(xpath="//span[contains(text(),'Header')]")
	private static WebElement   fields_HeaderExpandBtn;
	             
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/a")
		private static WebElement  fields_Header_DocNo;
	
	@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'Date')]//i[@class='icon-expand icon-font8']")
	private static WebElement  fields_Header_DateExpandBtn;
	
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[2]/ul/li[1]/a")
		private static WebElement  header_Date;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[2]/ul/li[2]/a")
		private static WebElement  header_Date_Year;
		
		@FindBy(xpath="///*[@id='InvoiceDesignheader']/ul/li[1]/ul/li[2]/ul/li[3]/a")
		private static WebElement  header_Date_Month;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[2]/ul/li[4]/a")
		private static WebElement  header_Date_DayOfYear;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[2]/ul/li[5]/a")
		private static WebElement  header_Date_Day;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[2]/ul/li[6]/a")
		private static WebElement  header_Date_Week;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[2]/ul/li[7]/a")
		private static WebElement  header_Date_WeekDay;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[3]/a")
		private static WebElement  fields_Header_TimeExpandBtn;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[3]/ul/li[1]/a")
		private static WebElement  headers_Time_Time;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[3]/ul/li[2]/a")
		private static WebElement  headers_Time_Hour;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[3]/ul/li[3]/a")
		private static WebElement  headers_Time_Minute;
		
		@FindBy(xpath="//*[@id='InvoiceDesignheaders']/ul/li[1]/ul/li[3]/ul/li[4]/a")
		private static WebElement headers_Time_Second;
	
	@FindBy(xpath="//span[contains(text(),'CashBankAC')]")
	private static WebElement fields_Header_CashBankACExpandBtn;
	
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[1]/a")
		private static WebElement  cashAndBankAC_Name;
					
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[2]/a")
		private static WebElement  cashAndBankAC_Code;
					
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[3]/a")
		private static WebElement  cashAndBankAC_Alias;
					
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[4]/a")
		private static WebElement  cashAndBankAC_Accounttype;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[5]/a")
		private static WebElement  cashAndBankAC_Address;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[6]/a")
		private static WebElement  cashAndBankAC_AllowCustomerPortal;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[7]/a")
		private static WebElement  cashAndBankAC_BanckAC;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[8]/a")
		private static WebElement  cashAndBankAC_BankACcode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[9]/a")
		private static WebElement  cashAndBankAC_BankAccountName;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[10]/a")
		private static WebElement  cashAndBankAC_BankAccountNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[11]/a")
		private static WebElement  cashAndBankAC_ChequeDiscountLimit;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[12]/a")
		private static WebElement  cashAndBankAC_City1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[13]/a")
		private static WebElement  cashAndBankAC_CityCode1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[14]/a")
		private static WebElement  cashAndBankAC_City2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[15]/a")
		private static WebElement  cashAndBankAC_CityCode2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[16]/a")
		private static WebElement  cashAndBankAC_ConsolidationMethod;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[17]/a")
		private static WebElement  cashAndBankAC_CreditDays;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[18]/a")
		private static WebElement  cashAndBankAC_CreditLimit;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[19]/a")
		private static WebElement  cashAndBankAC_DebitCreditProposal;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[20]/a")
		private static WebElement  cashAndBankAC_DebitCreditRequired;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[21]/a")
		private static WebElement  cashAndBankAC_DefaultCurrency;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[22]/a")
		private static WebElement  cashAndBankAC_DeliveryAddress;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[23]/a")
		private static WebElement  cashAndBankAC_Email;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[24]/a")
		private static WebElement  cashAndBankAC_ExchangeAdjustGainAC;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[25]/a")
		private static WebElement  cashAndBankAC_ExchangeAdjustGainACcode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[26]/a")
		private static WebElement  cashAndBankAC_ExchangeAdjustLossAC;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[27]/a")
		private static WebElement  cashAndBankAC_ExchangeAdjustLossACcode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[28]/a")
		private static WebElement  cashAndBankAC_FaxNo;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[29]/a")
		private static WebElement  cashAndBankAC_FinanceChargeTerms;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[30]/a")
		private static WebElement  cashAndBankAC_FinanaceEmail;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[31]/a")
		private static WebElement  cashAndBankAC_IFSCcode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[32]/a")
		private static WebElement  cashAndBankAC_Password;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[33]/a")
		private static WebElement  cashAndBankAC_PaymentTerms;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[34]/a")
		private static WebElement  cashAndBankAC_PaymentType;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[35]/a")
		private static WebElement  cashAndBankAC_PDCdiscountedAC;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[36]/a")
		private static WebElement  cashAndBankAC_PDCdiscountedACcode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[37]/a")
		private static WebElement  cashAndBankAC_Pin1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[38]/a")
		private static WebElement  cashAndBankAC_Pin2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[39]/a")
		private static WebElement  cashAndBankAC_PortalEmail;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[40]/a")
		private static WebElement  cashAndBankAC_PrimaryAccount;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[41]/a")
		private static WebElement  cashAndBankAC_PrimanryAccountCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[42]/a")
		private static WebElement  cashAndBankAC_RateOFInterest;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[43]/a")
		private static WebElement  cashAndBankAC_ReminderTerms;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[44]/a")
		private static WebElement  cashAndBankAC_SendEmaialToCustomer;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[45]/a")
		private static WebElement  cashAndBankAC_TelNo;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[46]/a")
		private static WebElement  cashAndBankAC_GropupLevel1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[47]/a")
		private static WebElement  cashAndBankAC_GroupLevel1Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[48]/a")
		private static WebElement  cashAndBankAC_GroupLevel2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[49]/a")
		private static WebElement  cashAndBankAC_GroupLevel2Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[50]/a")
		private static WebElement  cashAndBankAC_GroupLevel3;
		               
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[51]/a")
		private static WebElement  cashAndBankAC_GroupLevel3Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[52]/a")
		private static WebElement  cashAndBankAC_GroupLevel4;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[53]/a")
		private static WebElement  cashAndBankAC_GroupLevel4Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[54]/a")
		private static WebElement  cashAndBankAC_GroupLevel5;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[55]/a")
		private static WebElement  cashAndBankAC_GroupLevel5Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[56]/a")
		private static WebElement  cashAndBankAC_GroupLevel6;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[57]/a")
		private static WebElement  cashAndBankAC_GroupLevel6Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[58]/a")
		private static WebElement  cashAndBankAC_GroupLevel7;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[1]/ul/li[4]/ul/li[59]/a")
		private static WebElement  cashAndBankAC_GroupLevel7Code;
		
			
	@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'Department')]")
	private static WebElement  fields_Header_DepartmentExpandBtn;
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Location')]")
	private static WebElement  fields_Header_LocationExpandBtn;
	
	@FindBy(xpath="//span[contains(text(),'sNarration')]")
	private static WebElement  header_sNarration;
	
	@FindBy(xpath="//span[contains(text(),'sChequeNo')]")
	private static WebElement  header_sChequeNo;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[9]/a/span")
	private static WebElement  header_User;
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Role')]")
	private static WebElement  header_Role;
	
	@FindBy(xpath="//span[contains(text(),'UserVal1')]")
	private static WebElement  header_UserValue1;
	
	@FindBy(xpath="//span[contains(text(),'UserVal2')]")
	private static WebElement  header_UserValue2;
	
	@FindBy(xpath="//span[contains(text(),'UserVal3')]")
	private static WebElement  header_UserValue3;
	
	@FindBy(xpath="//span[contains(text(),'UserVal4')]")
	private static WebElement  header_UserValue4;
	
	@FindBy(xpath="//span[contains(text(),'UserVal5')]")
	private static WebElement  header_UserValue5;
	
	@FindBy(xpath="//span[contains(text(),'VoucherName')]")
	private static WebElement  header_VoucherName;
	
	
	//Body Expansion Fields
	
	@FindBy(xpath="//span[contains(text(),'Body')]")
	private static WebElement  fields_BodyExpansionBtn;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/a")
	private static WebElement  fields_Body_AccountExpansionBtn;
	
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[1]/a")
		private static WebElement body_Name;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[2]/a")
		private static WebElement body_Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[3]/a")
		private static WebElement body_Alias;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[4]/a")
		private static WebElement body_AccountType;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[5]/a")
		private static WebElement body_Address;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[6]/a")
		private static WebElement body_AlloowCoustmerPortal;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[7]/a")
		private static WebElement body_BankAc;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[8]/a")
		private static WebElement body_BAnkAcCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[9]/a")
		private static WebElement body_BanbkAccountName;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[10]/a")
		private static WebElement body_BankAccountNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[11]/a")
		private static WebElement body_BAnkDiscountLimit;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[12]/a")
		private static WebElement body_City1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[13]/a")
		private static WebElement body_CityCode1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[14]/a")
		private static WebElement body_City2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[15]/a")
		private static WebElement body_CityCode2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[16]/a")
		private static WebElement body_ConsoildationMethod;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[17]/a")
		private static WebElement body_CreditDays;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[18]/a")
		private static WebElement body_CreditLimit;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[19]/a")
		private static WebElement body_DebitOrCreditProposal;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[20]/a")
		private static WebElement body__DebitOrCreditRequired;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[21]/a")
		private static WebElement body_DefaultCurrency;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[22]/a")
		private static WebElement body_DeliveryAddress;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[23]/a")
		private static WebElement body_Email;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[24]/a")
		private static WebElement body_ExchangeAdjustmentGainAC;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[25]/a")
		private static WebElement body_ExchangeAdjustmentGainAcCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[26]/a")
		private static WebElement body_fields_Header_ExchangeAdjustmentLossAC;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[27]/a")
		private static WebElement body_fields_Header_ExchangeAdjustmentLossACCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[28]/a")
		private static WebElement body_FaxNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[29]/a")
		private static WebElement body_FininaceChargeTerms;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[30]/a")
		private static WebElement body_FinanceEmail;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[31]/a")
		private static WebElement body_IFSCCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[32]/a")
		private static WebElement body_Password;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[33]/a")
		private static WebElement body_PaymentTerms;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[34]/a")
		private static WebElement body_PaymentType;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[35]/a")
		private static WebElement body_PDCDiscountedAC;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[36]/a")
		private static WebElement body_PDCDiscountedACCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[37]/a")
		private static WebElement body_Pin1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[38]/a")
		private static WebElement body_Pin2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[39]/a")
		private static WebElement body_POrtalEmail;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[40]/a")
		private static WebElement body_PrimaryAccount;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[41]/a")
		private static WebElement body_PrimaryAccountCode;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[42]/a")
		private static WebElement body_RateOfInterest;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[43]/a")
		private static WebElement body_RemainderTerms;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[44]/a")
		private static WebElement body_SendEmailTOCustomer;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[45]/a")
		private static WebElement body_TelNumber2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[46]/a")
		private static WebElement body_GroupLevel1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[47]/a")
		private static WebElement body_GroupLevel1Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[48]/a")
		private static WebElement body_GroupLevel2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[49]/a")
		private static WebElement body_GroupLevel2Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[50]/a")
		private static WebElement body_GroupLevel3;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[51]/a")
		private static WebElement body_GroupLevel3Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[52]/a")
		private static WebElement body_GroupLevel4;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[53]/a")
		private static WebElement body_GroupLevel4Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[54]/a")
		private static WebElement body_GroupLevel5;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[55]/a")
		private static WebElement body_GroupLevel5Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[56]/a")
		private static WebElement body_GroupLevel6;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[57]/a")
		private static WebElement body_GroupLevel6Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[58]/a")
		private static WebElement body_GroupLevel7;
		              
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[1]/ul/li[59]/a")
		private static WebElement body_GroupLevel7Code;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[2]/a")
		private static WebElement body_Amount;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[3]/a")
		private static WebElement body_VouchurAmount;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[4]/a")
		private static WebElement body_Referrence;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[5]/a")
		private static WebElement body_Net;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[6]/a")
		private static WebElement body_VoucherNet;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[7]/a")
		private static WebElement body_SRemarks;

	//UserDetails

	@FindBy(xpath="//span[contains(text(),'User details')]")
	private static WebElement  fields_UserDetailsExpansionBtn;
	
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[1]/a")
		private static WebElement userDetails_UserName;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[2]/a")
		private static WebElement userDetails_MobileNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[3]/a")
		private static WebElement userDetails_PhoneNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[4]/a")
		private static WebElement userDetails_EmailId;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[5]/a")
		private static WebElement userDetails_Singature;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[6]/a")
		private static WebElement userDetails_Employee;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[7]/a")
		private static WebElement userDetails_AuthoriseUserName;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[8]/a")
		private static WebElement userDetails_AuthoriseUserMobileNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[9]/a")
		private static WebElement userDetails_AuthoriseUserPhoneNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[10]/a")
		private static WebElement userDetails_AuthoriseUserEmailId;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[11]/a")
		private static WebElement userDetails_AuthoriseUserSignature;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[12]/a")
		private static WebElement userDetails_AuthoriseBy;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[13]/a")
		private static WebElement userDetails_NextAuthoriseUserName;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[14]/a")
		private static WebElement userDetails_NextUserMobileNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[15]/a")
		private static WebElement userDetails_NextUserPhoneNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[16]/a")
		private static WebElement userDetails_NextUserEmailId;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[17]/a")
		private static WebElement userDetails_NextUserSignature;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[18]/a")
		private static WebElement userDetails_CreatedBySignature;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[19]/a")
		private static WebElement userDetails_ModifiedBySignature;

	
	//Miscellaneous 
	
	@FindBy(xpath="//li[@class='treeview active']//span[contains(text(),'Miscellaneous')]")
	private static WebElement  fields_MiscellaneousExpansionBtn;
	
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[1]/a")
		private static WebElement miscellaneous_Longdate;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[2]/a")
		private static WebElement miscellaneous_PageNumber;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[3]/a")
		private static WebElement miscellaneous_Printdate;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[4]/a")
		private static WebElement miscellaneous_PrintTime;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[5]/a")
		private static WebElement miscellaneous_TotalPage;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[6]/a")
		private static WebElement miscellaneous_Sno;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[7]/a")
		private static WebElement miscellaneous_PageType;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[8]/a")
		private static WebElement miscellaneous_AgingDetails;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[9]/a")
		private static WebElement miscellaneous_AgingAmounts;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[10]/a")
		private static WebElement miscellaneous_AgingHeadings;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[11]/a")
		private static WebElement miscellaneous_Agingbalance;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[12]/a")
		private static WebElement miscellaneous_AgingSlab1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[13]/a")
		private static WebElement miscellaneous_AgingSlab2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[14]/a")
		private static WebElement miscellaneous_AgingSlab3;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[15]/a")
		private static WebElement miscellaneous_AgingSlab4;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[16]/a")
		private static WebElement miscellaneous_AgingSlab5;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[17]/a")
		private static WebElement miscellaneous_AgingSlab6;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[5]/ul/li[18]/a")
		private static WebElement miscellaneous_AgingMonthWise;
		
	//'SMS template 
	
	@FindBy(xpath="//u[contains(text(),'SMS template')]")
	private static WebElement headerSMSTemplate;					
	
	//Pop As Same Above Email Header Template
	//Alerts
	@FindBy(xpath="//u[contains(text(),'Alerts')]")
	private static WebElement headerAlert;
	
	//Pop As Same Above Email Header Template
	
	//Recipient
	@FindBy(xpath="//div[contains(text(),'Recipient')]")
	private static WebElement headerRecipient;					
	
	//Pop As Same Above Email Header Template
						
	//Escalation
	
	@FindBy(xpath="//span[@class='font-5'][contains(text(),'Escalation')]")
	private static WebElement escalationTab;					

	@FindBy(xpath="//*[@id='spnAddEscalation']/i")
	private static WebElement escalationLevelAddBtn;					
	
	//First Escalation
	
	@FindBy(xpath="//*[@id='txtTimeLimit1']")
	private static WebElement TimelimitTxt1;					
			
	@FindBy(xpath="//*[@id='ddlTimeLimit1']")
	private static WebElement timelimitDropdown1;					
			
	@FindBy(xpath="//*[@id='ddlEscalationType1']")
	private static WebElement EscalationType1;	
	
	@FindBy(xpath="//*[@id='divEscalation1']/div[1]/div[2]/i[1]")
	private static WebElement Minimize1;					
	
	@FindBy(xpath="//*[@id='divEscalation1']/div[1]/div[2]/i[2]")
	private static WebElement Close1;					
			
	//Second Escalation
	
	@FindBy(xpath="//*[@id='txtTimeLimit2']")
	private static WebElement TimelimitTxt2;					
			
	@FindBy(xpath="//*[@id='ddlTimeLimit2']")
	private static WebElement Dropdown2;					
			
	@FindBy(xpath="//*[@id='ddlEscalationType2']")
	private static WebElement EscalationType2;	
	
	@FindBy(xpath="//*[@id='divEscalation2']/div[1]/div[2]/i[1]")
	private static WebElement Minimize2;					
	
	@FindBy(xpath="//*[@id='divEscalation2']/div[1]/div[2]/i[2]")
	private static WebElement Close2;				
	
	
	/// Ok And Cancel for Authorization Definition
	
	@FindBy(xpath="//*[@id='id_report_popup_ok']/i")
	private static WebElement definitionOkBtn;					
			
	@FindBy(xpath="//*[@id='id_report_popup_cancel']/i	")
	private static WebElement definitionCloseBtn;					
	
	@FindBy(xpath="//*[@id='16']/div/span")
	private static WebElement  settingsmenuBtn;
	
	@FindBy(xpath="//span[contains(text(),'Configure Transactions')]")
	private static WebElement  configureTransactionBtn;
	
	
	
	@FindBy(xpath="//*[@id='68']/span")
	private static WebElement  transactionAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='235']/span")
	private static WebElement  pricebookAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='19']/span")
	private static WebElement  configureMastersBtn;
	
	@FindBy(xpath="//*[@id='67']/span")
	private static WebElement  masterAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='69']/span")
	private static WebElement  creditLimitAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='74']/span")
	private static WebElement  designWorkflowBtn;
	
	@FindBy(xpath="//*[@id='105']/span")
	private static WebElement  settingsWizardBtn;
	
	@FindBy(xpath="//*[@id='232']/span")
	private static WebElement  batchCodeGenerationBtn;
	
	@FindBy(xpath="//*[@id='34']/span")
	private static WebElement  mapCreditLimitBtn;
	
	@FindBy(xpath="//*[@id='257']/span")
	private static WebElement  vatTaxCodeBtn;
	
	@FindBy(xpath="//*[@id='258']/span")
	private static WebElement  customerPortalAdminBtn;
	
	@FindBy(xpath="//*[@id='3308']/span")
	private static WebElement  budgetAuthorizationBtn;
	
	@FindBy(xpath="//*[@id='3320']/span")
	private static WebElement  paymentGatewayIntegrationBtn;
	
	@FindBy(xpath="//div[@class='theme_color font-6']")
	public static WebElement errorMessage;
	
	@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
	public static WebElement errorMessageCloseBtn;
	
	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboardName;
	
	@FindBy(xpath="//div[@id='divLevel1']//div[@class='row clsDivAuthorizationName']")
	private static WebElement level1;
	
	@FindBy(xpath="//div[@id='divLevel1']//i[@class='icon-edit icon-font7']")
	private static WebElement Level1editBtn;
	
	@FindBy(xpath="//div[@id='divLevel1']//i[@class='icon-new icon-font7']")
	private static WebElement AddLevel1Btn;
	
	@FindBy(xpath="//div[@id='divLevel1']//i[@class='icon-add-parallel icon-font7']")
	private static WebElement AddParallel1Btn;
	
	@FindBy(xpath="//div[@id='divLevel1']//i[@class='icon-delete icon-font7']")
	private static WebElement DeleteLevel1Btn;
	
	@FindBy(xpath="//span[@id='chkLevelCheck1']//input[@id='chkLevelCheck0']")
	private static WebElement LevelCheck1ChkBox;
	
	
	@FindBy(xpath="//div[@id='divLevel2']//div[@class='row clsDivAuthorizationName']")
	private static WebElement level2;
	
	@FindBy(xpath="//div[@id='divLevel2']//i[@class='icon-edit icon-font7']")
	private static WebElement Level2editBtn;
	
	@FindBy(xpath="//div[@id='divLevel2']//i[@class='icon-new icon-font7']")
	private static WebElement AddLevel2Btn;
	
	@FindBy(xpath="//div[@id='divLevel2']//i[@class='icon-add-parallel icon-font7']")
	private static WebElement AddParallel2Btn;
	
	@FindBy(xpath="//div[@id='divLevel2']//i[@class='icon-delete icon-font7']")
	private static WebElement Level2DeleteBtn;
	
	@FindBy(xpath="//span[@id='chkLevelCheck2']//input[@id='chkLevelCheck0']")
	private static WebElement LevelCheck2ChkBox;
	
	
	@FindBy(xpath="//span[@class='hidden-xs']")
	private static WebElement userNameDisplay;

    
   /* @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[7]/a/span")
	private static WebElement userNameDisplay;*/

	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;

	@FindBy(xpath="//*[@id='companyLogo']")
	private static WebElement companyLogo;
    
	@FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboard;
	
	@FindBy(xpath="//input[@id='donotshow']")
	private static WebElement doNotShowCheckbox;
    
    @FindBy(xpath="//span[@class='pull-right']")
	private static WebElement closeBtnInDemoPopupScreen;
	
	 
public static void checkPopUpWindow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	 Thread.sleep(5000);
       
       try 
       {
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotShowCheckbox));
			doNotShowCheckbox.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInDemoPopupScreen));
			closeBtnInDemoPopupScreen.click(); 
			
			System.err.println("POP UP DISPLAYED AND CLOSED SUCCESSFULLY");
			
		} 
       catch (Exception e)
       {
       	System.err.println("NO POP UP DISPLAYED");
		}

   	
   	Thread.sleep(4000);
}
		 



/*public boolean checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
        try
        {
                getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
                String actErrorMessage=errorMessage.getText();
                String expErrorMessage=ExpMessage;
                
                System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
                
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
                errorMessageCloseBtn.click();
                
                if(actErrorMessage.equalsIgnoreCase(expErrorMessage))
                {
                        System.err.println("Error Message is as Expected");
                        return true;
                }
                else
                {
                        System.err.println("Error Message is NOT as Expected");
                        return false;
                }
        }
        catch(Exception e)
        {
                System.err.println("Error Message NOT Found or NOT Clickable");
                System.err.println(e.getMessage());
                return false;
        }
}

		
*/


public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
        try
        {
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
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
		



	@FindBy(xpath="//button[contains(text(),'Ok')]")
	private static WebElement loginRefreshOkBtn;
	
	
	public static void checkRefershPopOnlogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	
	try 
	{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginRefreshOkBtn));
	loginRefreshOkBtn.click();
	
	
	} 
	catch (Exception e)
	{
	System.err.println("NO ALERT POP UP DISPLAYED");
	}
	
	
	Thread.sleep(4000);
	}
	

	private static String xlfile;
	private static String resPass="Pass";
	private static String resFail="Fail";
	private static ExcelReader excelReader;


	private static String xlSheetName = "SmokeTransactionAuthorization";

	private String actValidationMsg;
	
	private static int cSize; 
	 
	public boolean checkLoginToCheckTransactionAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		 excelReader=new ExcelReader(POJOUtility.getExcelPath());
		 xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		 
		 getDriver().navigate().refresh();
		 Thread.sleep(3000);
		 
		 getDriver().navigate().refresh();
		 Thread.sleep(3000);
			
		 LoginPage lp=new LoginPage(getDriver()); 
			
	     String unamelt="su";
	      
	     String pawslt="su";
	      
         lp.enterUserName(unamelt);

         lp.enterPassword(pawslt);
         
         String compname="Automation Company";
		 	
		 Select oSelect = new Select(companyDropDownList);
		 
		 List <WebElement> elementCount = oSelect.getOptions();
		
		 int cqSize = elementCount.size();
		 
		 int zqSize=cSize+1;
		 
		 System.out.println("CompanyDropdownList Count :"+cqSize);
		 
		 System.out.println("Company dropdown is :"+ zqSize);
	 
	 
	 //Select dropdown= new Select(lp.companyDropDownList);
	  int i;
	  
	  //List<WebElement> list = dropdown.getOptions();

		//List<String> text = new ArrayList<>();
		for(i=0; i<elementCount.size(); i++) 
		{
		
		  elementCount.get(i).getText();
  	  String optionName = elementCount.get(i).getText();
  	  if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
  	  {
  		  System.out.println("q"+elementCount.get(i).getText());
  		  elementCount.get(i).click();
  		  
  	  }
    
    }
  
         lp.clickOnSignInBtn();
              
         Thread.sleep(9000); 
	    
    	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
    	 
    	 String userInfo=userNameDisplay.getText();
     	
     	 System.out.println("User Info : "+userInfo);
    		 
    	 System.out.println("User Info Capture Text :"+userNameDisplay.getText());
     	 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    	 companyLogo.click();
    	 String getCompanyTxt=companyName.getText();
    	   	 
    	 String getLoginCompanyName=getCompanyTxt.substring(0, 19);
    	 System.out.println("company name :"+ getLoginCompanyName);
    	 companyLogo.click();
    	
    	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
    	
    	 String getDashboard=dashboard.getText();
    	
    	 System.out.println(getDashboard);

		  if(userInfo.equalsIgnoreCase("SU") && getLoginCompanyName.equalsIgnoreCase("Automation Company ") &&
		    		getDashboard.equalsIgnoreCase("Dashboard"))
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
	
	
	
	
	
	public boolean 	checkTransactionAuthorizationOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
		System.out.println("Setting buton is enabled");
		serachMenuTextHomePage.click();
		serachMenuTextHomePage.sendKeys("Transaction Authorization");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
		searchMenuTextClick.click();	
		
		Thread.sleep(4000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
		
		  boolean actdocumentNameDropdown                 = documentNameDropdown.isDisplayed();
			boolean actnameTxt                              = nameTxt.isDisplayed();
			boolean actactiveChkBox                         = activeChkBox.isDisplayed();
			boolean actalwaysauthorstartsfirstlevelChkBox   = alwaysauthorizationstartsfromfirstlevelChkBox.isDisplayed();
			boolean actaddLevelBtn                          = addLevelBtn.isDisplayed();
			boolean actstartPointBtn                        = startPointBtn.isDisplayed();
			boolean actclearbtn               				= clearbtn.isDisplayed();
			boolean actsaveBtn  							= saveBtn.isDisplayed();
			boolean actcancelBtn 							= cancelBtn.isDisplayed();
			boolean actfinancialAccountingChkBox			= financialAccountingChkBox.isDisplayed();
			boolean actlinksChkBox							= linksChkBox.isDisplayed();
			boolean actlinksBaseChkBox						= linksBaseChkBox.isDisplayed();
			
			boolean expdocumentNameDropdown                 = true;
			boolean expnameTxt            					= true;
			boolean expactiveChkBox                			= true;
			boolean expalwaysauthorstartsfirstlevelChkBox   = true;
			boolean expaddLevelBtn          				= true;
			boolean expstartPointBtn              			= true;
			boolean expclearbtn               				= true;
			boolean expsaveBtn  							= true;
			boolean expcancelBtn							= true;
			boolean expfinancialAccountingChkBox			= true;
			boolean explinksChkBox							= true;
			boolean explinksBaseChkBox						= true;
			
			System.out.println("********************* checkTransactionAuthorizationOptions ******************");
		
			System.out.println("Home Page documentNameDropdown               :"+actdocumentNameDropdown+              "  Value Expected : "+expdocumentNameDropdown);
			System.out.println("Home Page nameTxt                            :"+actnameTxt+                           "  Value Expected : "+expnameTxt);
			System.out.println("Home Page activeChkBox                       :"+actactiveChkBox+                      "	 Value Expected : "+expactiveChkBox);
			System.out.println("Home Page alwaysauthorstartsfirstlevelChkBox :"+actalwaysauthorstartsfirstlevelChkBox+"	 Value Expected : "+expalwaysauthorstartsfirstlevelChkBox);
	        System.out.println("Home Page addLevelBtn                        :"+actaddLevelBtn+                       "  Value Expected : "+expaddLevelBtn);
			System.out.println("Home Page startPointBtn                      :"+actstartPointBtn+                     "  Value Expected : "+expstartPointBtn);
			System.out.println("Home Page clearbtn                           :"+actclearbtn+                          "  Value Expected : "+expclearbtn);
			System.out.println("Home Page saveBtn                            :"+actsaveBtn+                           "	 Value Expected : "+expsaveBtn);
			System.out.println("Home Page cancelBtn 						 :"+actcancelBtn+                         "	 Value Expected : "+expcancelBtn);
			System.out.println("Home Page financialAccountingChkBox          :"+actfinancialAccountingChkBox+         "  Value Expected : "+expfinancialAccountingChkBox);
			System.out.println("Home Page linksChkBox                        :"+actlinksChkBox+                       "	 Value Expected : "+explinksChkBox);
			System.out.println("Home Page savlinksBaseChkBoxeBtn             :"+actlinksBaseChkBox+                   "  Value Expected : "+explinksBaseChkBox);
		
		
		
		boolean actMethod=actdocumentNameDropdown==expdocumentNameDropdown  && actnameTxt==expnameTxt &&
				actactiveChkBox==expactiveChkBox && actalwaysauthorstartsfirstlevelChkBox==expalwaysauthorstartsfirstlevelChkBox && 
				actaddLevelBtn==expaddLevelBtn  && actstartPointBtn==expstartPointBtn && 
			    actclearbtn==expclearbtn && actsaveBtn==expsaveBtn && actcancelBtn==expcancelBtn && actfinancialAccountingChkBox==expfinancialAccountingChkBox && 
			    actlinksChkBox==explinksChkBox && actlinksBaseChkBox==explinksBaseChkBox;
		
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 9, 7);
		excelReader.setCellData(xlfile, xlSheetName, 9, 8, actResult);
			
		
		if(actResult.equalsIgnoreCase(expResult))
			
		{
			System.out.println("Test Pass : Transaction Authorization Options Are Available");
			excelReader.setCellData(xlfile, xlSheetName, 8, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Transaction Authorization is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 8, 9, resFail);
			return false;
		}
		
	}
	
	
	@FindBy(xpath="//*[@id='id_menu_tree_Purchases Vouchers']/a/i")
	private static WebElement purchasevoucherExpandbutton;
	
	@FindBy(xpath="//*[@id='id_menu_tree_Purchase Voucher VAT']/a/span")
	private static WebElement purchasevoucherTypeCreatedVoucher;
		
	public boolean 	checkVoucherTypeDocumentOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
		documentNameDropdown.sendKeys(" ");
		
		Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receipts));
		 boolean actreceipts                    = receipts.isDisplayed();
		 boolean actpayments                    = payments.isDisplayed();
		 boolean actpettyCash                   = pettyCash.isDisplayed();
		 boolean actpostDatedReceipts           = postDatedReceipts.isDisplayed();
		 boolean actpostDatedPayments           = postDatedPayments.isDisplayed();
		 boolean actpurchasesVouchers           = purchasesVouchers.isDisplayed();
		 boolean actpurchasesReturns            = purchasesReturns.isDisplayed();
		 boolean actpurchasesOrders             = purchasesOrders.isDisplayed();
		 boolean actmaterialReceiptNotes        = materialReceiptNotes.isDisplayed();
		 boolean actsalesInvoices               = salesInvoices.isDisplayed();
		 boolean actsalesReturns                = salesReturns.isDisplayed();
		 boolean actsalesOrders                 = salesOrders.isDisplayed();
		 boolean actdeliveryNotes               = deliveryNotes.isDisplayed();
		 boolean actnonStandardJournalEntries   = nonStandardJournalEntries.isDisplayed();
		 boolean actjournalEntries              = journalEntries.isDisplayed();
		 boolean actdebitNotes                  = debitNotes.isDisplayed();
		 boolean actcreditNotes                 = creditNotes.isDisplayed();
		 boolean actopeningBalances             = openingBalances.isDisplayed();
		 boolean actshortagesInStock            = shortagesInStock.isDisplayed();
		 boolean actexcessesInStocks            = excessesInStocks.isDisplayed();
		 boolean actstockTransfers              = stockTransfers.isDisplayed();
		 boolean actopeningStocks               = openingStocks.isDisplayed();
		 boolean actissuesToProduction 			= issuesToProduction.isDisplayed();
		 boolean actreceiptsFromProduction 		= receiptsFromProduction.isDisplayed();
		 boolean actjobWorkIssues 				= jobWorkIssues.isDisplayed();
		 boolean actjobWorkReceipts				= jobWorkReceipts.isDisplayed();
		 boolean actpurchasesQuotations 		= purchasesQuotations.isDisplayed();
		 boolean actsalesQuotations				= salesQuotations.isDisplayed();
		 boolean actjobOrder 					= jobOrder.isDisplayed();
		 boolean actproductionProcess 			= productionProcess.isDisplayed();
		 boolean actmaterialRequisition 		= materialRequisition.isDisplayed();
		 boolean actrequestForQuote				= requestForQuote.isDisplayed();
		 boolean actforexJV 					= forexJV.isDisplayed();
			
		 boolean expreceipts                    = true;
		 boolean exppayments                    = true;
		 boolean exppettyCash                   = true;
		 boolean exppostDatedReceipts           = true;
		 boolean exppostDatedPayments           = true;
		 boolean exppurchasesVouchers           = true;
		 boolean exppurchasesReturns            = true;
		 boolean exppurchasesOrders             = true;
		 boolean expmaterialReceiptNotes        = true;
		 boolean expsalesInvoices               = true;
		 boolean expsalesReturns                = true;
		 boolean expsalesOrders                 = true;
		 boolean expdeliveryNotes               = true;
		 boolean expnonStandardJournalEntries   = true;
		 boolean expjournalEntries              = true;
		 boolean expdebitNotes                  = true;
		 boolean expcreditNotes                 = true;
		 boolean expopeningBalances             = true;
		 boolean expshortagesInStock            = true;
		 boolean expexcessesInStocks            = true;
		 boolean expstockTransfers              = true;
		 boolean expopeningStocks				= true;
		 boolean expissuesToProduction 			= true;
		 boolean expreceiptsFromProduction 		= true;
		 boolean expjobWorkIssues 				= true;
		 boolean expjobWorkReceipts 			= true;
		 boolean exppurchasesQuotations  		= true;
		 boolean expsalesQuotations 			= true;	
		 boolean expjobOrder 					= true;	
		 boolean expproductionProcess 			= true;
		 boolean expmaterialRequisition 		= true;
		 boolean exprequestForQuote 			= true;
		 boolean expforexJV 					= true;
		 
		 System.out.println("****************************** checkVoucherTypeDocumentOptions  ********************************************");
		 
		 System.out.println("Receipts               :"+actreceipts+                 "    Value Expected : "+expreceipts);
		 System.out.println("Payments               :"+actpayments+                 "    Value Expected : "+exppayments);
		 System.out.println("PettyCash              :"+actpettyCash+                "	 Value Expected : "+exppettyCash);
		 System.out.println("PostDatedReceipts      :"+actpostDatedReceipts+        "	 Value Expected : "+exppostDatedReceipts);
		 System.out.println("PostDatedPayments      :"+actpostDatedPayments+        "	 Value Expected : "+exppostDatedPayments);
		 System.out.println("PurchasesVouchers      :"+actpurchasesVouchers+        "	 Value Expected : "+exppurchasesVouchers);
		 System.out.println("PurchasesReturns       :"+actpurchasesReturns+         "	 Value Expected : "+exppurchasesReturns);
		 System.out.println("PurchasesOrders        :"+actpurchasesOrders+          "	 Value Expected : "+exppurchasesOrders);
		 System.out.println("MaterialReceiptNotes   :"+actmaterialReceiptNotes+     "	 Value Expected : "+expmaterialReceiptNotes);
		 System.out.println("SalesInvoices          :"+actsalesInvoices+            "	 Value Expected : "+expsalesInvoices);
		 System.out.println("SalesReturns           :"+actsalesReturns+             "	 Value Expected : "+expsalesReturns);
		 System.out.println("SalesOrders            :"+actsalesOrders+              "    Value Expected : "+expsalesOrders);
		 System.out.println("DeliveryNotes          :"+actdeliveryNotes+            "	 Value Expected : "+expdeliveryNotes);
		 System.out.println("NonStandardJouEntries  :"+actnonStandardJournalEntries+"	 Value Expected : "+expnonStandardJournalEntries);
		 System.out.println("JournalEntries         :"+actjournalEntries+           "	 Value Expected : "+expjournalEntries);
		 System.out.println("DebitNotes             :"+actdebitNotes+               "	 Value Expected : "+expdebitNotes);
		 System.out.println("CreditNotes            :"+actcreditNotes+              "	 Value Expected : "+expcreditNotes);
		 System.out.println("OpeningBalances        :"+actopeningBalances+          "	 Value Expected : "+expopeningBalances);
		 System.out.println("ShortagesInStock       :"+actshortagesInStock+         "	 Value Expected : "+expshortagesInStock);
		 System.out.println("ExcessesInStocks       :"+actexcessesInStocks+         "	 Value Expected : "+expexcessesInStocks);
		 System.out.println("StockTransfers         :"+actstockTransfers+           "	 Value Expected : "+expstockTransfers);
		 System.out.println("OpeningStocks          :"+actopeningStocks+            "	 Value Expected : "+expopeningStocks);
		 System.out.println("IssuesToProduction     :"+actissuesToProduction+       "    Value Expected : "+expissuesToProduction);
		 System.out.println("ReceiptsFromProduction :"+actreceiptsFromProduction+   "	 Value Expected : "+expreceiptsFromProduction);
		 System.out.println("JobWorkIssues          :"+actjobWorkIssues+            "	 Value Expected : "+expjobWorkIssues);
		 System.out.println("JobWorkReceipts        :"+actjobWorkReceipts+          "	 Value Expected : "+expjobWorkReceipts);
		 System.out.println("PurchasesQuotations    :"+actpurchasesQuotations+      "	 Value Expected : "+exppurchasesQuotations);
		 System.out.println("JobOrder               :"+actjobOrder+                 "	 Value Expected : "+expjobOrder);
		 System.out.println("ProductionProcess      :"+actproductionProcess+        "	 Value Expected : "+expproductionProcess);
		 System.out.println("MaterialRequisition    :"+actmaterialRequisition+      "	 Value Expected : "+expmaterialRequisition);
		 System.out.println("RequestForQuote        :"+actrequestForQuote+          "	 Value Expected : "+exprequestForQuote);
		 System.out.println("ForexJV                :"+actforexJV+                  "	 Value Expected : "+expforexJV);
		
		
		boolean actMethod=actreceipts==expreceipts  && actpayments==exppayments && actpettyCash==exppettyCash && actpostDatedReceipts==exppostDatedReceipts 
				 && actpostDatedPayments==exppostDatedPayments && actpurchasesVouchers==exppurchasesVouchers&& actpurchasesReturns==exppurchasesReturns 
				 && actpurchasesOrders==exppurchasesOrders && actmaterialReceiptNotes==expmaterialReceiptNotes&& actsalesInvoices==expsalesInvoices 
				 && actsalesReturns==expsalesReturns && actsalesOrders==expsalesOrders && actdeliveryNotes==expdeliveryNotes 
				 && actnonStandardJournalEntries==expnonStandardJournalEntries && actjournalEntries==expjournalEntries && actdebitNotes==expdebitNotes 
				 && actcreditNotes==expcreditNotes && actopeningBalances==expopeningBalances 
				 && actshortagesInStock==expshortagesInStock && actexcessesInStocks==expexcessesInStocks 
				 && actstockTransfers==expstockTransfers && actopeningStocks==expopeningStocks && actissuesToProduction==expissuesToProduction 
				 && actreceiptsFromProduction==expreceiptsFromProduction &&  actjobWorkIssues==expjobWorkIssues 
				 && actpurchasesQuotations==exppurchasesQuotations && actsalesQuotations==expsalesQuotations && actjobOrder==expjobOrder 
				 && actproductionProcess==expproductionProcess && actmaterialRequisition==expmaterialRequisition && actrequestForQuote==exprequestForQuote  
				 && actforexJV==expforexJV ;
		
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 11, 7);
		excelReader.setCellData(xlfile, xlSheetName, 11, 8, actResult);
			
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : DocumentName Dropdown Options Are As expected");
			excelReader.setCellData(xlfile, xlSheetName, 10, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Transaction Authorization is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 10, 9, resFail);
			return false;
		}
	}

	
	
	
	
	
	
	public boolean 	checkSaveWithoutInputOfMandatoryDocument() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage=excelReader.getCellData(xlSheetName, 13, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlSheetName, 13, 8, actMessage);
		
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 12, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Transaction Authorization is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 12, 9, resFail);
			return false;
		}
	}
	
	

	
	
	
	
	
	@FindBy(xpath="//*[@id='AuthTop']/div[1]/div[1]/div[2]/table/tbody/tr/td[2]/img")
	private static WebElement ExpandBtn;
	public boolean 	checkUserCreatedVoucherTypeDocumentOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
			
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ExpandBtn));
		ExpandBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
		purchasevoucherExpandbutton.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
		
		boolean PurchasevoucherTypeCreatedVoucher=purchasevoucherTypeCreatedVoucher.isDisplayed();
		
		String actpurchasevoucherTypeCreatedVoucher=Boolean.toString(PurchasevoucherTypeCreatedVoucher);
		String exppurchasevoucherTypeCreatedVoucher=excelReader.getCellData(xlSheetName, 14, 7);
		excelReader.setCellData(xlfile, xlSheetName, 14, 8, actpurchasevoucherTypeCreatedVoucher);
		
		if(actpurchasevoucherTypeCreatedVoucher.equalsIgnoreCase(exppurchasevoucherTypeCreatedVoucher))
		{
			System.out.println("Test Pass : DocumentName Dropdown Options Are As expected");
			excelReader.setCellData(xlfile, xlSheetName, 14, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Transaction Authorization is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 14, 9, resFail);
			return false;
		}
	}
	
	
	
	
	
	public boolean 	checkSelectingVoucherInDocumentDropdown() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
		purchasevoucherTypeCreatedVoucher.click();
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
		
		String actdata=documentNameDropdown.getAttribute("value");
		String expdata="Purchase Voucher VAT";
		System.out.println("The Voucher Actual Value : " + actdata + "Expected Value : " + expdata);
			
		excelReader.setCellData(xlfile, xlSheetName, 16, 8, actdata);
		
		if(actdata.equalsIgnoreCase(expdata))
		{
			System.out.println("Test Pass : Purchase Voucher N is Selected");
			excelReader.setCellData(xlfile, xlSheetName, 15, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Purchase Voucher N is Selected");
			excelReader.setCellData(xlfile, xlSheetName, 15, 9, resFail);
			return false;
		}	
	}
	
	
	
	public boolean 	checkSaveWithoutInputOfMandatoryName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expValidationMsg=excelReader.getCellData(xlSheetName, 18, 7);
		
		String actValidationMsg=checkValidationMessage(expValidationMsg);
		
		excelReader.setCellData(xlfile, xlSheetName, 18, 8, actValidationMsg);
		
		if(actValidationMsg.equalsIgnoreCase(expValidationMsg))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 17, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Transaction Authorization is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 17, 9, resFail);
			return false;
		}
	}
	


	public boolean 	checkBannerTextInNameTextBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		//Checking 
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		String actdata,expdata;
		actdata=nameTxt.getAttribute("placeholder");	
		expdata=excelReader.getCellData(xlSheetName, 20, 7);
		excelReader.setCellData(xlfile, xlSheetName, 20, 8, actdata);
		
		if(actdata.equalsIgnoreCase(expdata))
		{
			System.out.println("Test Pass : Add New Authorization Flow is Displyed");
			excelReader.setCellData(xlfile, xlSheetName, 19, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Add New Authorization Flow is NOT Displyed");
			excelReader.setCellData(xlfile, xlSheetName, 19, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean 	checkActiveCheckBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(activeChkBox));		
		System.out.println(activeChkBox.isSelected());
			
		boolean ActiveChkBox=activeChkBox.isSelected();
		
		String actactiveChkBox=Boolean.toString(ActiveChkBox);
		String expactiveChkBox=excelReader.getCellData(xlSheetName, 22, 7);
		excelReader.setCellData(xlfile, xlSheetName, 22, 8, actactiveChkBox);	
		
		if(actactiveChkBox.equalsIgnoreCase(expactiveChkBox))
		{
			System.out.println("Test Pass : Active ChkBox IS Enabled/Checked");
			excelReader.setCellData(xlfile, xlSheetName, 23, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Active ChkBox IS NOT Enabled/Checked");
			excelReader.setCellData(xlfile, xlSheetName, 23, 9, resFail);
			return false;
		}
	}

	
	public boolean 	checkInputNameAndClickOnSaveWithoutAuthorizationSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 24, 6));
		nameTxt.sendKeys(Keys.TAB);
	
		String actName,expName;
		actName=nameTxt.getAttribute("value");
		expName=excelReader.getCellData(xlSheetName, 24, 7);
		excelReader.setCellData(xlfile, xlSheetName, 24, 8, actName);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage  = excelReader.getCellData(xlSheetName, 25, 7);	
		String actMessage  = checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlSheetName, 25, 8, actMessage);

		if(actName.equalsIgnoreCase(expName) && actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Name  inputed Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 23, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Name  NOT inputed Successfully");
			excelReader.setCellData(xlfile, xlSheetName, 23, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean 	checkStartPoint() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
		 getAction().doubleClick(startPointBtn).build().perform();
		
		 Thread.sleep(2000);

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
		 boolean actconditionTab            = conditionTab.isDisplayed();
		 boolean actuserSelectionTab        = userSelectionTab.isDisplayed();
		 boolean actalertsTab               = alertsTab.isDisplayed();
		 boolean actescalationTab           = escalationTab.isDisplayed();
		 boolean actdefinitionOkBtn         = definitionOkBtn.isDisplayed();
		 boolean actdefinitionCloseBtn      = definitionCloseBtn.isDisplayed();
		  
		 boolean expconditionTab            = true;
		 boolean expuserSelectionTab        = true;
		 boolean expalertsTab               = true;
		 boolean expescalationTab           = true;
		 boolean expdefinitionOkBtn         = true;
		 boolean expdefinitionCloseBtn      = true;
		  
		 System.out.println("***********************************************checkStartPoint****************");
		  
		 System.out.println("conditionTab            "+actconditionTab         +"  Value Expected  :"+expconditionTab);
		 System.out.println("userSelectionTab        "+actuserSelectionTab     +"  Value Expected  :"+expuserSelectionTab);
		 System.out.println("alertsTab               "+actalertsTab            +"  Value Expected  :"+expalertsTab);
		 System.out.println("escalationTab           "+actescalationTab        +"  Value Expected  :"+expescalationTab);
		 System.out.println("definitionOkBtn         "+actdefinitionOkBtn      +"  Value Expected  :"+expdefinitionOkBtn);
		 System.out.println("definitionCloseBtn      "+actdefinitionCloseBtn   +"  Value Expected  :"+expdefinitionCloseBtn);
		
		 boolean actMethod=actconditionTab==expconditionTab && actuserSelectionTab==expuserSelectionTab && actdefinitionCloseBtn==expdefinitionCloseBtn && 
				  actalertsTab==expalertsTab && actescalationTab==expescalationTab && actdefinitionOkBtn==expdefinitionOkBtn;
		
		
		 String actResult=Boolean.toString(actMethod);
		 String expResult=excelReader.getCellData(xlSheetName, 27, 7);
		 excelReader.setCellData(xlfile, xlSheetName, 27, 8, actResult);
		 
		 if(actResult.equalsIgnoreCase(expResult))
		 {
			System.out.println("Test Pass : Start Point works As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 26, 9, resPass);
			return true;
		 }
		 else
		 {
			System.out.println("Test Fail : Start Point NOT works As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 26, 9, resFail);
			return false;
		 }
     }
	
	
	
	public boolean 	checkConditionTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
		 conditionTab.click();
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
	     boolean actdescriptionTxt                        = descriptionTxt.isDisplayed();
		 boolean actconditionNotRequiredChkBox            = conditionNotRequiredChkBox.isDisplayed();
		 boolean actcreditLimitExceededChkBox             = creditLimitExceededChkBox.isDisplayed();
		 boolean actbudgetExceededChkBox                  = budgetExceededChkBox.isDisplayed();
		 boolean actnegativeCashCheckChkBox               = negativeCashCheckChkBox.isDisplayed();
		 boolean actlineWiseAuthorizationChkBox           = lineWiseAuthorizationChkBox.isDisplayed();
		 boolean actcreditDaysExceededChkBox              = creditDaysExceededChkBox.isDisplayed();
		 boolean actnegativeStockCheckChkBox              = negativeStockCheckChkBox.isDisplayed();
		 boolean actdateRangeChkBox                       = dateRangeChkBox.isDisplayed();
		 boolean actfromDateTxt                           = fromDateTxt.isDisplayed();
		 boolean acttoDateTxt               			  = toDateTxt.isDisplayed();
		 boolean acttimeRangeChkBox                 	  = timeRangeChkBox.isDisplayed();
		 boolean actfromTimeTxt                  		  = fromTimeTxt.isDisplayed();
		 boolean acttotimeTxt                    		  = totimeTxt.isDisplayed();
		 boolean actConjunctionDropdown                   = ConjunctionDropdown.isDisplayed();
		 boolean actSelectFieldTxt                 		  = SelectFieldTxt.isDisplayed();
		 boolean actSelectOperatorDropdown                = SelectOperatorDropdown.isDisplayed();
		 boolean actCompareWithDropdown                   = CompareWithDropdown.isDisplayed();
		 boolean actValueTxt                			  = ValueTxt.isDisplayed();
		 boolean actDeleteRow1Btn               		  = DeleteRow1Btn.isDisplayed();
		 boolean actAddRowBtn                    		  = AddRowBtn.isDisplayed();
	     boolean actstatusUpdateDropdown                  = statusUpdateDropdown.isDisplayed();
		 boolean actreasonTxt                       	  = reasonTxt.isDisplayed();
		 boolean actkeepUnpostedfinancialAccountingChkBox = keepUnpostedfinancialAccountingChkBox.isDisplayed();
		 boolean actkeepUnpostedlinkBaseChkBox            = keepUnpostedlinkBaseChkBox.isDisplayed();
		 boolean actkeepUnpostedLinksChkBox               = keepUnpostedLinksChkBox.isDisplayed();
		 boolean actkeepUnpostedReferencesChkBox          = keepUnpostedReferencesChkBox.isDisplayed();
		 boolean actkeepUnpostedReservationChkBox         = keepUnpostedReservationChkBox.isDisplayed();
		 boolean actfullAuthorizationChkBox               = fullAuthorizationChkBox.isDisplayed();
		 boolean actaskRemarksOnapprovalChkBox            = askRemarksOnapprovalChkBox.isDisplayed();
		 boolean actmakeApprovalRemarksmandatoryChkBox    = makeApprovalRemarksmandatoryChkBox.isDisplayed();
		 boolean actaskRemarksOnRejectionChkBox           = askRemarksOnRejectionChkBox.isDisplayed();
		 boolean actmakeRejectionRemarksMandatoryChkBox   = makeRejectionRemarksMandatoryChkBox.isDisplayed();
		 boolean actanyValueChangeChkBox                  = anyValueChangeChkBox.isDisplayed();
		 boolean actamountsOrQuantityOrNumericChkBox      = amountsOrQuantityOrNumericChkBox.isDisplayed();
		 boolean actbillAdjustmentsChkBox                 = billAdjustmentsChkBox.isDisplayed();
		 boolean actundoLinksChkBox                 	  = undoLinksChkBox.isDisplayed();
		 boolean actundoReservationChkBox                 = undoReservationChkBox.isDisplayed();
		 boolean actbatchRMABinChkBox                     = batchRMABinChkBox.isDisplayed();
		 boolean actundoAuthorizationEditingDropdown      = undoAuthorizationEditingDropdown.isDisplayed();
		 boolean actdefinitionOkBtn                       = definitionOkBtn.isDisplayed();
		 boolean actdefinitionCloseBtn                    = definitionCloseBtn.isDisplayed();
		 
		 boolean expdescriptionTxt                        = true;
		 boolean expconditionNotRequiredChkBox            = true;
		 boolean expcreditLimitExceededChkBox             = true;
		 boolean expbudgetExceededChkBox                  = true;
		 boolean expnegativeCashCheckChkBox               = true;
		 boolean explineWiseAuthorizationChkBox           = true;
		 boolean expcreditDaysExceededChkBox              = true;
		 boolean expnegativeStockCheckChkBox              = true;
		 boolean expdateRangeChkBox                       = true;
		 boolean expfromDateTxt                			  = true;
		 boolean exptoDateTxt                             = true;
		 boolean exptimeRangeChkBox                       = true;
		 boolean expfromTimeTxt                           = true;
		 boolean exptotimeTxt                             = true;
		 boolean expConjunctionDropdown                   = true;
		 boolean expSelectFieldTxt                        = true;
		 boolean expSelectOperatorDropdown                = true;
		 boolean expCompareWithDropdown                   = true;
		 boolean expValueTxt                              = true;
		 boolean expDeleteRow1Btn                         = true;
		 boolean expAddRowBtn                             = true;
		 boolean expstatusUpdateDropdown                  = true;
		 boolean expreasonTxt                             = true;
		 boolean expkeepUnpostedfinancialAccountingChkBox = true;
		 boolean expkeepUnpostedlinkBaseChkBox            = true;
		 boolean expkeepUnpostedLinksChkBox               = true;
		 boolean expkeepUnpostedReferencesChkBox          = true;
		 boolean expkeepUnpostedReservationChkBox         = true;
		 boolean expfullAuthorizationChkBox               = true;
		 boolean expaskRemarksOnapprovalChkBox            = true;
		 boolean expmakeApprovalRemarksmandatoryChkBox    = true;
		 boolean expaskRemarksOnRejectionChkBox           = true;
		 boolean expmakeRejectionRemarksMandatoryChkBox   = true;
		 boolean expanyValueChangeChkBox                  = true;
		 boolean expamountsOrQuantityOrNumericChkBox      = true;
		 boolean expbillAdjustmentsChkBox                 = true;
		 boolean expundoLinksChkBox                 	  = true;
		 boolean expundoReservationChkBox                 = true;
		 boolean expbatchRMABinChkBox                     = true;
		 boolean expundoAuthorizationEditingDropdown      = true;
		 boolean expdefinitionOkBtn                       = true;
		 boolean expdefinitionCloseBtn                    = true;	
			
		 System.out.println("****************************** checkConditionTabOptions  ********************************************");
		 
		 System.out.println("DescriptionTxt                 :"+actdescriptionTxt+                        "   Value Expected : "+expdescriptionTxt);
		 System.out.println("ConditionNotRequiredChkBox     :"+actconditionNotRequiredChkBox+            "   Value Expected : "+expconditionNotRequiredChkBox);
		 System.out.println("CreditLimitExceededChkBox      :"+actcreditLimitExceededChkBox+             "	 Value Expected : "+expcreditLimitExceededChkBox);
		 System.out.println("BudgetExceededChkBox           :"+actbudgetExceededChkBox+                  "	 Value Expected : "+expbudgetExceededChkBox);
		 System.out.println("NegativeCashCheckChkBox        :"+actnegativeCashCheckChkBox+               "	 Value Expected : "+expnegativeCashCheckChkBox);
		 System.out.println("LineWiseAuthorizationChkBox    :"+actlineWiseAuthorizationChkBox+           "	 Value Expected : "+explineWiseAuthorizationChkBox);
		 System.out.println("CreditDaysExceededChkBox       :"+actcreditDaysExceededChkBox+              "	 Value Expected : "+expcreditDaysExceededChkBox);
		 System.out.println("NegativeStockCheckChkBox       :"+actnegativeStockCheckChkBox+              "	 Value Expected : "+expnegativeStockCheckChkBox);
		 System.out.println("DateRangeChkBox                :"+actdateRangeChkBox+                       "	 Value Expected : "+expdateRangeChkBox);
		 System.out.println("FromDateTxt                    :"+actfromDateTxt+                           "	 Value Expected : "+expfromDateTxt);
		 System.out.println("ToDateTxt                      :"+acttoDateTxt+                             "	 Value Expected : "+exptoDateTxt);
		 System.out.println("TimeRangeChkBox                :"+acttimeRangeChkBox+                       "   Value Expected : "+exptimeRangeChkBox);
		 System.out.println("FromTimeTxt                    :"+actfromTimeTxt+                           "	 Value Expected : "+expfromTimeTxt);
		 System.out.println("RotimeTxt                      :"+acttotimeTxt+                             "	 Value Expected : "+exptotimeTxt);
		 System.out.println("ConjunctionDropdown            :"+actConjunctionDropdown+                   "	 Value Expected : "+expConjunctionDropdown);
		 System.out.println("SelectFieldTxt                 :"+actSelectFieldTxt+                        "	 Value Expected : "+expSelectFieldTxt);
		 System.out.println("SelectOperatorDropdown         :"+actSelectOperatorDropdown+                "	 Value Expected : "+expSelectOperatorDropdown);
		 System.out.println("CompareWithDropdown            :"+actCompareWithDropdown+                   "	 Value Expected : "+expCompareWithDropdown);
		 System.out.println("ValueTxt                       :"+actValueTxt+                              "	 Value Expected : "+expValueTxt);
		 System.out.println("DeleteRow1Btn                  :"+actDeleteRow1Btn+                         "	 Value Expected : "+expDeleteRow1Btn);
		 System.out.println("AddRowBtn                      :"+actAddRowBtn+                             "	 Value Expected : "+expAddRowBtn);
		 System.out.println("StatusUpdateDropdown           :"+actstatusUpdateDropdown+                  "   Value Expected : "+expstatusUpdateDropdown);
		 System.out.println("ReasonTxt                      :"+actreasonTxt+                             "   Value Expected : "+expreasonTxt);
		 System.out.println("keepUnpostedfinancialAccChkBox :"+actkeepUnpostedfinancialAccountingChkBox+ "	 Value Expected : "+expkeepUnpostedfinancialAccountingChkBox);
		 System.out.println("keepUnpostedlinkBaseChkBox     :"+actkeepUnpostedlinkBaseChkBox+            "	 Value Expected : "+expkeepUnpostedlinkBaseChkBox);
		 System.out.println("keepUnpostedLinksChkBox        :"+actkeepUnpostedLinksChkBox+               "	 Value Expected : "+expkeepUnpostedLinksChkBox);
		 System.out.println("NewReplenishmentFlushing       :"+actkeepUnpostedReferencesChkBox+          "	 Value Expected : "+expkeepUnpostedReferencesChkBox);
		 System.out.println("keepUnpostedReservationChkBox  :"+actkeepUnpostedReservationChkBox+         "	 Value Expected : "+expkeepUnpostedReservationChkBox);
		 System.out.println("FullAuthorizationChkBox        :"+actfullAuthorizationChkBox+               " 	 Value Expected : "+expfullAuthorizationChkBox);
		 System.out.println("AskRemarksOnapprovalChkBox     :"+actaskRemarksOnapprovalChkBox+            "	 Value Expected : "+expaskRemarksOnapprovalChkBox);
		 System.out.println("MakeApprRemarksmandatoryChkBox :"+actmakeApprovalRemarksmandatoryChkBox+    "	 Value Expected : "+expmakeApprovalRemarksmandatoryChkBox);
		 System.out.println("AskRemarksOnRejectionChkBox    :"+actaskRemarksOnRejectionChkBox+           "	 Value Expected : "+expaskRemarksOnRejectionChkBox);
		 System.out.println("MakeRejecRemarksMandChkBox     :"+actmakeRejectionRemarksMandatoryChkBox+   "   Value Expected : "+expmakeRejectionRemarksMandatoryChkBox);
		 System.out.println("AnyValueChangeChkBox           :"+actanyValueChangeChkBox+                  "	 Value Expected : "+expanyValueChangeChkBox);
		 System.out.println("AmountsOrQuantityOrNumeChkBox  :"+actamountsOrQuantityOrNumericChkBox+      "	 Value Expected : "+expamountsOrQuantityOrNumericChkBox);
		 System.out.println("BillAdjustmentsChkBox          :"+actbillAdjustmentsChkBox+                 "	 Value Expected : "+expbillAdjustmentsChkBox);
		 System.out.println("UndoLinksChkBox                :"+actundoLinksChkBox+                       "	 Value Expected : "+expundoLinksChkBox);
		 System.out.println("UndoReservationChkBox          :"+actundoReservationChkBox+                 "	 Value Expected : "+expundoReservationChkBox);
		 System.out.println("BatchRMABinChkBox              :"+actbatchRMABinChkBox+                     "	 Value Expected : "+expbatchRMABinChkBox);
		 System.out.println("UndoAuthorEditingDropdown      :"+actundoAuthorizationEditingDropdown+      "	 Value Expected : "+expundoAuthorizationEditingDropdown);
		 System.out.println("DefinitionOkBtn                :"+actdefinitionOkBtn+                       "	 Value Expected : "+expdefinitionOkBtn);
		 System.out.println("DefinitionCloseBtn             :"+actdefinitionCloseBtn+                    "	 Value Expected : "+expdefinitionCloseBtn);
		
		 
		 boolean actMethod=actdescriptionTxt==expdescriptionTxt  && actconditionNotRequiredChkBox==expconditionNotRequiredChkBox 
				 && actcreditLimitExceededChkBox==expcreditLimitExceededChkBox && actbudgetExceededChkBox==expbudgetExceededChkBox 
				 && actnegativeCashCheckChkBox==expnegativeCashCheckChkBox && actlineWiseAuthorizationChkBox==explineWiseAuthorizationChkBox
			     && actcreditDaysExceededChkBox==expcreditDaysExceededChkBox && actnegativeStockCheckChkBox==expnegativeStockCheckChkBox 
			     && actdateRangeChkBox==expdateRangeChkBox && actfromDateTxt==expfromDateTxt && acttoDateTxt==exptoDateTxt 
				 && acttimeRangeChkBox==exptimeRangeChkBox && actfromTimeTxt==expfromTimeTxt && acttotimeTxt==exptotimeTxt 
				 && actConjunctionDropdown==expConjunctionDropdown && actSelectFieldTxt==expSelectFieldTxt 
				 && actSelectOperatorDropdown==expSelectOperatorDropdown && actCompareWithDropdown==expCompareWithDropdown 
				 && actValueTxt==expValueTxt && actDeleteRow1Btn==expDeleteRow1Btn && actkeepUnpostedlinkBaseChkBox==expkeepUnpostedlinkBaseChkBox
				 && actAddRowBtn==expAddRowBtn && actstatusUpdateDropdown==expstatusUpdateDropdown && actkeepUnpostedLinksChkBox==expkeepUnpostedLinksChkBox
				 && actkeepUnpostedReferencesChkBox==expkeepUnpostedReferencesChkBox &&  actkeepUnpostedReservationChkBox==expkeepUnpostedReservationChkBox
				 && actfullAuthorizationChkBox==expfullAuthorizationChkBox && actaskRemarksOnapprovalChkBox==expaskRemarksOnapprovalChkBox 
				 && actmakeApprovalRemarksmandatoryChkBox==expmakeApprovalRemarksmandatoryChkBox && actaskRemarksOnRejectionChkBox==expaskRemarksOnRejectionChkBox 
				 &&  actmakeRejectionRemarksMandatoryChkBox==expmakeRejectionRemarksMandatoryChkBox && actanyValueChangeChkBox==expanyValueChangeChkBox 
				 && actamountsOrQuantityOrNumericChkBox==expamountsOrQuantityOrNumericChkBox && actbillAdjustmentsChkBox==expbillAdjustmentsChkBox
				 && actundoLinksChkBox==expundoLinksChkBox && actundoReservationChkBox==expundoReservationChkBox && actbatchRMABinChkBox==expbatchRMABinChkBox 
				 && actundoAuthorizationEditingDropdown==expundoAuthorizationEditingDropdown && actdefinitionOkBtn==expdefinitionOkBtn  
				 && actdefinitionCloseBtn==expdefinitionCloseBtn;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 29, 7);
			excelReader.setCellData(xlfile, xlSheetName, 29, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Condition Tab Options Are Displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 28, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Condition Tab Options Are NOT Displayed ");
			excelReader.setCellData(xlfile, xlSheetName, 28, 9, resFail);
			return false;
		}
		
	}
	
	public boolean 	checkUserSelectionTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
		userSelectionTab.click();
	
		Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userselectionDropdown));
		 boolean actuserselectionDropdown             = userselectionDropdown.isDisplayed();
		 boolean actcriteriaDropdown                  = criteriaDropdown.isDisplayed();
		 boolean actuserrow1                          = userrow1.isDisplayed();
		 boolean actlimitDefinitionrow1               = limitDefinitionrow1.isDisplayed();
		 boolean actlimitValue1                       = limitValue1.isDisplayed();
		 boolean actresetFrequency1                   = resetFrequency1.isDisplayed();
		  
		 boolean expuserselectionDropdown             = true;
		 boolean expcriteriaDropdown                  = true;
		 boolean expuserrow1                          = true;
		 boolean explimitDefinitionrow1               = true;
		 boolean explimitValue1                       = true;
		 boolean expresetFrequency1                   = true;
		  
		 System.out.println("***********************************************checkUserSelectionTabOptions****************");
		  
		 System.out.println("UserselectionDropdown    :"+actuserselectionDropdown+"  Value Expected  :"+expuserselectionDropdown);
		 System.out.println("CriteriaDropdown         :"+actcriteriaDropdown     +"  Value Expected  :"+expcriteriaDropdown);
		 System.out.println("Userrow1                 :"+actuserrow1             +"  Value Expected  :"+expuserrow1);
		 System.out.println("LimitDefinitionrow1      :"+actlimitDefinitionrow1  +"  Value Expected  :"+explimitDefinitionrow1);
		 System.out.println("LimitValue1              :"+actlimitValue1          +"  Value Expected  :"+explimitValue1);
		 System.out.println("ResetFrequency1          :"+actresetFrequency1      +"  Value Expected  :"+expresetFrequency1);
		
		 
		 boolean actMethod=actuserselectionDropdown==expuserselectionDropdown && actcriteriaDropdown==expcriteriaDropdown && 
				  actuserrow1==expuserrow1 && actlimitDefinitionrow1==explimitDefinitionrow1 && actlimitValue1==explimitValue1 && actresetFrequency1==expresetFrequency1;
			
			
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 31, 7);
		excelReader.setCellData(xlfile, xlSheetName, 31, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : User Selection TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 30, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : User Selection TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 30, 9, resFail);
			return false;
		}
	}


	public boolean 	checkUserDropdownOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userselectionDropdown));
		userselectionDropdown.click();
		
		String userq=userselectionDropdown.getAttribute("value");
		
		System.out.println("userq"+userq);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(criteriaDropdown));
		criteriaDropdown.click();
		
		String userc=criteriaDropdown.getText();
		
		System.out.println("userc"+userc);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
		userDropdown.click();
		
		String Strlpl= userDropdown.getText();
	
		System.out.println(Strlpl);
		 
        String[] testString=Strlpl.split("\n");
        
        List<String> listg = Arrays.asList(testString);
        
        System.out.println("Converting to string array"+listg);
        
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
        list.add(excelReader.getCellData(xlSheetName, 33, 6));
        list.add(excelReader.getCellData(xlSheetName, 34, 6));
        list.add(excelReader.getCellData(xlSheetName, 35, 6));
        list.add(excelReader.getCellData(xlSheetName, 36, 6));
        
        System.out.println(list);  
        //[SU, PortalUser, UserAllOptionsST, UserRestrictionST, UserExclusionST]
       if((listg.equals(list)) )
       {
    	   excelReader.setCellData(xlfile, xlSheetName, 32, 9, resPass);
    	   return true;
    	   
       }
       
       else
       {
    	   excelReader.setCellData(xlfile, xlSheetName, 32, 9, resFail);
    	   return false;
    	  
       }
    	
    	
    
		
	 
	}


	public boolean 	checkAlertsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertsTab));
		alertsTab.click();
			
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedChkBox));
		 boolean actreceivedChkBox                   = receivedChkBox.isDisplayed();
	     boolean actapprovedChkBox                   = approvedChkBox.isDisplayed();
		 boolean actrejectedChkBox                   = rejectedChkBox.isDisplayed();
		 boolean actstoppedChkBox                    = stoppedChkBox.isDisplayed();
		 boolean actemailHeaderTemplateBtn           = emailHeaderTemplateBtn.isDisplayed();
		 boolean actemailTemplateBtn                 = emailTemplateBtn.isDisplayed();
	     boolean actheaderSMSTemplate          		 = headerSMSTemplate.isDisplayed();
		 boolean actheaderAlert                      = headerAlert.isDisplayed();
		 boolean actheaderRecipient                  = headerRecipient.isDisplayed();
		 
		 boolean expreceivedChkBox                   = true;
		 boolean expapprovedChkBox                   = true;
		 boolean exprejectedChkBox                   = true;
		 boolean expstoppedChkBox                    = true;
		 boolean expemailHeaderTemplateBtn           = true;
		 boolean expemailTemplateBtn                 = true;
		 boolean expheaderSMSTemplate                = true;
		 boolean expheaderAlert                      = true;
		 boolean expheaderRecipient                  = true;
		 	
		 System.out.println("****************************** checkAlertsTabOptions  ********************************************");
		 
		 System.out.println("ReceivedChkBox                :"+actreceivedChkBox         +"   Value Expected : "+expreceivedChkBox);
		 System.out.println("ApprovedChkBox                :"+actapprovedChkBox         +"   Value Expected : "+expapprovedChkBox);
		 System.out.println("RejectedChkBox                :"+actrejectedChkBox         +"	 Value Expected : "+exprejectedChkBox);
		 System.out.println("StoppedChkBox     			   :"+actstoppedChkBox          +"	 Value Expected : "+expstoppedChkBox);
		 System.out.println("EmailHeaderTemplateBtn        :"+actemailHeaderTemplateBtn +"	 Value Expected : "+expemailHeaderTemplateBtn);
		 System.out.println("EmailTemplateBtn      	       :"+actemailTemplateBtn       +"	 Value Expected : "+expemailTemplateBtn);
		 System.out.println("HeaderSMSTemplate             :"+actheaderSMSTemplate      +"	 Value Expected : "+expheaderSMSTemplate);
		 System.out.println("HeaderAlert                   :"+actheaderAlert            +"	 Value Expected : "+expheaderAlert);
		 System.out.println("HeaderRecipient               :"+actheaderRecipient        +"	 Value Expected : "+expheaderRecipient);
		  	
		 
		 boolean actMethod=actreceivedChkBox==expreceivedChkBox&& actapprovedChkBox==expapprovedChkBox  && actrejectedChkBox==exprejectedChkBox 
				 && actstoppedChkBox==expstoppedChkBox && actemailHeaderTemplateBtn==expemailHeaderTemplateBtn 
				  && actemailTemplateBtn==expemailTemplateBtn && actheaderSMSTemplate==expheaderSMSTemplate 
			     && actheaderAlert==expheaderAlert && actheaderRecipient==expheaderRecipient;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 38, 7);
			excelReader.setCellData(xlfile, xlSheetName, 38, 8, actResult);
		 
		 
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 37, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 37, 9, resFail);
			return false;
		}
	}





	public boolean 	checkEscalationTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(escalationTab));
		escalationTab.click();
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(escalationLevelAddBtn));
		boolean EscalationLevelAddBtn=escalationLevelAddBtn.isDisplayed();
		
		String actescalationLevelAddBtn=Boolean.toString(EscalationLevelAddBtn);
		String expescalationLevelAddBtn=excelReader.getCellData(xlSheetName, 40, 7);
		excelReader.setCellData(xlfile, xlSheetName, 40, 8, actescalationLevelAddBtn);
		
		System.out.println("*********************************************checkEscalationTabOptions**************************");
		
		System.out.println("escalationLevelAddBtn    :  "+actescalationLevelAddBtn+" Value Expected : "+expescalationLevelAddBtn);
		
		if(actescalationLevelAddBtn.equalsIgnoreCase(expescalationLevelAddBtn))
		{
			System.out.println("Test Pass : Escalation TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 39, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Esacalation TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 39, 9, resFail);
			return false;
		}
	}



	public boolean 	checkEscalationTabOptionsAfterClickingAddBtn() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(escalationLevelAddBtn));
		escalationLevelAddBtn.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(TimelimitTxt1));
		
        boolean actTimelimitTxt1                 = TimelimitTxt1.isDisplayed();
		boolean acttimelimitDropdown1            = timelimitDropdown1.isDisplayed();
		boolean actEscalationType1               = EscalationType1.isDisplayed();
		boolean actMinimize1                     = Minimize1.isDisplayed();
		boolean actClose1                        = Close1.isDisplayed();
		
		boolean expTimelimitTxt1                 = true;
		boolean exptimelimitDropdown1            = true;
		boolean expEscalationType1               = true;
		boolean expMinimize1                     = true;
		boolean expClose1                        = true;
		
		System.out.println("********************* checkEscalationTabOptionsAfterClickingAddBtn ******************");
	
		System.out.println("TimelimitTxt1                :"+actTimelimitTxt1       +"  Value Expected : "+expTimelimitTxt1);
		System.out.println("timelimitDropdown1           :"+acttimelimitDropdown1  +"  Value Expected : "+exptimelimitDropdown1);
		System.out.println("EscalationType1              :"+actEscalationType1     +"  Value Expected : "+expEscalationType1);
		System.out.println("Minimize1                    :"+actMinimize1           +"  Value Expected : "+expMinimize1);
        System.out.println("Close1                       :"+actClose1              +"  Value Expected : "+expClose1);
	
		
        boolean actMethod=actTimelimitTxt1==expTimelimitTxt1  && acttimelimitDropdown1==exptimelimitDropdown1 &&
				actEscalationType1==expEscalationType1 && actMinimize1==expMinimize1 && 
				actClose1==expClose1;
		
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 42, 7);
		excelReader.setCellData(xlfile, xlSheetName, 42, 8, actResult);
			
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Escalation TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 41, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Esacalation TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 41, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean 	checkCancelButtonInDefinitionScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionCloseBtn));
		definitionCloseBtn.click();
		
		
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
		
        boolean actdocumentNameDropdown                      = documentNameDropdown.isDisplayed();
		boolean actnameTxt                                   = nameTxt.isDisplayed();
		boolean actactiveChkBox                              = activeChkBox.isDisplayed();
		boolean actalwaysauthorstartsfromfirstlevelChkBox    = alwaysauthorizationstartsfromfirstlevelChkBox.isDisplayed();
		boolean actaddLevelBtn                               = addLevelBtn.isDisplayed();
		boolean actclearbtn              					 = clearbtn.isDisplayed();
		boolean actsaveBtn                                   = saveBtn.isDisplayed();
		boolean actcancelBtn                                 = cancelBtn.isDisplayed();
		
		boolean expdocumentNameDropdown                      = true;
		boolean expnameTxt                                   = true;
		boolean expactiveChkBox                              = true;
		boolean expalwaysauthorstartsfromfirstlevelChkBox    = true;
		boolean expaddLevelBtn         						 = true;
		boolean expclearbtn              					 = true;
		boolean expsaveBtn               					 = true;
		boolean expcancelBtn 							     = true;
		
		System.out.println("********************* checkCancelButtonInDefinitionScreen ******************");
	
		System.out.println("documentNameDropdown                     :"+actdocumentNameDropdown                   +"    Value Expected : "+expdocumentNameDropdown);
		System.out.println("nameTxt                                  :"+actnameTxt                                +"    Value Expected : "+expnameTxt);
		System.out.println("activeChkBox                             :"+actactiveChkBox                           +"	Value Expected : "+expactiveChkBox);
		System.out.println("alwaysauthorstartsfromfirstlevelChkBox   :"+actalwaysauthorstartsfromfirstlevelChkBox +"	Value Expected : "+expalwaysauthorstartsfromfirstlevelChkBox);
        System.out.println("addLevelBtn                              :"+actaddLevelBtn                            +"    Value Expected : "+expaddLevelBtn);
		System.out.println("clearbtn                                 :"+actclearbtn                               +"    Value Expected : "+expclearbtn);
		System.out.println("saveBtn                                  :"+actsaveBtn                                +" 	Value Expected : "+expsaveBtn);
		System.out.println("cancelBtn                                :"+actcancelBtn                              +"	Value Expected : "+expcancelBtn);
		
		
		boolean actMethod=actdocumentNameDropdown==expdocumentNameDropdown  && actnameTxt==expnameTxt &&
				actactiveChkBox==expactiveChkBox && actalwaysauthorstartsfromfirstlevelChkBox==expalwaysauthorstartsfromfirstlevelChkBox && 
				actaddLevelBtn==expaddLevelBtn  && actclearbtn==expclearbtn && 
			    actsaveBtn==expsaveBtn && actcancelBtn==expcancelBtn;
		
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 44, 7);
		excelReader.setCellData(xlfile, xlSheetName, 44, 8, actResult);
			
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Cancel Option Working ");
			excelReader.setCellData(xlfile, xlSheetName, 43, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Cancel Option Not Working");
			excelReader.setCellData(xlfile, xlSheetName, 43, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean 	checkDescriptionAsMandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		
		getAction().doubleClick(startPointBtn).build().perform();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		

		String expMessage=excelReader.getCellData(xlSheetName, 46, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlSheetName, 46, 8, actMessage);

				
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 45, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			excelReader.setCellData(xlfile, xlSheetName, 45, 9, resFail);
			return false;
		}
	}
	
	
	
	
	
	public boolean 	checkConditionAsMandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
		descriptionTxt.click();
		
		descriptionTxt.sendKeys(excelReader.getCellData(xlSheetName, 47, 6));
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
        String expMessage="In User Selection tab select user , User selection is mandatory";
		
		String actMessage=checkValidationMessage(expMessage);
		
		excelReader.setCellData(xlfile, xlSheetName, 48, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 47, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			excelReader.setCellData(xlfile, xlSheetName, 47, 9, resFail);
			return false;
		}
	}
	
	
	@FindBy(xpath="//div[@id='filterTree_68_0_AdvanceFilter_']//a[@id='1073741850']")
	private static WebElement voucherQty;
	
	public boolean 	checkUserSelectionIsManadatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";/*
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
		conditionNotRequiredChkBox.click();*/
		
		
		//ConjunctionDropdown.click();
		
				Select s1=new Select(ConjunctionDropdown);
				
				s1.selectByIndex(1);
				
				//ConjunctionDropdown.sendKeys(Keys.TAB);
				
				
				SelectFieldTxt.click();
				
				Thread.sleep(2000);
				
				voucherQty.click();
				
				//SelectOperatorDropdown.click();
				
				Select s2=new Select(SelectOperatorDropdown);
				
				s2.selectByIndex(6);
				
				//SelectOperatorDropdown.sendKeys(Keys.TAB);
				
				//CompareWithDropdown.click();
				
				Select s3=new Select(CompareWithDropdown);
				
				s3.selectByIndex(1);
				
				//CompareWithDropdown.sendKeys(Keys.TAB);
				
				ValueTxt.click();
				
				ValueTxt.sendKeys("1000");
				
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(askRemarksOnapprovalChkBox));
		askRemarksOnapprovalChkBox.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		String expMessage=excelReader.getCellData(xlSheetName, 50, 7);
			
		String actMessage=checkValidationMessage(expMessage);
			
		excelReader.setCellData(xlfile, xlSheetName, 50, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 49, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			excelReader.setCellData(xlfile, xlSheetName, 49, 9, resFail);
			return false;
		}
	}
	
	

	
	
	
	@FindBy(xpath="//div[@class='divStopNode']//i[@class='icon-end icon-font4 grey']")
	private static WebElement endpoint;
	
	
	public boolean 	checkOkButtonOnSelectingUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
		userSelectionTab.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
		userrow1.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
		userDropdown.click();
		
		Select s=new Select(userDropdown);
		s.selectByVisibleText(excelReader.getCellData(xlSheetName, 52, 6));
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		if(endpoint.isDisplayed())
		{
			System.out.println("Test Pass : Image Displayed In Design Area");
			excelReader.setCellData(xlfile, xlSheetName, 51, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Image NOT Displayed In Design Area");
			excelReader.setCellData(xlfile, xlSheetName, 51, 9, resFail);
			return false;
		}
	}
	
	
	
	
	
	
	public boolean 	checkSavingTransactionAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		String expMessage=excelReader.getCellData(xlSheetName, 54, 7);
		
		String actMessage=checkValidationMessage(expMessage);
			
		excelReader.setCellData(xlfile, xlSheetName, 54, 8, actMessage);
		
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 53, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			excelReader.setCellData(xlfile, xlSheetName, 53, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean 	checkCancelButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
		cancelBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboardName));
		if(dashboardName.isDisplayed())
			
		{
			System.out.println("Test Pass : Cancel Option Working ");
			excelReader.setCellData(xlfile, xlSheetName, 55, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Cancel Option Not Working");
			excelReader.setCellData(xlfile, xlSheetName, 55, 9, resFail);
			return false;
		}
	}
	
	
	@FindBy(xpath="//*[@id='txtSearchMenu_MainLayout']")
    private static WebElement serachMenuTextHomePage;
	
	@FindBy(xpath="//li/span")
    private static WebElement searchMenuTextClick;
	
	@FindBy(xpath="//*[@id='id_menu_tree_Purchase Voucher VAT (1)']/a/span")
	private static WebElement purchaseVoucherTypeAuthorizeToEdit;
	
	
	public boolean 	checkDisplayingAuthorizationName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
		System.out.println("Setting buton is enabled");
		serachMenuTextHomePage.click();
		serachMenuTextHomePage.sendKeys("Transaction Authorization");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
		searchMenuTextClick.click();	  
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
		documentNameDropdown.sendKeys(" ");
		
		Thread.sleep(2000);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
		purchasevoucherExpandbutton.click();
		
		Thread.sleep(2000);
	
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherTypeAuthorizeToEdit));
        purchaseVoucherTypeAuthorizeToEdit.click();
		
		Thread.sleep(3000);
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		
		nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 57, 6));
		
        Thread.sleep(5000);
        
        
		nameTxt.sendKeys(Keys.TAB);
			
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
		boolean actstartPointBtn=startPointBtn.isDisplayed();
		boolean actendpoint=endpoint.isDisplayed();
		
		boolean expstartPointBtn=true;
		boolean expendpoint=true;
		
		System.out.println("*************************************checkDisplayingAuthorizationName************************************");
		
		System.out.println("startPointBtn    :"+actstartPointBtn   +"  Value Expected : "+expstartPointBtn);
		System.out.println("endpoint         :"+actendpoint        +"  Value Expected : "+expendpoint);
		
		if(actstartPointBtn==expstartPointBtn && actendpoint==expendpoint)
		{
			System.out.println("Test Pass : Saved Data is Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 56, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Saved Data is NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 56, 9, resFail);
			return false;
		}
		
	}
	
	
	
	
	
	
	public boolean 	checkEditAuthorizationSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
		Level1editBtn.click();
			
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
        boolean actconditionTab                 = conditionTab.isDisplayed();
		boolean actuserSelectionTab             = userSelectionTab.isDisplayed();
		boolean actalertsTab                    = alertsTab.isDisplayed();
		boolean actescalationTab                = escalationTab.isDisplayed();
		
		boolean expconditionTab                 = true;
		boolean expuserSelectionTab             = true;
		boolean expalertsTab                    = true;
		boolean expescalationTab                = true;
		
		System.out.println("********************* checkEditAuthorizationSettings ******************");
	
		System.out.println("ConditionTab             :"+actconditionTab     +"  Value Expected : "+expconditionTab);
		System.out.println("UserSelectionTab         :"+actuserSelectionTab +"  Value Expected : "+expuserSelectionTab);
		System.out.println("AlertsTab                :"+actalertsTab        +"	Value Expected : "+expalertsTab);
		System.out.println("EscalationTab            :"+actescalationTab    +"	Value Expected : "+expescalationTab);
		
		
		boolean actMethod=actconditionTab==expconditionTab  && actuserSelectionTab==expuserSelectionTab &&
				actalertsTab==expalertsTab && actescalationTab==expescalationTab;
		
		
		String actResult=Boolean.toString(actMethod);
		String expResult=excelReader.getCellData(xlSheetName, 59, 7);
		excelReader.setCellData(xlfile, xlSheetName, 59, 8, actResult);
			
		
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Edit Btn Opened definition Screen");
			excelReader.setCellData(xlfile, xlSheetName, 58, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Edit Btn NOT Opened definition Screen");
			excelReader.setCellData(xlfile, xlSheetName, 58, 9, resFail);
			return false;
		}
		
	}
	
	
	
	@FindBy(xpath="//span[contains(text(),'Alerts')]")
	private static WebElement alertTabInEdit;
	
	
	
	
	public boolean 	checkEditOnSelectAlertsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertTabInEdit));
		alertTabInEdit.click();
		
		Thread.sleep(2000);
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedChkBox));
		 boolean actreceivedChkBox                   = receivedChkBox.isDisplayed();
	     boolean actapprovedChkBox                   = approvedChkBox.isDisplayed();
		 boolean actrejectedChkBox                   = rejectedChkBox.isDisplayed();
		 boolean actstoppedChkBox                    = stoppedChkBox.isDisplayed();
		 boolean actemailHeaderTemplateBtn           = emailHeaderTemplateBtn.isDisplayed();
		 boolean actemailTemplateBtn                 = emailTemplateBtn.isDisplayed();
	     boolean actheaderSMSTemplate          		 = headerSMSTemplate.isDisplayed();
		 boolean actheaderAlert                      = headerAlert.isDisplayed();
		 boolean actheaderRecipient                  = headerRecipient.isDisplayed();
		 
		 boolean expreceivedChkBox                   = true;
		 boolean expapprovedChkBox                   = true;
		 boolean exprejectedChkBox                   = true;
		 boolean expstoppedChkBox                    = true;
		 boolean expemailHeaderTemplateBtn           = true;
		 boolean expemailTemplateBtn                 = true;
		 boolean expheaderSMSTemplate                = true;
		 boolean expheaderAlert                      = true;
		 boolean expheaderRecipient                  = true;
		 	
		 System.out.println("****************************** checkEditOnSelectAlertsTabOptions  ********************************************");
		 
		 System.out.println("ReceivedChkBox                :"+actreceivedChkBox         +"   Value Expected : "+expreceivedChkBox);
		 System.out.println("ApprovedChkBox                :"+actapprovedChkBox         +"   Value Expected : "+expapprovedChkBox);
		 System.out.println("RejectedChkBox                :"+actrejectedChkBox         +"	 Value Expected : "+exprejectedChkBox);
		 System.out.println("StoppedChkBox     			   :"+actstoppedChkBox          +"	 Value Expected : "+expstoppedChkBox);
		 System.out.println("EmailHeaderTemplateBtn        :"+actemailHeaderTemplateBtn +"	 Value Expected : "+expemailHeaderTemplateBtn);
		 System.out.println("EmailTemplateBtn      	       :"+actemailTemplateBtn       +"	 Value Expected : "+expemailTemplateBtn);
		 System.out.println("HeaderSMSTemplate             :"+actheaderSMSTemplate      +"	 Value Expected : "+expheaderSMSTemplate);
		 System.out.println("HeaderAlert                   :"+actheaderAlert            +"	 Value Expected : "+expheaderAlert);
		 System.out.println("HeaderRecipient               :"+actheaderRecipient        +"	 Value Expected : "+expheaderRecipient);
		  	
		 
		 
		 boolean actMethod=actreceivedChkBox==expreceivedChkBox&& actapprovedChkBox==expapprovedChkBox  && actrejectedChkBox==exprejectedChkBox 
				 && actstoppedChkBox==expstoppedChkBox && actemailHeaderTemplateBtn==expemailHeaderTemplateBtn 
				  && actemailTemplateBtn==expemailTemplateBtn && actheaderSMSTemplate==expheaderSMSTemplate 
			     && actheaderAlert==expheaderAlert && actheaderRecipient==expheaderRecipient;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 61, 7);
			excelReader.setCellData(xlfile, xlSheetName, 61, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 60, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 60, 9, resFail);
			return false;
		}
	}
	
	
	
	
	@FindBy(xpath="//input[@id='smsTemplateOptCtrl']")
	private static WebElement emailTemplates;
	

	
	
	public boolean checkEmailTemplateHeaderOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailHeaderTemplateBtn));
		emailHeaderTemplateBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailTemplates));
		boolean actemailTemplates  = emailTemplates.isDisplayed();
		boolean expemailTemplates  = true;
		
		System.out.println("*************************************************checkEmailTemplateHeaderOption***************"); 
		
		
		System.out.println("EmailTemplates  :"+actemailTemplates +" Value Expected :"+expemailTemplates);
		
		if(actemailTemplates==expemailTemplates)
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 62, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 62, 9, resFail);
			return false;
		}
		
	}
	
	
	
/*	@FindBy(xpath="//i[@class='icon-open icon-font7']")
	private static WebElement companyMenu;
	
	@FindBy(xpath="//span[contains(text(),'Company Name')]")
	private static WebElement companyNameSource;
	
	@FindBy(xpath="//textarea[@id='txtTemplate']")
	private static WebElement companyNameTemplateArea;
	
	@FindBy(xpath="//span[@id='btnSaveSmsTemplate']")
	private static WebElement saveBtnInEmailTemplateHeader;*/
	
	
	public boolean checkSaveButtonWithoutTemplateName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
		saveBtnInEmailTemplateHeader.click();
		
		System.out.println("***************************checkSaveButtonWithoutTemplateName*****************************");
		

		String expMessage=excelReader.getCellData(xlSheetName, 64, 7);
		
		String actMessage=checkValidationMessage(expMessage);
			
		excelReader.setCellData(xlfile, xlSheetName, 64, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 63, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 63, 9, resFail);
			return false;
		}
		
	}
	
	
	public boolean checkTemplateNameWithoutTemplateText() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailTemplates));
		emailTemplates.sendKeys(excelReader.getCellData(xlSheetName, 65, 6));
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
		saveBtnInEmailTemplateHeader.click();
		
		Thread.sleep(2000);
		
        String expMessage=excelReader.getCellData(xlSheetName, 66, 7);
		
		String actMessage=checkValidationMessage(expMessage);
			
		excelReader.setCellData(xlfile, xlSheetName, 66, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 65, 9, resPass);
				return true;
		}
		else
		{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 65, 9, resFail);
				return false;
		}
	}
	
	
	
	
	
	
	
	
	
	public boolean checkSaveWithAllMandatoryInputs() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTemplateArea));
		companyNameTemplateArea.click();
		companyNameTemplateArea.sendKeys(excelReader.getCellData(xlSheetName, 68, 6));
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
		saveBtnInEmailTemplateHeader.click();
		
		String expMessage=excelReader.getCellData(xlSheetName, 69, 7);
			
		String actMessage=checkValidationMessage(expMessage);
		
		System.out.println("The Message display Value Actual : " + actMessage + "Value Expected : " + expMessage);
				
		excelReader.setCellData(xlfile, xlSheetName, 69, 8, actMessage);	
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 67, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 67, 9, resFail);
			return false;
		}
	}
	
	
	
	
	public boolean checkEditCreateEmailTemplateHeader() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyMenu));
		emailTemplates.sendKeys(excelReader.getCellData(xlSheetName, 71, 6));
		Thread.sleep(2000);
		
		emailTemplates.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTemplateArea));
		companyNameTemplateArea.click();
		companyNameTemplateArea.clear();
		companyNameTemplateArea.sendKeys(excelReader.getCellData(xlSheetName, 72, 6));
		companyNameTemplateArea.sendKeys(Keys.ENTER);
		companyNameTemplateArea.sendKeys(excelReader.getCellData(xlSheetName, 73, 6));
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
		saveBtnInEmailTemplateHeader.click();
		
		String expMessage=excelReader.getCellData(xlSheetName, 74, 7);
		
		String actMessage=checkValidationMessage(expMessage);
		
		
		System.out.println("The Message display Value Actual : " + actMessage + "Value Expected : " + expMessage);
		
		excelReader.setCellData(xlfile, xlSheetName, 74, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 70, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 70, 9, resFail);
			return false;
		}
	}
	
	
	@FindBy(xpath="//li[@class='theme_background-color-inverse']//a[contains(text(),'Template')]")
	private static WebElement templateTab;
	
	@FindBy(xpath="//a[@id='btnPreviewtab']")
	private static WebElement previewTab;
	
	
	@FindBy(xpath="//textarea[@id='txtPreview']")
	private static WebElement previewText;
	
	
	public boolean checkPreviewOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyMenu));
		emailTemplates.sendKeys(excelReader.getCellData(xlSheetName, 76, 6));
		
		Thread.sleep(2000);
		
		emailTemplates.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previewTab));
		previewTab.click();
	
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(previewText));
		previewText.click();

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date=new Date();
		System.out.println(df.format(date));
		
		String expdate=df.format(date);
		
		String Strlpl= previewText.getAttribute("value");
		
		System.out.println("Text Company Value : " + Strlpl);
		 
		String actCompanySubString=Strlpl.substring(0,18);
		String expCompanySubString="Automation Company";
		
		System.out.println("Converting Array to String : " + actCompanySubString + " Value Expected  : " + expCompanySubString);
			
		boolean actLoginName = Strlpl.contains("SU");
		boolean expLoginName = true;
	    
        System.out.println("Converting Array to String : " + actLoginName + " Value Expected  : " + expLoginName);
        
		if(actCompanySubString.equalsIgnoreCase(expCompanySubString))
		{
			System.out.println("Test Pass : Preview Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 75, 9, resPass);
			return true;		
		}
		else
		{
			System.out.println("Test Fail : preview Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 75, 9, resFail);
			return false;
		}
	}
	
	

	
	
	@FindBy(xpath="//span[@id='btnNewSmsTemplate']")
	private static WebElement newButtonInCreateTemplate;
	
	@FindBy(xpath="//span[@id='btnCloseSMSModal']")
	private static WebElement closeButtonInCreateTemplate;
	
	
	

	public boolean checkNewOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newButtonInCreateTemplate));
		newButtonInCreateTemplate.click();
		
		Thread.sleep(2000);
	
		System.out.println("emailTemplates"+emailTemplates.getAttribute("value"));
		
		System.out.println("emailTemplates"+emailTemplates.getText());
		
		String getEmailTempates=emailTemplates.getAttribute("value");	
	
		if(getEmailTempates.isEmpty())
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 77, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 77, 9, resFail);
			return false;
		}
	
	}
	
	
	
	
	public boolean checkCloseOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeButtonInCreateTemplate));
		closeButtonInCreateTemplate.click();
		
		
         Thread.sleep(2000);
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedChkBox));
		 boolean actreceivedChkBox                   = receivedChkBox.isDisplayed();
	     boolean actapprovedChkBox                   = approvedChkBox.isDisplayed();
		 boolean actrejectedChkBox                   = rejectedChkBox.isDisplayed();
		 boolean actstoppedChkBox                    = stoppedChkBox.isDisplayed();
		 boolean actemailHeaderTemplateBtn           = emailHeaderTemplateBtn.isDisplayed();
		 boolean actemailTemplateBtn                 = emailTemplateBtn.isDisplayed();
	     boolean actheaderSMSTemplate          		 = headerSMSTemplate.isDisplayed();
		 boolean actheaderAlert                      = headerAlert.isDisplayed();
		 boolean actheaderRecipient                  = headerRecipient.isDisplayed();
		 
		 boolean expreceivedChkBox                   = true;
		 boolean expapprovedChkBox                   = true;
		 boolean exprejectedChkBox                   = true;
		 boolean expstoppedChkBox                    = true;
		 boolean expemailHeaderTemplateBtn           = true;
		 boolean expemailTemplateBtn                 = true;
		 boolean expheaderSMSTemplate                = true;
		 boolean expheaderAlert                      = true;
		 boolean expheaderRecipient                  = true;
		 	
		 System.out.println("****************************** checkCloseOption  ********************************************");
		 
		 System.out.println("ReceivedChkBox                :"+actreceivedChkBox         +"   Value Expected : "+expreceivedChkBox);
		 System.out.println("ApprovedChkBox                :"+actapprovedChkBox         +"   Value Expected : "+expapprovedChkBox);
		 System.out.println("RejectedChkBox                :"+actrejectedChkBox         +"	 Value Expected : "+exprejectedChkBox);
		 System.out.println("StoppedChkBox     			   :"+actstoppedChkBox          +"	 Value Expected : "+expstoppedChkBox);
		 System.out.println("EmailHeaderTemplateBtn        :"+actemailHeaderTemplateBtn +"	 Value Expected : "+expemailHeaderTemplateBtn);
		 System.out.println("EmailTemplateBtn      	       :"+actemailTemplateBtn       +"	 Value Expected : "+expemailTemplateBtn);
		 System.out.println("HeaderSMSTemplate             :"+actheaderSMSTemplate      +"	 Value Expected : "+expheaderSMSTemplate);
		 System.out.println("HeaderAlert                   :"+actheaderAlert            +"	 Value Expected : "+expheaderAlert);
		 System.out.println("HeaderRecipient               :"+actheaderRecipient        +"	 Value Expected : "+expheaderRecipient);
		  	
		 
		 boolean actMethod=actreceivedChkBox==expreceivedChkBox&& actapprovedChkBox==expapprovedChkBox  && actrejectedChkBox==exprejectedChkBox 
				  && actstoppedChkBox==expstoppedChkBox && actemailHeaderTemplateBtn==expemailHeaderTemplateBtn 
				  && actemailTemplateBtn==expemailTemplateBtn && actheaderSMSTemplate==expheaderSMSTemplate 
			      && actheaderAlert==expheaderAlert && actheaderRecipient==expheaderRecipient;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 79, 7);
			excelReader.setCellData(xlfile, xlSheetName, 79, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 78, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 78, 9, resFail);
			return false;
		}
	}
	
	
	
	@FindBy(xpath="//td[@id='id_tblAlerts_col_1-2']")
	private static WebElement recievedEmailHeaderTemplate;
	
	@FindBy(xpath="//select[@id='id_tblAlerts_EmailHeaderTemplate']")
	private static WebElement receivedEmailHeaderTemplateInput;
	
	
	public boolean checkCreatedEmailInEmailHedaerTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedChkBox));
		receivedChkBox.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(recievedEmailHeaderTemplate));
		recievedEmailHeaderTemplate.click();
		receivedEmailHeaderTemplateInput.click();
		
		receivedEmailHeaderTemplateInput.sendKeys(excelReader.getCellData(xlSheetName, 81, 6));
		
		Thread.sleep(2000);
		
		receivedEmailHeaderTemplateInput.sendKeys(Keys.TAB);
		
		String actdatamsg,expdatamsg;
		actdatamsg=receivedEmailHeaderTemplateInput.getText();
		
		String actdatamsgs=receivedEmailHeaderTemplateInput.getAttribute("value");
		
		expdatamsg=excelReader.getCellData(xlSheetName, 81, 7);
		excelReader.setCellData(xlfile, xlSheetName, 81, 8, actdatamsg);
		
		System.out.println("actdatamsg   :  "+actdatamsg);
		
		System.out.println("actdatamsgs  :  "+actdatamsgs);
		
		System.out.println("expdatamsg   :  "+expdatamsg);
		
		if(actdatamsg.equalsIgnoreCase(expdatamsg))
		{
			System.out.println("Test Pass : Alerts TAb Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 80, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 80, 9, resFail);
			return false;
		}
	}
	
	
	
	public boolean 	checkOkButtonOnSelectionEmailHeaderTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
		definitionOkBtn.click();
		
		Thread.sleep(2000);
		
		if(endpoint.isDisplayed())
		{
			System.out.println("Test Pass : Image Displayed In Design Area");
			excelReader.setCellData(xlfile, xlSheetName, 82, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Image NOT Displayed In Design Area");
			excelReader.setCellData(xlfile, xlSheetName, 82, 9, resFail);
			return false;
		}
	}
	
	
	
	
	
	
	public boolean 	checkSavingTransactionAuthorizationOnSelctingEmailHeaderTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
        String expMessage=excelReader.getCellData(xlSheetName, 84, 7);
		
		String actMessage=checkValidationMessage(expMessage);
				
		excelReader.setCellData(xlfile, xlSheetName, 84, 8, actMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			System.out.println("Error Message is As Expected");
			excelReader.setCellData(xlfile, xlSheetName, 83, 9, resPass);
			return true;
		}
		else
		{
			System.out.println(" NO Error Message");
			excelReader.setCellData(xlfile, xlSheetName, 83, 9, resFail);
			return false;
		}
	}
	
	


	@FindBy(xpath="//li[@id='li_InvoicePageSetup']")
	private static WebElement pagesetupTab;	
		
	@FindBy(xpath="//li[@id='li_InvoiceDesigner']")
	private static WebElement designerTab;	
		
	@FindBy(xpath="//*[@id='LiDesignField']")
	private static WebElement  FieldsTab;
		
	@FindBy(xpath="//*[@id='LiProp']")
	private static WebElement PropertiesTab;	
		
	@FindBy(xpath="//li[@id='li_InvoicePreview']")
	private static WebElement  printPreviewTab;	
	
  
  
	public boolean checkEditClickOnEmailTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		
		//need to comment this three lines from strat and stop
		/*
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
		documentNameDropdown.sendKeys(" ");
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherExpandbutton));
		purchasevoucherExpandbutton.click();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasevoucherTypeCreatedVoucher));
		purchasevoucherTypeCreatedVoucher.click();
		
		Thread.sleep(3000);
		*/
		//Stop
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		
		nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 86, 6));
		
		Thread.sleep(5000);
		
		nameTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
		Level1editBtn.click();
				
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertTabInEdit));
		alertTabInEdit.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailTemplateBtn));
		emailTemplateBtn.click();
	
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Newdropdown));
		
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Newdropdown));
		
        boolean actNewdropdown                              = Newdropdown.isDisplayed();
	     boolean actOpendropdown                             = Opendropdown.isDisplayed();
		 boolean actSavedropdown                             = Savedropdown.isDisplayed();
		 boolean actRemovedropdown                           = Removedropdown.isDisplayed();
		 boolean actPageNo                                   = PageNo.isDisplayed();
		 boolean actControldrpdown                           = Controldrpdown.isDisplayed();
	     boolean actAlignmentdropdown          				 = Alignmentdropdown.isDisplayed();
		 boolean actSizedropdown                       	     = Sizedropdown.isDisplayed();
		 boolean actPrintdropdown                          	 = Printdropdown.isDisplayed();
		 boolean actExitBtn                                  = ExitBtn.isDisplayed();
		 boolean actpagesetupTab                             = pagesetupTab.isDisplayed();
		 boolean actdesignerTab                            	 = designerTab.isDisplayed();
		 boolean actprintPreviewTab                          = printPreviewTab.isDisplayed();
		 boolean actFieldsTab                                = FieldsTab.isDisplayed();
		 boolean actPropertiesTab                            = PropertiesTab.isDisplayed();
		
		 boolean expNewdropdown                              = true;
		 boolean expOpendropdown                             = true;
		 boolean expSavedropdown                             = true;
		 boolean expRemovedropdown                           = true;
		 boolean expPageNo                                   = true;
		 boolean expControldrpdown                           = true;
		 boolean expAlignmentdropdown                        = true;
		 boolean expSizedropdown                             = true;
		 boolean expPrintdropdown                            = true;
		 boolean expExitBtn                                  = true;
		 boolean exppagesetupTab                             = true;
		 boolean expdesignerTab                              = true;
		 boolean expprintPreviewTab                          = true;
		 boolean expFieldsTab                                = true;
		 boolean expPropertiesTab                            = true;
		 boolean expuser1Chkbox                              = true;
		 boolean expuser2Chkbox                              = true;
		 boolean expuser3Chkbox                              = true;
		 boolean expuser4Chkbox                              = true;
		 boolean expuser5Chkbox                              = true;
		 	
		 System.out.println("****************************** checkEditClickOnEmailTemplate  ********************************************");
		 
		 System.out.println("Newdropdown                  :"+actNewdropdown       +"     Value Expected : "+expNewdropdown);
		 System.out.println("Opendropdown                 :"+actOpendropdown      +"     Value Expected : "+expOpendropdown);
		 System.out.println("Savedropdown                 :"+actSavedropdown      +"     Value Expected : "+expSavedropdown);
		 System.out.println("Removedropdown     	      :"+actRemovedropdown    +"	 Value Expected : "+expRemovedropdown);
		 System.out.println("PageNo                       :"+actPageNo            +"	 Value Expected : "+expPageNo);
		 System.out.println("Controldrpdown      	      :"+actControldrpdown    +"	 Value Expected : "+expControldrpdown);
		 System.out.println("Alignmentdropdown            :"+actAlignmentdropdown +"	 Value Expected : "+expAlignmentdropdown);
		 System.out.println("Sizedropdown                 :"+actSizedropdown      +"	 Value Expected : "+expSizedropdown);
		 System.out.println("Printdropdown                :"+actPrintdropdown     +"	 Value Expected : "+expPrintdropdown);
		 System.out.println("ExitBtn                      :"+actExitBtn           +"	 Value Expected : "+expExitBtn);
		 System.out.println("pagesetupTab                 :"+actpagesetupTab      +"	 Value Expected : "+exppagesetupTab);
		 System.out.println("designerTab                  :"+actdesignerTab       +"	 Value Expected : "+expdesignerTab);
		 System.out.println("printPreviewTab              :"+actprintPreviewTab   +"     Value Expected : "+expprintPreviewTab);
		 System.out.println("FieldsTab                    :"+actFieldsTab         +"     Value Expected : "+expFieldsTab);
		 System.out.println("PropertiesTab                :"+actPropertiesTab     +"	 Value Expected : "+expPropertiesTab);
			
		 
		 boolean actMethod=actNewdropdown==expNewdropdown && actOpendropdown==expOpendropdown 
				 && actSavedropdown==expSavedropdown  && actRemovedropdown==expRemovedropdown  
				 && actPageNo==expPageNo && actControldrpdown==expControldrpdown && actAlignmentdropdown==expAlignmentdropdown
			     && actSizedropdown==expSizedropdown && actPrintdropdown==expPrintdropdown
				 && actExitBtn==expExitBtn && actpagesetupTab==exppagesetupTab 
				 && actdesignerTab==expdesignerTab  && actprintPreviewTab==expprintPreviewTab
				 && actFieldsTab==expFieldsTab&& actPropertiesTab==expPropertiesTab;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 87, 7);
			excelReader.setCellData(xlfile, xlSheetName, 87, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		
		{
			System.out.println("Test Pass : Invoice design options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 85, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Invoice design options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 85, 9, resFail);
			return false;
		}
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Header')]//i[@class='icon-expand icon-font8']")
	private static WebElement  Finance_Purchases_HeaderExpandBtn;

	@FindBy(xpath="//span[contains(text(),'Header')]//i[@class='icon-collepse icon-font8']")
	private static WebElement  Finance_Purchases_HeaderMinimiseBtn;
	
    @FindBy(xpath="//span[contains(text(),'Miscellaneous')]//i[@class='icon-expand icon-font8']")
	private static WebElement MiscellaneousExpandBtn;

	@FindBy(xpath="//span[contains(text(),'Company')]//i[@class='icon-expand icon-font8']")
	private static WebElement CompanyExpandBtn;

	@FindBy(xpath="//span[contains(text(),'Company')]//i[@class='icon-collepse icon-font8']")
	private static WebElement CompanyMinimiseBtn;
	
	@FindBy(xpath="//span[contains(text(),'User details')]//i[@class='icon-expand icon-font8']")
	private static WebElement  UserDetailsExpandbtn;

	@FindBy(xpath="//span[contains(text(),'Body')]//i[@class='icon-expand icon-font8']")
	private static WebElement  PSS_BodyExpandBtn;
	
	@FindBy(xpath="//span[contains(text(),'Body')]//i[@class='icon-collepse icon-font8']")
	private static WebElement  PSS_BodyMinimizeBtn;
	
	
	public boolean checkFieldsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsTab));
		FieldsTab.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CompanyExpandBtn));
	    boolean actCompanyExpandBtn                      = CompanyExpandBtn.isDisplayed();
		boolean actFinance_Purchases_HeaderExpandBtn    = Finance_Purchases_HeaderExpandBtn.isDisplayed();
		boolean actPSS_BodyExpandBtn                    = PSS_BodyExpandBtn.isDisplayed();
		boolean actUserDetailsExpandbtn                 = UserDetailsExpandbtn.isDisplayed();
		boolean actMiscellaneousExpandBtn               = MiscellaneousExpandBtn.isDisplayed();
		
		boolean expCompanyExpandBtn                     = true;
		boolean expFinance_Purchases_HeaderExpandBtn    = true;
		boolean expPSS_BodyExpandBtn                    = true;
		boolean expUserDetailsExpandbtn                 = true;
		boolean expMiscellaneousExpandBtn               = true;
		
		System.out.println("********************* checkFieldsTabOptions ******************");
	
		System.out.println("CompanyExpandBtn                  :"+actCompanyExpandBtn                  +"  Value Expected : "+expCompanyExpandBtn);
		System.out.println("Finance_Purchases_HeaderExpandBtn :"+actFinance_Purchases_HeaderExpandBtn +"  Value Expected : "+expFinance_Purchases_HeaderExpandBtn);
		System.out.println("PSS_BodyExpandBtn                 :"+actPSS_BodyExpandBtn                 +"  Value Expected : "+expPSS_BodyExpandBtn);
		System.out.println("UserDetailsExpandbtn              :"+actUserDetailsExpandbtn              +"  Value Expected : "+expUserDetailsExpandbtn);
        System.out.println("MiscellaneousExpandBtn            :"+actMiscellaneousExpandBtn            +"  Value Expected : "+expMiscellaneousExpandBtn);
		
		if( actCompanyExpandBtn==expCompanyExpandBtn  && actFinance_Purchases_HeaderExpandBtn==expFinance_Purchases_HeaderExpandBtn &&
				actPSS_BodyExpandBtn==expPSS_BodyExpandBtn && actUserDetailsExpandbtn==expUserDetailsExpandbtn && 
				actMiscellaneousExpandBtn==expMiscellaneousExpandBtn)
		{
			System.out.println("Test Pass : Fields Options Are Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 88, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Fields Options Are NOT Displayed");
			excelReader.setCellData(xlfile, xlSheetName, 88, 9, resFail);
			return false;
		}
	}
									
		
				
	@FindBy(xpath="//span[contains(text(),'Company Name')]")
	private static WebElement  Company_CompanyNamedraganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Company Code')]")
	private static WebElement  Company_CompanyCodedraganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Accounting Date')]")
	private static WebElement  Comapny_AccountingDateExpandbtn;
						
	@FindBy(xpath="//span[contains(text(),'Tax Registration Number')]")
	private static WebElement  Company_TaxRegistrationNumber;
	
	@FindBy(xpath="//span[contains(text(),'Excise Registration Number')]")
	private static WebElement  Company_ExciseRegistrationNumber;
	



	public boolean checkCompanyExpandInFieldsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CompanyExpandBtn));
		CompanyExpandBtn.click();
		
        
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Company_CompanyNamedraganddrop));
	    boolean actCompany_CompanyNamedraganddrop            = Company_CompanyNamedraganddrop.isDisplayed();
		boolean actCompany_CompanyCodedraganddrop            = Company_CompanyCodedraganddrop.isDisplayed();
		boolean actComapny_AccountingDateExpandbtn           = Comapny_AccountingDateExpandbtn.isDisplayed();
		boolean actCompany_TaxRegistrationNumber             = Company_TaxRegistrationNumber.isDisplayed();
		boolean actCompany_ExciseRegistrationNumber          = Company_ExciseRegistrationNumber.isDisplayed();
		
		boolean expCompany_CompanyNamedraganddrop            = true;
		boolean expCompany_CompanyCodedraganddrop            = true;
		boolean expComapny_AccountingDateExpandbtn           = true;
		boolean expCompany_TaxRegistrationNumber             = true;
		boolean expCompany_ExciseRegistrationNumber          = true;
		
		System.out.println("********************* checkCompanyExpandInFieldsTabOptions ******************");
	
		System.out.println("Company_CompanyNamedraganddrop           :"+actCompany_CompanyNamedraganddrop   +"  Value Expected : "+expCompany_CompanyNamedraganddrop);
		System.out.println("Company_CompanyCodedraganddrop           :"+actCompany_CompanyCodedraganddrop   +"  Value Expected : "+expCompany_CompanyCodedraganddrop);
		System.out.println("Comapny_AccountingDateExpandbtn          :"+actComapny_AccountingDateExpandbtn  +"	Value Expected : "+expComapny_AccountingDateExpandbtn);
		System.out.println("Company_TaxRegistrationNumber            :"+actCompany_TaxRegistrationNumber    +"	Value Expected : "+expCompany_TaxRegistrationNumber);
        System.out.println("Company_ExciseRegistrationNumber         :"+actCompany_ExciseRegistrationNumber +"  Value Expected : "+expCompany_ExciseRegistrationNumber);
		
		if( actCompany_CompanyNamedraganddrop==expCompany_CompanyNamedraganddrop&& actCompany_CompanyCodedraganddrop==expCompany_CompanyCodedraganddrop &&
				actComapny_AccountingDateExpandbtn==expComapny_AccountingDateExpandbtn && actCompany_TaxRegistrationNumber==expCompany_TaxRegistrationNumber && 
				actCompany_ExciseRegistrationNumber==expCompany_ExciseRegistrationNumber)
		{
			System.out.println("Test Pass : Fields Options Are Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CompanyMinimiseBtn));
			CompanyMinimiseBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 89, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Fields Options Are NOT Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CompanyMinimiseBtn));
			CompanyMinimiseBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 89, 9, resFail);
			return false;
		}
	}
	
		
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'DocNo')]")
	private static WebElement  Finance_Purchases_Header_DocNOdraganddrop;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/a")
	private static WebElement  Finance_Purchases_Header_DateExpandBtn;

	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[3]/a")
	private static WebElement  Finance_Purchases_Header_TimeExpandBtn;
	
    @FindBy(xpath="//li[@class='treeview']//span[contains(text(),'PurchaseAC')]")
	private static WebElement Finance_Purchases_Header_PurchaseAcExpandBtn;

    @FindBy(xpath="//li[@class='treeview']//span[contains(text(),'VendorAC')]")
	private static WebElement Finance_Purchases_Header_VendorACExpandBtn;

    @FindBy(xpath="//li[@class='treeview']//span[contains(text(),'UpdateStock')]")
	private static WebElement  Finance_Purchases_Header_UpdateStockBtn;
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'RaiseReceipt')]")
	private static WebElement  Finance_Purchases_Header_RaiseReceiptBtn;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[8]/a")
	private static WebElement  Finance_Purchases_Header_WareHouseExpandBtn;
				
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[9]/a")
	private static WebElement  Finance_Purchases_Header_DepartmentExpandBtn;
				
	@FindBy(xpath="//span[contains(text(),'sNarration')]")
	private static WebElement  Finance_Purchases_Narrationdraganddrop;
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Test')]")
	private static WebElement  Finance_Purchases_Testdraganddrop;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[15]/a")
	private static WebElement  Finance_Purchases_Userdraganddrop;
					
	@FindBy(xpath="//li[@class='treeview']//a//span[contains(text(),'Role')]")
	private static WebElement  Finance_Purchases_Roledraganddrop;
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'FD%')]")
	private static WebElement  Finance_Purchases_FDdragAndDrop;

	@FindBy(xpath="//i[@class='icon-collepse icon-font8']")
	private static WebElement  FieldsMinimizeBtn;

	
			
	
	public boolean checkHeaderOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Finance_Purchases_HeaderExpandBtn));
		Finance_Purchases_HeaderExpandBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Finance_Purchases_Header_DocNOdraganddrop));

		 boolean actFinance_Purchases_Header_DocNOdraganddrop                = Finance_Purchases_Header_DocNOdraganddrop.isDisplayed();
	     boolean actFinance_Purchases_Header_DateExpandBtn                   = Finance_Purchases_Header_DateExpandBtn.isDisplayed();
		 //boolean actFinance_Purchases_Header_PurchaseAcExpandBtn             = Finance_Purchases_Header_PurchaseAcExpandBtn.isDisplayed();
		 boolean actFinance_Purchases_Header_VendorACExpandBtn               = Finance_Purchases_Header_VendorACExpandBtn.isDisplayed();
		 boolean actFinance_Purchases_Header_UpdateStockBtn                  = Finance_Purchases_Header_UpdateStockBtn.isDisplayed();
		 boolean actFinance_Purchases_Header_RaiseReceiptBtn                 = Finance_Purchases_Header_RaiseReceiptBtn.isDisplayed();
	     boolean actFinance_Purchases_Header_WareHouseExpandBtn          	 = Finance_Purchases_Header_WareHouseExpandBtn.isDisplayed();
		 boolean actFinance_Purchases_Narrationdraganddrop                   = Finance_Purchases_Narrationdraganddrop.isDisplayed();
		 boolean actFinance_Purchases_Userdraganddrop                        = Finance_Purchases_Userdraganddrop.isDisplayed();
		 boolean actFinance_Purchases_Roledraganddrop                        = Finance_Purchases_Roledraganddrop.isDisplayed();
		 boolean actFinance_Purchases_FDdragAndDrop                          = Finance_Purchases_FDdragAndDrop.isDisplayed();
		 
		 boolean expFinance_Purchases_Header_DocNOdraganddrop                = true;
		 boolean expFinance_Purchases_Header_DateExpandBtn                   = true;
		 //boolean expFinance_Purchases_Header_PurchaseAcExpandBtn             = true;
		 boolean expFinance_Purchases_Header_VendorACExpandBtn               = true;
		 boolean expFinance_Purchases_Header_UpdateStockBtn                  = true;
		 boolean expFinance_Purchases_Header_RaiseReceiptBtn                 = true;
		 boolean expFinance_Purchases_Header_WareHouseExpandBtn              = true;
		 boolean expFinance_Purchases_Narrationdraganddrop                   = true;
		 boolean expFinance_Purchases_Userdraganddrop                        = true;
		 boolean expFinance_Purchases_Roledraganddrop                        = true;
		 boolean expFinance_Purchases_FDdragAndDrop                          = true;
			
			
		 System.out.println("****************************** checkHeaderOptions  ********************************************");
		 
		 System.out.println("Finance_Purchases_Header_DocNOdraganddrop     :"+actFinance_Purchases_Header_DocNOdraganddrop    +"     Value  : "+expFinance_Purchases_Header_DocNOdraganddrop);
		 System.out.println("Finance_Purchases_Header_DateExpandBtn        :"+actFinance_Purchases_Header_DateExpandBtn       +"     Value : "+expFinance_Purchases_Header_DateExpandBtn);
		 //System.out.println("Finance_Purchases_Header_PurchaseAcExpandBtn  :"+actFinance_Purchases_Header_PurchaseAcExpandBtn +"	 Value : "+expFinance_Purchases_Header_PurchaseAcExpandBtn);
		 System.out.println("Finance_Purchases_Header_VendorACExpandBtn    :"+actFinance_Purchases_Header_VendorACExpandBtn   +"	 Value : "+expFinance_Purchases_Header_VendorACExpandBtn);
		 System.out.println("Finance_Purchases_Header_UpdateStockBtn       :"+actFinance_Purchases_Header_UpdateStockBtn      +"	 Value : "+expFinance_Purchases_Header_UpdateStockBtn);
		 System.out.println("Finance_Purchases_Header_RaiseReceiptBtn      :"+actFinance_Purchases_Header_RaiseReceiptBtn     +"	 Value : "+expFinance_Purchases_Header_RaiseReceiptBtn);
		 System.out.println("Finance_Purchases_Header_WareHouseExpandBtn   :"+actFinance_Purchases_Header_WareHouseExpandBtn  +"	 Value : "+expFinance_Purchases_Header_WareHouseExpandBtn);
		 System.out.println("Finance_Purchases_Narrationdraganddrop        :"+actFinance_Purchases_Narrationdraganddrop       +"	 Value : "+expFinance_Purchases_Narrationdraganddrop);
		 System.out.println("Finance_Purchases_Userdraganddrop             :"+actFinance_Purchases_Userdraganddrop            +"	 Value : "+expFinance_Purchases_Userdraganddrop);
		 System.out.println("Finance_Purchases_Roledraganddrop             :"+actFinance_Purchases_Roledraganddrop            +"	 Value : "+expFinance_Purchases_Roledraganddrop);
		 System.out.println("Finance_Purchases_FDdragAndDrop               :"+actFinance_Purchases_FDdragAndDrop              +"	 Value : "+expFinance_Purchases_FDdragAndDrop);
		 
		 
		 boolean actMethod=actFinance_Purchases_Header_DocNOdraganddrop==expFinance_Purchases_Header_DocNOdraganddrop 
				 && actFinance_Purchases_Header_DateExpandBtn==expFinance_Purchases_Header_DateExpandBtn 
				 && actFinance_Purchases_Header_VendorACExpandBtn==expFinance_Purchases_Header_VendorACExpandBtn 
				 && actFinance_Purchases_Header_UpdateStockBtn==expFinance_Purchases_Header_UpdateStockBtn  
				 && actFinance_Purchases_Header_RaiseReceiptBtn==expFinance_Purchases_Header_RaiseReceiptBtn
				 && actFinance_Purchases_Header_WareHouseExpandBtn==expFinance_Purchases_Header_WareHouseExpandBtn 
			     && actFinance_Purchases_Narrationdraganddrop==expFinance_Purchases_Narrationdraganddrop
				 && actFinance_Purchases_Userdraganddrop==expFinance_Purchases_Userdraganddrop
				 && actFinance_Purchases_Roledraganddrop==expFinance_Purchases_Roledraganddrop 
				 && actFinance_Purchases_FDdragAndDrop==expFinance_Purchases_FDdragAndDrop;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 91, 7);
			excelReader.setCellData(xlfile, xlSheetName, 91, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : Header Options Are Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Finance_Purchases_HeaderMinimiseBtn));
			Finance_Purchases_HeaderMinimiseBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 90, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Header Options Are NOT Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Finance_Purchases_HeaderMinimiseBtn));
			Finance_Purchases_HeaderMinimiseBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 90, 9, resFail);
			return false;
		}
	}	
		
		
	


	@FindBy(xpath="//span[contains(text(),'Item')]//i[@class='icon-expand icon-font8']")
	private static WebElement  PSS_Body_ItemtExpansion;

	@FindBy(xpath="//span[contains(text(),'Unit')]//i[@class='icon-expand icon-font8']")
	private static WebElement  PSS_Body_UnitExpandBtn;
							
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[3]/a")
	private static WebElement  PSS_Body_RDdraganddrop;
							
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[5]/a")
	private static WebElement  PSS_Body_AvgRate0draganddrop;
							
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[7]/a")
	private static WebElement  PSS_Body_Quantitydraganddrop;
										
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[8]/a")
	private static WebElement  PSS_Body_VoucherQuantitydraganddrop;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[9]/a")
	private static WebElement  PSS_Body_PurchaseVoucherLinkColumn;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[10]/a")
	private static WebElement  PSS_Body_Ratedraganddrop;
							
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[11]/a")
	private static WebElement  PSS_Body_Grossdraganddrop;
							
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[12]/a")
	private static WebElement  PSS_Body_VoucherGrossdraganddrop;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[13]/a")
	private static WebElement  PSS_Body_Batchdraganddrop;
							
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[19]/a/span")
	private static WebElement  PSS_Body_BinsExpandBtn;
							
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[15]/a")
	private static WebElement  PSS_Body_ExpDatedraganddrop;
							
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'RMA')]")
	private static WebElement  PSS_Body_RMAdraganddrop;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[16]/a")
	private static WebElement  PSS_Body_Netdraganddrop;
							
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[17]/a")
	private static WebElement  PSS_Body_VoucherNetdraganddrop;
							
	@FindBy(xpath="//span[contains(text(),'VoucherVoucher RD')]")
	private static WebElement  PSS_Body_VoucherRDValue;

		
		
	public boolean checkBodyOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PSS_BodyExpandBtn));
		PSS_BodyExpandBtn.click();
		
		Thread.sleep(4000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PSS_Body_ItemtExpansion));
		
		 boolean actPSS_Body_ItemtExpansion                  = PSS_Body_ItemtExpansion.isDisplayed();
	     boolean actPSS_Body_UnitExpandBtn                   = PSS_Body_UnitExpandBtn.isDisplayed();
		 boolean actPSS_Body_RDdraganddrop                   = PSS_Body_RDdraganddrop.isDisplayed();
		 boolean actPSS_Body_AvgRate0draganddrop             = PSS_Body_AvgRate0draganddrop.isDisplayed();
		 boolean actPSS_Body_Quantitydraganddrop             = PSS_Body_Quantitydraganddrop.isDisplayed();
		 boolean actPSS_Body_VoucherQuantitydraganddrop      = PSS_Body_VoucherQuantitydraganddrop.isDisplayed();
	     boolean actPSS_Body_PurchaseVoucherLinkColumn       = PSS_Body_PurchaseVoucherLinkColumn.isDisplayed();
		 boolean actPSS_Body_Ratedraganddrop                 = PSS_Body_Ratedraganddrop.isDisplayed();
		 boolean actPSS_Body_Grossdraganddrop                = PSS_Body_Grossdraganddrop.isDisplayed();
		 boolean actPSS_Body_VoucherGrossdraganddrop         = PSS_Body_VoucherGrossdraganddrop.isDisplayed();
		 boolean actPSS_Body_Batchdraganddrop                = PSS_Body_Batchdraganddrop.isDisplayed();
		 boolean actPSS_Body_BinsExpandBtn                   = PSS_Body_BinsExpandBtn.isDisplayed();
		 boolean actPSS_Body_ExpDatedraganddrop              = PSS_Body_ExpDatedraganddrop.isDisplayed();
		 boolean actPSS_Body_RMAdraganddrop                  = PSS_Body_RMAdraganddrop.isDisplayed();
		 boolean actPSS_Body_Netdraganddrop                  = PSS_Body_Netdraganddrop.isDisplayed();
		 boolean actPSS_Body_VoucherNetdraganddrop           = PSS_Body_VoucherNetdraganddrop.isDisplayed();
		 boolean actPSS_Body_VoucherRDValue                  = PSS_Body_VoucherRDValue.isDisplayed();
		 
		 
		 boolean expPSS_Body_ItemtExpansion                  = true;
		 boolean expPSS_Body_UnitExpandBtn                   = true;
		 boolean expPSS_Body_RDdraganddrop                   = true;
		 boolean expPSS_Body_AvgRate0draganddrop             = true;
		 boolean expPSS_Body_Quantitydraganddrop             = true;
		 boolean expPSS_Body_VoucherQuantitydraganddrop      = true;
		 boolean expPSS_Body_PurchaseVoucherLinkColumn       = true;
		 boolean expPSS_Body_Ratedraganddrop                 = true;
		 boolean expPSS_Body_Grossdraganddrop                = true;
		 boolean expPSS_Body_VoucherGrossdraganddrop         = true;
		 boolean expPSS_Body_Batchdraganddrop                = true;
		 boolean expPSS_Body_BinsExpandBtn                   = true;
		 boolean expPSS_Body_ExpDatedraganddrop              = true;
		 boolean expPSS_Body_RMAdraganddrop                  = true;
		 boolean expPSS_Body_Netdraganddrop                  = true;
		 boolean expPSS_Body_VoucherNetdraganddrop           = true;
		 boolean expPSS_Body_VoucherRDValue                  = true;
		 boolean expuser4Chkbox                              = true;
		 boolean expuser5Chkbox                              = true;
		 	
		 System.out.println("****************************** checkBodyOptions  ********************************************");
		 
		 System.out.println("PSS_Body_ItemtExpansion             :"+actPSS_Body_ItemtExpansion             +"    Value Expected : "+expPSS_Body_ItemtExpansion);
		 System.out.println("PSS_Body_UnitExpandBtn              :"+actPSS_Body_UnitExpandBtn              +"    Value Expected : "+expPSS_Body_UnitExpandBtn);
		 System.out.println("PSS_Body_RDdraganddrop              :"+actPSS_Body_RDdraganddrop              +"	 Value Expected : "+expPSS_Body_RDdraganddrop);
		 System.out.println("PSS_Body_AvgRate0draganddrop     	 :"+actPSS_Body_AvgRate0draganddrop        +"	 Value Expected : "+expPSS_Body_AvgRate0draganddrop);
		 System.out.println("PSS_Body_Quantitydraganddrop        :"+actPSS_Body_Quantitydraganddrop        +"	 Value Expected : "+expPSS_Body_Quantitydraganddrop);
		 System.out.println("PSS_Body_VoucherQuantitydraganddrop :"+actPSS_Body_VoucherQuantitydraganddrop +"	 Value Expected : "+expPSS_Body_VoucherQuantitydraganddrop);
		 System.out.println("PSS_Body_PurchaseVoucherLinkColumn  :"+actPSS_Body_PurchaseVoucherLinkColumn  +"	 Value Expected : "+expPSS_Body_PurchaseVoucherLinkColumn);
		 System.out.println("PSS_Body_Ratedraganddrop            :"+actPSS_Body_Ratedraganddrop            +"	 Value Expected : "+expPSS_Body_Ratedraganddrop);
		 System.out.println("PSS_Body_Grossdraganddrop           :"+actPSS_Body_Grossdraganddrop           +"	 Value Expected : "+expPSS_Body_Grossdraganddrop);
		 System.out.println("PSS_Body_VoucherGrossdraganddrop    :"+actPSS_Body_VoucherGrossdraganddrop    +"	 Value Expected : "+expPSS_Body_VoucherGrossdraganddrop);
		 System.out.println("PSS_Body_Batchdraganddrop           :"+actPSS_Body_Batchdraganddrop           +"	 Value Expected : "+expPSS_Body_Batchdraganddrop);
		 System.out.println("PSS_Body_BinsExpandBtn              :"+actPSS_Body_BinsExpandBtn              +"	 Value Expected : "+expPSS_Body_BinsExpandBtn);
		 System.out.println("PSS_Body_ExpDatedraganddrop         :"+actPSS_Body_ExpDatedraganddrop         +"    Value Expected : "+expPSS_Body_ExpDatedraganddrop);
		 System.out.println("PSS_Body_RMAdraganddrop             :"+actPSS_Body_RMAdraganddrop             +"    Value Expected : "+expPSS_Body_RMAdraganddrop);
		 System.out.println("PSS_Body_Netdraganddrop             :"+actPSS_Body_Netdraganddrop             +"	 Value Expected : "+expPSS_Body_Netdraganddrop);
		 System.out.println("PSS_Body_VoucherNetdraganddrop      :"+actPSS_Body_VoucherNetdraganddrop      +"	 Value Expected : "+expPSS_Body_VoucherNetdraganddrop);
		 System.out.println("PSS_Body_VoucherRDValue             :"+actPSS_Body_VoucherRDValue             +"	 Value Expected : "+expPSS_Body_VoucherRDValue);
			
		 
		 boolean actMethod=actPSS_Body_ItemtExpansion==expPSS_Body_ItemtExpansion  && actPSS_Body_UnitExpandBtn==expPSS_Body_UnitExpandBtn 
				 && actPSS_Body_RDdraganddrop==expPSS_Body_RDdraganddrop && actPSS_Body_AvgRate0draganddrop==expPSS_Body_AvgRate0draganddrop
				 && actPSS_Body_Quantitydraganddrop==expPSS_Body_Quantitydraganddrop && actPSS_Body_VoucherQuantitydraganddrop==expPSS_Body_VoucherQuantitydraganddrop 
				 && actPSS_Body_PurchaseVoucherLinkColumn==expPSS_Body_PurchaseVoucherLinkColumn && actPSS_Body_Ratedraganddrop==expPSS_Body_Ratedraganddrop 
			     && actPSS_Body_Grossdraganddrop==expPSS_Body_Grossdraganddrop
				 && actPSS_Body_VoucherGrossdraganddrop==expPSS_Body_VoucherGrossdraganddrop && actPSS_Body_Batchdraganddrop==expPSS_Body_Batchdraganddrop 
				 && actPSS_Body_BinsExpandBtn==expPSS_Body_BinsExpandBtn  && actPSS_Body_ExpDatedraganddrop==expPSS_Body_ExpDatedraganddrop
				 && actPSS_Body_RMAdraganddrop==expPSS_Body_RMAdraganddrop && actPSS_Body_Netdraganddrop==expPSS_Body_Netdraganddrop 
				 && actPSS_Body_VoucherNetdraganddrop==expPSS_Body_VoucherNetdraganddrop 
				 && actPSS_Body_VoucherRDValue==expPSS_Body_VoucherRDValue;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 93, 7);
			excelReader.setCellData(xlfile, xlSheetName, 93, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		{
			System.out.println("Test Pass : body Options Are Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PSS_BodyMinimizeBtn));
			PSS_BodyMinimizeBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 92, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : body Options Are NOT Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PSS_BodyMinimizeBtn));
			PSS_BodyMinimizeBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 92, 9, resFail);
			return false;
		}
	}	
			
	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[1]/a")
	private static WebElement  UserDetails_UserNamedraganddrop;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[2]/a")
	private static WebElement  UserDetails_MobileNumberdraganddrop;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[3]/a")
	private static WebElement  UserDetails_PhoneNumberdraganddrop;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[4]/a")
	private static WebElement  UserDetails_EmailIddraganddrop;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[5]/a")
	private static WebElement  UserDetails_Signaturedraganddrop;	
	
	@FindBy(xpath="//li[@class='treeview']//span[contains(text(),'Employee')]")
	private static WebElement  UserDetails_EmployeeExpandBtn;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[7]/a")
	private static WebElement  UserDetails_AuthoriseUserNamedraganddrop;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[8]/a")
	private static WebElement  UserDetails_AuthoriseUserMobileNumberdraganddrop;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[9]/a")
	private static WebElement  UserDetails_AuthoriseUserPhoneNumberdraganddrop;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[10]/a")
	private static WebElement  UserDetails_AuthoriseUserEmailIddraganddrop;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[11]/a")
	private static WebElement  UserDetails_AuthoriseUserSignaturedraganddrop;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[12]/a")
	private static WebElement  UserDetails_AuthoriseBydraganddrop;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[13]/a")
	private static WebElement  UserDetails_NextUserNamedraganddrop;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[14]/a")
	private static WebElement  UserDetails_NextUserMobileNumberdraganddrop;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[15]/a")
	private static WebElement  UserDetails_NextUserPhoneNumberdraganddrop;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[16]/a")
	private static WebElement  UserDetails_NextUserEmailIddraganddrop;	
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[17]/a")
	private static WebElement  UserDetails_NextUserSignaturedraganddrop;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[18]/a")
	private static WebElement  UserDetails_CreatedBySignaturedraganddrop;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[4]/ul/li[19]/a")
	private static WebElement  UserDetails_ModifiedBySignaturedraganddrop;

		
	public boolean checkUserDetailsOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UserDetailsExpandbtn));
		UserDetailsExpandbtn.click();
		
		
		Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(UserDetails_UserNamedraganddrop));
		 boolean actUserDetails_UserNamedraganddrop                        = UserDetails_UserNamedraganddrop.isDisplayed();
	     boolean actUserDetails_MobileNumberdraganddrop                    = UserDetails_MobileNumberdraganddrop.isDisplayed();
		 boolean actUserDetails_PhoneNumberdraganddrop                     = UserDetails_PhoneNumberdraganddrop.isDisplayed();
		 boolean actUserDetails_EmailIddraganddrop                         = UserDetails_EmailIddraganddrop.isDisplayed();
		 boolean actUserDetails_Signaturedraganddrop                       = UserDetails_Signaturedraganddrop.isDisplayed();
		 boolean actUserDetails_EmployeeExpandBtn                          = UserDetails_EmployeeExpandBtn.isDisplayed();
	     boolean actUserDetails_AuthoriseUserNamedraganddrop          	   = UserDetails_AuthoriseUserNamedraganddrop.isDisplayed();
		 boolean actUserDetails_AuthoriseUserMobileNumberdraganddrop       = UserDetails_AuthoriseUserMobileNumberdraganddrop.isDisplayed();
		 boolean actUserDetails_AuthoriseUserPhoneNumberdraganddrop        = UserDetails_AuthoriseUserPhoneNumberdraganddrop.isDisplayed();
		 boolean actUserDetails_AuthoriseUserEmailIddraganddrop            = UserDetails_AuthoriseUserEmailIddraganddrop.isDisplayed();
		 boolean actUserDetails_AuthoriseUserSignaturedraganddrop          = UserDetails_AuthoriseUserSignaturedraganddrop.isDisplayed();
		 boolean actUserDetails_AuthoriseBydraganddrop                     = UserDetails_AuthoriseBydraganddrop.isDisplayed();
		 boolean actUserDetails_NextUserNamedraganddrop                    = UserDetails_NextUserNamedraganddrop.isDisplayed();
		 boolean actUserDetails_NextUserMobileNumberdraganddrop            = UserDetails_NextUserMobileNumberdraganddrop.isDisplayed();
		 boolean actUserDetails_NextUserPhoneNumberdraganddrop             = UserDetails_NextUserPhoneNumberdraganddrop.isDisplayed();
		 boolean actUserDetails_NextUserEmailIddraganddrop                 = UserDetails_NextUserEmailIddraganddrop.isDisplayed();
		 boolean actUserDetails_NextUserSignaturedraganddrop               = UserDetails_NextUserSignaturedraganddrop.isDisplayed();
		 boolean actUserDetails_CreatedBySignaturedraganddrop              = UserDetails_CreatedBySignaturedraganddrop.isDisplayed();
		 boolean actUserDetails_ModifiedBySignaturedraganddrop             = UserDetails_ModifiedBySignaturedraganddrop.isDisplayed();
		
		 boolean expUserDetails_UserNamedraganddrop                        = true;
		 boolean expUserDetails_MobileNumberdraganddrop                    = true;
		 boolean expUserDetails_PhoneNumberdraganddrop                     = true;
		 boolean expUserDetails_EmailIddraganddrop                         = true;
		 boolean expUserDetails_Signaturedraganddrop                       = true;
		 boolean expUserDetails_EmployeeExpandBtn                          = true;
		 boolean expUserDetails_AuthoriseUserNamedraganddrop               = true;
		 boolean expUserDetails_AuthoriseUserMobileNumberdraganddrop       = true;
		 boolean expUserDetails_AuthoriseUserPhoneNumberdraganddrop        = true;
		 boolean expUserDetails_AuthoriseUserEmailIddraganddrop            = true;
		 boolean expUserDetails_AuthoriseUserSignaturedraganddrop          = true;
		 boolean expUserDetails_AuthoriseBydraganddrop                     = true;
		 boolean expUserDetails_NextUserNamedraganddrop                    = true;
		 boolean expUserDetails_NextUserMobileNumberdraganddrop            = true;
		 boolean expUserDetails_NextUserPhoneNumberdraganddrop             = true;
		 boolean expUserDetails_NextUserEmailIddraganddrop                 = true;
		 boolean expUserDetails_NextUserSignaturedraganddrop               = true;
		 boolean expUserDetails_CreatedBySignaturedraganddrop              = true;
		 boolean expUserDetails_ModifiedBySignaturedraganddrop             = true;
			
			
		 System.out.println("****************************** checkPropertiesOption  ********************************************");
		 
		 System.out.println("UserDetails_UserNamedraganddrop                  :"+actUserDetails_UserNamedraganddrop                  +"  Value Expected : "+expUserDetails_UserNamedraganddrop);
		 System.out.println("UserDetails_MobileNumberdraganddrop              :"+actUserDetails_MobileNumberdraganddrop              +"  Value Expected : "+expUserDetails_MobileNumberdraganddrop);
		 System.out.println("UserDetails_PhoneNumberdraganddrop               :"+actUserDetails_PhoneNumberdraganddrop               +"	 Value Expected : "+expUserDetails_PhoneNumberdraganddrop);
		 System.out.println("UserDetails_EmailIddraganddrop     			  :"+actUserDetails_EmailIddraganddrop                   +"	 Value Expected : "+expUserDetails_EmailIddraganddrop);
		 System.out.println("UserDetails_Signaturedraganddrop                 :"+actUserDetails_Signaturedraganddrop                 +"	 Value Expected : "+expUserDetails_Signaturedraganddrop);
		 System.out.println("UserDetails_EmployeeExpandBtn      	          :"+actUserDetails_EmployeeExpandBtn                    +"	 Value Expected : "+expUserDetails_EmployeeExpandBtn);
		 System.out.println("UserDetails_AuthoriseUserNamedraganddrop         :"+actUserDetails_AuthoriseUserNamedraganddrop         +"	 Value Expected : "+expUserDetails_AuthoriseUserNamedraganddrop);
		 System.out.println("UserDetails_AuthoriseUserMobileNumberdraganddrop :"+actUserDetails_AuthoriseUserMobileNumberdraganddrop +"	 Value Expected : "+expUserDetails_AuthoriseUserMobileNumberdraganddrop);
		 System.out.println("UserDetails_AuthoriseUserPhoneNumberdraganddrop  :"+actUserDetails_AuthoriseUserPhoneNumberdraganddrop  +"	 Value Expected : "+expUserDetails_AuthoriseUserPhoneNumberdraganddrop);
		 System.out.println("UserDetails_AuthoriseUserEmailIddraganddrop      :"+actUserDetails_AuthoriseUserEmailIddraganddrop      +"	 Value Expected : "+expUserDetails_AuthoriseUserEmailIddraganddrop);
		 System.out.println("UserDetails_AuthoriseUserSignaturedraganddrop    :"+actUserDetails_AuthoriseUserSignaturedraganddrop    +"	 Value Expected : "+expUserDetails_AuthoriseUserSignaturedraganddrop);
		 System.out.println("UserDetails_AuthoriseBydraganddrop               :"+actUserDetails_AuthoriseBydraganddrop               +"	 Value Expected : "+expUserDetails_AuthoriseBydraganddrop);
		 System.out.println("UserDetails_NextUserNamedraganddrop              :"+actUserDetails_NextUserNamedraganddrop              +"  Value Expected : "+expUserDetails_NextUserNamedraganddrop);
		 System.out.println("UserDetails_NextUserMobileNumberdraganddrop      :"+actUserDetails_NextUserMobileNumberdraganddrop      +"  Value Expected : "+expUserDetails_NextUserMobileNumberdraganddrop);
		 System.out.println("UserDetails_NextUserPhoneNumberdraganddrop       :"+actUserDetails_NextUserPhoneNumberdraganddrop       +"	 Value Expected : "+expUserDetails_NextUserPhoneNumberdraganddrop);
		 System.out.println("UserDetails_NextUserEmailIddraganddrop           :"+actUserDetails_NextUserEmailIddraganddrop           +"	 Value Expected : "+expUserDetails_NextUserEmailIddraganddrop);
		 System.out.println("UserDetails_NextUserSignaturedraganddrop         :"+actUserDetails_NextUserSignaturedraganddrop         +"	 Value Expected : "+expUserDetails_NextUserSignaturedraganddrop);
		 System.out.println("UserDetails_CreatedBySignaturedraganddrop        :"+actUserDetails_CreatedBySignaturedraganddrop        +"	 Value Expected : "+expUserDetails_CreatedBySignaturedraganddrop);
		 System.out.println("UserDetails_ModifiedBySignaturedraganddrop       :"+actUserDetails_ModifiedBySignaturedraganddrop       +"	 Value Expected : "+expUserDetails_ModifiedBySignaturedraganddrop);
		
		 	
		 if( actUserDetails_UserNamedraganddrop==expUserDetails_UserNamedraganddrop  && actUserDetails_MobileNumberdraganddrop==expUserDetails_MobileNumberdraganddrop 
				 && actUserDetails_PhoneNumberdraganddrop==expUserDetails_PhoneNumberdraganddrop
				 && actUserDetails_EmailIddraganddrop==expUserDetails_EmailIddraganddrop  
				 && actUserDetails_Signaturedraganddrop==expUserDetails_Signaturedraganddrop  
				 && actUserDetails_EmployeeExpandBtn==expUserDetails_EmployeeExpandBtn 
				 && actUserDetails_AuthoriseUserNamedraganddrop==expUserDetails_AuthoriseUserNamedraganddrop 
			     && actUserDetails_AuthoriseUserMobileNumberdraganddrop==expUserDetails_AuthoriseUserMobileNumberdraganddrop
			     && actUserDetails_AuthoriseUserPhoneNumberdraganddrop==expUserDetails_AuthoriseUserPhoneNumberdraganddrop
				 && actUserDetails_AuthoriseUserEmailIddraganddrop==expUserDetails_AuthoriseUserEmailIddraganddrop 
				 && actUserDetails_AuthoriseUserSignaturedraganddrop==expUserDetails_AuthoriseUserSignaturedraganddrop 
				 && actUserDetails_AuthoriseBydraganddrop==expUserDetails_AuthoriseBydraganddrop  
				 && actUserDetails_NextUserNamedraganddrop==expUserDetails_NextUserNamedraganddrop
				 && actUserDetails_NextUserMobileNumberdraganddrop==expUserDetails_NextUserMobileNumberdraganddrop 
				 && actUserDetails_NextUserPhoneNumberdraganddrop==expUserDetails_NextUserPhoneNumberdraganddrop
				 && actUserDetails_NextUserEmailIddraganddrop==expUserDetails_NextUserEmailIddraganddrop
				 && actUserDetails_NextUserSignaturedraganddrop==expUserDetails_NextUserSignaturedraganddrop 
				 && actUserDetails_CreatedBySignaturedraganddrop==expUserDetails_CreatedBySignaturedraganddrop
				 && actUserDetails_ModifiedBySignaturedraganddrop==expUserDetails_ModifiedBySignaturedraganddrop)
		{
			System.out.println("Test Pass : Userdetails Options Are Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsMinimizeBtn));
			FieldsMinimizeBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 94, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Userdetails Options Are NOT Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsMinimizeBtn));
			FieldsMinimizeBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 94, 9, resFail);
			return false;
		}
	}	
		
		
		
	@FindBy(xpath="//span[contains(text(),'Login date')]")
	private static WebElement  Miscellaneous_LoginDatedraganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Page Number')]")
	private static WebElement  Miscellaneous_PageNumberdraganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Print Date')]")
	private static WebElement  Miscellaneous_PrintDatedraganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Print Time')]")
	private static WebElement  Miscellaneous_PrintTimedraganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Total Page')]")
	private static WebElement  Miscellaneous_TotalPagedraganddrop;
	
	@FindBy(xpath="//span[contains(text(),'S.No')]")
	private static WebElement  Miscellaneous_SrNodraganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Page Type')]")
	private static WebElement  Miscellaneous_PageTypedraganddrop;
				
	@FindBy(xpath="//span[contains(text(),'Ageing details')]")
	private static WebElement  Miscellaneous_AgeingDetailsdraganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Ageing amounts')]")
	private static WebElement  Miscellaneous_AgeingAmountsdraganddrop;

	@FindBy(xpath="//span[contains(text(),'Ageing headings')]")
	private static WebElement  Miscellaneous_AgeingHeadingsdraganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Ageing balance')]")
	private static WebElement  Miscellaneous_AgeingBalancesdraganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab1')]")
	private static WebElement  Miscellaneous_AgeingSlab1draganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab2')]")
	private static WebElement  Miscellaneous_AgeingSlab2draganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab3')]")
	private static WebElement  Miscellaneous_AgeingSlab3draganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab4')]")
	private static WebElement  Miscellaneous_AgeingSlab4draganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab5')]")
	private static WebElement  Miscellaneous_AgeingSlab5draganddrop;
	
	@FindBy(xpath="//span[contains(text(),'Ageing slab6')]")
	private static WebElement  Miscellaneous_AgeingSlab6draganddrop;
	

	
	
	public boolean checkMiscellaneousOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MiscellaneousExpandBtn));
		MiscellaneousExpandBtn.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Miscellaneous_LoginDatedraganddrop));
		 boolean actMiscellaneous_LoginDatedraganddrop                    = Miscellaneous_LoginDatedraganddrop.isDisplayed();
	     boolean actMiscellaneous_PageNumberdraganddrop                   = Miscellaneous_PageNumberdraganddrop.isDisplayed();
		 boolean actMiscellaneous_PrintDatedraganddrop                    = Miscellaneous_PrintDatedraganddrop.isDisplayed();
		 boolean actMiscellaneous_PrintTimedraganddrop                    = Miscellaneous_PrintTimedraganddrop.isDisplayed();
		 boolean actMiscellaneous_TotalPagedraganddrop                    = Miscellaneous_TotalPagedraganddrop.isDisplayed();
		 boolean actMiscellaneous_SrNodraganddrop                         = Miscellaneous_SrNodraganddrop.isDisplayed();
	     boolean actMiscellaneous_PageTypedraganddrop				      = Miscellaneous_PageTypedraganddrop.isDisplayed();
		 boolean actMiscellaneous_AgeingDetailsdraganddrop                = Miscellaneous_AgeingDetailsdraganddrop.isDisplayed();
		 boolean actMiscellaneous_AgeingAmountsdraganddrop                = Miscellaneous_AgeingAmountsdraganddrop.isDisplayed();
		 boolean actMiscellaneous_AgeingHeadingsdraganddrop               = Miscellaneous_AgeingHeadingsdraganddrop.isDisplayed();
		 boolean actMiscellaneous_AgeingBalancesdraganddrop               = Miscellaneous_AgeingBalancesdraganddrop.isDisplayed();
		 boolean actMiscellaneous_AgeingSlab1draganddrop                  = Miscellaneous_AgeingSlab1draganddrop.isDisplayed();
		 boolean actMiscellaneous_AgeingSlab2draganddrop                  = Miscellaneous_AgeingSlab2draganddrop.isDisplayed();
		 boolean actMiscellaneous_AgeingSlab3draganddrop                  = Miscellaneous_AgeingSlab3draganddrop.isDisplayed();
		 boolean actMiscellaneous_AgeingSlab4draganddrop                  = Miscellaneous_AgeingSlab4draganddrop.isDisplayed();
		 boolean actMiscellaneous_AgeingSlab5draganddrop                  = Miscellaneous_AgeingSlab5draganddrop.isDisplayed();
		 boolean actMiscellaneous_AgeingSlab6draganddrop                  = Miscellaneous_AgeingSlab6draganddrop.isDisplayed();
		 
		 boolean expMiscellaneous_LoginDatedraganddrop                    = true;
		 boolean expMiscellaneous_PageNumberdraganddrop                   = true;
		 boolean expMiscellaneous_PrintDatedraganddrop                    = true;
		 boolean expMiscellaneous_PrintTimedraganddrop                    = true;
		 boolean expMiscellaneous_TotalPagedraganddrop                    = true;
		 boolean expMiscellaneous_SrNodraganddrop                         = true;
		 boolean expMiscellaneous_PageTypedraganddrop                     = true;
		 boolean expMiscellaneous_AgeingDetailsdraganddrop                = true;
		 boolean expMiscellaneous_AgeingAmountsdraganddrop                = true;
		 boolean expMiscellaneous_AgeingHeadingsdraganddrop               = true;
		 boolean expMiscellaneous_AgeingBalancesdraganddrop               = true;
		 boolean expMiscellaneous_AgeingSlab1draganddrop                  = true;
		 boolean expMiscellaneous_AgeingSlab2draganddrop                  = true;
		 boolean expMiscellaneous_AgeingSlab3draganddrop                  = true;
		 boolean expMiscellaneous_AgeingSlab4draganddrop                  = true;
		 boolean expMiscellaneous_AgeingSlab5draganddrop                  = true;
		 boolean expMiscellaneous_AgeingSlab6draganddrop                  = true;
		 
			
		 System.out.println("****************************** checkMiscellaneousOptions  ********************************************");
		 
		 System.out.println("Miscellaneous_LoginDatedraganddrop          :"+actMiscellaneous_LoginDatedraganddrop     +"     Value Expected : "+expMiscellaneous_LoginDatedraganddrop);
		 System.out.println("Miscellaneous_PageNumberdraganddrop         :"+actMiscellaneous_PageNumberdraganddrop    +"     Value Expected : "+expMiscellaneous_PageNumberdraganddrop);
		 System.out.println("Miscellaneous_PrintDatedraganddrop          :"+actMiscellaneous_PrintDatedraganddrop     +"	 Value Expected : "+expMiscellaneous_PrintDatedraganddrop);
		 System.out.println("Miscellaneous_PrintTimedraganddrop          :"+actMiscellaneous_PrintTimedraganddrop     +"	 Value Expected : "+expMiscellaneous_PrintTimedraganddrop);
		 System.out.println("Miscellaneous_TotalPagedraganddrop          :"+actMiscellaneous_TotalPagedraganddrop     +"	 Value Expected : "+expMiscellaneous_TotalPagedraganddrop);
		 System.out.println("Miscellaneous_SrNodraganddrop      	     :"+actMiscellaneous_SrNodraganddrop          +"	 Value Expected : "+expMiscellaneous_SrNodraganddrop);
		 System.out.println("Miscellaneous_PageTypedraganddrop           :"+actMiscellaneous_PageTypedraganddrop      +"	 Value Expected : "+expMiscellaneous_PageTypedraganddrop);
		 System.out.println("Miscellaneous_AgeingDetailsdraganddrop      :"+actMiscellaneous_AgeingDetailsdraganddrop +"	 Value Expected : "+expMiscellaneous_AgeingDetailsdraganddrop);
		 System.out.println("Miscellaneous_AgeingAmountsdraganddrop      :"+actMiscellaneous_AgeingAmountsdraganddrop +"	 Value Expected : "+expMiscellaneous_AgeingAmountsdraganddrop);
		 System.out.println("Miscellaneous_AgeingHeadingsdraganddrop     :"+actMiscellaneous_AgeingHeadingsdraganddrop+"	 Value Expected : "+expMiscellaneous_AgeingHeadingsdraganddrop);
		 System.out.println("Miscellaneous_AgeingBalancesdraganddrop     :"+actMiscellaneous_AgeingBalancesdraganddrop+"	 Value Expected : "+expMiscellaneous_AgeingBalancesdraganddrop);
		 System.out.println("Miscellaneous_AgeingSlab1draganddrop        :"+actMiscellaneous_AgeingSlab1draganddrop   +"	 Value Expected : "+expMiscellaneous_AgeingSlab1draganddrop);
		 System.out.println("Miscellaneous_AgeingSlab2draganddrop        :"+actMiscellaneous_AgeingSlab2draganddrop   +"     Value Expected : "+expMiscellaneous_AgeingSlab2draganddrop);
		 System.out.println("Miscellaneous_AgeingSlab3draganddrop        :"+actMiscellaneous_AgeingSlab3draganddrop   +"     Value Expected : "+expMiscellaneous_AgeingSlab3draganddrop);
		 System.out.println("Miscellaneous_AgeingSlab4draganddrop        :"+actMiscellaneous_AgeingSlab4draganddrop   +"     Value Expected : "+expMiscellaneous_AgeingSlab4draganddrop);
		 System.out.println("Miscellaneous_AgeingSlab5draganddrop        :"+actMiscellaneous_AgeingSlab5draganddrop   +"     Value Expected : "+expMiscellaneous_AgeingSlab5draganddrop);
		 System.out.println("Miscellaneous_AgeingSlab6draganddrop        :"+actMiscellaneous_AgeingSlab6draganddrop   +"     Value Expected : "+expMiscellaneous_AgeingSlab6draganddrop);
		 
		 if( actMiscellaneous_LoginDatedraganddrop==expMiscellaneous_LoginDatedraganddrop  && actMiscellaneous_PageNumberdraganddrop==expMiscellaneous_PageNumberdraganddrop 
				 && actMiscellaneous_PrintDatedraganddrop==expMiscellaneous_PrintDatedraganddrop
				 && actMiscellaneous_PrintTimedraganddrop==expMiscellaneous_PrintTimedraganddrop  && actMiscellaneous_TotalPagedraganddrop==expMiscellaneous_TotalPagedraganddrop
				 && actMiscellaneous_SrNodraganddrop==expMiscellaneous_SrNodraganddrop && actMiscellaneous_PageTypedraganddrop==expMiscellaneous_PageTypedraganddrop 
			     && actMiscellaneous_AgeingDetailsdraganddrop==expMiscellaneous_AgeingDetailsdraganddrop
			     && actMiscellaneous_AgeingAmountsdraganddrop==expMiscellaneous_AgeingAmountsdraganddrop
				 && actMiscellaneous_AgeingHeadingsdraganddrop==expMiscellaneous_AgeingHeadingsdraganddrop
				 && actMiscellaneous_AgeingBalancesdraganddrop==expMiscellaneous_AgeingBalancesdraganddrop 
				 && actMiscellaneous_AgeingSlab1draganddrop==expMiscellaneous_AgeingSlab1draganddrop  
				 && actMiscellaneous_AgeingSlab2draganddrop==expMiscellaneous_AgeingSlab2draganddrop
				 && actMiscellaneous_AgeingSlab3draganddrop==expMiscellaneous_AgeingSlab3draganddrop
				 && actMiscellaneous_AgeingSlab4draganddrop==expMiscellaneous_AgeingSlab4draganddrop
				 && actMiscellaneous_AgeingSlab5draganddrop==expMiscellaneous_AgeingSlab5draganddrop
				 && actMiscellaneous_AgeingSlab6draganddrop==expMiscellaneous_AgeingSlab6draganddrop)
				
		{
			System.out.println("Test Pass : Miscellaneous Options Are Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsMinimizeBtn));
			FieldsMinimizeBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 95, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Fail : Miscellaneous Options Are NOT Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsMinimizeBtn));
			FieldsMinimizeBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 95, 9, resFail);
			return false;
		}
	}	
		
	
	
	@FindBy(xpath="//div[@id='id_LayoutDiv_0']")
	private static WebElement  layoutTarget;
	
	@FindBy(xpath="//div[@id='StaticText_0_2002']//p[contains(text(),'DocNo')]")
	private static WebElement  printLayoutHeaderDocNoLabel;
	
	@FindBy(xpath="//p[contains(text(),'Header.DocNo')]")
	private static WebElement  printLayoutHeaderDocNo;
	
	@FindBy(xpath="//div[@id='StaticText_0_2004']//p[contains(text(),'Date')]")
	private static WebElement  printLayoutHeaderDateLabel;
	
	@FindBy(xpath="//p[contains(text(),'Header.Date')]")
	private static WebElement  printLayoutHeaderDate;
	
	@FindBy(xpath="//div[@id='StaticText_0_2006']//p[contains(text(),'Name')]")
	private static WebElement  printLayoutHeaderPurchaseAcLabel;
	
	@FindBy(xpath="//p[contains(text(),'PurchaseAC.Name')]")
	private static WebElement  printLayoutHeaderPurchaseAc;
	
	@FindBy(xpath="//div[@id='StaticText_0_2008']//p[contains(text(),'Name')]")
	private static WebElement  printLayoutHeaderVendorAcLabel;
	
	@FindBy(xpath="//p[contains(text(),'VendorAC.Name')]")
	private static WebElement  printLayoutHeaderVendorAc;
	
	@FindBy(xpath="//div[@id='StaticText_0_2010']//p[contains(text(),'Name')]")
	private static WebElement  printLayoutHeaderWarehouseLabel;
	
	@FindBy(xpath="//p[contains(text(),'Warehouse.Name')]")
	private static WebElement  printLayoutHeaderWarehouse;
	
	@FindBy(xpath="//div[@id='StaticText_0_2012']//p[contains(text(),'Name')]")
	private static WebElement  printLayoutHeaderDepartmentLabel;
	
	@FindBy(xpath="//p[contains(text(),'Department.Name')]")
	private static WebElement  printLayoutHeaderDepartment;	
	
	@FindBy(xpath="//div[@id='StaticText_0_2014']//p[contains(text(),'sNarration')]")
	private static WebElement  printLayoutHeaderNarrationLabel;
	
	@FindBy(xpath="//p[contains(text(),'Header.sNarration')]")
	private static WebElement  printLayoutHeaderNarration;	
	
	@FindBy(xpath="//div[@id='StaticText_0_2016']//p[contains(text(),'User')]")
	private static WebElement  printLayoutHeaderUserLabel;
	
	@FindBy(xpath="//p[contains(text(),'Header.User')]")
	private static WebElement  printLayoutHeaderUser;	
	
	
	@FindBy(xpath="//input[@id='FTextBox_26_2000']")
	private static WebElement  bodyHeight;	
	
	@FindBy(xpath="//div[@id='ColumnGrid_0_2000']")
	private static WebElement  layoutBodyControl;
	

	

	
	
	public boolean checkFieldsDragInHeaderOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		 Thread.sleep(3000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Finance_Purchases_HeaderExpandBtn));
		 Finance_Purchases_HeaderExpandBtn.click();
		
		 Thread.sleep(5000);

		 Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\print.exe");
		 Thread.sleep(5000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(printLayoutHeaderDocNoLabel));

		 boolean actprintLayoutHeaderDocNoLabel                 = printLayoutHeaderDocNoLabel.isDisplayed();
	     boolean actprintLayoutHeaderDocNo                      = printLayoutHeaderDocNo.isDisplayed();
		 boolean actprintLayoutHeaderDateLabel                  = printLayoutHeaderDateLabel.isDisplayed();
		 boolean actprintLayoutHeaderDate                       = printLayoutHeaderDate.isDisplayed();
		 //boolean actprintLayoutHeaderPurchaseAcLabel            = printLayoutHeaderPurchaseAcLabel.isDisplayed();
		 //boolean actprintLayoutHeaderPurchaseAc                 = printLayoutHeaderPurchaseAc.isDisplayed();
	     //boolean actprintLayoutHeaderVendorAcLabel          	= printLayoutHeaderVendorAcLabel.isDisplayed();
		 //boolean actprintLayoutHeaderVendorAc                   = printLayoutHeaderVendorAc.isDisplayed();
		/* boolean actprintLayoutHeaderWarehouseLabel             = printLayoutHeaderWarehouseLabel.isDisplayed();
		 boolean actprintLayoutHeaderWarehouse                  = printLayoutHeaderWarehouse.isDisplayed();
		 boolean actprintLayoutHeaderDepartmentLabel            = printLayoutHeaderDepartmentLabel.isDisplayed();
		 boolean actprintLayoutHeaderDepartment                 = printLayoutHeaderDepartment.isDisplayed();
		 boolean actprintLayoutHeaderNarrationLabel             = printLayoutHeaderNarrationLabel.isDisplayed();
		 boolean actprintLayoutHeaderNarration                  = printLayoutHeaderNarration.isDisplayed();
		 boolean actprintLayoutHeaderUserLabel                  = printLayoutHeaderUserLabel.isDisplayed();
		 boolean actprintLayoutHeaderUser                       = printLayoutHeaderUser.isDisplayed();*/
		 
		 boolean expprintLayoutHeaderDocNoLabel                 = true;
		 boolean expprintLayoutHeaderDocNo                      = true;
		 boolean expprintLayoutHeaderDateLabel                  = true;
		 boolean expprintLayoutHeaderDate                       = true;
		// boolean expprintLayoutHeaderPurchaseAcLabel            = true;
		// boolean expprintLayoutHeaderPurchaseAc                 = true;
		 //boolean expprintLayoutHeaderVendorAcLabel              = true;
		 //boolean expprintLayoutHeaderVendorAc                   = true;
		 boolean expprintLayoutHeaderWarehouseLabel             = true;
		 boolean expprintLayoutHeaderWarehouse                  = true;
		 /*boolean expprintLayoutHeaderDepartmentLabel            = true;
		 boolean expprintLayoutHeaderDepartment                 = true;
		 boolean expprintLayoutHeaderNarrationLabel             = true;
		 boolean expprintLayoutHeaderNarration                  = true;
		 boolean expprintLayoutHeaderUserLabel                  = true;
		 boolean expprintLayoutHeaderUser                       = true;*/
		 	
			
		 System.out.println("****************************** checkFieldsDragInHeaderOptions  ********************************************");
		 
		 System.out.println("printLayoutHeaderDocNoLabel         :"+actprintLayoutHeaderDocNoLabel      +"   Value Expected : "+expprintLayoutHeaderDocNoLabel);
		 System.out.println("printLayoutHeaderDocNo              :"+actprintLayoutHeaderDocNo           +"   Value Expected : "+expprintLayoutHeaderDocNo);
		 System.out.println("printLayoutHeaderDateLabel          :"+actprintLayoutHeaderDateLabel       +"	 Value Expected : "+expprintLayoutHeaderDateLabel);
		 System.out.println("printLayoutHeaderDate     			 :"+actprintLayoutHeaderDate            +"	 Value Expected : "+expprintLayoutHeaderDate);
		 //System.out.println("printLayoutHeaderPurchaseAcLabel    :"+actprintLayoutHeaderPurchaseAcLabel +"	 Value Expected : "+expprintLayoutHeaderPurchaseAcLabel);
		 //System.out.println("printLayoutHeaderPurchaseAc      	 :"+actprintLayoutHeaderPurchaseAc      +"	 Value Expected : "+expprintLayoutHeaderPurchaseAc);
		 //System.out.println("printLayoutHeaderVendorAcLabel      :"+actprintLayoutHeaderVendorAcLabel   +"	 Value Expected : "+expprintLayoutHeaderVendorAcLabel);
		 //System.out.println("printLayoutHeaderVendorAc           :"+actprintLayoutHeaderVendorAc        +"	 Value Expected : "+expprintLayoutHeaderVendorAc);
		/* System.out.println("printLayoutHeaderWarehouseLabel     :"+actprintLayoutHeaderWarehouseLabel  +"	 Value Expected : "+expprintLayoutHeaderWarehouseLabel);
		 System.out.println("printLayoutHeaderWarehouse          :"+actprintLayoutHeaderWarehouse       +"	 Value Expected : "+expprintLayoutHeaderWarehouse);
		 System.out.println("printLayoutHeaderDepartmentLabel    :"+actprintLayoutHeaderDepartmentLabel +"	 Value Expected : "+expprintLayoutHeaderDepartmentLabel);
		 System.out.println("printLayoutHeaderDepartment         :"+actprintLayoutHeaderDepartment      +"	 Value Expected : "+expprintLayoutHeaderDepartment);
		 System.out.println("printLayoutHeaderNarrationLabel     :"+actprintLayoutHeaderNarrationLabel  +"   Value Expected : "+expprintLayoutHeaderNarrationLabel);
		 System.out.println("UserChkbox                          :"+actprintLayoutHeaderNarration       +"   Value Expected : "+expprintLayoutHeaderNarration);
		 System.out.println("printLayoutHeaderUserLabel          :"+actprintLayoutHeaderUserLabel       +"	 Value Expected : "+expprintLayoutHeaderUserLabel);
		 System.out.println("printLayoutHeaderUser               :"+actprintLayoutHeaderUser            +"	 Value Expected : "+expprintLayoutHeaderUser);
		*/	
		 if( actprintLayoutHeaderDocNoLabel==expprintLayoutHeaderDocNoLabel  && actprintLayoutHeaderDocNo==expprintLayoutHeaderDocNo 
				 && actprintLayoutHeaderDateLabel==expprintLayoutHeaderDateLabel && actprintLayoutHeaderDate==expprintLayoutHeaderDate  
			     /*&& actprintLayoutHeaderWarehouseLabel==expprintLayoutHeaderWarehouseLabel && actprintLayoutHeaderWarehouse==expprintLayoutHeaderWarehouse
				 && actprintLayoutHeaderDepartmentLabel==expprintLayoutHeaderDepartmentLabel && actprintLayoutHeaderDepartment==expprintLayoutHeaderDepartment  
				 && actprintLayoutHeaderNarrationLabel==expprintLayoutHeaderNarrationLabel  && actprintLayoutHeaderNarration==expprintLayoutHeaderNarration
				 && actprintLayoutHeaderUserLabel==expprintLayoutHeaderUserLabel && actprintLayoutHeaderUser==expprintLayoutHeaderUser*/)

		{
			System.out.println("Test Pass : Miscellaneous Options Are Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Finance_Purchases_HeaderMinimiseBtn));
			Finance_Purchases_HeaderMinimiseBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 96, 9, resPass);
			return true;
		}
		else
		{
			System.out.println("Test Pass : Miscellaneous Options Are Displayed");
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Finance_Purchases_HeaderMinimiseBtn));
			Finance_Purchases_HeaderMinimiseBtn.click();
			excelReader.setCellData(xlfile, xlSheetName, 96, 9, resFail);
			return false;
		}
		
	}	
		
	
	
	
	
	
	@FindBy(xpath="//input[@id='TextBox_3_2000']")
	private static WebElement  lapyoutBodyPropertyOfClass;
		
	@FindBy(xpath="//input[@id='TextBox_4_2000']")
	private static WebElement  lapyoutBodyPropertyOfFunction;
	
	@FindBy(xpath="//input[@id='TextBox_5_2000']")
	private static WebElement  lapyoutBodyPropertyOfNameSpace;
	
	@FindBy(xpath="//input[@id='browsebtn_6_2000']")
	private static WebElement  lapyoutBodyPropertyOfDefaultFontBrowseButton;
	
	@FindBy(xpath="//input[@id='browsebtn_7_2000']")
	private static WebElement  lapyoutBodyPropertyOfHeadingFontBrowseButton;
	
	@FindBy(xpath="//input[@id='browsebtn_8_2000']")
	private static WebElement  lapyoutBodyPropertyOfTotalFontBrowseButton;
	
	@FindBy(xpath="//select[@id='FColorCombo_9_2000']")
	private static WebElement  lapyoutBodyPropertyOfGridBankColor;
	
	@FindBy(xpath="//input[@id='FTextBox_10_2000']")
	private static WebElement  lapyoutBodyPropertyPostionIfHeaderSkipped;
	
	@FindBy(xpath="//select[@id='FColorCombo_11_2000']")
	private static WebElement  lapyoutBodyPropertyGridColor;
		
	@FindBy(xpath="//input[@id='FTextBox_12_2000']")
	private static WebElement  lapyoutBodyPropertyGridThickness;
	
	@FindBy(xpath="//select[@id='Combobox_13_2000']")
	private static WebElement  lapyoutBodyPropertyAddBalnceBfPageTotal;
		
	@FindBy(xpath="//select[@id='Combobox_14_2000']")
	private static WebElement  lapyoutBodyPropertyAlertnateRowColor;
	
	@FindBy(xpath="//select[@id='Combobox_15_2000']")
	private static WebElement  lapyoutBodyPropertyBodyLengthVariable;
		
	@FindBy(xpath="//select[@id='Combobox_16_2000']")
	private static WebElement  lapyoutBodyPropertyPrintBalance;
		
	@FindBy(xpath="//select[@id='Combobox_17_2000']")
	private static WebElement  lapyoutBodyPropertyDoNotPrintPartialItem;
		
	@FindBy(xpath="//select[@id='Combobox_18_2000']")
	private static WebElement  lapyoutBodyPropertyDoNotShowHeader;
	
	@FindBy(xpath="//select[@id='Combobox_19_2000']")
	private static WebElement  lapyoutBodyPropertyHideItemUnderSet;
	
	@FindBy(xpath="//select[@id='Combobox_20_2000']")
	private static WebElement  lapyoutBodyPropertyPrefixColoumnNameInPrintPreviousColumn;

	@FindBy(xpath="//select[@id='Combobox_21_2000']")
	private static WebElement  lapyoutBodyPropertyPrintTotalOnEveryPage;
	
	@FindBy(xpath="//select[@id='Combobox_22_2000']")
	private static WebElement  lapyoutBodyPropertySkipLineBetween;
	
	@FindBy(xpath="//select[@id='Combobox_23_2000']")
	private static WebElement  lapyoutBodyPropertyShowGridLines;
		
	@FindBy(xpath="//input[@id='FTextBox_24_2000']")
	private static WebElement  lapyoutBodyPropertyPostionLeft;
	
	@FindBy(xpath="//input[@id='FTextBox_25_2000']")
	private static WebElement  lapyoutBodyPropertyPositionRight;
	
	@FindBy(xpath="//input[@id='FTextBox_26_2000']")
	private static WebElement  lapyoutBodyPropertySizeHeight;
		
	@FindBy(xpath="//input[@id='FTextBox_27_2000']")
	private static WebElement  lapyoutBodyPropertySizeWidth;
	

	@FindBy(xpath="//*[@id='MainGrid_0_2000']")
	private static WebElement  lapyoutBodyControl;
	

	
	
	
	
	public boolean checkBodyControlLayout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		excelReader=new ExcelReader(POJOUtility.getExcelPath());
		xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	
        Thread.sleep(3000);

        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsTab));
		FieldsTab.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Controldrpdown));
		Controldrpdown.click();
		
		Thread.sleep(4000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BodyGridBtn));
		BodyGridBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(layoutTarget));
		layoutTarget.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyControl));
		
		if(lapyoutBodyControl.isDisplayed())
		{
			excelReader.setCellData(xlfile, xlSheetName, 97, 9, resPass);
			return true;
		}
		else
		{
			excelReader.setCellData(xlfile, xlSheetName, 97, 9, resFail);
			return false;
		}
		
	}
		
	
	
	
	@FindBy(xpath="//*[@id='BodyColumn_2000_0']")
	private static WebElement lapyoutBodyItem;	
	
	@FindBy(xpath="//*[@id='BodyColumn_2000_1']")
	private static WebElement lapyoutBodyUnit;
	
	@FindBy(xpath="//*[@id=InvoiceDesignFields']/ul/li[3]/ul/li[5]/a/span")
	private static WebElement lapyoutBodyRD;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[7]/a/span")
	private static WebElement lapyoutBodyAvgRate;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[11]/a/span")
	private static WebElement lapyoutBodyQty;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[13]/a/span")
	private static WebElement lapyoutBodyRate;
	
	@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[3]/ul/li[14]/a/span")
	private static WebElement lapyoutBodyGross;
	

	
		public boolean checkBodyPropertiesControl() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyControl));
			lapyoutBodyControl.click();
		
	        Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PropertiesTab));
			PropertiesTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyPostionIfHeaderSkipped));
			lapyoutBodyPropertyPostionIfHeaderSkipped.sendKeys(Keys.TAB);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyGridColor));
			lapyoutBodyPropertyGridColor.sendKeys(Keys.TAB);
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyGridThickness));
			lapyoutBodyPropertyGridThickness.sendKeys(Keys.TAB);
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyAddBalnceBfPageTotal));
			lapyoutBodyPropertyAddBalnceBfPageTotal.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyAlertnateRowColor));
			lapyoutBodyPropertyAlertnateRowColor.sendKeys(Keys.TAB);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyBodyLengthVariable));
			lapyoutBodyPropertyBodyLengthVariable.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyPrintBalance));
			lapyoutBodyPropertyPrintBalance.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyDoNotPrintPartialItem));
			lapyoutBodyPropertyDoNotPrintPartialItem.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyDoNotShowHeader));
			lapyoutBodyPropertyDoNotShowHeader.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyHideItemUnderSet));
			lapyoutBodyPropertyHideItemUnderSet.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyPrefixColoumnNameInPrintPreviousColumn));
			lapyoutBodyPropertyPrefixColoumnNameInPrintPreviousColumn.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyPrintTotalOnEveryPage));
			lapyoutBodyPropertyPrintTotalOnEveryPage.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertySkipLineBetween));
			lapyoutBodyPropertySkipLineBetween.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyShowGridLines));
			lapyoutBodyPropertyShowGridLines.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyPostionLeft));
			lapyoutBodyPropertyPostionLeft.clear();
			lapyoutBodyPropertyPostionLeft.sendKeys(excelReader.getCellData(xlSheetName, 99, 6));
			lapyoutBodyPropertyPostionLeft.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertyPositionRight));
			lapyoutBodyPropertyPositionRight.clear();
			lapyoutBodyPropertyPositionRight.sendKeys(excelReader.getCellData(xlSheetName, 100, 6));
			lapyoutBodyPropertyPositionRight.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertySizeHeight));
			lapyoutBodyPropertySizeHeight.clear();
			lapyoutBodyPropertySizeHeight.sendKeys(excelReader.getCellData(xlSheetName, 101, 6));
			lapyoutBodyPropertySizeHeight.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyPropertySizeWidth));
			lapyoutBodyPropertySizeWidth.clear();
			lapyoutBodyPropertySizeWidth.sendKeys(excelReader.getCellData(xlSheetName, 102, 6));
			lapyoutBodyPropertySizeWidth.sendKeys(Keys.TAB);
			
			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsTab));
			FieldsTab.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyControl));
			lapyoutBodyControl.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsTab));
			FieldsTab.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PSS_BodyExpandBtn));
			PSS_BodyExpandBtn.click();
			
			
			Thread.sleep(3000);

			 Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\printBody.exe");
			 
			 
			 Thread.sleep(5000);
			 
		 
			   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(lapyoutBodyItem));
			    boolean actlapyoutBodyItem             = lapyoutBodyItem.isDisplayed();
				boolean actlapyoutBodyUnit             = lapyoutBodyUnit.isDisplayed();
				//boolean actlapyoutBodyRD               = lapyoutBodyRD.isDisplayed();
				boolean actlapyoutBodyAvgRate          = lapyoutBodyAvgRate.isDisplayed();
				boolean actlapyoutBodyQty              = lapyoutBodyQty.isDisplayed();
				boolean actlapyoutBodyRate             = lapyoutBodyRate.isDisplayed();
				boolean actlapyoutBodyGross            = lapyoutBodyGross.isDisplayed();
				
				boolean explapyoutBodyItem             = true;
				boolean explapyoutBodyUnit             = true;
				//boolean explapyoutBodyRD               = true;
				boolean explapyoutBodyAvgRate          = true;
				boolean explapyoutBodyQty              = true;
				boolean explapyoutBodyRate             = true;
				boolean explapyoutBodyGross            = true;
				
				
				System.out.println("********************* checkMainOptionsWarehouseMenu ******************");
			
				System.out.println("lapyoutBodyItem           :"+actlapyoutBodyItem    +"  Value Expected : "+explapyoutBodyItem);
				System.out.println("lapyoutBodyUnit           :"+actlapyoutBodyUnit    +"  Value Expected : "+explapyoutBodyUnit);
				//System.out.println("lapyoutBodyRD             :"+actlapyoutBodyRD      +"  Value Expected : "+explapyoutBodyRD);
				System.out.println("lapyoutBodyAvgRate        :"+actlapyoutBodyAvgRate +"  Value Expected : "+explapyoutBodyAvgRate);
		        System.out.println("lapyoutBodyQty            :"+actlapyoutBodyQty     +"  Value Expected : "+explapyoutBodyQty);
				System.out.println("lapyoutBodyRate           :"+actlapyoutBodyRate    +"  Value Expected : "+explapyoutBodyRate);
				System.out.println("lapyoutBodyGross          :"+actlapyoutBodyGross   +"  Value Expected : "+explapyoutBodyGross);
			
					
				boolean actMethod= actlapyoutBodyItem==explapyoutBodyItem  && actlapyoutBodyUnit==explapyoutBodyUnit &&
						/*actlapyoutBodyRD==explapyoutBodyRD && */actlapyoutBodyAvgRate==explapyoutBodyAvgRate && 
						actlapyoutBodyQty==explapyoutBodyQty  && actlapyoutBodyRate==explapyoutBodyRate && 
					    actlapyoutBodyGross==explapyoutBodyGross;
				
				
				String actResult=Boolean.toString(actMethod);
				String expResult=excelReader.getCellData(xlSheetName, 103, 7);
				excelReader.setCellData(xlfile, xlSheetName, 103, 8, actResult);
					
				
			if(actResult.equalsIgnoreCase(expResult))
			{
				System.out.println("Test Pass : Miscellaneous Options Are Displayed");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsMinimizeBtn));
				FieldsMinimizeBtn.click();
				excelReader.setCellData(xlfile, xlSheetName, 98, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Miscellaneous Options Are NOT Displayed");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FieldsMinimizeBtn));
				FieldsMinimizeBtn.click();
				excelReader.setCellData(xlfile, xlSheetName, 98, 9, resFail);
				return false;
			}
	}	
		
		
		@FindBy(xpath="//span[@class='dropdown theme_icon-color open']//a[1]")
		private static WebElement receivedEmailTemplatePrintSaveBtn;	
		
		@FindBy(xpath="//input[@id='id_PopuplayoutName']")
		private static WebElement saveLayoutName;	
			
		@FindBy(xpath="//button[@id='btn_PopUpOk']")
		private static WebElement saveLayoutOkBtn;	
		
		@FindBy(xpath="//div[@id='id_PopUp']//button[@class='Fbutton'][contains(text(),'Cancel')]")
		private static WebElement saveLayoutCancelBtn;	
		
		@FindBy(xpath="//a[contains(text(),'Static Text')]")
		private static WebElement controlStaticText;	
		
		
		
		
		
		
		
		
		public boolean checkSaveOptionInEmailTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Savedropdown));
			Savedropdown.click();
			
			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedEmailTemplatePrintSaveBtn));
			receivedEmailTemplatePrintSaveBtn.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveLayoutName));
			boolean actsaveLayoutName          = saveLayoutName.isDisplayed();
			boolean actsaveLayoutOkBtn         = saveLayoutOkBtn.isDisplayed();
			boolean actsaveLayoutCancelBtn     = saveLayoutCancelBtn.isDisplayed();
			
			boolean expsaveLayoutName         = true;
			boolean expsaveLayoutOkBtn        = true;
			boolean expsaveLayoutCancelBtn    = true;
			
			System.out.println("*******************************************checkSaveOptionInEmailTemplate************************************"); 
			System.out.println("saveLayoutName           :"+actsaveLayoutName      +" Value Expected  :"+expsaveLayoutName);
			System.out.println("saveLayoutOkBtn          :"+actsaveLayoutOkBtn     +" Value Expected  :"+expsaveLayoutOkBtn);
			System.out.println("saveLayoutCancelBtn      :"+actsaveLayoutCancelBtn +" Value Expected  :"+expsaveLayoutCancelBtn);
			
			
			boolean actMethod=actsaveLayoutName==expsaveLayoutName && actsaveLayoutOkBtn==expsaveLayoutOkBtn &&
					actsaveLayoutCancelBtn==expsaveLayoutCancelBtn;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 105, 7);
			excelReader.setCellData(xlfile, xlSheetName, 105, 8, actResult);
				
			
			if(actResult.equalsIgnoreCase(expResult))
			{
				System.out.println("Test Pass : Miscellaneous Options Are Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 104, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Pass : Miscellaneous Options Are Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 104, 9, resFail);
				return false;
			}
			
		}	
		
		
		
		public boolean checkSaveOptionWithoutLayoutName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			Thread.sleep(3000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveLayoutOkBtn));
			saveLayoutOkBtn.click();
			
			String expMessage=excelReader.getCellData(xlSheetName, 107, 7);
			
			String actMessage=checkValidationMessage(expMessage);
					
			excelReader.setCellData(xlfile, xlSheetName, 107, 8, actMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 106, 9, resPass);
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				excelReader.setCellData(xlfile, xlSheetName, 106, 9, resFail);
				return false;
			}
			
		}	
		
		public boolean checkSaveOptionWithLayoutName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Savedropdown));
			Savedropdown.click();
			
			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedEmailTemplatePrintSaveBtn));
			receivedEmailTemplatePrintSaveBtn.click();
			
			Thread.sleep(3000);
			
			saveLayoutName.click();
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveLayoutName));
			saveLayoutName.sendKeys(excelReader.getCellData(xlSheetName, 109, 6));
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveLayoutOkBtn));
			saveLayoutOkBtn.click();
			
            String expMessage=excelReader.getCellData(xlSheetName, 110, 7);
			
			String actMessage=checkValidationMessage(expMessage);
					
			excelReader.setCellData(xlfile, xlSheetName, 110, 8, actMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 108, 9, resPass);
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				excelReader.setCellData(xlfile, xlSheetName, 108, 9, resFail);
				return false;
			}
			
		}	
	
		
		
		
		
		
		
		@FindBy(xpath="//span[@id='btnNewSmsTemplate']")
		private static WebElement smsTemplateLayoutNewBtn;	
		
		@FindBy(xpath="//span[@id='btnSaveSmsTemplate']")
		private static WebElement smsTemplateLayoutSaveBtn;	

		@FindBy(xpath="//span[@id='btnCloseSMSModal']")
		private static WebElement smsTemplateLayoutCloseBtn;	
			
		@FindBy(xpath="//span[@class='FBold theme_icon-color'][contains(text(),'Users')]")
		private static WebElement smsTemplateLayoutUsers;	
		
		@FindBy(xpath="//span[@class='FBold theme_icon-color'][contains(text(),'Company')]")
		private static WebElement smsTemplateLayoutCompany;	
		
		@FindBy(xpath="//*[@id='fieldtab']/li[3]/span")
		private static WebElement smsTemplateLayoutBody;	
		
		@FindBy(xpath="//*[@id='fieldtab']/li[4]/span")
		private static WebElement smsTemplateLayoutHeader;	
		
		/*@FindBy(xpath="//span[contains(text(),'Body')]")
		private static WebElement smsTemplateLayoutBody;	
		
		@FindBy(xpath="//span[contains(text(),'Header')]")
		private static WebElement smsTemplateLayoutHeader;	*/
		
		@FindBy(xpath="//td[@id='id_tblAlerts_col_1-3']")
		private static WebElement receivedEmailTemplateClick;	
		
		@FindBy(xpath="//select[@id='id_tblAlerts_EmailTemplate']")
		private static WebElement receivedEmailTemplateInput;
		
		
		public boolean checkExitOptionInLayout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ExitBtn));
			ExitBtn.click();
			
	        Thread.sleep(2000);
				      
	        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerSMSTemplate));
	        
		   	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedChkBox));
			 boolean actreceivedChkBox                   = receivedChkBox.isDisplayed();
		     boolean actapprovedChkBox                   = approvedChkBox.isDisplayed();
			 boolean actrejectedChkBox                   = rejectedChkBox.isDisplayed();
			 boolean actstoppedChkBox                    = stoppedChkBox.isDisplayed();
			 boolean actemailHeaderTemplateBtn           = emailHeaderTemplateBtn.isDisplayed();
			 boolean actemailTemplateBtn                 = emailTemplateBtn.isDisplayed();
		     boolean actheaderSMSTemplate          		 = headerSMSTemplate.isDisplayed();
			 boolean actheaderAlert                      = headerAlert.isDisplayed();
			 boolean actheaderRecipient                  = headerRecipient.isDisplayed();
			 
			 boolean expreceivedChkBox                   = true;
			 boolean expapprovedChkBox                   = true;
			 boolean exprejectedChkBox                   = true;
			 boolean expstoppedChkBox                    = true;
			 boolean expemailHeaderTemplateBtn           = true;
			 boolean expemailTemplateBtn                 = true;
			 boolean expheaderSMSTemplate                = true;
			 boolean expheaderAlert                      = true;
			 boolean expheaderRecipient                  = true;
			 	
			 System.out.println("****************************** checkExitOptionInLayout  ********************************************");
			 
			 System.out.println("ReceivedChkBox                :"+actreceivedChkBox         +"   Value Expected : "+expreceivedChkBox);
			 System.out.println("ApprovedChkBox                :"+actapprovedChkBox         +"   Value Expected : "+expapprovedChkBox);
			 System.out.println("RejectedChkBox                :"+actrejectedChkBox         +"	 Value Expected : "+exprejectedChkBox);
			 System.out.println("StoppedChkBox     			   :"+actstoppedChkBox          +"	 Value Expected : "+expstoppedChkBox);
			 System.out.println("EmailHeaderTemplateBtn        :"+actemailHeaderTemplateBtn +"	 Value Expected : "+expemailHeaderTemplateBtn);
			 System.out.println("EmailTemplateBtn      	       :"+actemailTemplateBtn       +"	 Value Expected : "+expemailTemplateBtn);
			 System.out.println("HeaderSMSTemplate             :"+actheaderSMSTemplate      +"	 Value Expected : "+expheaderSMSTemplate);
			 System.out.println("HeaderAlert                   :"+actheaderAlert            +"	 Value Expected : "+expheaderAlert);
			 System.out.println("HeaderRecipient               :"+actheaderRecipient        +"	 Value Expected : "+expheaderRecipient);
			  	
			 
			 boolean actMethod=actreceivedChkBox==expreceivedChkBox&& actapprovedChkBox==expapprovedChkBox  && actrejectedChkBox==exprejectedChkBox 
					 && actstoppedChkBox==expstoppedChkBox && actemailHeaderTemplateBtn==expemailHeaderTemplateBtn 
					  && actemailTemplateBtn==expemailTemplateBtn && actheaderSMSTemplate==expheaderSMSTemplate 
				     && actheaderAlert==expheaderAlert && actheaderRecipient==expheaderRecipient;
				
				
				String actResult=Boolean.toString(actMethod);
				String expResult=excelReader.getCellData(xlSheetName, 112, 7);
				excelReader.setCellData(xlfile, xlSheetName, 112, 8, actResult);
					
				
			if(actResult.equalsIgnoreCase(expResult))
			{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 111, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 111, 9, resFail);
				return false;
			}
		}
		

		
		
		

		
		public boolean checkSavedEmailTemplateInEmailTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		

			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedEmailTemplateClick));
			receivedEmailTemplateClick.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(recievedEmailHeaderTemplate));
			recievedEmailHeaderTemplate.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedEmailTemplateClick));
			receivedEmailTemplateClick.click();
			
			Thread.sleep(3000);
			
			/*receivedEmailTemplateInput.click();
			receivedEmailTemplateInput.sendKeys("emailLayoutOne");*/
			
			String actdatamsg,expdatamsg;
			
			Select s=new Select(receivedEmailTemplateInput);
			
			s.selectByVisibleText(excelReader.getCellData(xlSheetName, 114, 7));
			
			
			actdatamsg=s.getFirstSelectedOption().getText();
		
			Thread.sleep(3000);
			
			receivedEmailTemplateInput.sendKeys(Keys.TAB);
			
			Thread.sleep(3000);

			expdatamsg=excelReader.getCellData(xlSheetName, 114, 7);
			excelReader.setCellData(xlfile, xlSheetName, 114, 8, actdatamsg);
			
			System.out.println("actdatamsg"+actdatamsg);
			
			System.out.println("expdatamsg"+expdatamsg);
			
			if(actdatamsg.equalsIgnoreCase(expdatamsg))
			{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 113, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 113, 9, resFail);
				return false;
			}
			
		}	
		
		
		

		
		
		public boolean checkSMSTemplateOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerSMSTemplate));
			headerSMSTemplate.click();
			
			Thread.sleep(2000);
			
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(smsTemplateLayoutNewBtn));
			
		    boolean actsmsTemplateLayoutNewBtn                 = smsTemplateLayoutNewBtn.isDisplayed();
			boolean actsmsTemplateLayoutSaveBtn            	   = smsTemplateLayoutSaveBtn.isDisplayed();
			boolean actsmsTemplateLayoutCloseBtn               = smsTemplateLayoutCloseBtn.isDisplayed();
			boolean actsmsTemplateLayoutUsers                  = smsTemplateLayoutUsers.isDisplayed();
			boolean actsmsTemplateLayoutHeader                 = smsTemplateLayoutHeader.isDisplayed();
			boolean actsmsTemplateLayoutCompany                = smsTemplateLayoutCompany.isDisplayed();
			boolean actsmsTemplateLayoutBody                   = smsTemplateLayoutBody.isDisplayed();
			
			boolean expsmsTemplateLayoutNewBtn                 = true;
			boolean expsmsTemplateLayoutSaveBtn                = true;
			boolean expsmsTemplateLayoutCloseBtn               = true;
			boolean expsmsTemplateLayoutUsers                  = true;
			boolean expsmsTemplateLayoutHeader                 = true;
			boolean expsmsTemplateLayoutCompany                = true;
			boolean expsmsTemplateLayoutBody                   = true;
			boolean expmasterRibbonToExpandOptions             = true;
			
			System.out.println("*************************************checkSMSTemplateOption***********************************");
		
			System.out.println("smsTemplateLayoutNewBtn            :"+actsmsTemplateLayoutNewBtn   +"  Value Expected : "+expsmsTemplateLayoutNewBtn);
			System.out.println("smsTemplateLayoutSaveBtn           :"+actsmsTemplateLayoutSaveBtn  +"  Value Expected : "+expsmsTemplateLayoutSaveBtn);
			System.out.println("smsTemplateLayoutCloseBtn          :"+actsmsTemplateLayoutCloseBtn +"  Value Expected : "+expsmsTemplateLayoutCloseBtn);
			System.out.println("smsTemplateLayoutUsers             :"+actsmsTemplateLayoutUsers    +"  Value Expected : "+expsmsTemplateLayoutUsers);
	        System.out.println("smsTemplateLayoutHeader            :"+actsmsTemplateLayoutHeader   +"  Value Expected : "+expsmsTemplateLayoutHeader);
			System.out.println("smsTemplateLayoutCompany           :"+actsmsTemplateLayoutCompany  +"  Value Expected : "+expsmsTemplateLayoutCompany);
			System.out.println("smsTemplateLayoutBody              :"+actsmsTemplateLayoutBody     +"  Value Expected : "+expsmsTemplateLayoutBody);
			
			
			boolean actMethod=actsmsTemplateLayoutNewBtn==expsmsTemplateLayoutNewBtn  && actsmsTemplateLayoutSaveBtn==expsmsTemplateLayoutSaveBtn &&
					actsmsTemplateLayoutCloseBtn==expsmsTemplateLayoutCloseBtn && actsmsTemplateLayoutUsers==expsmsTemplateLayoutUsers && 
					actsmsTemplateLayoutHeader==expsmsTemplateLayoutHeader  && actsmsTemplateLayoutCompany==expsmsTemplateLayoutCompany && 
				    actsmsTemplateLayoutBody==expsmsTemplateLayoutBody;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 116, 7);
			excelReader.setCellData(xlfile, xlSheetName, 116, 8, actResult);
				
			
			if(actResult.equalsIgnoreCase(expResult))
			{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 115, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 115, 9, resFail);
				return false;
			}
			
		}
		
		
		
		@FindBy(xpath="//i[@class='icon-open icon-font7']")
		private static WebElement companyMenu;
		
		@FindBy(xpath="//span[contains(text(),'Company Name')]")
		private static WebElement companyNameSource;
		
		@FindBy(xpath="//textarea[@id='txtTemplate']")
		private static WebElement companyNameTemplateArea;
		
		@FindBy(xpath="//span[@id='btnSaveSmsTemplate']")
		private static WebElement saveBtnInEmailTemplateHeader;
		
		
		public boolean checkSaveButtonWithoutSMSTemplateName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
			saveBtnInEmailTemplateHeader.click();
			
			
            String expMessage=excelReader.getCellData(xlSheetName, 118, 7);
			
			String actMessage=checkValidationMessage(expMessage);
					
			excelReader.setCellData(xlfile, xlSheetName, 118, 8, actMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 117, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 117, 9, resFail);
				return false;
			}
			
		}
		
		
		public boolean checkSaveSMSTemplateWithMandatoryInputs() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyMenu));
			emailTemplates.sendKeys(excelReader.getCellData(xlSheetName, 120, 6));
			Thread.sleep(2000);
			emailTemplates.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTemplateArea));
			companyNameTemplateArea.click();
			companyNameTemplateArea.sendKeys(excelReader.getCellData(xlSheetName, 121, 6));
			companyNameTemplateArea.sendKeys(excelReader.getCellData(xlSheetName, 122, 6));
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
			saveBtnInEmailTemplateHeader.click();
			
            String expMessage=excelReader.getCellData(xlSheetName, 123, 7);
			
			String actMessage=checkValidationMessage(expMessage);
					
			excelReader.setCellData(xlfile, xlSheetName, 123, 8, actMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 119, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 119, 9, resFail);
				return false;
			}
		}
		
		
		
		public boolean checkCloseOptionInSMSTemplateWithMandatoryInputs() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		    
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(smsTemplateLayoutCloseBtn));
			smsTemplateLayoutCloseBtn.click();
			
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerSMSTemplate));
			    
		   	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedChkBox));
			 boolean actreceivedChkBox                   = receivedChkBox.isDisplayed();
		     boolean actapprovedChkBox                   = approvedChkBox.isDisplayed();
			 boolean actrejectedChkBox                   = rejectedChkBox.isDisplayed();
			 boolean actstoppedChkBox                    = stoppedChkBox.isDisplayed();
			 boolean actemailHeaderTemplateBtn           = emailHeaderTemplateBtn.isDisplayed();
			 boolean actemailTemplateBtn                 = emailTemplateBtn.isDisplayed();
		     boolean actheaderSMSTemplate          		 = headerSMSTemplate.isDisplayed();
			 boolean actheaderAlert                      = headerAlert.isDisplayed();
			 boolean actheaderRecipient                  = headerRecipient.isDisplayed();
			 
			 boolean expreceivedChkBox                   = true;
			 boolean expapprovedChkBox                   = true;
			 boolean exprejectedChkBox                   = true;
			 boolean expstoppedChkBox                    = true;
			 boolean expemailHeaderTemplateBtn           = true;
			 boolean expemailTemplateBtn                 = true;
			 boolean expheaderSMSTemplate                = true;
			 boolean expheaderAlert                      = true;
			 boolean expheaderRecipient                  = true;
			 	
			 System.out.println("****************************** checkCloseOptionInSMSTemplateWithMandatoryInputs  ********************************************");
			 
			 System.out.println("ReceivedChkBox                :"+actreceivedChkBox         +"   Value Expected : "+expreceivedChkBox);
			 System.out.println("ApprovedChkBox                :"+actapprovedChkBox         +"   Value Expected : "+expapprovedChkBox);
			 System.out.println("RejectedChkBox                :"+actrejectedChkBox         +"	 Value Expected : "+exprejectedChkBox);
			 System.out.println("StoppedChkBox     			   :"+actstoppedChkBox          +"	 Value Expected : "+expstoppedChkBox);
			 System.out.println("EmailHeaderTemplateBtn        :"+actemailHeaderTemplateBtn +"	 Value Expected : "+expemailHeaderTemplateBtn);
			 System.out.println("EmailTemplateBtn      	       :"+actemailTemplateBtn       +"	 Value Expected : "+expemailTemplateBtn);
			 System.out.println("HeaderSMSTemplate             :"+actheaderSMSTemplate      +"	 Value Expected : "+expheaderSMSTemplate);
			 System.out.println("HeaderAlert                   :"+actheaderAlert            +"	 Value Expected : "+expheaderAlert);
			 System.out.println("HeaderRecipient               :"+actheaderRecipient        +"	 Value Expected : "+expheaderRecipient);

			 
			 
			 boolean actMethod=actreceivedChkBox==expreceivedChkBox&& actapprovedChkBox==expapprovedChkBox  && actrejectedChkBox==exprejectedChkBox 
					 && actstoppedChkBox==expstoppedChkBox && actemailHeaderTemplateBtn==expemailHeaderTemplateBtn 
					  && actemailTemplateBtn==expemailTemplateBtn && actheaderSMSTemplate==expheaderSMSTemplate 
				     && actheaderAlert==expheaderAlert && actheaderRecipient==expheaderRecipient;
				
				
				String actResult=Boolean.toString(actMethod);
				String expResult=excelReader.getCellData(xlSheetName, 125, 7);
				excelReader.setCellData(xlfile, xlSheetName, 125, 8, actResult);
					
				
			if(actResult.equalsIgnoreCase(expResult))
			{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 124, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 124, 9, resFail);
				return false;
			}
		}
		
		
		
		
		@FindBy(xpath="//td[@id='id_tblAlerts_col_1-4']")
		private static WebElement receivedSMSTemplateClick;	
		
		@FindBy(xpath="//select[@id='id_tblAlerts_SMSTemplate']")
		private static WebElement smsTemplateInput;	
		
		
		public boolean checkSavedSMSTemplateInTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedSMSTemplateClick));
			receivedSMSTemplateClick.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(smsTemplateInput));
			smsTemplateInput.click();
			
			Thread.sleep(3000);
			
			smsTemplateInput.sendKeys(excelReader.getCellData(xlSheetName, 127, 6));
		
			Thread.sleep(3000);
			
			smsTemplateInput.sendKeys(Keys.TAB);
			
			Thread.sleep(3000);
			
			String actdatamsg,expdatamsgs;
			
			Select s=new Select(smsTemplateInput);
			
			actdatamsg=smsTemplateInput.getText();
			String actdatamsgs=smsTemplateInput.getAttribute("value");
			String actdatamsgss=s.getFirstSelectedOption().getText();
			
			String expdatamsg="createSMSTemplate";
			excelReader.setCellData(xlfile, xlSheetName, 127, 8, actdatamsgss);
			
			System.out.println("actdatamsg   :  "+actdatamsg);
			
			System.out.println("actdatamsgs  :  "+actdatamsgs);
			
			System.out.println("expdatamsg   :  "+expdatamsg);
			
			System.out.println("actdatamsgss   :  "+actdatamsgss);
			
			if(actdatamsg.equalsIgnoreCase(expdatamsg))
			{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 126, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 126, 9, resFail);
				return false;
			}
		}	
		
		
		
		
		
		public boolean checkAlertsTemplateOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";

		
			
            Thread.sleep(4000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerAlert));
			headerAlert.click();
			
			Thread.sleep(10000);
            getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(smsTemplateLayoutNewBtn));
			
		    boolean actsmsTemplateLayoutNewBtn                 = smsTemplateLayoutNewBtn.isDisplayed();
			boolean actsmsTemplateLayoutSaveBtn            	   = smsTemplateLayoutSaveBtn.isDisplayed();
			boolean actsmsTemplateLayoutCloseBtn               = smsTemplateLayoutCloseBtn.isDisplayed();
			boolean actsmsTemplateLayoutUsers                  = smsTemplateLayoutUsers.isDisplayed();
			boolean actsmsTemplateLayoutHeader                 = smsTemplateLayoutHeader.isDisplayed();
			boolean actsmsTemplateLayoutCompany                = smsTemplateLayoutCompany.isDisplayed();
			boolean actsmsTemplateLayoutBody                   = smsTemplateLayoutBody.isDisplayed();
			
			boolean expsmsTemplateLayoutNewBtn                 = true;
			boolean expsmsTemplateLayoutSaveBtn                = true;
			boolean expsmsTemplateLayoutCloseBtn               = true;
			boolean expsmsTemplateLayoutUsers                  = true;
			boolean expsmsTemplateLayoutHeader                 = true;
			boolean expsmsTemplateLayoutCompany                = true;
			boolean expsmsTemplateLayoutBody                   = true;
			boolean expmasterRibbonToExpandOptions             = true;
			
			System.out.println("*************************************checkAlertsTemplateOption***********************************");
		
			System.out.println("smsTemplateLayoutNewBtn            :"+actsmsTemplateLayoutNewBtn   +"  Value Expected : "+expsmsTemplateLayoutNewBtn);
			System.out.println("smsTemplateLayoutSaveBtn           :"+actsmsTemplateLayoutSaveBtn  +"  Value Expected : "+expsmsTemplateLayoutSaveBtn);
			System.out.println("smsTemplateLayoutCloseBtn          :"+actsmsTemplateLayoutCloseBtn +"  Value Expected : "+expsmsTemplateLayoutCloseBtn);
			System.out.println("smsTemplateLayoutUsers             :"+actsmsTemplateLayoutUsers    +"  Value Expected : "+expsmsTemplateLayoutUsers);
	        System.out.println("smsTemplateLayoutHeader            :"+actsmsTemplateLayoutHeader   +"  Value Expected : "+expsmsTemplateLayoutHeader);
			System.out.println("smsTemplateLayoutCompany           :"+actsmsTemplateLayoutCompany  +"  Value Expected : "+expsmsTemplateLayoutCompany);
			System.out.println("smsTemplateLayoutBody              :"+actsmsTemplateLayoutBody     +"  Value Expected : "+expsmsTemplateLayoutBody);
			
			
			boolean actMethod=actsmsTemplateLayoutNewBtn==expsmsTemplateLayoutNewBtn  && actsmsTemplateLayoutSaveBtn==expsmsTemplateLayoutSaveBtn &&
					actsmsTemplateLayoutCloseBtn==expsmsTemplateLayoutCloseBtn && actsmsTemplateLayoutUsers==expsmsTemplateLayoutUsers && 
					actsmsTemplateLayoutHeader==expsmsTemplateLayoutHeader  && actsmsTemplateLayoutCompany==expsmsTemplateLayoutCompany && 
				    actsmsTemplateLayoutBody==expsmsTemplateLayoutBody;
			
			
			String actResult=Boolean.toString(actMethod);
			String expResult=excelReader.getCellData(xlSheetName, 129, 7);
			excelReader.setCellData(xlfile, xlSheetName, 129, 8, actResult);
				
			
		if(actResult.equalsIgnoreCase(expResult))
		
		{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 128, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 128, 9, resFail);
				return false;
			}
			
		}
		
		
		

		
		
		public boolean checkSaveButtonWithoutAlertsTemplateName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		

			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
			saveBtnInEmailTemplateHeader.click();
			
            String expMessage=excelReader.getCellData(xlSheetName, 131, 7);
			
			String actMessage=checkValidationMessage(expMessage);
					
			excelReader.setCellData(xlfile, xlSheetName, 131, 8, actMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 130, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 130, 9, resFail);
				return false;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		public boolean checkSaveAlertsTemplateWithMandatoryInputs() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyMenu));
			emailTemplates.sendKeys(excelReader.getCellData(xlSheetName, 133, 6));
			Thread.sleep(2000);
			emailTemplates.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTemplateArea));
			companyNameTemplateArea.click();
			companyNameTemplateArea.sendKeys(excelReader.getCellData(xlSheetName, 134, 6));
			companyNameTemplateArea.sendKeys(excelReader.getCellData(xlSheetName, 135, 6));
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
			saveBtnInEmailTemplateHeader.click();
			

            String expMessage=excelReader.getCellData(xlSheetName, 136, 7);
			
			String actMessage=checkValidationMessage(expMessage);
					
			excelReader.setCellData(xlfile, xlSheetName, 136, 8, actMessage);
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 132, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 132, 9, resFail);
				return false;
			}
		}
		
		
		
		public boolean checkCloseOptionInAlertsTemplateWithMandatoryInputs() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(smsTemplateLayoutCloseBtn));
			smsTemplateLayoutCloseBtn.click();
				
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(headerSMSTemplate));
			   
		   	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedChkBox));
			 boolean actreceivedChkBox                   = receivedChkBox.isDisplayed();
		     boolean actapprovedChkBox                   = approvedChkBox.isDisplayed();
			 boolean actrejectedChkBox                   = rejectedChkBox.isDisplayed();
			 boolean actstoppedChkBox                    = stoppedChkBox.isDisplayed();
			 boolean actemailHeaderTemplateBtn           = emailHeaderTemplateBtn.isDisplayed();
			 boolean actemailTemplateBtn                 = emailTemplateBtn.isDisplayed();
		     boolean actheaderSMSTemplate          		 = headerSMSTemplate.isDisplayed();
			 boolean actheaderAlert                      = headerAlert.isDisplayed();
			 boolean actheaderRecipient                  = headerRecipient.isDisplayed();
			 
			 boolean expreceivedChkBox                   = true;
			 boolean expapprovedChkBox                   = true;
			 boolean exprejectedChkBox                   = true;
			 boolean expstoppedChkBox                    = true;
			 boolean expemailHeaderTemplateBtn           = true;
			 boolean expemailTemplateBtn                 = true;
			 boolean expheaderSMSTemplate                = true;
			 boolean expheaderAlert                      = true;
			 boolean expheaderRecipient                  = true;
			 	
			 System.out.println("****************************** checkCloseOptionInAlertsTemplateWithMandatoryInputs  ********************************************");
			 
			 System.out.println("ReceivedChkBox                :"+actreceivedChkBox         +"   Value Expected : "+expreceivedChkBox);
			 System.out.println("ApprovedChkBox                :"+actapprovedChkBox         +"   Value Expected : "+expapprovedChkBox);
			 System.out.println("RejectedChkBox                :"+actrejectedChkBox         +"	 Value Expected : "+exprejectedChkBox);
			 System.out.println("StoppedChkBox     			   :"+actstoppedChkBox          +"	 Value Expected : "+expstoppedChkBox);
			 System.out.println("EmailHeaderTemplateBtn        :"+actemailHeaderTemplateBtn +"	 Value Expected : "+expemailHeaderTemplateBtn);
			 System.out.println("EmailTemplateBtn      	       :"+actemailTemplateBtn       +"	 Value Expected : "+expemailTemplateBtn);
			 System.out.println("HeaderSMSTemplate             :"+actheaderSMSTemplate      +"	 Value Expected : "+expheaderSMSTemplate);
			 System.out.println("HeaderAlert                   :"+actheaderAlert            +"	 Value Expected : "+expheaderAlert);
			 System.out.println("HeaderRecipient               :"+actheaderRecipient        +"	 Value Expected : "+expheaderRecipient);
			  	
			 if(actreceivedChkBox==expreceivedChkBox&& actapprovedChkBox==expapprovedChkBox  && actrejectedChkBox==exprejectedChkBox 
					 && actstoppedChkBox==expstoppedChkBox && actemailHeaderTemplateBtn==expemailHeaderTemplateBtn 
					  && actemailTemplateBtn==expemailTemplateBtn && actheaderSMSTemplate==expheaderSMSTemplate 
				     && actheaderAlert==expheaderAlert && actheaderRecipient==expheaderRecipient)
			 {
					System.out.println("Test Pass : Alerts TAb Options Are Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 137, 9, resPass);
					return true;
			}
			else
			{
					System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
					excelReader.setCellData(xlfile, xlSheetName, 137, 9, resFail);
					return false;
			}
		}
		
		
		@FindBy(xpath="//td[@id='id_tblAlerts_col_1-5']")
		private static WebElement alertsTemplateClick;	
		
		@FindBy(xpath="//select[@id='id_tblAlerts_Alerts']")
		private static WebElement alertsTemplateInput;	
		
		
		public boolean checkSavedAlertTemplateInTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertsTemplateClick));
			alertsTemplateClick.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertsTemplateInput));
			alertsTemplateInput.click();
			
			Thread.sleep(3000);
			
			alertsTemplateInput.sendKeys(excelReader.getCellData(xlSheetName, 139, 6));
		
			Thread.sleep(3000);
			
			alertsTemplateInput.sendKeys(Keys.TAB);
			
			Thread.sleep(3000);
			
			Select s=new Select(alertsTemplateInput);
			
			String actdatamsg,expdatamsg;
			actdatamsg=alertsTemplateInput.getText();
			
			String actdatamsgs=alertsTemplateInput.getAttribute("value");
			String actdatamsgss=s.getFirstSelectedOption().getText();
			
			/*actdatamsg=receivedEmailTemplateInput.getText();
			String actdatamsgs=receivedEmailTemplateInput.getAttribute("value");
			
			
			expdatamsg="createAlertsTemplate";
			*/
			
			expdatamsg="createAlertsTemplate";
			excelReader.setCellData(xlfile, xlSheetName, 139, 8, actdatamsgss);
			
			System.out.println("actdatamsg  :  "+actdatamsg);
			
			System.out.println("actdatamsgs  :  "+actdatamsgs);
			
			System.out.println("expdatamsg  :  "+expdatamsg);
			
			System.out.println("actdatamsgss  :  "+actdatamsgss);
			
			if(actdatamsg.equalsIgnoreCase(expdatamsg))
			{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 140, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 140, 9, resFail);
				return false;
			}
		}	
		
		
		
		
		@FindBy(xpath="//select[@id='ddlAlertMessage1']")
		private static WebElement alertInEscalation;	
		
		@FindBy(xpath="//label[contains(text(),'UserAllOptionsST')]//input")
		private static WebElement userselection;	
		
		@FindBy(xpath="//select[@id='ddlUserType1']")
		private static WebElement userType;	
		
		public boolean 	checkOkBtnInEscalationTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
	

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(escalationTab));
			escalationTab.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(escalationLevelAddBtn));
			escalationLevelAddBtn.click();
			
			Thread.sleep(2000);
			
			TimelimitTxt1.sendKeys(excelReader.getCellData(xlSheetName, 141, 6));
			
			Thread.sleep(2000);
			
			TimelimitTxt1.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			EscalationType1.sendKeys(excelReader.getCellData(xlSheetName, 142, 6));
			
			Thread.sleep(2000);
			
			alertInEscalation.sendKeys(excelReader.getCellData(xlSheetName, 143, 6));
			
			Thread.sleep(2000);
			
			userType.click();
			
			Thread.sleep(2000);
			
			userselection.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
			definitionOkBtn.click();
			
			Thread.sleep(2000);
				
			if(startPointBtn.isDisplayed() && endpoint.isDisplayed())
			{
				System.out.println("Test Pass : Saved Data is Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 140, 9, resPass);
				return true;
			}
			else
			{
				System.out.println("Test Fail : Saved Data is NOT Displayed");
				excelReader.setCellData(xlfile, xlSheetName, 140, 9, resFail);
				return false;
			}
			
		}
		
	
		
		

		
		
		
		public boolean checkSaveAuthorizationWithAlertsAndEsclations() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
				
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
            String expMessage=excelReader.getCellData(xlSheetName, 145, 7);
			
			String actMessage=checkValidationMessage(expMessage);
					
			excelReader.setCellData(xlfile, xlSheetName, 145, 8, actMessage);	
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 144, 9, resPass);
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				excelReader.setCellData(xlfile, xlSheetName, 144, 9, resFail);
				return false;
			}
		}
		
		
	
		
		public boolean 	checkClearButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clearbtn));
			clearbtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
			documentNameDropdown.sendKeys(" ");
			
			String actdocumentNameDropdown,expdocumentNameDropdown;
			
			actdocumentNameDropdown=documentNameDropdown.getAttribute("placeholder");
			expdocumentNameDropdown=excelReader.getCellData(xlSheetName, 147, 7);
			excelReader.setCellData(xlfile, xlSheetName, 147, 8, actdocumentNameDropdown);
			System.out.println(actdocumentNameDropdown);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.click();
			
			String actnameTxt,expnameTxt;
			actnameTxt=nameTxt.getAttribute("placeholder");
			expnameTxt=excelReader.getCellData(xlSheetName, 148, 7);
			excelReader.setCellData(xlfile, xlSheetName, 148, 8, actdocumentNameDropdown);
			System.out.println(actnameTxt);
			
			
			if(actdocumentNameDropdown.equalsIgnoreCase(expdocumentNameDropdown) && actnameTxt.equalsIgnoreCase(expnameTxt))
			{
				excelReader.setCellData(xlfile, xlSheetName, 146, 9, resPass);
				return true;
				
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 146, 9, resFail);
				return false;
				
			}
			
		}
		
		
		@FindBy(xpath="//span[@class='treemenu_item_content_group_text col-xs-9']")
		private static WebElement selectJobOrders;	
		
		
		@FindBy(xpath="//span[@id='spnAddLevel']//i[@class='icon-new icon-font7']")
		private static WebElement addLevelButton;	

		
		public boolean checkAlertMessageOnDeleteAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
			documentNameDropdown.sendKeys(" ");
			
			Thread.sleep(2000);
			documentNameDropdown.sendKeys(Keys.END);
			documentNameDropdown.sendKeys(Keys.SHIFT,Keys.HOME);
			Thread.sleep(2000);
			
			documentNameDropdown.sendKeys(excelReader.getCellData(xlSheetName, 150, 6));
					
			Thread.sleep(3000);
			
			selectJobOrders.click();
			
			Thread.sleep(2000);
			
			nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 151, 6));
			
			Thread.sleep(3000);
			
			nameTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(3000);
			
			addLevelButton.click();
			
			Thread.sleep(3000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
			descriptionTxt.click();
			descriptionTxt.sendKeys(excelReader.getCellData(xlSheetName, 152, 6));
	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
			conditionNotRequiredChkBox.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
			userSelectionTab.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
			userrow1.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
			userDropdown.click();
			
			userDropdown.sendKeys(excelReader.getCellData(xlSheetName, 153, 6));
			
			Thread.sleep(2000);
			
			userDropdown.sendKeys(Keys.TAB);
						
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
			definitionOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
			errorMessageCloseBtn.click();
			
			Thread.sleep(5000);
			
            nameTxt.sendKeys(excelReader.getCellData(xlSheetName, 154, 6));
			
			Thread.sleep(2000);
			
			nameTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteBtn));
			deleteBtn.click();
						
			//Working with delete option
			getWaitForAlert();
			
			String actdatamsg=this.getDriver().switchTo().alert().getText();
			String expdatamsg=excelReader.getCellData(xlSheetName, 155, 7);
			excelReader.setCellData(xlfile, xlSheetName, 155, 8, actdatamsg);
		
			System.out.println("actdatamsg"+actdatamsg);
			
			System.out.println("expdatamsg"+expdatamsg);
			
			if(actdatamsg.equalsIgnoreCase(expdatamsg))
			{
				System.out.println("Error Message is As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 149, 9, resPass);
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				excelReader.setCellData(xlfile, xlSheetName, 149, 9, resFail);
				return false;
			}
		}
		
		
		
		public boolean 	checkCancelInAlertDeleteOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{		
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			this.getDriver().switchTo().alert().dismiss();
			
			Thread.sleep(3000);
			
			String actdata,expdata;
			
			actdata=nameTxt.getAttribute("value");
			expdata=excelReader.getCellData(xlSheetName, 157, 7);
			excelReader.setCellData(xlfile, xlSheetName, 157, 8, actdata);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.click();

			if(actdata.equalsIgnoreCase(expdata))
			{
				excelReader.setCellData(xlfile, xlSheetName, 156, 9, resPass);
				return true;
             		
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 156, 9, resFail);
				return false;
			}
			
		}
		
		
		

		public boolean 	checkOkInAlertDeleteOption() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteBtn));
			deleteBtn.click();
			
			
			//Working with delete option
			
			getWaitForAlert();
			
			
			
			this.getDriver().switchTo().alert().accept();
			
			if (errorMessage.isDisplayed()==true)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
				errorMessageCloseBtn.click();
			}
						
			Thread.sleep(3000);
			
			String actdata,expdata;
			
			actdata=nameTxt.getAttribute("placeholder");
			expdata=excelReader.getCellData(xlSheetName, 159, 7);
			excelReader.setCellData(xlfile, xlSheetName, 159, 8, actdata);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.click();

			if(actdata.equalsIgnoreCase(expdata))
			{
				excelReader.setCellData(xlfile, xlSheetName, 158, 9, resPass);
				return true;
             		
			}
			else
			{
				excelReader.setCellData(xlfile, xlSheetName, 158, 9, resFail);
				return false;
			}
			
		}
		
		
		
		
		@FindBy(xpath="//*[@id='id_menu_tree_Purchases Orders']/a/span")
		private static WebElement selectPurchaseOrders;	
		
		public boolean checkCreateAuthorizationInPurchasesOrder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
			documentNameDropdown.sendKeys(" ");
			
			Thread.sleep(2000);
			documentNameDropdown.sendKeys(Keys.END);
			documentNameDropdown.sendKeys(Keys.SHIFT,Keys.HOME);
		
			documentNameDropdown.sendKeys("Purchases Orders");
			Thread.sleep(3000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectPurchaseOrders));		
			selectPurchaseOrders.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys("Purchases");
			
			Thread.sleep(2000);
			
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addLevelButton));
			
			addLevelButton.click();
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
			descriptionTxt.click();
			descriptionTxt.sendKeys(excelReader.getCellData(xlSheetName, 152, 6));
	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
			conditionNotRequiredChkBox.click();
			
			
			Thread.sleep(2000);
			
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedlinkBaseChkBox));
			keepUnpostedlinkBaseChkBox.click();
			
			Thread.sleep(2000);

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
			userSelectionTab.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
			userrow1.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
			userDropdown.click();
			
			userDropdown.sendKeys(excelReader.getCellData(xlSheetName, 153, 6));
			
			Thread.sleep(2000);
			
			userDropdown.sendKeys(Keys.TAB);
						
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
			definitionOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage=excelReader.getCellData(xlSheetName, 54, 7);
			
			String actMessage=checkValidationMessage(expMessage);
				
			excelReader.setCellData(xlfile, xlSheetName, 54, 8, actMessage);
				
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 149, 9, resPass);
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				excelReader.setCellData(xlfile, xlSheetName, 149, 9, resFail);
				return false;
			}
		}
		
		
		@FindBy(xpath="//*[@id='id_menu_tree_Material Requisition']/a/span")
		private static WebElement selectMaterialRequisition;	
		
		
		public boolean checkCreateAuthorizationInMaterialRequistion() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.click();
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNameDropdown));
			documentNameDropdown.sendKeys(" ");
			
			Thread.sleep(2000);
			documentNameDropdown.sendKeys(Keys.END);
			documentNameDropdown.sendKeys(Keys.SHIFT,Keys.HOME);
		
			documentNameDropdown.sendKeys("Material Requisition");
			
			Thread.sleep(3000);
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectMaterialRequisition));		
			selectMaterialRequisition.click();
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys("Material Requisition");
			
			Thread.sleep(2000);
			
			nameTxt.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addLevelButton));
			
			addLevelButton.click();
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
			descriptionTxt.click();
			descriptionTxt.sendKeys(excelReader.getCellData(xlSheetName, 152, 6));
	
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
			conditionNotRequiredChkBox.click();

			Thread.sleep(2000);
			
			

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(keepUnpostedlinkBaseChkBox));
			keepUnpostedlinkBaseChkBox.click();

			Thread.sleep(2000);
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
			userSelectionTab.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
			userrow1.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
			userDropdown.click();
			
			userDropdown.sendKeys(excelReader.getCellData(xlSheetName, 153, 6));
			
			Thread.sleep(2000);
			
			userDropdown.sendKeys(Keys.TAB);
						
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
			definitionOkBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage=excelReader.getCellData(xlSheetName, 54, 7);
			
			String actMessage=checkValidationMessage(expMessage);
				
			excelReader.setCellData(xlfile, xlSheetName, 54, 8, actMessage);
				
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				excelReader.setCellData(xlfile, xlSheetName, 149, 9, resPass);
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				excelReader.setCellData(xlfile, xlSheetName, 149, 9, resFail);
				return false;
			}
		}
		
		
		
	@FindBy(xpath="//*[@id='userprofile']/li/span[2]")
	private static WebElement logoutOption;

	@FindBy(xpath="//*[@id='txtUsername']")
	private static WebElement username;

	@FindBy(id="txtPassword")
	private static WebElement password;
	
    @FindBy(id="ddlCompany")
    private static WebElement companyDropDownList;

	@FindBy(id="btnSignin")
	private static WebElement signIn;
	
	
		
		public boolean checkCloseAndLogoutTheCompany() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			excelReader=new ExcelReader(POJOUtility.getExcelPath());
			xlfile=getBaseDir()+"\\src\\main\\resources\\testdata\\FocusTestData.xlsx";		
			
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtn));
			    cancelBtn.click();
				
			    Thread.sleep(2000);
			  
			    getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(userNameDisplay));
			    userNameDisplay.click();
 
			    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
			    logoutOption.click();
	  
			    Thread.sleep(2000);
			   			
				
				getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(username));
			
				boolean verifyFiledsStatus=true;
				
		      	boolean actusername			      = username.isDisplayed();
		      	boolean actpassword	 	          = password.isDisplayed();
		        boolean actcompanyDropDownList    = companyDropDownList.isDisplayed();
		      	boolean actsignIn				  = signIn.isDisplayed();
		      	
		      	boolean expusername			      = true;
		      	boolean exppassword			      = true;
		      	boolean expcompanyDropDownList    = true;
		      	boolean expsignIn				  = true;
		  		 
		      	System.out.println("************************************* checkLogoutAfterCustomization  *********************************");
		      	
		      	System.out.println("Username             : "+actusername            +" Value Expected : "+expusername);
		      	System.out.println("Password             : "+actpassword            +" Value Expected : "+exppassword);
		      	System.out.println("CompanyDropDownList  : "+actcompanyDropDownList +" Value Expected : "+expcompanyDropDownList);
		      	System.out.println("SignIn               : "+actsignIn              +" Value Expected : "+expsignIn);
		      	      	
		      	boolean actMethod=actusername==expusername && actpassword==exppassword && 
		      			actcompanyDropDownList==expcompanyDropDownList && actsignIn==expsignIn;
							
				String actResult=Boolean.toString(actMethod);
				String expResult=excelReader.getCellData(xlSheetName, 161, 7);
				excelReader.setCellData(xlfile, xlSheetName, 161, 8, actResult);
					
				
				if(actResult.equalsIgnoreCase(expResult))
				{
					excelReader.setCellData(xlfile, xlSheetName, 160, 9, resPass);
				    return true;
							 
				}
				else
				{
					
					excelReader.setCellData(xlfile, xlSheetName, 160, 9, resFail);
					return false;
			    }
		}
		
		
		
		
		
		
		
		
	 public SmokeTransactionAuthorizationDefinitionPage(WebDriver driver)
	 {
		PageFactory.initElements(driver, this);	
	 }
	 
	 
	 
}
