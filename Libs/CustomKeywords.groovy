
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String



def static "addemployee.addnewemployee"(
    	String firstName	
     , 	String middleName	
     , 	String lastName	
     , 	String employeeID	) {
    (new addemployee()).addnewemployee(
        	firstName
         , 	middleName
         , 	lastName
         , 	employeeID)
}


def static "addemployee.createlogindetails"(
    	String username	
     , 	String password	
     , 	String confirmPassword	) {
    (new addemployee()).createlogindetails(
        	username
         , 	password
         , 	confirmPassword)
}


def static "addemployee.choosestatus"(
    	String statusemployee	) {
    (new addemployee()).choosestatus(
        	statusemployee)
}


def static "accesskeyword.login"(
    	String username	
     , 	String password	) {
    (new accesskeyword()).login(
        	username
         , 	password)
}


def static "accesskeyword.logout"() {
    (new accesskeyword()).logout()
}
