package Facade;

import builder.GoldPostBuilder;
import builder.StandardPostBuilder;
import builder.VIPPostBuilder;
import model.Post;

public class CreatePost {

	public CreatePost(String type) {
		// TODO Auto-generated constructor stub
		switch (type){
		case "Standard":
			StandardPostBuilder standardPostBuilder = new StandardPostBuilder();
			Post standardPost = standardPostBuilder
					.setTitle()
					.setContent()
					.setTheme()
					.setPicture()
					.build();
			break;
		case "Gold":
			GoldPostBuilder goldPostBuilder = new GoldPostBuilder();
			Post goldPost = goldPostBuilder
					.setTitle()
					.setContent()
					.setTheme()
					.setPicture()
					.build();
			break;
		case "VIP":
			VIPPostBuilder vipPostBuilder = new VIPPostBuilder();
			Post vipPost = vipPostBuilder
					.setTitle()
					.setContent()
					.setTheme()
					.setPicture()
					.build();
			break;
		default:
			type = null;
			break;
		}
	}
}

