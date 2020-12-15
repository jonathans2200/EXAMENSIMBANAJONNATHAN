package examen.simbana.jonnathan.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import examen.simbana.jonnathan.modelo.Autor;


@Stateless
public class AutorDao {
 private EntityManager em;
	public void insert(Autor autor) {
		em.persist(autor);
	}
		

	public  List<Autor> listar(){
		String sql= "select * from autor";
		Query q = em.createQuery(sql,Autor.class);
		return q.getResultList();
	}
}
