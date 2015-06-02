package model;

import java.util.List;

public class CampoBatalla {
	
	private int ancho;
	private int alto;
	private List<Elemento> elementos;
	
	
	private static CampoBatalla INSTANCIA = null;

	private CampoBatalla(){
		setAncho(10);
		setAlto(10);
		
	};
	
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

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	

}
