package com.example.ibmprojectpablomelzi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.ibmprojectpablomelzi.model.ProveedorModel;

import com.example.ibmprojectpablomelzi.repository.ProveedorRepository;

@Service
public class ProveedorService {

private final ProveedorRepository proveedorRepository;

public ProveedorService(ProveedorRepository proveedorRepository) {
	this.proveedorRepository=proveedorRepository;
}

public List<ProveedorModel>getProveedoresByClienteId(Integer idCliente){
	return proveedorRepository.findByIdCliente(idCliente);
}
}
