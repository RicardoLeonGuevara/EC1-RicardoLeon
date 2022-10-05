package com.idat.ev1.service;

import java.util.List;

import com.idat.ev1.modelo.Curso;

public interface CursoService {
	void guardar(Curso curso);
	void actualizar(Curso curso);
	void eliminar(Integer id);
	List<Curso> listar();
	Curso obtener(Integer id);
}
