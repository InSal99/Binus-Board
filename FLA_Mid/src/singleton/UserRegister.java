package singleton;
import java.util.Vector;
import model.User;

public class UserRegister {
	
	public static User userRegister;
	public static Vector<User> userRegistered = new Vector();
	
	public static User getInstance() {
		if (userRegister == null) {
			userRegister = new User();
		}
		return userRegister;
	}

	public static Vector<User> Register(String username, String password, String type) {
		userRegister.setUsername(username);
		userRegister.setPassword(password);
		userRegister.setType(type);
		userRegistered.add(userRegister);
		System.out.println("Register is successful!");
		System.out.println();
		return userRegistered;
	}

}
