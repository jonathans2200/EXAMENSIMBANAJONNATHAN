package examen.simbana.jonnathan.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_libro")
	private int idLibro;
	private String codigo;
	private String titulo;
	private Autor autor;
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	private String anoEdicion;

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnoEdicion() {
		return anoEdicion;
	}

	public void setAnoEdicion(String anoEdicion) {
		this.anoEdicion = anoEdicion;
	}

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", codigo=" + codigo + ", titulo=" + titulo + ", anoEdicion=" + anoEdicion
				+ "]";
	}
	
}
