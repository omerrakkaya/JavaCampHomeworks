package core.concretes;


import core.abstracts.ValidatorService;


public class EmailValidatorManager implements ValidatorService {

	@Override
	public void sendVarificationMail() {
		System.out.println("Do�rulama maili g�nderildi. Do�rulama i�in mailinizi kontrol ediniz.");
	}

	

}
