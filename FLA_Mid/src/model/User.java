package model;

import java.util.Vector;

import builder.StandardPostBuilder;

public class User {
	
	private String username;
	private String password;
	private String type;
	private Vector<Post> posts = new Vector<>();
	
	public User() {
		
	}

	public User(String username, String password, String type, Vector<Post> posts) {
		super();
		this.username = username;
		this.password = password;
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Vector<Post> getPosts() {
		return posts;
	}

	public void setPosts(Vector<Post> posts) {
		this.posts = posts;
	}

}
