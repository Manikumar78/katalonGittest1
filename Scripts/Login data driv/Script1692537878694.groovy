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

for (def row = 1; row <= findTestData('New Test Data').getRowNumbers(); row++) {
WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-sqms.skill-quotient.com/')

WebUI.setText(findTestObject('Login/Page_Login-/input_Account Login_emailOrPhone'), findTestData('New Test Data').getValue(
        'Username', row), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Login/Page_Login-/input_Account Login_password'), findTestData('New Test Data').getValue('Password', 
        row))

WebUI.click(findTestObject('Login/Page_Login-/span_Login'))

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.closeBrowser()
}
