package br.com.qintess;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ExemploConexao {

	public static void main(String[] args) throws SQLException {
		
		
		/*
		 * Connection conn =
		 * DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres",
		 * "postgres", null );
		 */
		
		System.out.println("Conectado !");
		//conn.close();

	}

}
