package com.example.ibmprojectpablomelzi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ibmprojectpablomelzi.model.ProveedorModel;
import com.example.ibmprojectpablomelzi.service.ProveedorService;

@RestController
@RequestMapping("api/proveedores")
public class ProveedorController {

private final ProveedorService proveedorService;

public ProveedorController(ProveedorService proveedorService) {
	this.proveedorService=proveedorService;
}

@GetMapping("/{idCliente}")
public List<ProveedorModel>getProveedores(@PathVariable Integer idCliente){
	return proveedorService.getProveedoresByClienteId(idCliente);
}
}
