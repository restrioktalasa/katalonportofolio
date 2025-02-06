import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

class addemployee {
	@Keyword
	def addnewemployee (String firstName, String middleName, String lastName, String employeeID) {
		WebUI.setText(findTestObject('Object Repository/4. PIM Page/input_firstname'), firstName)
		WebUI.setText(findTestObject('Object Repository/4. PIM Page/input_middlename'), middleName)
		WebUI.setText(findTestObject('Object Repository/4. PIM Page/input_lastname'), lastName)
		WebUI.clearText(findTestObject('Object Repository/4. PIM Page/input_employee id'))
		WebUI.setText(findTestObject('Object Repository/4. PIM Page/input_employee id'), employeeID)
	}

	@Keyword
	def createlogindetails (String username, String password, String confirmPassword) {
		WebUI.setText(findTestObject('Object Repository/4. PIM Page/input_username'), username)
		WebUI.setText(findTestObject('Object Repository/4. PIM Page/input_password'), password)
		WebUI.setText(findTestObject('Object Repository/4. PIM Page/input_confirm password'), confirmPassword)
	}

	@Keyword
	def choosestatus (String statusemployee) {
		switch (statusemployee.toLowerCase()) {
			case 'enable':
				WebUI.click(findTestObject('Object Repository/4. PIM Page/button_status enable'))
				break
			case 'disable':
				WebUI.click(findTestObject('Object Repository/4. PIM Page/button_status disable'))
				break
			default:
				println("tidak ada status dipilih")
		}
	}
}
