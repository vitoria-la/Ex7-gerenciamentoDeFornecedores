package com.exercicios.gerenciamentoDeFornecedores.Services;

import com.exercicios.gerenciamentoDeFornecedores.Models.FornecedorModel;
import com.exercicios.gerenciamentoDeFornecedores.Repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    FornecedorRepository fornecedorRepository;

    public FornecedorModel criarFornecedor(FornecedorModel fornecedorModel) {
        return fornecedorRepository.save(fornecedorModel);
    }

    public List<FornecedorModel> listarFornecedores() {
        return fornecedorRepository.findAll();
    }

    public Optional<FornecedorModel> buscarFornecedor(Long id) {
        return fornecedorRepository.findById(id);
    }

    public void deletarFornecedor(Long id) {
        fornecedorRepository.deleteById(id);
    }

}
