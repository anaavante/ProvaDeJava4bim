package br.com.cti.meuapp.dao

import br.com.cti.meuapp.models.Produtos

class ProdutosDao {

    fun adiciona(produto: Produtos){
        produtos.add(produto)
    }

    fun buscaTodos(): List<Produtos>{
        return produtos.toList()
    }

    companion object{
        private val produtos = mutableListOf<Produtos>()
    }
}