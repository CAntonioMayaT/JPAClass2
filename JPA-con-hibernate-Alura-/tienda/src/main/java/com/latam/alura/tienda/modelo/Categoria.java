package com.latam.alura.tienda.modelo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {
	
	@EmbeddedId
	private CategoriaID categoriaid;
	
	public Categoria() {}

	public Categoria(String contraseña) {
		this.categoriaid = new CategoriaID(contraseña, "456");
	}
	
	public String getNombre() {
		return categoriaid.getNombre();
	}
	public void setNombre(String nombre) {
		this.categoriaid.setNombre(nombre);;
	}

}
