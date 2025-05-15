package com.example.ejerciciopracticaexamen.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciopracticaexamen.adapter.PersonaAdapter
import com.example.ejerciciopracticaexamen.model.PersonaProvider
import com.example.ejerciciopracticaexamen.DetallePersonaActivity
import com.example.ejerciciopracticaexamen.R
import java.time.format.DateTimeFormatter

class ListaPersonasFragment : Fragment() { // DECLARAMOS QUE ESTA CLASE HEREDA DE Fragment()

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: PersonaAdapter

    // ESTE METODO SIRVE PARA QUE CUANDO SE CREE UNA INSTANCIA DE ESTA CLASE, DEVUELVE EL FRAGMENT PARA MOSTRARLO
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_personas_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // OBTENEMOS LA REFERENCIA DEL RecyclerView
        recyclerView = view.findViewById(R.id.fragmentPersonasList)

        // CONFIGURAMOS EL LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(context)

        // GUARDAMOS EN UNA VARIABLE LA LISTA DE PERSONAS QUE QUEREMOS MOSTRAR EN EL FRAGMENT
        val listaDePersonas = PersonaProvider.printList()

        // CONFIGURAMOS EL ADAPTER
        adapter = PersonaAdapter(listaDePersonas) { persona -> // AQUI INDICAMOS LO QUE TIENE QUE MOSTRAR EL ADAPTER, EN ESTE CASO, LA LISTA DE PERSONAS
            // CONFIGURAMOS EL LISTENER, PARA CUANDO DES CLICK A UNA PERSONA, SE ABRA UNA ACTIVITY NUEVA Y PASAMOS LOS DATOS POR EL BUNDLE, PARA PODER CARGARLOS.
            val intent = Intent(context, DetallePersonaActivity::class.java).apply {
                putExtra("nombre", persona.name)
                putExtra("apellido", persona.surname)
                putExtra("edad", persona.age)
                putExtra("telefono", persona.phoneNumber)
                putExtra("fechaNacimiento", persona.dateOfBirth.format(DateTimeFormatter.ISO_LOCAL_DATE))
                putExtra("fotoResId", persona.photoURl)
            }
            startActivity(intent) // ABRIMOS EL ACTIVITY
        }

        // CONECTA EL RecyclerView CON EL Adapter, PERMITIENDO AL RecyclerView MOSTRAR LOS DATOS PROPORCIONADOS POR EL ADAPTER
        recyclerView.adapter = adapter
    }
}