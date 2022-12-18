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

WebUI.click(findTestObject('Page_Home - PS Enterprise Gameshop/icon_user'))

WebUI.selectOptionByValue(findTestObject('Page_1 new message/select_genre'), 'Action', false)

WebUI.selectOptionByValue(findTestObject('Page_1 new message/select_console'), 'PC', false)

WebUI.selectOptionByValue(findTestObject('Page_Home - PS Enterprise Gameshop/select_hobby'), 'Culinary', false)

WebUI.check(findTestObject('Page_1 new message/input_Female'))

WebUI.setText(findTestObject('Page_Home - PS Enterprise Gameshop/input__email'), 'xcsjfrq556@qemail.org')

WebUI.click(findTestObject('Page_1 new message/button_Register'))

WebUI.verifyElementText(findTestObject('Page_Home - PS Enterprise Gameshop/div_Error'), 'Error: Please enter an account password.')

WebUI.closeBrowser()

