package br.com.sispes.conexaoJDBC;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConexaoJDBC {
	private static final String USUARIO = "root";
	private static final String SENHA = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/sispes";
	
	public static Connection fazerConexao()throws SQLException{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection conexao = (Connection) DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;
	}
}
