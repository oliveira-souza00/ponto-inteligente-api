package com.sts.pontointeligente.api;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sts.pontointeligente.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa,Long> {

	Empresa findByCnpj(String cnpj);

}
