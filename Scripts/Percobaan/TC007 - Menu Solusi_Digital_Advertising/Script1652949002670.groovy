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

WebUI.navigateToUrl('https://digiads.id/')

WebUI.click(findTestObject('Object Repository/Page_Homepage  Digiads/em_Solusi_arrow-down'))

WebUI.click(findTestObject('Object Repository/Page_Homepage  Digiads/a_Digital Advertising'))

WebUI.click(findTestObject('Object Repository/Page_Digital Advertising  Digiads/a_Pelajari Produk'))

WebUI.click(findTestObject('Object Repository/Page_Messaging  Digiads/a_Digital Advertising'))

WebUI.click(findTestObject('Object Repository/Page_Digital Advertising  Digiads/a_Pelajari Produk_1'))

WebUI.click(findTestObject('Object Repository/Page_Display  Digiads/a_Digital Advertising'))

WebUI.click(findTestObject('Object Repository/Page_Digital Advertising  Digiads/a_Pelajari Produk_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Rewards  Digiads/a_Digital Advertising'))

