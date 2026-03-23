package com.exercicios.gerenciamentoDeFornecedores.Repositories;

import com.exercicios.gerenciamentoDeFornecedores.Models.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<FornecedorModel, Long> {
}
