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

WebUI.openBrowser('https://www.psegameshop.com/')

WebUI.click(findTestObject('Page_Login/icon_user'))

WebUI.verifyElementText(findTestObject('Page_Register/Header_Register'), 'REGISTER')

WebUI.selectOptionByValue(findTestObject('Page_Register/select_genre'), genre, false)

WebUI.selectOptionByValue(findTestObject('Page_Register/select_console'), console, false)

if (gender == 'Female') {
    WebUI.check(findTestObject('Page_Register/input_Female'))
} else {
    WebUI.check(findTestObject('Page_Register/input_Male'))
}

WebUI.setText(findTestObject('Page_Register/input_email_reg'), email)

WebUI.setText(findTestObject('Page_Register/input_password_reg'), password)

WebUI.setText(findTestObject('Page_Register/input_confirm_password'), confirm_password)

WebUI.click(findTestObject('Page_Register/button_Register'))

result = WebUI.getText(findTestObject('Page_Register/text_register'))

WebUI.verifyNotMatch(result, message, false)

WebUI.closeBrowser()

