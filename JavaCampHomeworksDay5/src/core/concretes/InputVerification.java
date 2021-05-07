package core.concretes;

import java.util.regex.Pattern;

import core.abstracts.InputVerificationService;
import entities.concretes.User;

public class InputVerification implements InputVerificationService {

	public boolean isValidEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public boolean isValidPassword(String password) {
		if (password == null || password.length() < 6) {
			return false;
		}

		return true;
	}

	public boolean isValidString(String name) {

		if (name == null || name.length() < 2) {
			return false;
		}
		for (char c : name.toCharArray()) {
			if (Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isValid(User user) {
		if (!isValidEmail(user.geteMail())) {
			System.out.println("Yanl�� email format�. L�tfen kontrol edin.");
			return false;

		}

		if (!isValidString(user.getFirstName())) {
			System.out.println("Yanl�� isim format� --> en az 2 karakter girmelisiniz ve say� i�ermemeli!");
			return false;

		}
		if (!isValidString(user.getLastName())) {
			System.out.println("Yanl�� soyad� format� --> en az 2 karakter girmelisiniz ve say� i�ermemeli!");
			return false;

		}
		if (!isValidPassword(user.getPassword())) {
			System.out.println("Yanl�� parola format� --> en az 6 karakter girmelisiniz!");
			return false;

		}
		return true;

	}

}
