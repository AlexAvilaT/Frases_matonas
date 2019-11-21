package com.barbaro.fmmvc.model;

import java.util.Date;

import java.sql.Date;

public class Frase
{
	private int IdFrase;
	private String Contenido;
	private int Cantidad;
	private java.sql.Date FechaDesde;
	private Date Fecha;
	
	
	public Frase() 
	{
	}	
	
	public Frase(int idFrase, String contenido, int cantidad, Date fechaDesde, Date fecha) {
		this.IdFrase = idFrase;
		this.Contenido = contenido;
		this.Cantidad = cantidad;
		this.FechaDesde = (java.sql.Date) fechaDesde;
		this.Fecha = fecha;
	
	
	}
	public int getIdFrase() {
		return IdFrase;
	}
	public void setIdFrase(int idFrase) {
		IdFrase = idFrase;
	}
	public String getContenido() {
		return Contenido;
	}
	public void setContenido(String contenido) {
		Contenido = contenido;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public java.sql.Date getFechaDesde() {
		return FechaDesde;
	}
	public void setFechaDesde(java.sql.Date fechaDesde) {
		FechaDesde = fechaDesde;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	
	
	
	
	
	
	
	
	
	
}



