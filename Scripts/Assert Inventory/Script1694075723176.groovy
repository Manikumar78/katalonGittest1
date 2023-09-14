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
//WebUI.setText(findTestObject('Object Repository/Asset Invent/Page_Login-/input_Account Login_emailOrPhone'), 'skill@gmail.com')
//
//WebUI.setText(findTestObject('Object Repository/Asset Invent/Page_Login-/input_Account Login_password_1'), 'P@ssw0rd')
//
//WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Login-/span_Login'))
WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Login-/div_Asset'))

WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Inventory/a_Acquisition'))

WebUI.setText(findTestObject('Object Repository/Asset Invent/Page_Acquisition/input_Asset Title_basic_assetTitle'), 'mac 23')

WebUI.setText(findTestObject('Object Repository/Asset Invent/Page_Acquisition/input_Asset Code_basic_assetCode'), '123456')

WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Acquisition/input_Asset Type_basic_assetType'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset Invent/Page_Acquisition/label_Asset Description - Copy'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Asset Invent/Page_Acquisition/input_Estimated Life_basic_estimatedLife'))

//WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Acquisition/label_Asset Description'))
WebUI.setText(findTestObject('Object Repository/Asset Invent/Page_Acquisition/textarea_React'), 'React')

WebUI.click(findTestObject('Asset Invent/Page_Acquisition/input_Purchase Date_basic_purchaseDate'))

WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Acquisition/div_1'))

WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Acquisition/input_Purchase Value_basic_purchaseValue'))

WebUI.setText(findTestObject('Object Repository/Asset Invent/Page_Acquisition/input_Purchase Value_basic_purchaseValue'), 
    '2500')

WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Acquisition/span_RM'))

WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Acquisition/div_RM'))

WebUI.setText(findTestObject('Object Repository/Asset Invent/Page_Acquisition/input_Purchase Order_basic_purchaseOrderNo'), 
    '987650')

WebUI.setText(findTestObject('Object Repository/Asset Invent/Page_Acquisition/input_Payment Method_basic_paymentMethod'), 
    'cash')

WebUI.setText(findTestObject('Object Repository/Asset Invent/Page_Acquisition/input_Delivery Date_basic_deliveryDate'), 
    '')

WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Acquisition/input_Delivery Date_basic_deliveryDate'))

WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Acquisition/div_2'))

WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Acquisition/input_Warranty Expiry Date_basic_warrantyEx_b40fbd'))

WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Acquisition/span_Sep_ant-picker-super-next-icon'))

WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Acquisition/div_30'))

WebUI.setText(findTestObject('Object Repository/Asset Invent/Page_Acquisition/input_Estimated Salvage Value_basic_estimat_b5a88c'), 
    '2000')

WebUI.setText(findTestObject('Object Repository/Asset Invent/Page_Acquisition/input_Estimated Life_basic_estimatedLife'), 
    '12')

WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Acquisition/span_Acquisition'))

WebUI.rightClick(findTestObject('Object Repository/Asset Invent/Page_Inventory/span_Download As Excel'))

WebUI.click(findTestObject('Object Repository/Asset Invent/Page_Inventory/div_Download As Excel'))

WebUI.verifyElementText(findTestObject('Object Repository/Asset Invent/Page_Inventory/span_Download As Excel'), 'Download As Excel')

WebUI.closeBrowser()

