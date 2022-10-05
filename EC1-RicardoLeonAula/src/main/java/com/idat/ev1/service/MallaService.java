package com.idat.ev1.service;

import java.util.List;

import com.idat.ev1.modelo.MallaCurricular;

public interface MallaService {
	void guardar(MallaCurricular mallaCurricular);
	void actualizar(MallaCurricular mallaCurricular);
	void eliminar(Integer id);
	List<MallaCurricular> listar();
	MallaCurricular obtener(Integer id);
}
