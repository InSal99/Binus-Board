package main;

import java.util.Scanner;
import java.util.Vector;
import Facade.CreatePost;
import model.User;
import singleton.GeneratePosts;
import singleton.UserRegister;

public class Main {
	
	Scanner scan = new Scanner(System.in);

	public Main() {
		// TODO Auto-generated constructor stub
		PrintTitle();
		EnterBoard();
	}
	
	public void PrintTitle() {
		System.out.println("  _______________");
		System.out.println("||  Binus Board  ||");
		System.out.println("||_______________||");
		System.out.println();
		
		System.out.println("Welcome to BinusBoard! Please register to access all the posts");
	}
	
	public String getUsername() {
		String inUname;
		do {
			System.out.print("Set username (No space) : ");
			inUname = scan.nextLine();
		} while (inUname.contains(" ") || inUname.length() <= 0);
		return inUname;
	}
	
	public String getPassword() {
		String inPass;
		do {
			System.out.print("Set password (min. 5 char) : ");
			inPass = scan.nextLine();
		} while (inPass.length() < 5);
		return inPass;
	}
	
	public String getType() {
		String inType;
		do {
			System.out.print("Input user type [ Standard | Gold | VIP ] (Case sensitive): ");
			inType = scan.nextLine();
			
			switch (inType){
			case "Standard":
				inType = "Standard";
				break;
			case "Gold":
				inType = "Gold";
				break;
			case "VIP":
				inType = "VIP";
				break;
			default:
				inType = null;
				break;
			}
		} while (inType == null);
		return inType;
	}
	
	public Vector<User> RegisterUser (String username, String password, String type) {
		UserRegister userLogin = new UserRegister();
		userLogin.getInstance();
		Vector<User> registered = userLogin.Register(username, password, type);
		return registered;
	}
	
	
	public void PerformActivity(User userLogggedIn, String type) {
		int inActivity;
		do {
			GeneratePosts postsBuilder = new GeneratePosts();
			postsBuilder.BuildPosts(userLogggedIn);
			
			System.out.println();
			System.out.println("1. Input new post");
			System.out.println("2. Login as another user");
			System.out.println("3. Exit program");
			System.out.print(">> ");
			inActivity = scan.nextInt();
			System.out.println();
			
			switch(inActivity) {
			case 1:
				CreatePost createPost = new CreatePost(type);
				break;
			case 2:
				userLogggedIn = null;
				EnterBoard();
				break;
			case 3:
				System.out.println("Goodbye!");
				UserRegister.userRegistered.clear();
				return;
			default:
				break;
			}
			inActivity = 0;
			
			
		} while (inActivity == 0);
	}
	
	public void EnterBoard() {
		String username = getUsername();
		String password = getPassword();
		String type = getType();
		Vector<User> registered = RegisterUser(username, password, type);
		
		User userLoggedIn = null;
		do {
			System.out.println();
			System.out.println("Please login to your account!");
			username = getUsername();
			password = getPassword();
			for (User user : registered) {
				 if (user.getUsername().equals(username)) {
					 if (user.getPassword().equals(password)) {
						 userLoggedIn = user;
						 System.out.println("Hi " + username + ", happy posting!");
					 } else {
						 System.out.println("Password is incorrect!");
					 }
				 } else {
					 System.out.println("Account is not found!");
				 }
			}
			
			
		} while (userLoggedIn == null);
		
		PerformActivity(userLoggedIn, type);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
