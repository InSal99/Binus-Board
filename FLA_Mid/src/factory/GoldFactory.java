package factory;

import model.Theme;

public class GoldFactory implements GenerateTheme{

	@Override
	public Theme generateTheme() {
		// TODO Auto-generated method stub
		Theme theme = new Theme("warna emas (#FFD700)", 
								"solid, emas gelap", 
								"gambar koin emas", 
								"musik klasik");
		return theme;
	}

}
