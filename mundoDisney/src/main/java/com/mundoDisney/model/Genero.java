package com.mundoDisney.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "genero")
public class Genero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idGenero;
	@Column()
	private String nombre;
	@Column()
	private String imagen;
	@Column(name = "id_peliculas_o_series_asociadas")
	private Integer idPeliculaOSerieAsociadas;
	
public Genero() {}

public Integer getIdGenero() {
	return idGenero;
}

public void setIdGenero(Integer idGenero) {
	this.idGenero = idGenero;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getImagen() {
	return imagen;
}

public void setImagen(String imagen) {
	this.imagen = imagen;
}

public Integer getIdPeliculaOSerieAsociadas() {
	return idPeliculaOSerieAsociadas;
}

public void setIdPeliculaOSerieAsociadas(Integer idPeliculaOSerieAsociadas) {
	this.idPeliculaOSerieAsociadas = idPeliculaOSerieAsociadas;
}


}