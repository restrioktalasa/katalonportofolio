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

class accesskeyword {
	@Keyword
	def login (String username, String password) {
		WebUI.setText(findTestObject('Object Repository/1. Login Page/input_username'), username)
		WebUI.setText(findTestObject('Object Repository/1. Login Page/input_password'), password)
		WebUI.click(findTestObject('Object Repository/1. Login Page/button_login'))
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/1. Login Page/header_homepage'), 3)
	}
	
	@Keyword
	def logout() {
		WebUI.click(findTestObject('Object Repository/2. Logout Page/button_profile dropdown'))
		WebUI.click(findTestObject('Object Repository/2. Logout Page/button_logout'))
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/1. Login Page/input_username'), 3)
	}
}
