package com.latam.alura.tienda.prueba;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.dao.CategoriaDao;
import com.latam.alura.tienda.dao.ClienteDao;
import com.latam.alura.tienda.dao.PedidoDao;
import com.latam.alura.tienda.dao.ProductoDao;
import com.latam.alura.tienda.modelo.Categoria;
import com.latam.alura.tienda.modelo.Cliente;
import com.latam.alura.tienda.modelo.ItemsPedido;
import com.latam.alura.tienda.modelo.Pedido;
import com.latam.alura.tienda.modelo.Producto;
import com.latam.alura.tienda.utils.JPAUtils;

public class RegistroDePedido {

	public static void main(String[] args) {
		registrarProducto();
		
		EntityManager em = JPAUtils.getEntityManager();
		
	
		
	
	
		
		
	}

	private static void registrarProducto() {
		Categoria celulares = new Categoria("CELULARES");

		Producto celular = new Producto("Xiaomi Redmi", "Muy bueno", new BigDecimal("800"), celulares);
		
		Cliente cliente = new Cliente("Juan", "k5sd78Tx7b");
	
		

	    EntityManager em = JPAUtils.getEntityManager();
	    ProductoDao productoDao = new ProductoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);
        ProductoDao productodoao = new ProductoDao(em);
		PedidoDao pedidodao = new PedidoDao(em);
		ClienteDao clientedao = new ClienteDao(em);
		
		
	
        
	    em.getTransaction().begin();
	    	    
	    Pedido pedido = new Pedido(cliente);
		Producto producto = productodoao.consultaPorId(1l);
		pedido.agregarItems(new ItemsPedido(5, producto, pedido));
	    
	    categoriaDao.guardar(celulares);
	    productoDao.guardar(celular);	
		clientedao.guardar(cliente);
		pedidodao.guardar(pedido);
	    
	    em.getTransaction().commit();
	    em.close();
	}

}








