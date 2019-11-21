package com.test;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;
import java.sql.Connection;
import java.util.List;

import com.barbaro.fmmvc.DatabaseUtil;
import com.barbaro.fmmvc.db.DataBaseManager;
import com.barbaro.fmmvc.model.Persona
;
public class TestReadPersona
{

	@Test
	public void test() 
	{
		Connection conn = DatabaseUtil.getConnection();
		assertNotNull("La conexión es nula", conn);
		DataBaseManager dbManager = new DataBaseManager(conn);
		List<Persona> list = dbManager.consultarPersona();
		assertNotNull("No se consultaron los datos", list);
		assertNotNull("No hay datos", list.size()>0);

		DatabaseUtil.closeConnection(conn);
		
		try
		{
		assertTrue("No se cerro la conexion", conn.isClosed());
		
		}
			catch (Exception e)
			{
			e.printStackTrace();
			}
	}

}
