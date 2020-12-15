package examen.simbana.jonnathan.vista;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import examen.simbana.jonnathan.modelo.Autor;
import examen.simbana.jonnathan.modelo.Libro;
import examen.simbana.jonnathan.negocio.LibroON;

@Named
@ViewScoped
public class LibroBean implements Serializable{
	
	@Inject
	private LibroON onLibros;
	private Libro newLibro;
	private List<Autor> listaAutor;
	private List<Libro> listado;
	private String codLibro;

public LibroBean() {
	init();
}

public void init() {
	newLibro =new Libro();
	loadLibros();
	
}



public String guardarLibro() {
	System.out.println(this.toString());
	onLibros.guardarLibro(newLibro);
	return null;
}


/*public String cargarLibro(int idLibro) {
	System.out.println(idLibro);
	listado= onLibros.listadoLibros(idLibro);
	return null;
}*/
public Libro doBuscarLibro(Libro libro) {
	Libro a=onLibros.buscarLibro(Integer.parseInt(codLibro));
	return a;
}

public LibroON getOnLibros() {
	return onLibros;
}

public void setOnLibros(LibroON onLibros) {
	this.onLibros = onLibros;
}

public Libro getNewLibro() {
	return newLibro;
}

public void setNewLibro(Libro newLibro) {
	this.newLibro = newLibro;
}

public List<Autor> getListaAutor() {
	return listaAutor;
}

public void setListaAutor(List<Autor> listaAutor) {
	this.listaAutor = listaAutor;
}

public void loadLibros() {
	listado=onLibros.listadoLibros();
}

public List<Libro> getListado() {
	return listado;
}

public void setListado(List<Libro> listado) {
	this.listado = listado;
}

public String getCodLibro() {
	return codLibro;
}

public void setCodLibro(String codLibro) {
	this.codLibro = codLibro;
}


}
