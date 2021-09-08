package br.univille.mateuskinadacs2021.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.mateuskinadacs2021.model.Produto;
import br.univille.mateuskinadacs2021.repository.ProdutoRepository;
import br.univille.mateuskinadacs2021.service.ProdutoService;


@Service
public class ProdutoServiceImpl implements ProdutoService{
    @Autowired
    private ProdutoRepository repository;

    @Override
    public List<Produto> getAllProdutos() {
        return repository.findAll();
    }

    @Override
    public Produto save(Produto produto) {
        return repository.save(produto);
    }
    
}
