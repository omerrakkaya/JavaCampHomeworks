
public class UserManager {
	
	public void editProfile(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Profiliniz Başarıyla Düzenlendi. ");	}
	
	public void logIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Giris Başarılı.");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Oturumunuz Sonlandırıldı.");
	}

}
