package com.henrique.orgs.activity

import android.app.Activity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.henrique.orgs.R
import com.henrique.orgs.adapter.ListaProdutosAdapter
import com.henrique.orgs.model.Produto
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.setText("Cesta de frutas")
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, pera e maça"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(this, listOf(
            Produto(
                "teste","testando", BigDecimal("10.00")
            ),
            Produto(
                "teste 2","testando 2", BigDecimal("12.00")
            ),
            Produto(
                "teste 3","testando 3", BigDecimal("13.00")
            )
        ))
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}