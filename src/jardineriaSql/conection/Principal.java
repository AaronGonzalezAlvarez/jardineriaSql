package jardineriaSql.conection;

public class Principal {
	public static void main(String[] args) {
		Conection c = new Conection();
		
		System.out.println("1- Consultas sobre una tabla.");
		System.out.println("Ejercicio 11.");
		c.ejercicio11();
		System.out.println("");
		System.out.println("Ejercicio 12.");
		c.ejercicio12();
		System.out.println("");
		
		System.out.println("6- Consultas variadas");
		/*1.	Devuelve el listado de clientes indicando el nombre del cliente y
		 *  cuántos pedidos ha realizado. Tenga en cuenta que pueden
		 *   existir clientes que no han realizado ningún pedido.*/
		
		/*SELECT cli.codigo_cliente, cli.nombre_cliente,count(ped.codigo_cliente) AS "numero pedido"
			FROM cliente cli
			LEFT JOIN pedido ped ON cli.codigo_cliente = ped.codigo_cliente
			GROUP BY cli.codigo_cliente;*/
	}

}
