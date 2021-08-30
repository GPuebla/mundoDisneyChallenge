package com.mundoDisney.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "personaje")
public class Personaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column()
	private String nombre;
	@Column()
	private String imagen;
	@Column()
	private Integer edad;
	@Column()
	private double peso;
	@Column()
	private String historia;
	@Column(name = "id_peliculas_o_series_asociadas")
	private Integer idPeliculaOSerieAsociadas;
	
	public Personaje() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public Integer getIdPeliculaOSerieAsociadas() {
		return idPeliculaOSerieAsociadas;
	}

	public void setIdPeliculaOSerieAsociadas(Integer idPeliculaOSerieAsociadas) {
		this.idPeliculaOSerieAsociadas = idPeliculaOSerieAsociadas;
	}
	
	
	
	
}
