package Unidad;

import model.Elemento;

public abstract class Unidad implements Elemento {
	
	private int transporte;
	private int vision;
	private int costo;
	private int tiempo;
	private int da�o;
	private int suministro;
	private int rangoAtaque;
	private int vida;
	
	public int getTransporte() {
		return transporte;
	}
	public void setTransporte(int transporte) {
		this.transporte = transporte;
	}
	public int getVision() {
		return vision;
	}
	public void setVision(int vision) {
		this.vision = vision;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	public int getDa�o() {
		return da�o;
	}
	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}
	public int getSuministro() {
		return suministro;
	}
	public void setSuministro(int suministro) {
		this.suministro = suministro;
	}
	public int getRangoAtaque() {
		return rangoAtaque;
	}
	public void setRangoAtaque(int rangoAtaque) {
		this.rangoAtaque = rangoAtaque;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}

}
