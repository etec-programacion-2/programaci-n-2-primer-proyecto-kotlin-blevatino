package org.example

fun main() {
    println("¡Hola, Kotlin!")
    println("Bruno Levatino")
    println("hoy es 22 de abril del año 2025")
    println ("\t")
    mostrarTiposDeDatos()
    println ("\t")
    CalcularAreaRectangulo()
    println ("\t")
    println(esParOImpar(4))
    println ("\t")
    println(PositivoNegativoCero(0))

}

fun mostrarTiposDeDatos() {
    val nombre: String = "Juan"
    val edad: Int = 25
    val altura: Double = 1.75
    val esEstudiante: Boolean = true
    
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")
    println("Es estudiante: $esEstudiante")
}

fun CalcularAreaRectangulo(){
    val base: Double = 35.2
    val altura: Double = 20.5
    println("El area del rectangulo es de ${base*altura}m2")
}

fun esParOImpar(numero: Int): String {
    return when {
        numero % 2 == 0 -> "Par"
        else -> "Impar"
    }
}

fun PositivoNegativoCero(num: Int):String {
    return when {
        num > 0 -> "Positivo"
        num < 0 -> "Negativo"
        else -> "Cero"
    }
}