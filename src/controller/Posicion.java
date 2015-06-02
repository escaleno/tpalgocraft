package controller;

import model.CampoBatalla;

import common.Mensajes;

import exceptions.FueraDeRangoException;

public class Posicion {
	int posX;
	int posY;
	
	public Posicion(int posX, int posY) throws FueraDeRangoException{
		
		if( posX>CampoBatalla.getInstancia().getAncho()||posY>CampoBatalla.getInstancia().getAlto()||posX<0||posY<0)
			throw new FueraDeRangoException(Mensajes.MSJ_ERROR_FUERA_DE_RANGO);
	
		this.posX=posX;
		this.posY=posY;

	}
	
}
