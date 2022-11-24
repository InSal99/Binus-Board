package factory;

import model.Theme;

public class ThemeFactory {

	public Theme GetTheme(String theme) {
		switch(theme) {
		case "Serenity":
			return new SerenityFactory().generateTheme();
		case "Party":
			return new PartyFactory().generateTheme();
		case "Heroes":
			return new HeroesFactory().generateTheme();
		case "Gold":
			return new GoldFactory().generateTheme();
		case "VIP":
			return new VIPFactory().generateTheme();
		default:
			return null;
		}
	}
	
	public void PrintTheme(Theme theme) {
		System.out.println(theme.getBackground());
		System.out.println("          " + theme.getBorder());
		System.out.println("          " + theme.getIcon());
		System.out.println("          " + theme.getMusic());
	}
	
}
