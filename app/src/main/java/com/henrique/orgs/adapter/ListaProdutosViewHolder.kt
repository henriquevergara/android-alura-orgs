package com.henrique.orgs.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.henrique.orgs.R
import com.henrique.orgs.model.Produto

class ListaProdutosViewHolder(produtoView: View) : RecyclerView.ViewHolder(produtoView) {

    fun bind(produto: Produto) {
        val nome = itemView.findViewById<TextView>(R.id.nome)
        nome.text = produto.nome
        val descricao = itemView.findViewById<TextView>(R.id.descricao)
        descricao.text = produto.descricao
        val valor = itemView.findViewById<TextView>(R.id.valor)
        valor.text = produto.valor.toPlainString()
    }

}