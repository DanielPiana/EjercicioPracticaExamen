package com.example.ejerciciopracticaexamen.model

import com.example.ejerciciopracticaexamen.R
import java.time.LocalDate

data class Persona(
    val name: String,
    val surname: String,
    val phoneNumber: Long,
    val age: Int,
    val dateOfBirth: LocalDate = LocalDate.now(),
    val photoURl: Int? = R.drawable.ic_default_person
) {
    // CONSTRUCTOR SECUNDARIO PARA PASAR TU LA FOTO
    constructor(
        name: String,
        surname: String,
        phoneNumber: Long,
        age: Int,
        photoURl: Int?
    ) : this(name, surname, phoneNumber, age, LocalDate.now(), photoURl)

    // CONSTRUCTOR SECUNDARIO SIN PHOTOURL, USARA EL ESTABLECIDO ARRIBA POR DEFECTO (R.drawable.ic_default_person)
    constructor(
        name: String,
        surname: String,
        phoneNumber: Long,
        age: Int
    ) : this(name, surname, phoneNumber, age, LocalDate.now())
}
    