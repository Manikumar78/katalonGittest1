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

WebUI.setText(findTestObject('Object Repository/allocate asset/Page_Login-/input_Account Login_emailOrPhone'), 'ramesh11@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/allocate asset/Page_Login-/input_Account Login_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/allocate asset/Page_Login-/span_Login'))

WebUI.click(findTestObject('Object Repository/allocate asset/Page_Login-/i_Asset_ant-menu-submenu-arrow'))

WebUI.click(findTestObject('Object Repository/allocate asset/Page_Login-/a_Allocation'))

WebUI.setText(findTestObject('Object Repository/allocate asset/Page_Allocation/input_Employee_basic_employee'), '100')

WebUI.click(findTestObject('Object Repository/allocate asset/Page_Allocation/span_100'))

WebUI.click(findTestObject('Object Repository/allocate asset/Page_Allocation/div_Asset'))

WebUI.click(findTestObject('Object Repository/allocate asset/Page_Allocation/div_SQA2023090059 - macbook (123456)'))

WebUI.click(findTestObject('Object Repository/allocate asset/Page_Allocation/input_Allocation Date_basic_allocationDate'))

WebUI.click(findTestObject('Object Repository/allocate asset/Page_Allocation/div_3'))

WebUI.setText(findTestObject('Object Repository/allocate asset/Page_Allocation/textarea_mac'), 'mac')

WebUI.click(findTestObject('Object Repository/allocate asset/Page_Allocation/span_Choose File'))

WebUI.click(findTestObject('Object Repository/allocate asset/Page_Allocation/span_Allocate'))

WebUI.verifyElementText(findTestObject('Object Repository/allocate asset/Page_Inventory/article_SQA2023090059'), 'SQA2023090059')

WebUI.closeBrowser()

