package Task2

fun main (){
    var arrayStroke = arrayOf("железо", "галий", "свинец", "марганец", "уран")
    arrayStroke.sortBy { it.length }
    for ( i in arrayStroke.indices){
        if (i == arrayStroke.size - 1){
            println(arrayStroke[i])
        }
    }

}