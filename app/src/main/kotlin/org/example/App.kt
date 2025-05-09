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
    println ("\t")
    mostrarNumerosConLoops()
    println ("\t")
    MostrarNumerosPares()
    println ("\t")
    println(factorial(5))
    println ("\t")
    saludar("Bruno",16)
    println ("\t")
    potencia(2.0,9.0)

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

fun mostrarNumerosConLoops() {
    // Usando for
    println("Usando for:")
    for (i in 1..10) {
        println(i)
    }
    
    // Usando while
    println("\nUsando while:")
    var j = 1
    while (j <= 10) {
        println(j)
        j++
    }
    
    // Usando do-while
    println("\nUsando do-while:")
    var k = 1
    do {
        println(k)
        k++
    } while (k <= 10)
}

fun MostrarNumerosPares(){
    // Usando for
    println("Usando for:")
    for (i in 1..20) {
        when{
            i % 2 == 0 -> println(i)
        }
    }
    
    // Usando while
    println("\nUsando while:")
    var j = 1
    while (j <= 20) {
        when{
            j % 2 == 0 -> println(j)
        }
        j++
    }
    
    // Usando do-while
    println("\nUsando do-while:")
    var k = 1
    do {
        when{
            k % 2 == 0 -> println(k)
        }
        k ++
    } while (k <= 20)
}

fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun saludar(nombre: String, edad: Int = 0) {
    println("Hola $nombre, tienes $edad años")
}

fun potencia(n: Double, m: Double){
    val base = n
    val exponente = m
    val resultado = Math.pow(base, exponente)
    println(resultado)
}