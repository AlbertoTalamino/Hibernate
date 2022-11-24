package com.app.conexionHibernate;

import javax.persistence.*;

@Entity
@Table(name="empleados")
public class Empleados {

	//Propiedades
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="nombre")
	String nombre;
	
	@Column(name="apellidos")
	String apellidos;
	
	@Column(name="tlf")
	String tlf;
	
	
	//Constructores
	public Empleados() {
		super();
	}
	
	public Empleados(String nombre, String apellidos, String tlf) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tlf = tlf;
	}


	//GETTER AND SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Empleados [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", tlf=" + tlf + "]";
	}
	
}
