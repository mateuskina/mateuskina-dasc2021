package br.univille.mateuskinadacs2021.service;

import java.util.List;
import br.univille.mateuskinadacs2021.model.Produto;

public interface ProdutoService {
    public List<Produto> getAllProdutos();
    public Produto save(Produto produto);
}
