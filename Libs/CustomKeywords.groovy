
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String



def static "login.logintopage"(
    	String username	
     , 	String password	) {
    (new login()).logintopage(
        	username
         , 	password)
}


def static "login.logout"() {
    (new login()).logout()
}


def static "personalinfo.detailinformation"(
    	String firstname	
     , 	String lastname	
     , 	String postcode	) {
    (new personalinfo()).detailinformation(
        	firstname
         , 	lastname
         , 	postcode)
}
