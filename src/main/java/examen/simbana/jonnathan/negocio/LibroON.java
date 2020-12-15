package examen.simbana.jonnathan.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import examen.simbana.jonnathan.dao.AutorDao;
import examen.simbana.jonnathan.dao.LibroDao;
import examen.simbana.jonnathan.modelo.Autor;
import examen.simbana.jonnathan.modelo.Libro;

@Stateless
public class LibroON {

	@Inject
	private LibroDao daoLibro;
	@Inject
	private AutorDao daoAutor;
	
	public void guardarLibro(Libro libro) {
		daoLibro.insert(libro);
	}

public Libro buscarLibro(int codigoLibro) {
 Libro l=daoLibro.buscarLibro(codigoLibro);
return l;
}

public  List<Libro> listadoLibros(){
	return daoLibro.listar();
}

public List<Autor>listadoAutores(){
	return daoAutor.listar();
}
}
