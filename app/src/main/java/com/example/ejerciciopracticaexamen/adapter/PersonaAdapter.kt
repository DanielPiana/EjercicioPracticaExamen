package com.example.ejerciciopracticaexamen.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciopracticaexamen.R
import com.example.ejerciciopracticaexamen.model.Persona

class PersonaAdapter(private val personaList:List<Persona>, private val onClickListener:(Persona) -> Unit) : RecyclerView.Adapter<PersonaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PersonaViewHolder(layoutInflater.inflate(R.layout.item_recyclerview,parent,false))
    }

    override fun getItemCount(): Int {
        return personaList.size
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        val item = personaList[position]
        holder.render(item,onClickListener)
    }
}