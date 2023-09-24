package com.latam.alura.tienda.dao;

import javax.persistence.EntityManager;

import com.latam.alura.tienda.modelo.Pedido;
import com.latam.alura.tienda.prueba.LoadRecords;
import com.latam.alura.tienda.utils.JPAUtils;

public class PruebaDeDesempeño {
public static void main(String[] args) {
	try {
		LoadRecords.cargarRegistros();
	} catch (Exception e) {
		throw new RuntimeException("excepcion");
	}
	
	EntityManager em = JPAUtils.getEntityManager();
	Pedido pedido = em.find(Pedido.class, 31);
	System.out.println(pedido.getFecha());
	}
}
