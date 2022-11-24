package builder;

import model.Post;

public interface PostBuilder {
	
	public PostBuilder setTitle();
	public PostBuilder setContent();
	public PostBuilder setTheme();
	public PostBuilder setPicture();
	
	public Post build();
	public void printTheme();

}
