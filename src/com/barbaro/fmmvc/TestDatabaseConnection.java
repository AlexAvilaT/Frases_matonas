package com.barbaro.fmmvc;
import org.junit.Test;
import java.sql.Connection;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
public class TestDatabaseConnection
{
	@Test
	public void testConnection()
	{
		Connection connection = DatabaseUtil.getConnection();
		assertNotNull("No se realizo la conexi�n", connection);
		try
		{
			connection.close();
			assertTrue("No se cerro la conexi�n", connection.isClosed());
		}
		catch(Exception e)
		{
			
		}

	}
}
