package com.henrique.orgs.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.henrique.orgs.R
import com.henrique.orgs.model.Produto

class ListaProdutosAdapter(
    private val context: Context,
    private val produtos: List<Produto>
) : RecyclerView.Adapter<ListaProdutosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaProdutosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.produto_item,parent,false)
        return ListaProdutosViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListaProdutosViewHolder, position: Int) {
        holder.bind(produtos[position])
    }

    override fun getItemCount(): Int {
        return produtos.size
    }
}