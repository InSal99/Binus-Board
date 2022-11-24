package singleton;

import factory.ThemeFactory;
import model.Post;
import model.User;

public class GeneratePosts {
	
	public static User userLogin;
	public static Post userPost;
	public static ThemeFactory userTheme = new ThemeFactory();

	public  void BuildPosts(User userLogin) {
		// TODO Auto-generated constructor stub
		try {
			if (userLogin.getPosts().isEmpty()) {
				System.out.println("There Is Currently No Post.");
			} else {
				System.out.println();
				for (int i = 0 ; i < userLogin.getPosts().size() ; i++) {
					System.out.println("Post " + (i + 1));
					System.out.println("===================================================================");
					System.out.println("Title   : " + userLogin.getPosts().get(i).getTitle());
					System.out.println("Content : " + userLogin.getPosts().get(i).getContent());
					System.out.print("Theme   : ");
					userTheme.PrintTheme(userTheme.GetTheme(userLogin.getPosts().get(i).getTheme()));
					System.out.println("Picture : " + userLogin.getPosts().get(i).getPicture());
					System.out.println("===================================================================");
					System.out.println();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
