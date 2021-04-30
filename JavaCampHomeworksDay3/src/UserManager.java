
public class UserManager {
	
	public void editProfile(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Profiliniz Baþarýyla Düzenlendi. ");	}
	
	public void logIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Giris Baþarýlý.");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Oturumunuz Sonlandýrýldý.");
	}

}
