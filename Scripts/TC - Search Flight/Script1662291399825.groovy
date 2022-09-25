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

WebUI.callTestCase(findTestCase('TC - Login'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Page_Swag  Travel Technology Partner - Sako/a_flights'))

if (Trip == 'Round Trip') {
    WebUI.click(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/Round Trip'))
}

if (Classes != 'economi') {
    WebUI.selectOptionByValue(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/Classes'), 
        Classes, true)
}

WebUI.setText(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/Flying From'), 
    FlyingFrom)

WebUI.click(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/From 1st Option'))

WebUI.setText(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/To Destination'), 
    ToDestination)

WebUI.click(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/Destination 1st Option'))

if (Swap == 'Yes') {
    WebUI.click(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/Swap'))
}

WebUI.setText(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/Departure Date'), 
    DepartureDate)

if (WebUI.verifyElementVisible(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/Return Date'), 
    FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/Return Date'), 
        ReturnDate)
}

WebUI.click(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/Passengers'))

WebUI.setText(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/Adults'), Adults)

WebUI.setText(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/Childs'), Childs)

WebUI.setText(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/Infants'), Infants)

WebUI.click(findTestObject('SearchFlightObject/Page_PHPTRAVELS  Travel Technology Partner - PHPTRAVELS/Button Search'))

