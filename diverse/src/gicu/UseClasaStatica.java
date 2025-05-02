package gicu;

import gicu.ClasaCuClStatica.ClasaStatica;

public class UseClasaStatica {
	
	public static void main(String[] args) {
		var str = ClasaStatica.staticStr;
		System.out.println(str);
		
		var staticClassInst = new ClasaStatica();
		
		str = staticClassInst.nonStaticStr;
		System.out.println(str);
		
//		worning: The static field ClasaCuClStatica.ClasaStatica.staticStr should be accessed in a static way
		str = staticClassInst.staticStr;
		System.out.println(str);
	}
}
