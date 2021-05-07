import business.abstracts.UserService;
import business.concretes.UserManager;
import core.concretes.EmailValidatorManager;
import core.concretes.InputVerification;
import dataAccess.concretes.InMemoryUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		 
		        User user1 = new User(1,"ömer","akkaya","omerrakkaya@gmail.com","123456");
		        User user2 = new User(2,"3ngin","Demiroð","engindemirog@gmail.com","123456");
		        User user3 = new User(3,"Arel","Akkaya","arel@akkaya,com","1234");


		        UserService userService = new UserManager(new InputVerification(), new InMemoryUserDao(), new EmailValidatorManager());
		        userService.register(user1);

		        System.out.println("----------------------------------");

		        userService.register(user1);

		        System.out.println("----------------------------------");

		        userService.register(user2);

		        System.out.println("----------------------------------");

		        userService.register(user3);

		        System.out.println("----------------------------------");



		        UserService userService2 = new UserManager(new InputVerification(), new InMemoryUserDao(), new EmailValidatorManager());
		        userService2.register(user3);



		        System.out.println("----------------------------------");

		        userService.login("omerrakkaya@gmail.com", "123456");

		        System.out.println("----------------------------------");

		        userService.login ("engindemiroð@gmail.com", "56565655225215448"); 


	}

}
