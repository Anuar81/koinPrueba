package com.elabel.koinprueba.Persona

class Persona(val dni: DNI) {
    override fun toString(): String = dni.nombre + " " + dni.apellido + " DNI: " + dni.documento.toString()
}