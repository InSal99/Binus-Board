package factory;

import model.Theme;

public class PartyFactory implements GenerateTheme{

	@Override
	public Theme generateTheme() {
		// TODO Auto-generated method stub
		Theme theme = new Theme("warna pink menyala (#F9A7B0)", 
								"putus-putus, warna merah maroon", 
								"gambar orang berdansa", 
								"musik yang semangat dan menarik");
		return theme;
	}

}
