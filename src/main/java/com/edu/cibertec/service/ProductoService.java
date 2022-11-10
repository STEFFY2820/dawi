package com.edu.cibertec.service;

import java.util.List;

import com.edu.cibertec.modelo.Producto;

public interface ProductoService {

	//Matricular la cabecera de lo metodos que se van a utilizar
	List<Producto> obtenerTodos();
	 
	void guardar (Producto o);
	 
	Producto getProductoById(int id);
	 
	void eliminarProductoById(int id);
}
