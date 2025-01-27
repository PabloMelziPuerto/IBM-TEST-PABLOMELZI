package com.example.ibmprojectpablomelzi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ibmprojectpablomelzi.model.ProveedorModel;

public interface ProveedorRepository extends JpaRepository<ProveedorModel, Long> {
List<ProveedorModel> findByIdCliente(Integer idCliente);
}
