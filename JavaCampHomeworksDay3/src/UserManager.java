
public class UserManager {
	
	public void editProfile(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Profiliniz Ba�ar�yla D�zenlendi. ");	}
	
	public void logIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Giris Ba�ar�l�.");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Oturumunuz Sonland�r�ld�.");
	}

}
