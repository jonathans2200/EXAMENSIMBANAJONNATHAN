package examen.simbana.jonnathan.vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

import examen.simbana.jonnathan.modelo.Autor;
import examen.simbana.jonnathan.modelo.Libro;
import examen.simbana.jonnathan.negocio.LibroON;

@ManagedBean
@ViewScoped
public class LibroBean {
	@Inject
	private LibroON onLibros;
	
	private Libro newLibro;
	
	private List<Autor> listaAutor;
	
	private List<Libro> listaLibro;
	
	private String codLibro;

public LibroBean() {
	init();
}

public void init() {
	newLibro =new Libro();
	
}

public List<Autor> doListarAutor(){
return onLibros.listadoAutores();	
}


public Libro doBuscarLibro(int idLibro) {
return onLibros.buscarLibro(idLibro);
}

}
