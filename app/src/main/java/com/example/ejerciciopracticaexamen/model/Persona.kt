package com.example.ejerciciopracticaexamen.model

import com.example.ejerciciopracticaexamen.R
import java.time.LocalDate


data class Persona (
    val name:String,
    val surname:String,
    val phoneNumber:Int,
    val age:Int,
    val dateOfBirth:LocalDate,
    val photoURl: Int? = R.drawable.ic_default_person){ // POR SI QUEREMOS USAR UN VALOR POR DEFECTO

    // CONSTRUCTOR PARA IGNORAR 1 VALOR Y USARLO DE MANERA PROGRAMATICA (NO SE USA EL VALOR POR DEFECTO)
    constructor(name: String, surname: String, age: Int, phoneNumber: Int, dateOfBirth: LocalDate) :
            this(name, surname, phoneNumber,age, dateOfBirth, null)
}