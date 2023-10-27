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

WebUI.navigateToUrl('https://stage.mobipaid.com/en/register')

WebUI.setText(findTestObject('Object Repository/Page_Login/Page_Register/input_signatory_last_name'), 'veren')

WebUI.setText(findTestObject('Object Repository/Page_Login/Page_Register/input_email'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/Page_Register/input_password'), 'xcM2aaxBXWtMp6iPH4pvNQ==')

WebUI.setText(findTestObject('Object Repository/Page_Login/Page_Register/input_name'), 'v')

WebUI.setText(findTestObject('Object Repository/Page_Login/Page_Register/input_form-control btn-log border-grey int__5c974a'), 
    '3333333')

WebUI.click(findTestObject('Object Repository/Page_Login/Page_Register/input_psa-checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Login/Page_Register/button_Next Step   please wait'))

WebUI.setText(findTestObject('Object Repository/Page_Login/Page_Register/input_email'), 'vereni@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Login/Page_Register/button_Next Step   please wait'))

WebUI.click(findTestObject('Object Repository/Page_Login/Page_Register/div_Invalid phone number'))

WebUI.click(findTestObject('Object Repository/Page_Login/Page_Register/div_62United States1United Kingdom44South A_1e68ec'))

WebUI.setText(findTestObject('Object Repository/Page_Login/Page_Register/input_form-control btn-log border-grey int__5c974a'), 
    '838736748')

WebUI.click(findTestObject('Object Repository/Page_Login/Page_Register/button_Next Step   please wait'))

