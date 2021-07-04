package com.henrique.orgs.activity

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.henrique.orgs.R
import com.henrique.orgs.adapter.ListaProdutosAdapter
import com.henrique.orgs.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_produto)
        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)
        botaoSalvar.setOnClickListener{
            val campoNome = findViewById<EditText>(R.id.nome)
            val nome = campoNome.text.toString()
            val campoDescricao = findViewById<EditText>(R.id.descricao)
            val descricao = campoDescricao.text.toString()
            val campoValor = findViewById<EditText>(R.id.valor)
            val valor = campoValor.text.toString()

            val produto = Produto(
                nome = nome,
                descricao = descricao,
                valor = BigDecimal(valor)
            )

            Log.i("FormularioProduto", "onCreate: $produto")
        }
    }

}