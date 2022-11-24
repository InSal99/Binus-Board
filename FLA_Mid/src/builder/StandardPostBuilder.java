package builder;

import java.util.Scanner;
import factory.ThemeFactory;
import model.Post;
import model.Theme;
import singleton.UserRegister;

public class StandardPostBuilder implements PostBuilder{
	
	private Post standardPost;
	Scanner scan = new Scanner(System.in);
	UserRegister user = new UserRegister();
	Theme themes;

	public StandardPostBuilder() {
		standardPost = new Post();
		standardPost.setTitle(standardPost.getTitle());
		standardPost.setContent(standardPost.getContent());
		standardPost.setTheme(standardPost.getTheme());
		standardPost.setPicture(standardPost.getPicture());
	}

	@Override
	public PostBuilder setTitle() {
		// TODO Auto-generated method stub
		String title;
		do {
			System.out.print("Input title : ");
			title = scan.nextLine();
		} while (title.length() <= 0 || title.length() >= 100);
		standardPost.setTitle(title);
		return this;
	}

	@Override
	public PostBuilder setContent() {
		// TODO Auto-generated method stub
		String content;
		do {
			System.out.print("Input content : ");
			content = scan.nextLine();
		} while (content.length() > 500);
		standardPost.setContent(content);
		return this;
	}

	@Override
	public PostBuilder setTheme() {
		// TODO Auto-generated method stub
		String theme;
		do {
			System.out.print("Choose theme [ Serenity | Party | Heroes ] : ");
			theme = scan.nextLine();
		} while (!theme.equals("Serenity") && !theme.equals("Party") && !theme.equals("Heroes"));
		standardPost.setTheme(theme);
		ThemeFactory factory = new ThemeFactory();
		themes = factory.GetTheme(theme);
		return this;
	}

	@Override
	public PostBuilder setPicture() {
		// TODO Auto-generated method stub
		String picture;
		do {
			System.out.print("Insert picture : ");
			picture = scan.nextLine();
		} while (picture.length() <= 0);
		standardPost.setPicture(picture);
		return this;
	}

	@Override
	public Post build() {
		// TODO Auto-generated method stub
		user.getInstance().getPosts().add(standardPost);
		return standardPost;
	}

	@Override
	public void printTheme() {
		// TODO Auto-generated method stub
		System.out.println(this.themes.getBackground());
		System.out.println("          " + this.themes.getBorder());
		System.out.println("          " + this.themes.getIcon());
		System.out.println("          " + this.themes.getMusic());
	}

}
