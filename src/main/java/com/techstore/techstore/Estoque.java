package com.techstore.techstore;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Integer> quantidades = new HashMap<>();
    private Map<String, Produto> produtos = new HashMap<>();

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.put(produto.getCodigo(), produto);
        quantidades.put(produto.getCodigo(),
                quantidades.getOrDefault(produto.getCodigo(), 0) + quantidade);
    }

    public Map<String, Produto> getProdutos() {
        return produtos;
    }

    // Métodos extras se precisar no futuro...
    public Produto obterProduto(String codigo) { return produtos.get(codigo); }
}
