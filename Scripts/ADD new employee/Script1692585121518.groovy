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
//WebUI.setText(findTestObject('Object Repository/ADD Timesheet/Page_Login-/input_Account Login_emailOrPhone'), 'skill@gmail.com')
//
//WebUI.setText(findTestObject('Object Repository/ADD Timesheet/Page_Login-/input_Account Login_password_1'), 'P@ssw0rd')
//
//WebUI.click(findTestObject('Object Repository/ADD Timesheet/Page_Login-/span_Login'))
WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-sqms.skill-quotient.com/')

WebUI.setText(findTestObject('Object Repository/Add new employee/Page_Login-/input_Account Login_emailOrPhone'), 'deepu@gmail.com')

WebUI.setText(findTestObject('Object Repository/Add new employee/Page_Login-/input_Account Login_password'), 'password')

WebUI.click(findTestObject('Object Repository/Add new employee/Page_Login-/span_Login'))

WebUI.click(findTestObject('Add new employee/Page_Login-/Page_Login-/div_Employee'))

WebUI.click(findTestObject('Object Repository/Add new employee/Page_Login-/a_Onboard Employee'))

WebUI.setText(findTestObject('Object Repository/Add new employee/Page_Onboard Employee/input_First Name_basic_firstName'), 
    'Rahul')

WebUI.setText(findTestObject('Object Repository/Add new employee/Page_Onboard Employee/input_Last Name_basic_lastName'), 
    'Khanna')

WebUI.setText(findTestObject('Object Repository/Add new employee/Page_Onboard Employee/input_Primary Email_basic_email'), 
    'rahul10@gmail.com')

WebUI.setText(findTestObject('Add new employee/Page_Onboard Employee/input_Phone Number_basic_phone'), '8121676522')

WebUI.click(findTestObject('Add new employee/Page_Onboard Employee/Page_Onboard Employee/input_Employment Type_basic_employmentType'))

WebUI.click(findTestObject('Add new employee/Page_Onboard Employee/div_Onsite'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Add new employee/Page_Onboard Employee/input_Designation_basic_designation'), 
    'sof')

WebUI.click(findTestObject('Object Repository/Add new employee/Page_Onboard Employee/div_Software Engineer'))

WebUI.setText(findTestObject('Object Repository/Add new employee/Page_Onboard Employee/input_Current Location_basic_currentLocation'), 
    'Mal')

WebUI.click(findTestObject('Object Repository/Add new employee/Page_Onboard Employee/div_Malaysia'))

WebUI.click(findTestObject('Object Repository/Add new employee/Page_Onboard Employee/input_Date of Joining_basic_dateOfJoining'))

WebUI.click(findTestObject('Object Repository/Add new employee/Page_Onboard Employee/div_1'))

WebUI.click(findTestObject('Add new employee/Page_Onboard Employee/Date of Birth'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Add new employee/Page_Onboard Employee/Date of Birth'), '01-09-2023')

WebUI.click(findTestObject('Add new employee/Page_Login-/Page_Onboard Employee/Page_Onboard Employee/div_2'))

WebUI.click(findTestObject('Add new employee/Page_Onboard Employee/Country'))

//WebUI.click(findTestObject('Add new employee/Page_Onboard Employee/span_Today_ant-picker-super-prev-icon'), FailureHandling.CONTINUE_ON_FAILURE)
//
//WebUI.click(findTestObject('Add new employee/Page_Onboard Employee/span_Today_ant-picker-super-prev-icon'), FailureHandling.CONTINUE_ON_FAILURE)
//WebUI.click(findTestObject('null'), FailureHandling.CONTINUE_ON_FAILURE)
//
//WebUI.click(findTestObject('null'), FailureHandling.CONTINUE_ON_FAILURE)
//
//WebUI.click(findTestObject('null'), FailureHandling.CONTINUE_ON_FAILURE)
//
//WebUI.click(findTestObject('null'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.setText(findTestObject('Add new employee/Page_Onboard Employee/Country'), 'india')

WebUI.click(findTestObject('Add new employee/Page_Onboard Employee/div_Male'))

WebUI.setText(findTestObject('Object Repository/Add new employee/Page_Onboard Employee/textarea_kualalumpur'), 'kualalumpur')

WebUI.setText(findTestObject('Object Repository/Add new employee/Page_Onboard Employee/textarea_India'), 'India')

WebUI.click(findTestObject('Object Repository/Add new employee/Page_Onboard Employee/span_Onboard'))

WebUI.click(findTestObject('Object Repository/Add new employee/Page_Onboard Employee/span_Onboard'))

WebUI.click(findTestObject('Object Repository/Add new employee/Page_Onboard Employee/a_Onboarding Approval'))

WebUI.click(findTestObject('Object Repository/Add new employee/Page_Onboarding Approval/path'))

WebUI.setText(findTestObject('Object Repository/Add new employee/Page_Onboarding Approval/textarea_reviewed'), 'reviewed')

WebUI.click(findTestObject('Object Repository/Add new employee/Page_Onboarding Approval/span_Approve'))

