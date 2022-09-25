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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://phptravels.net/login')

WebUI.setText(findTestObject('LoginObject/Page_Login - PHPTRAVELS/Email'), Email)

WebUI.setText(findTestObject('LoginObject/Page_Login - PHPTRAVELS/Password'), Password)

WebUI.click(findTestObject('Object Repository/LoginObject/Page_Login - PHPTRAVELS/button_Login'))

if (WebUI.verifyElementPresent(findTestObject('LoginObject/Page_Login - PHPTRAVELS/Wrong Credentials'), 0, FailureHandling.OPTIONAL)) {
    print('Password/Username Salah')
} else {
    WebUI.verifyElementVisible(findTestObject('LoginObject/Page_Login - PHPTRAVELS/Dashboard'))
}

