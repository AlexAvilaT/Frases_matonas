package com.barbaro.fmmvc.model;
import java.time.LocalDateTime;
import java.util.Date;

public class PersonaFrase 
{
	private int IdPersonaFrase;
	private int Id_Persona;
	private int Id_Frase;
	private Date Fecha;
	
	
	public PersonaFrase() 
	{
	}
	public PersonaFrase(int idPersonaFrase, int id_Persona, int id_Frase, Date fecha)
	{
		this.IdPersonaFrase = idPersonaFrase;
		this.Id_Persona = id_Persona;
		this.Id_Frase = id_Frase;
		this.Fecha = fecha;
	}
	 
	
	public int getIdPersonaFrase() {
		return IdPersonaFrase;
	}
	public void setIdPersonaFrase(int idPersonaFrase) {
		IdPersonaFrase = idPersonaFrase;
	}
	public int getId_Persona() {
		return Id_Persona;
	}
	public void setId_Persona(int id_Persona) {
		Id_Persona = id_Persona;
	}
	public int getId_Frase() {
		return Id_Frase;
	}
	public void setId_Frase(int id_Frase) {
		Id_Frase = id_Frase;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	
	
}
