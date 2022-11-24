package factory;

import model.Theme;

public class SerenityFactory implements GenerateTheme{

	@Override
	public Theme generateTheme() {
		// TODO Auto-generated method stub
		Theme theme = new Theme("warna putih perak (#EFEFEF)", 
								"solid, warna putih salju dengan bayangan", 
								"gambar rubah putih", 
								"musik yang tenang");
		return theme;
	}

}
