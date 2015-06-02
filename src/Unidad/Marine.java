package Unidad;

public class Marine extends Unidad {

	
	public Marine() {
		
		setTransporte(1);
		setVision(7);
		setCosto(50); //TODO modificar
		setTiempo(3);
		setDaño(6);
		setSuministro(1);
		setRangoAtaque(4);
		setVida(40);
	}
	@Override
	public void mover(int poisicionX, int posicionY) {
		// TODO Auto-generated method stub

	}

	@Override
	public void posicionar(int posicionX, int posicionY) {
		// TODO Auto-generated method stub

	}

}
