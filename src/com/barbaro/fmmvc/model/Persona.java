package com.barbaro.fmmvc.model;
import java.time.LocalDateTime;
import java.util.Date;


	public class Persona
	{
		private int idPersona;
		private String nombre;
		private int edad;
		private String carrera;
		private Date fecha;
	
	
	
	public Persona() 
		{
			
		}
	
	public Persona(int idPersona, String nombre, byte edad, String carrera, Date fecha) {
		
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.edad = edad;
		this.carrera = carrera;
		this.fecha = fecha;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int i) {
		this.edad = i;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString()
	{
		return String.format("'%s', %s, '%s'", nombre, edad, carrera);
	}
}

	