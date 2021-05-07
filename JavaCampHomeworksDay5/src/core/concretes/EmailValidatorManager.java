package core.concretes;


import core.abstracts.ValidatorService;


public class EmailValidatorManager implements ValidatorService {

	@Override
	public void sendVarificationMail() {
		System.out.println("Doðrulama maili gönderildi. Doðrulama için mailinizi kontrol ediniz.");
	}

	

}
