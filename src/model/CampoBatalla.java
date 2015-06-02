package model;

public class CampoBatalla {
	
	private static CampoBatalla INSTANCIA = null;

	private CampoBatalla(){};
	
	public static CampoBatalla getInstancia() {
		
		if (INSTANCIA == null) {
			crearInstancia();
		}
		return INSTANCIA;
	}
	
	private synchronized static void crearInstancia() {
		if (INSTANCIA == null) { 
	       INSTANCIA = new CampoBatalla();
	    }
	}

}
