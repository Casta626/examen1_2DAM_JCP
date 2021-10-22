fun tabla6a8par(){
    println("TABLA DEL 1")
    println("**************")
    println("TABLA DEL 3")
    println("**************")
    println("TABLA DEL 5")
    println("**************")
}
fun tabla6a8impar(){
    println("TABLA DEL 2")
    println("**************")
    println("TABLA DEL 4")
    println("**************")
}
fun tabla8a10par(){
    println("TABLA DEL 7")
    println("**************")
    println("TABLA DEL 9")
    println("**************")
}
fun tabla8a10impar(){
    println("TABLA DEL 6")
    println("**************")
    println("TABLA DEL 8")
    println("**************")
    println("TABLA DEL 10")
    println("**************")
}
fun tabla10a12par(){
    println("TABLA DEL 11")
    println("**************")
    println("TABLA DEL 12")
    println("**************")
    println("TABLA DEL 13")
    println("**************")
}
fun tabla10a12impar(){
    println("TABLA DEL 14")
    println("**************")
    println("TABLA DEL 15")
    println("**************")
    println("TABLA DEL 16")
    println("**************")
}



fun main(args: Array<String>) {

    println("Introduce el nombre del Alumno")
    val alumno = readLine()


    var año: Int
    var mes: Int



    println("Introduce el año")
    año = readLine()?.toInt() as Int

    println("Introduce el mes")
    mes = readLine()?.toInt() as Int



    println("************************************************************")
    println("PROGRAMA DE GENERACIÓN DE TABLAS: "+alumno)
    println("____________________________________________________________")


    if (año in 6..8) {
        println("Edad: "+año+". El alumno esta en el rango [6-8]")
        if (mes % 2 == 0) {

            println("Mes: "+mes+". El mes es par, corresponde a las tablas siguientes:")
            println("____________________________________________________________")
            tabla6a8par()
        }else{
            println("Mes: "+mes+". El mes es impar, corresponde a las tablas siguientes:")
            println("____________________________________________________________")
            tabla6a8impar()}

    }else if (año in 8..10) {
        println("Edad: "+año+". El alumno esta en el rango [8-10]")

        if (mes%2 == 0) {

            println("Mes: "+mes+". El mes es par, corresponde a las tablas siguientes:")
            println("____________________________________________________________")
            tabla8a10par()
        }else{
            println("Mes: "+mes+". El mes es impar, corresponde a las tablas siguientes:")
            println("____________________________________________________________")
            tabla8a10impar()}

    }else if (año in 10..12) {
        println("Edad: "+año+". El alumno esta en el rango [10-12]")

        if (mes%2 == 0) {

            println("Mes: "+mes+". El mes es par, corresponde a las tablas siguientes:")
            println("____________________________________________________________")
            tabla10a12par()
        }else{
            println("Mes: "+mes+". El mes es impar, corresponde a las tablas siguientes:")
            println("____________________________________________________________")
            tabla10a12impar()}

    }else if (año>12 || año<6) {
        println("Los años deben de estar comprendidos entre 6 y 12 años")
    }else if (mes>12 || mes<0){
        println("Los meses son del 1 al 12")
    }

    println("************************************************************")

}