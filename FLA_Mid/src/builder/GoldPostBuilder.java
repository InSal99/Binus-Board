package builder;

import java.util.Scanner;
import factory.ThemeFactory;
import model.Post;
import model.Theme;
import singleton.UserRegister;

public class GoldPostBuilder implements PostBuilder{
	
	private Post goldPost;
	Scanner scan = new Scanner(System.in);
	UserRegister user = new UserRegister();
	Theme themes;

	public GoldPostBuilder() {
		goldPost = new Post();
		goldPost.setTitle(goldPost.getTitle());
		goldPost.setContent(goldPost.getContent());
		goldPost.setTheme(goldPost.getTheme());
		goldPost.setPicture(goldPost.getPicture());
	}

	@Override
	public PostBuilder setTitle() {
		// TODO Auto-generated method stub
		String title;
		do {
			System.out.print("Input title : ");
			title = scan.nextLine();
		} while (title.length() <= 0 || title.length() >= 100);
		goldPost.setTitle(title);
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
		goldPost.setContent(content);
		return this;
	}

	@Override
	public PostBuilder setTheme() {
		// TODO Auto-generated method stub
		String theme;
		do {
			System.out.print("Choose theme [ Serenity | Party | Heroes | Gold ] : ");
			theme = scan.nextLine();
		} while (!theme.equals("Serenity") && !theme.equals("Party") && !theme.equals("Heroes") && !theme.equals("Gold"));
		goldPost.setTheme(theme);
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
		goldPost.setPicture(picture);
		return this;
	}

	@Override
	public Post build() {
		// TODO Auto-generated method stub
		user.getInstance().getPosts().add(goldPost);
		return goldPost;
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
