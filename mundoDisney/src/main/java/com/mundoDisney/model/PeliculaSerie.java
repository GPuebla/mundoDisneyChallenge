package com.mundoDisney.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "pelicula_o_serie")
public class PeliculaSerie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPeliculaOSerie;
	@Column()
	private String titulo;
	@Column(name = "fecha_de_creacion")
	private Date fechaCreacion;
	@Column()
	private int calificaion;
	@Column()
	private int idPersonajesRelacionados;
	@Column()
	private int historia;
	
public PeliculaSerie() {}

public Integer getIdPeliculaOSerie() {
	return idPeliculaOSerie;
}

public void setIdPeliculaOSerie(Integer idPeliculaOSerie) {
	this.idPeliculaOSerie = idPeliculaOSerie;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public Date getFechaCreacion() {
	return fechaCreacion;
}

public void setFechaCreacion(Date fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
}

public int getCalificaion() {
	return calificaion;
}

public void setCalificaion(int calificaion) {
	this.calificaion = calificaion;
}

public int getIdPersonajesRelacionados() {
	return idPersonajesRelacionados;
}

public void setIdPersonajesRelacionados(int idPersonajesRelacionados) {
	this.idPersonajesRelacionados = idPersonajesRelacionados;
}

public int getHistoria() {
	return historia;
}

public void setHistoria(int historia) {
	this.historia = historia;
}




}
