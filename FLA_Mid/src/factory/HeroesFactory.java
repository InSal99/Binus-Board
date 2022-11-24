package factory;

import model.Theme;

public class HeroesFactory implements GenerateTheme{
	
	@Override
	public Theme generateTheme() {
		// TODO Auto-generated method stub
		Theme theme = new Theme("warna biru metalik (#376282)", 
								"solid, warna abu-abu gelap metalik", 
								"gambar superhero", 
								"musik orkestra yang tegang dan bersemangat");
		return theme;
	}

}
