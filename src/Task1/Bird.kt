package Task1

 open class Bird (
     val type : String,
    val eating : String
) {
    open val mustSwiming : String = ""
     open val mustFlying : String = ""
     open val information : String
         get () = "Bird {Тип : $type, умение летать: $mustFlying , умение плавать: $mustSwiming" +
                 " занимаемое местов пищевой цепочке: $eating"

      open fun action (){
          println("")
     }
     open fun migration (){
         println("")
     }


}