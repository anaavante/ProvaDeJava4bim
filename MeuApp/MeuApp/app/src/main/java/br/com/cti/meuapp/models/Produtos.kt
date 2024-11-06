package br.com.cti.meuapp.models

import java.math.BigDecimal

data class Produtos(
    val nome: String,
    val descricao: String,
    val valor: BigDecimal
)
