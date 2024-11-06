package br.com.cti.meuapp.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.cti.meuapp.recycleview.adapter.ListaProdutoAdapter
import br.com.cti.meuapp.R
import br.com.cti.meuapp.dao.ProdutosDao
import br.com.cti.meuapp.models.Produtos
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume(){
        super.onResume()
        val recyclerView = findViewById<RecyclerView>(R.id.recycleView)
        val dao = ProdutosDao()
        Log.i("MainActivity","onCreate: ${dao.buscaTodos()}")
        recyclerView.adapter = ListaProdutoAdapter(context = this, prod = dao.buscaTodos())
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener{
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
    }
}