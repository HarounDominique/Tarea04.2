package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

public class ConnectionFactory {
	
	private static ODB connection = null;
	private static final String RUTA_FICHERO_CONFIG= "src/main/resources/db.properties";
	private static final String FILE_KEY= "db.file";
	
	
	private ConnectionFactory() {
		
	}

	public static ODB getConnection() {
	
		if (connection==null) {
				
			Properties properties = new Properties(); //ikasryyjhdoau
			try(FileInputStream fis = new FileInputStream(RUTA_FICHERO_CONFIG)) {
				
				properties.load(fis);	
				String fichero = properties.getProperty(FILE_KEY);
				
				connection= ODBFactory.open(fichero);
			
			} catch(FileNotFoundException e) {
				
				System.out.println("Excepcion FileNotFound: " +e.getMessage());
			} catch(IOException e) {
				System.out.println("Excepcion IO: " +e.getMessage());
			} catch(Exception e) {
				System.out.println("Excepcion: " +e.getMessage());
			} 

			
		}
		

		return connection;
	}

	
	
	
	
	public static void closeConnection() {
		if (connection != null) { connection.close(); }
		
	}

}
