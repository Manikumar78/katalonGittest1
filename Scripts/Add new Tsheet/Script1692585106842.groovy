import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://test-sqms.skill-quotient.com/')
//
//WebUI.setText(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Login-/input_Account Login_emailOrPhone'), 
//    'deepu@gmail.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Login-/input_Account Login_password'), 
//    '8SQVv/p9jVScEs4/2CZsLw==')
//
//WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Login-/span_Login'))
WebUI.maximizeWindow()

WebUI.click(findTestObject('ADD Timesheet/Page_Login-/div_Timesheet'))

WebUI.click(findTestObject('ADD Timesheet/Page_Add Timesheet/Page_Login-/a_Add Timesheet'))

WebUI.setText(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Add Timesheet/input_Employee_basic_employee'), 
    '3108')

WebUI.click(findTestObject('ADD Timesheet/Page_Add Timesheet/span_3107'))

WebUI.click(findTestObject('ADD Timesheet/Page_Add Timesheet/div_SQW2023072751-AIA'))

WebUI.click(findTestObject('ADD Timesheet/Page_Add Timesheet/div_SQW2023072751-AIA - Copy'))

WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Add Timesheet/span_Full Month'))

WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Add Timesheet/div_Full Month'))

WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Add Timesheet/input_Date From-To_basic_date'))

WebUI.doubleClick(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Add Timesheet/button_Full Month_ant-picker-header-prev-btn'))

WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Add Timesheet/button_Full Month_ant-picker-header-prev-btn'))

WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Add Timesheet/button_Full Month_ant-picker-header-prev-btn'))

WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Add Timesheet/div_1'))

WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Add Timesheet/div_29'))

WebUI.setText(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Add Timesheet/input_Work Hours_basic_workedHours'), 
    '80')

WebUI.uploadFile(findTestObject('ADD Timesheet/Page_Add Timesheet/span_Click to attach'), span)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Add Timesheet/span_Save as draft'))

WebUI.click(findTestObject('ADD Timesheet/Page_Add Timesheet/Page_Add Timesheet/span_Yes'))

WebUI.takeScreenshotAsCheckpoint('Submitted')

//WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_My Timesheets/svg'))
//
//WebUI.click(findTestObject('ADD Timesheet/Page_Add Timesheet/Page_My Timesheets/span_Submit'))
//
//WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_My Timesheets/span_Yes'))
//WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_My Timesheets/a_Timesheet Approval'))
//
//WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Timesheet Approval/svg'))
//
//WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Timesheet Approval/span_Approve'))
//
//WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Add Timesheet/Page_Timesheet Approval/span_Yes'))
WebUI.closeBrowser()

