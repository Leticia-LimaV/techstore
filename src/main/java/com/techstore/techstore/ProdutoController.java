package com.techstore.techstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private Estoque estoque = new Estoque();

    public ProdutoController() {
        // CADASTRANDO PRODUTOS FALSOS PARA O TESTE
        // Assim que você rodar, esses produtos já vão aparecer no site!
        estoque.adicionarProduto(new Produto("P001", "Mouse Gamer", 129.90, "Periféricos"), 10);
        estoque.adicionarProduto(new Produto("P002", "Teclado Mecânico", 349.90, "Periféricos"), 5);
        estoque.adicionarProduto(new Produto("P003", "Headset", 249.90, "Áudio"), 8);
        estoque.adicionarProduto(new Produto("P004", "Monitor 24", 899.90, "Monitores"), 3);
    }

    @GetMapping
    public Collection<Produto> listar() {
        return estoque.getProdutos().values();
    }
}