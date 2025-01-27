package com.example.ibmprojectpablomelzi.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name="proveedores")
public class ProveedorModel {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private long idProveedor;

private String nombre;

private LocalDate fechaAlta;

private Integer idCliente;

public long getIdProveedor() {
	return idProveedor;
}

public void setIdProveedor(long idProveedor) {
	this.idProveedor = idProveedor;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public LocalDate getFechaAlta() {
	return fechaAlta;
}

public void setFechaAlta(LocalDate fechaAlta) {
	this.fechaAlta = fechaAlta;
}

public Integer getIdCliente() {
	return idCliente;
}

public void setIdCliente(Integer idCliente) {
	this.idCliente = idCliente;
}


}
