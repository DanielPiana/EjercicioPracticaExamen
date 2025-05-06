package com.example.ejerciciopracticaexamen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }
}


// Lista de funcionalidades y elementos a implementar:
//Pantalla principal (MainActivity):
//
//Campos de entrada:
//
//Nombre
//
//Apellido
//
//Número de teléfono
//
//Fecha de nacimiento
//
//Imagen (opcional)
//
//Botón "Guardar":
//
//Guarda la información ingresada en un ViewModel y en una lista (puede ser en memoria al principio, luego en una base de datos si lo prefieres).
//
//Botón "Ver Lista":
//
//Abre un nuevo Fragment o Activity que contiene el RecyclerView con la lista de personas guardadas.
//
//RecyclerView en el Fragmento o Activity de Lista:
//
//Adapter y ViewHolder: Configura un Adapter para manejar la lista de personas y un ViewHolder para cada ítem.
//
//Listener de item clickeado: Al hacer clic en un elemento de la lista, abre un fragmento o Activity con los detalles de la persona seleccionada.
//
//Actualización dinámica: Si usas LiveData, la lista debería actualizarse automáticamente cuando se agregan nuevas personas.
//
//Fragmento de Detalles de la Persona:
//
//Al hacer clic en una persona desde el RecyclerView, abre un Fragment con los detalles completos de la persona seleccionada. Muestra:
//
//Nombre
//
//Apellido
//
//Número de teléfono
//
//Fecha de nacimiento
//
//Foto (si has añadido este campo)
//
//Navegación entre pantallas:
//
//Implementa la navegación entre pantallas (de MainActivity a Fragment de lista, y de la lista al fragmento de detalles de la persona seleccionada).
//
//Usa el Navigation Component para gestionar la navegación entre las pantallas de manera eficiente y escalable.
//
//Validación de campos en MainActivity:
//
//Asegúrate de que los campos de entrada no estén vacíos antes de guardar la persona.
//
//Implementa validaciones básicas como verificar que el número de teléfono sea válido (puedes usar expresiones regulares, por ejemplo).
//
//Persistencia de datos:
//
//Al principio puedes guardar los datos en memoria (una lista de objetos Persona), pero una vez que tengas el flujo básico funcionando, podrías implementar Room para guardar la información de manera persistente.
//
//Si decides no usar Room, podrías usar SharedPreferences para guardar los datos en formato clave-valor de manera sencilla, o una lista en memoria si es solo para el ejercicio.
//
//ViewModel:
//
//El ViewModel es responsable de almacenar y gestionar los datos de la UI de manera independiente del ciclo de vida de la actividad o fragmento.
//
//El ViewModel mantiene los datos entre cambios de configuración (como la rotación de pantalla) y es útil para manejar la lógica de negocio y separar la lógica de la UI.
//
//Uso del ViewModel:
//
//Puedes usar el ViewModel para gestionar la lista de personas.
//
//LiveData puede observarse desde el Activity o Fragment y actualizar la UI cuando los datos cambien (como cuando se agrega una nueva persona).
//
//Diseño y UX (Usabilidad):
//
//Uso de ConstraintLayout: Organiza los campos de entrada de manera flexible.
//
//Uso de CardView para cada ítem del RecyclerView, lo que mejora la apariencia de los elementos de la lista.
//
//Mensajes de error: Muestra mensajes de error si los campos no son válidos (por ejemplo, si el teléfono no es un número válido o si un campo está vacío).
//
//Interactividad: Agrega retroalimentación visual cuando el usuario guarde correctamente los datos o si hay algún error.
//
//Manejo de imágenes:
//
//Si decides incluir la imagen de la persona, puedes usar bibliotecas como Glide o Picasso para cargar imágenes de manera eficiente desde la galería del dispositivo o recursos locales.
//
//Para comenzar, puedes tener un campo de imagen opcional (por ejemplo, si el usuario quiere subir una foto de la persona) o simplemente una imagen por defecto.
//
//Resumen de flujo:
//Pantalla Principal (MainActivity): Donde el usuario puede ingresar los datos de una persona y guardarlos.
//
//Campos: nombre, apellido, teléfono, fecha de nacimiento, y foto (opcional).
//
//Botón "Guardar" para almacenar la persona.
//
//Botón "Ver Lista" para mostrar las personas guardadas.
//
//Fragmento o Actividad de Lista: Muestra la lista de personas guardadas en un RecyclerView.
//
//Cada item tiene un ViewHolder que muestra los datos de la persona.
//
//Al hacer clic en un ítem, se navega al fragmento de detalles de la persona.
//
//Fragmento de Detalles: Muestra la información detallada de la persona seleccionada.
//
//Navegación: Usa el Navigation Component para mover entre las pantallas y pasar datos entre ellas.
//
//ViewModel: Utiliza un ViewModel para gestionar los datos de las personas, manejar la persistencia (si decides usar Room) y actualizar la UI con LiveData.
//
//Validación: Asegúrate de que los datos sean válidos antes de guardarlos (número de teléfono válido, campos no vacíos, etc.).
//
//Diseño y Usabilidad: Utiliza ConstraintLayout para la UI y CardView para cada item del RecyclerView. Asegúrate de tener una experiencia de usuario limpia y fácil de usar.