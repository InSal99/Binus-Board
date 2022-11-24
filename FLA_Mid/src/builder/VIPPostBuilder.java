package builder;

import java.util.Scanner;
import factory.ThemeFactory;
import model.Post;
import model.Theme;
import singleton.UserRegister;

public class VIPPostBuilder implements PostBuilder{
	
	private Post vipPost;
	Scanner scan = new Scanner(System.in);
	UserRegister user = new UserRegister();
	Theme themes;

	public VIPPostBuilder() {
		vipPost = new Post();
		vipPost.setTitle(vipPost.getTitle());
		vipPost.setContent(vipPost.getContent());
		vipPost.setTheme(vipPost.getTheme());
		vipPost.setPicture(vipPost.getPicture());
	}

	@Override
	public PostBuilder setTitle() {
		// TODO Auto-generated method stub
		String title;
		do {
			System.out.print("Input title : ");
			title = scan.nextLine();
		} while (title.length() <= 0 || title.length() >= 100);
		vipPost.setTitle(title);
		return this;
	}

	@Override
	public PostBuilder setContent() {
		// TODO Auto-generated method stub
		String content;
		do {
			System.out.print("Input content : ");
			content = scan.nextLine();
		} while (content.length() > 1000);
		vipPost.setContent(content);
		return this;
	}

	@Override
	public PostBuilder setTheme() {
		// TODO Auto-generated method stub
		String theme;
		do {
			System.out.print("Choose theme [ Serenity | Party | Heroes | VIP ] : ");
			theme = scan.nextLine();
		} while (!theme.equals("Serenity") && !theme.equals("Party") && !theme.equals("Heroes") && !theme.equals("VIP"));
		vipPost.setTheme(theme);
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
		vipPost.setPicture(picture);
		return this;
	}

	@Override
	public Post build() {
		// TODO Auto-generated method stub
		user.getInstance().getPosts().add(vipPost);
		return vipPost;
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
