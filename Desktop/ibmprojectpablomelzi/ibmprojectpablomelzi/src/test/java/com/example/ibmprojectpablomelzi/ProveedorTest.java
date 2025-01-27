package com.example.ibmprojectpablomelzi;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.example.ibmprojectpablomelzi.model.ProveedorModel;
import com.example.ibmprojectpablomelzi.repository.ProveedorRepository;
import com.example.ibmprojectpablomelzi.service.ProveedorService;

class ProveedorTest {

	private final ProveedorRepository proveedorRepository=mock(ProveedorRepository.class);
	private final ProveedorService proveedorService= new ProveedorService(proveedorRepository);
	
@Test
void testGetProveedoresByClientId() {
	List<ProveedorModel> mockProveedores =Arrays.asList(
			new ProveedorModel() {{setIdProveedor(1L); setNombre("Coca-cola"); setFechaAlta(LocalDate.now()); setIdCliente(5);}},
			new ProveedorModel() {{setIdProveedor(2L); setNombre("Pepsi"); setFechaAlta(LocalDate.now()); setIdCliente(5);}});
	when(proveedorRepository.findByIdCliente(5)).thenReturn(mockProveedores);
	
	List<ProveedorModel> result=proveedorService.getProveedoresByClienteId(5);
	
	assertEquals(2, result.size());
	assertEquals("Coca-cola", result.get(0).getNombre());
	assertEquals("Pepsi", result.get(1).getNombre());
	verify(proveedorRepository, times(1)).findByIdCliente(5);
}

}
