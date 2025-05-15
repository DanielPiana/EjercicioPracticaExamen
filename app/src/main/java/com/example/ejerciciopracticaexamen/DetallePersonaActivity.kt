package com.example.ejerciciopracticaexamen

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.ejerciciopracticaexamen.databinding.ActivityDetallePersonaBinding
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DetallePersonaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetallePersonaBinding
    private lateinit var tvNombre: TextView
    private lateinit var tvApellido: TextView
    private lateinit var tvEdad: TextView
    private lateinit var tvTelefono: TextView
    private lateinit var tvFechaNacimiento: TextView
    private lateinit var ivFoto: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetallePersonaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        tvNombre = binding.tvNombreDetalle
        tvApellido = binding.tvApellidoDetalle
        tvEdad = binding.tvEdadDetalle
        tvTelefono = binding.tvTelefonoDetalle
        tvFechaNacimiento = binding.tvFechaNacimientoDetalle
        ivFoto = binding.ivFotoDetalle

        // OBTENEMOS LOS DATOS PASANDOS POR EL BUNDLE DE LA PERSONA
        val nombre = intent.getStringExtra("nombre") ?: ""  // PODEMOS PONER OPERADOR TERNARIO POR SI SE PASA MAL O DA ERROR, LO DEJAMOS VACIO (TAMBIEN PODEMOS PONER ERROR)
        val apellido = intent.getStringExtra("apellido") ?: ""
        val edad = intent.getIntExtra("edad", 0) // PONEMOS UN VALOR POR DEFECTO POR SI DA ERROR O NO HAY UN VALOR EN ESE DATO
        val telefono = intent.getLongExtra("telefono", 0L) // USAMOS 0L PARA UN LONG
        val fechaNacimientoString = intent.getStringExtra("fechaNacimiento") ?: LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE)
        val fechaNacimiento = LocalDate.parse(fechaNacimientoString, DateTimeFormatter.ISO_LOCAL_DATE) // PARSEAMOS LA FECHA A FORMATO ISO_LOCAL_DATE
        val fotoResId = intent.getIntExtra("fotoResId", R.drawable.ic_default_person) // USAMOS ic_default_person COMO IMAGEN POR DEFECTO

        // SETEMOS LOS DATOS PARA MOSTRARLOS EN PANTALLA
        tvNombre.text = nombre
        tvApellido.text = apellido
        tvEdad.text = "Edad: $edad"
        tvTelefono.text = "Teléfono: $telefono"
        tvFechaNacimiento.text = "Fecha de Nacimiento: $fechaNacimiento"
        Glide.with(this)
            .load(fotoResId)
            .into(ivFoto)
    }
}
