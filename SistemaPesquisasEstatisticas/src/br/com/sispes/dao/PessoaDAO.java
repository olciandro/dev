package br.com.sispes.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.sispes.conexaoJDBC.ConexaoJDBC;
import br.com.sispes.model.Pessoa;

import com.mysql.jdbc.Connection;

public class PessoaDAO {
	
	public void salvar(Pessoa p) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO pessoa ");
		sql.append("(sexo) ");
		sql.append("VALUES (?)");
		
		Connection conexao = ConexaoJDBC.fazerConexao();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setObject(1, p.getSexo());
		comando.executeUpdate();
		comando.close();
		
	}

}
