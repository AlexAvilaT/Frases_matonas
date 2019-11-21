
package com.barbaro.fmmvc.db;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import com.barbaro.fmmvc.model.Frase;
import com.barbaro.fmmvc.model.Persona;

public class DataBaseManager 
{

	private Connection conn;
	
	public DataBaseManager(Connection conn)
	{
		this.conn = conn;
	}
	
	public void crearPersona(Persona persona)
	{
		String query = "insert into persona(nombre, edad, carrera) "
				+ "values(" + persona.toString() + ")";
		Statement stmnt = null;
		
		try {
			stmnt = conn.createStatement();
			stmnt.executeUpdate(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public void crearFrase(Frase frase)
	{
		String query = "insert into frase(contenido, cantidad, fechaDesde)"
				+ "values(?, ?, ?)";
		PreparedStatement stmnt = null;
		
		try {
			stmnt = conn.prepareStatement(query);
			stmnt.setString(1, frase.getContenido());
			stmnt.setInt(2, frase.getCantidad());
			stmnt.setDate(3, (Date) frase.getFechaDesde());//convertir date util a sql 
			
			stmnt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void asignarFrasePersona(int idPersona, int idFrase )
	{
		
	}
	public List<Persona> consultarPersona()
	{
		String query = "select * from persona";
		Statement stmnt = null;
		ResultSet rs = null;
		List<Persona>listPersonas = null;
		
		try {
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(query);
			listPersonas = new ArrayList<>();
			while(rs.next())
			{
				//Crear el modelo
				Persona persona = new Persona();
				
				//Agregar valores al modelo
				persona.setIdPersona(rs.getInt("idPersona"));
				persona.setNombre(rs.getString("nombre"));
				persona.setEdad(rs.getByte("edad"));
				persona.setCarrera(rs.getString("carrera"));
				persona.setFecha(rs.getDate("fecha"));
				
				//agregar modelo a la vista
				listPersonas.add(persona);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listPersonas;
		
	}
	public List<Frase> consultarFrases()
	{
		return null;
	}
	public List<Frase> consultarFrasePersona(int idPersona)
	{
		return null;
	}
}
