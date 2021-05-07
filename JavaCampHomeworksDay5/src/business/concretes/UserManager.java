package business.concretes;

import business.abstracts.UserService;
import core.abstracts.InputVerificationService;
import core.abstracts.ValidatorService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	InputVerificationService memberInformationValidation;
	UserDao userDao;
	ValidatorService validatorService;

	public UserManager(InputVerificationService memberInformationValidation, UserDao userDao,
			ValidatorService validatorService) {
		this.memberInformationValidation = memberInformationValidation;
		this.userDao = userDao;
		this.validatorService = validatorService;

	}

	@Override
	public void register(User user) {
		if (!memberInformationValidation.isValid(user)) {
			System.out.println("Lütfen geçerli bir formatta giriþ yapýnýz. Kayýt iþlemi BAÞARISIZ!!!");
		} else if (!userDao.emailCheck(user)) {
			System.out.println(
					"Bu email adresi daha önce alýnmýþ ---> " + user.geteMail() + "\n" + "Kayýt iþlemi BAÞARISIZ!!!");

		} else {
			userDao.add(user);
			validatorService.sendVarificationMail();
		}
	}

	@Override
	public void login(String email, String password) {
		if (userDao.loginByCheck(email, password)) {
			System.out.println("Giriþ Baþarýlý.");
		} else {
			System.out.println("Kullanýcý adý yanlýþ veya kullanýcý yok. Giriþ BAÞARISIZ!!!");
		}

	}
}
