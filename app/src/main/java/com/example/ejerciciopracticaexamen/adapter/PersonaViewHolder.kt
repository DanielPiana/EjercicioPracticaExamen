package com.example.ejerciciopracticaexamen.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.ejerciciopracticaexamen.databinding.ItemRecyclerviewBinding
import com.example.ejerciciopracticaexamen.model.Persona

class PersonaViewHolder(view:View) : ViewHolder(view) {

    val binding = ItemRecyclerviewBinding.bind(view)

    fun render(personaModel : Persona, onClickListener:(Persona) -> Unit) {
        binding.tvName.text = personaModel.name
        binding.tvSurname.text = personaModel.surname
        binding.tvAge.text = personaModel.age.toString()
        binding.tvPhoneNumber.text = personaModel.phoneNumber.toString()
        binding.tvDateOfBirth.text = personaModel.dateOfBirth.toString()

        Glide.with(binding.ivPhoto).load(personaModel.photoURl).into(binding.ivPhoto)


        itemView.setOnClickListener {
            onClickListener(personaModel)
        }

    }
}