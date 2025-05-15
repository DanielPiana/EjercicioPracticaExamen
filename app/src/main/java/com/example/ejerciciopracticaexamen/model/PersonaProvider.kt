package com.example.ejerciciopracticaexamen.model

import android.util.Log
import com.example.ejerciciopracticaexamen.R

class PersonaProvider {
    companion object {
        // LA LISTA DEBE SER MUTABLE PARA PODER AÑADIR ELEMENTOS
        val personaList = mutableListOf<Persona>(
            Persona("Name1", "Surname1", 111111111, 1, R.drawable.persona1),
            Persona("Name2", "Surname2", 222222222, 2, R.drawable.persona2),
            Persona("Name3", "Surname3", 333333333, 3, R.drawable.persona3),
            Persona("Name4", "Surname4", 444444444, 4, R.drawable.persona4),
            Persona("Name5", "Surname5", 555555555, 5, null),
            Persona("Name6", "Surname6", 666666666, 6),
            Persona("Name7", "Surname7", 777777777, 7),
            Persona("Name8", "Surname8", 888888888, 8)
        )

        fun addPersona(persona: Persona) {
            personaList.add(persona)
        }

        fun printList(): List<Persona> {
            Log.d("PersonaProvider", "getPersonaList: $personaList") // LOG DE DEPURACION
            return personaList.toList() // DEVOLVEMOS UNA COPIA NO MUTABLE
        }

        fun removePersona(persona:Persona) {
            personaList.remove(persona)
        }
    }
}
