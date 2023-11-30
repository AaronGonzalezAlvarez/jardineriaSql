package jardineriaSql.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class Conection {
	
	private String nameDatabase = "jardineria";
	private String user = "root";
	private String pass = "usuario";
	
	
	public void ejercicio11() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nameDatabase, user, pass);
			String inicio = "2009-01-01";
			String fin = "2009-12-31";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(
					"SELECT codigo_pedido, fecha_pedido, comentarios from pedido where fecha_pedido BETWEEN '"+inicio+"' AND '"+fin+"' AND estado='Rechazado';");
			int code;
			String comentario;
			Date fechaPedido;
			while (resultSet.next()) {
				code = resultSet.getInt("codigo_pedido");
				comentario= resultSet.getString("comentarios");
				fechaPedido = resultSet.getDate("fecha_pedido");
				System.out.println("Codigo pedido : " + code + " Fecha pedido: "+fechaPedido );
				System.out.println("\tcomentario:" +comentario);
				System.out.println("-----------------------" );
			}
			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}	
	
	public void ejercicio12() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nameDatabase, user, pass);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(
					"SELECT codigo_pedido, fecha_pedido, comentarios from pedido where fecha_pedido LIKE \"%-01-%\"  AND estado=\"Entregado\";");
			int code;
			String comentario;
			Date fechaPedido;
			while (resultSet.next()) {
				code = resultSet.getInt("codigo_pedido");
				comentario= resultSet.getString("comentarios");
				fechaPedido = resultSet.getDate("fecha_pedido");
				System.out.println("Codigo pedido : " + code + " Fecha pedido: "+fechaPedido );
				System.out.println("\tcomentario:" +comentario);
				System.out.println("-----------------------" );
			}
			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}
