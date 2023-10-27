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

WebUI.click(findTestObject('Object Repository/Page_Register/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_email'), 'verenitaberlian97@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_password'), 'xcM2aaxBXWtMp6iPH4pvNQ==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login please wait'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Sales person                Search e_941074'), 
    'social_media', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Facebook                Twitter     _c639f7'), 
    'linkedin', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_Select                              _30b3d7'), 
    'private', true)

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_trading_name'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/textarea_company_desc'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_company_street_no'), 'Jawa')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_company_street_name'), 'Jawa')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_company_city'), 'Bondowoso')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_company_postal_code'), '62823')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_company_website'), 'no')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_company_age'), 'no')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/div_col-sm-8'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_company_age'), '2020')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_signatory_email'), 'verenitaberlian97@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_signatory_id_number'), '12345')

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/label_Same as company address'))

WebUI.setText(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/input_form-control minor-edit int_tel_input'), 
    '83847539190')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_-- Please Select a country --       _45f784'), 
    '-- Please Select a country --', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/select_-- Please Select a country --       _45f784'), 
    'ID', true)

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Mobipaid  Merchant Application/button_Next'))

