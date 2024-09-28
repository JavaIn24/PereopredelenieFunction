package Task3

import javax.xml.stream.events.Characters

fun main (){
    var count = 0
    var a = "ПриВет, кАк деЛа"
    val aArrayChar = a.toCharArray()
    for (i in aArrayChar.indices){
        var b : Char = aArrayChar[i]
        if (b.isUpperCase()) {
            println(b)
            count++
        }
    }
    println(count)
}
