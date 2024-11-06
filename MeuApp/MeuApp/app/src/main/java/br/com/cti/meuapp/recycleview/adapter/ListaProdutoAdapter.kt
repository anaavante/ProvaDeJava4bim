package br.com.cti.meuapp.recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.cti.meuapp.R
import br.com.cti.meuapp.models.Produtos

class ListaProdutoAdapter(
    private val context: Context,
    private val prod: List<Produtos>
) : RecyclerView.Adapter<ListaProdutoAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        fun vincular(prod: Produtos){
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = prod.nome
            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text = prod.descricao
            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text = prod.valor.toPlainString()
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val prod = prod[position]
        holder.vincular(prod)
    }

    override fun getItemCount(): Int =  prod.size



}
