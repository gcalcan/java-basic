package gicu;

public class ClasaCuClStatica {

	String baseStr = "string din clasa ClasaCuClStatica";
	
	static class ClasaStatica{
		String nonStaticStr = "string non static din clasa ClasaStatica";
		static String staticStr = "string static din clasa ClasaStatica";
	}
	
	public static class ClasaStaticaPublica{
		String nonStaticStr = "string non static din clasa ClasaStaticaPublica";
		public static String staticStr = "string static din clasa ClasaStaticaPublica";
	}
}

// Illegal modifier for the class AltaClasaStatica; only public, abstract & final are permitted
//static class AltaClasaStatica{}