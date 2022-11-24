package model;

public class Theme {
	
	private String background;
	private String border;
	private String icon;
	private String music;
	
	public Theme(String background, String border, String icon, String music) {
		super();
		this.background = background;
		this.border = border;
		this.icon = icon;
		this.music = music;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}
	
	public void PrintTheme() {
		System.out.println(this.getBackground());
		System.out.println("          " + this.getBorder());
		System.out.println("          " + this.getIcon());
		System.out.println("          " + this.getMusic());
	}


}
