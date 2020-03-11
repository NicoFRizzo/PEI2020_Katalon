import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('LogIn'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('NuevoCliente/MenuBar_Clientes'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('NuevoCliente/btn_NuevoCliente'))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('NuevoCliente/txt_Nombre'), Nombre)

WebUI.setText(findTestObject('NuevoCliente/txt_Apellido'), Apellido)

WebUI.setText(findTestObject('NuevoCliente/txt_Direccion'), Direccion)

WebUI.setText(findTestObject('NuevoCliente/txt_Email'), Email)

WebUI.setText(findTestObject('NuevoCliente/txt_Telefono'), Telefono)

WebUI.click(findTestObject('NuevoCliente/btn_AgregarCliente'))

WebUI.waitForPageLoad(5)

if (GlobalVariable.Email_Clientes == '') {
    GlobalVariable.Email_Clientes = '\'' + Email + '\''
} else {
    GlobalVariable.Email_Clientes = GlobalVariable.Email_Clientes + ', \'' + Email + '\''
}

System.out.println('Email de los clientes --> ' + GlobalVariable.Email_Clientes)

WebUI.takeScreenshot()

