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
			System.out.println("L�tfen ge�erli bir formatta giri� yap�n�z. Kay�t i�lemi BA�ARISIZ!!!");
		} else if (!userDao.emailCheck(user)) {
			System.out.println(
					"Bu email adresi daha �nce al�nm�� ---> " + user.geteMail() + "\n" + "Kay�t i�lemi BA�ARISIZ!!!");

		} else {
			userDao.add(user);
			validatorService.sendVarificationMail();
		}
	}

	@Override
	public void login(String email, String password) {
		if (userDao.loginByCheck(email, password)) {
			System.out.println("Giri� Ba�ar�l�.");
		} else {
			System.out.println("Kullan�c� ad� yanl�� veya kullan�c� yok. Giri� BA�ARISIZ!!!");
		}

	}
}
