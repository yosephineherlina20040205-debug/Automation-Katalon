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

WebUI.navigateToUrl('http://149.129.243.237/mainmenu_base/main')

WebUI.setText(findTestObject('Object Repository/Page_PT Mobitech Media Integrasi/logout/Page_PT Mobitech Media Integrasi/input_Login_username'), 
    'superadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_PT Mobitech Media Integrasi/logout/Page_PT Mobitech Media Integrasi/input_Login_password'), 
    'LD9RyrWLt6Y=')

WebUI.click(findTestObject('Object Repository/Page_PT Mobitech Media Integrasi/logout/Page_PT Mobitech Media Integrasi/button_Login_btn btn-warning btn-block'))

WebUI.click(findTestObject('Object Repository/Page_PT Mobitech Media Integrasi/logout/Page_PT Mobitech Media Integrasi/a_SUPERADMIN_navbarDropdownMenuLink'))

WebUI.click(findTestObject('Object Repository/Page_PT Mobitech Media Integrasi/logout/Page_PT Mobitech Media Integrasi/a_Some Actions_dropdown-item'))

