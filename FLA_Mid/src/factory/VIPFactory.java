package factory;

import model.Theme;

public class VIPFactory implements GenerateTheme{
	
	@Override
	public Theme generateTheme() {
		// TODO Auto-generated method stub
		Theme theme = new Theme("warna platinum (#E5E4E2)", 
								"solid, warna putih bersih", 
								"gambar mahkota", 
								"musik klasik");
		return theme;
	}

}
