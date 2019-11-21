package com.barbaro.fmmvc.controller;
import com.barbaro.fmmvc.DatabaseUtil;
import com.barbaro.fmmvc.model.*;
import com.barbaro.fmmvc.db.DataBaseManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.barbaro.fmmvc.model.Persona;

 @WebServlet("/personas")

public class Personaservlet extends HttpServlet
{	
	private static final long serialVersionUID = 1L;
	
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Connection conn = null;
		DataBaseManager dbManager = null;	
		List<Persona> personas = null;
		
		RequestDispatcher dispatcher = null;
	
		conn = DatabaseUtil.getConnection(); //si no tienes esto, no tienes nada
		
		dbManager = new DataBaseManager(conn);
		
		personas = dbManager.consultarPersona();
		
		//preparar datos para mandarlo a la vista (MVC)
		req.setAttribute("listPersona", personas);
		
		//indicar la vista a utilizar
		dispatcher = req.getRequestDispatcher("personas.jsp"); //ya hay vista
		
		//cargar vista
		dispatcher.forward(req, resp);
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 	{
		
		Connection conn = null;
		DataBaseManager dbManager = null;
		Persona persona = null;
		
		//obetener datos
			//Identificar  de donde  van a recuperar los datos
			//Nombre de los datos
		String txtNombre = request.getParameter("txtNombre");
		String txtEdad = request.getParameter("txtEdad");
		String txtCarrera = request.getParameter("txtCarrera");
		
		//validar datos(null, empty, range, date)
		
		//modelar datos
		
		persona = new Persona();
		persona.setNombre(txtNombre);
		persona.setEdad(Integer.parseInt(txtEdad));
		persona.setCarrera(txtCarrera);
		
		/**guardar datos**/
		
		//Obtener conexión 
		conn = DatabaseUtil.getConnection();
		
		//Encargado de manipular los datos
		dbManager = new DataBaseManager(conn);
		
		// procesar datos, ejecutar la acción
		dbManager.crearPersona(persona);
		
		//cerrar la conexion
		
		DatabaseUtil.closeConnection(conn);
		
			doGet(request, response);
	}

}
