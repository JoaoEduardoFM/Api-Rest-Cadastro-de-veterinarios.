package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import exception.ConexaoException;

public class ConexaoSingleton {
	
	private static Connection conexao;
	
	//nome do usuario do my sql
		private static final String USERNAME = "root";
		
		//senha do banco
		private static final String PASSWORD = "";
		
		//caminho do banco de dados, nome do banco de dados.	
		private static final String DATABASE_URL = "jdbc:mysql://localhost/local_bd?useTimezone=true&serverTimezone=UTC";
	
	private static Connection novaConexao() throws ConexaoException{
		Connection con = null;
		
	try {
		Class.forName("com.mysql.cj.jdbc.driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/local_bd?useTimezone=true&serverTimezone=UTC","root","");
	}catch (SQLException e) {
		throw new ConexaoException("Erro ao conectar-se com o banco de dados!", e);
	}catch(ClassNotFoundException e) {
		throw new ConexaoException("Erro no driver do banco de dados!", e);
		}
	return con;
	}
	
	public static Connection getConexao()throws ConexaoException{
		if(conexao == null)
			conexao = novaConexao();
		return conexao;
	}
	
	public static void finalizarConexao() throws ConexaoException{
		try {
			conexao.close();
		}catch( SQLException e){
			throw new ConexaoException("Erro ao fechar conexao com o banco de dados", e);
		}
		conexao = null;
		
	}

}
