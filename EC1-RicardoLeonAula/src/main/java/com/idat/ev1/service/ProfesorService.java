package com.idat.ev1.service;

import java.util.List;

import com.idat.ev1.modelo.Profesor;

public interface ProfesorService {
	void guardar(Profesor profesor);
	void actualizar(Profesor profesor);
	void eliminar(Integer id);
	List<Profesor> listar();
	Profesor obtener(Integer id);
}
