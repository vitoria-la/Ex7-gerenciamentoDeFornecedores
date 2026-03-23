package com.exercicios.gerenciamentoDeFornecedores.Controllers;

import com.exercicios.gerenciamentoDeFornecedores.Models.FornecedorModel;
import com.exercicios.gerenciamentoDeFornecedores.Services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/fornecedores")
public class FornecedorController {

    @Autowired
    FornecedorService fornecedorService;

    @PostMapping
    public ResponseEntity<FornecedorModel> criarFornecedor(@RequestBody FornecedorModel fornecedorModel) {
        FornecedorModel request = fornecedorService.criarFornecedor(fornecedorModel);
        return ResponseEntity.status(201).body(request);
    }

    @GetMapping
    public ResponseEntity<List<FornecedorModel>> listarFornecedores() {
        List<FornecedorModel> request = fornecedorService.listarFornecedores();
        return ResponseEntity.status(200).body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<FornecedorModel>> buscarFornecedor(@PathVariable Long id) {
        Optional<FornecedorModel> request = fornecedorService.buscarFornecedor(id);
        return ResponseEntity.status(200).body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarFornecedor(@PathVariable Long id) {
        fornecedorService.deletarFornecedor(id);
        return ResponseEntity.status(204).build();
    }

}
