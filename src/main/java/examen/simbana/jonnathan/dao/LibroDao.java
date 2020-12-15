package examen.simbana.jonnathan.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import examen.simbana.jonnathan.modelo.Autor;
import examen.simbana.jonnathan.modelo.Libro;

@Stateless
public class LibroDao {
private EntityManager em;

public void insert(Libro libro) {
	em.persist(libro);
}
	

public  List<Libro> listar(){
	String sql= "Select * from libro";
	Query q = em.createQuery(sql,Libro.class);
	return q.getResultList();
}

public Libro buscarLibro(int codigo) {
	return em.find(Libro.class, codigo);
}
}
