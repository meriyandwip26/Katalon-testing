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

WebUI.click(findTestObject('Object Repository/Page_Homepage  Digiads/a_Cari Tahu (3)'))

WebUI.switchToWindowTitle('Tentang Kami | Digiads')

WebUI.click(findTestObject('Object Repository/Page_Tentang Kami  Digiads/img_Platform_img-responsive (1)'))

WebUI.click(findTestObject('Object Repository/Page_Homepage  Digiads/a_Pelajari Produk (1)'))

WebUI.switchToWindowTitle('Marketing Intelligence | Digiads')

WebUI.click(findTestObject('Object Repository/Page_Marketing Intelligence  Digiads/img_Platform_img-responsive'))

WebUI.click(findTestObject('Object Repository/Page_Homepage  Digiads/a_Pelajari Produk_1'))

WebUI.switchToWindowTitle('Digital Advertising | Digiads')

WebUI.click(findTestObject('Object Repository/Page_Digital Advertising  Digiads/img_Platform_img-responsive'))

WebUI.click(findTestObject('Object Repository/Page_Homepage  Digiads/a_Pelajari Produk_1_2'))

WebUI.switchToWindowTitle('API Service | Digiads')

WebUI.click(findTestObject('Object Repository/Page_API Service  Digiads/img_Platform_img-responsive'))

WebUI.click(findTestObject('Object Repository/Page_Homepage  Digiads/a_Pelajari Produk_1_2_3'))

WebUI.switchToWindowTitle('Mobile Banking | Digiads')

WebUI.click(findTestObject('Object Repository/Page_Mobile Banking  Digiads/img_Platform_img-responsive'))

