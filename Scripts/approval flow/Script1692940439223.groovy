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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-sqms.skill-quotient.com/')

WebUI.setText(findTestObject('Object Repository/Approval Time sheet/Page_Login-/input_Account Login_emailOrPhone'), 'partho@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Approval Time sheet/Page_Login-/input_Account Login_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Login-/span_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Approval Time sheet/Page_Login-/i_Timesheet_ant-menu-submenu-arrow'))

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Login-/a_Timesheet Approval'))

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/path'))

WebUI.click(findTestObject('Approval Time sheet/Page_Timesheet Approval/span_Approve'))

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Approval Time sheet/Page_Timesheet Approval/span_Logout - Copy'))

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Logout'))

WebUI.setText(findTestObject('Object Repository/Approval Time sheet/Page_Login-/input_Account Login_emailOrPhone'), 'deepu@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Approval Time sheet/Page_Login-/input_Account Login_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Login-/span_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Approval Time sheet/Page_Timesheet Approval/path'))

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Approve'))

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Deepthi joshi'))

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Logout'))

WebUI.setText(findTestObject('Object Repository/Approval Time sheet/Page_Login-/input_Account Login_emailOrPhone'), 'fateh@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Approval Time sheet/Page_Login-/input_Account Login_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Login-/span_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/svg'))

WebUI.click(findTestObject('Approval Time sheet/Page_Timesheet Approval/span_Approve'))

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Fateh  Ali Khan'))

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Logout'))

WebUI.setText(findTestObject('Object Repository/Approval Time sheet/Page_Login-/input_Account Login_emailOrPhone'), 'ravi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Approval Time sheet/Page_Login-/input_Account Login_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Login-/span_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/path'))

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Approve'))

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Ravindra gokhale'))

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Logout'))

WebUI.setText(findTestObject('Object Repository/Approval Time sheet/Page_Login-/input_Account Login_emailOrPhone'), 'abhinav@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Approval Time sheet/Page_Login-/input_Account Login_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Login-/span_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/svg'))

WebUI.setText(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/textarea_check'), 'check')

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Reject'))

WebUI.click(findTestObject('Object Repository/Approval Time sheet/Page_Timesheet Approval/span_Yes'))

WebUI.delay(2)

WebUI.closeBrowser()

