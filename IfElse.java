package DevelopmentSet;

public class IfElse {

	public static void main(String[] args) {
	/*	cardInfo.setIdNo(cardInfo.getTcCitizen() ?
		(formUtils.isNullOrEmptyString(verifyOtpWSResponse.getTckn()) ? 
		registrationForm.getTckn() : verifyOtpWSResponse.getTckn()): 
		(formUtils.isNullOrEmptyString(verifyOtpWSResponse.getCustno())) ?
		registrationForm.getTckn(): verifyOtpWSResponse.getCustno());*/
		
		//If-Else Arrangement
		
		if (cardInfo.setIdNo(cardInfo.getTcCitizen())){
			
		if(formUtils.isNullOrEmptyString(verifyOtpWSResponse.getTckn())) {
			registrationForm.getTckn();
		}
		else {
			verifyOtpWSResponse.getTckn();
		}
		}
		else {
			if (formUtils.isNullOrEmptyString(verifyOtpWSResponse.getCustno())){
			registrationForm.getTckn();
		else 
			{verifyOtpWSResponse.getCustno();}
		}
		}

