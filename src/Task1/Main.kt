package Task1

import kotlin.math.E

fun main (){
    val eagle = Eagle ("ястребинные" , "хищники")
    val bullfinch = Bullfinch ("воробьинные", "насекомоядние и травоядные")
    val penguins = Penguins ("пингвинообразные", "хищники")
    println(eagle.information)
    eagle.action()
    eagle.migration()
    println("")
    println(bullfinch.information)
    bullfinch.action()
    bullfinch.migration()
    println("")
    println(penguins.information)
    penguins.action()
    penguins.migration()
}


class Eagle (type : String,  eating: String) : Bird(type , eating) {
    override val mustFlying: String = "летают"
    override val information: String
        get() = "Bird {Тип : $type, умение летать: $mustFlying " +
                "занимаемое местов пищевой цепочке: $eating"

    override fun migration() {
        println("Обитают на одной территории, не мигрируют")
    }

    override fun action() {
        println("Добывают пропитание охотясь на мелких грызонов и других птиц")
    }
}

class Bullfinch (type: String, eating: String) : Bird(type, eating){

    override val information: String
        get() = "Bird {Тип : $type, умение летать: $mustFlying " +
                "занимаемое местов пищевой цепочке: $eating"
    override val mustFlying: String
        get() = "летают"

    override fun action() {
            println("Питаются в соновном насекомыми и семенами ягод")
        }
    override fun migration() {
        println("Зимой мигрируют")
    }
}


class Penguins (type: String, eating: String) : Bird(type, eating){
    override val information: String
        get() = super.information
    override val mustFlying: String
        get() = "Не летают"
    override val mustSwiming: String
        get() =  "Плавают"
    override fun migration() {
            println("Не мигрируют")
        }
    override fun action() {
        println("Охотятся в месте обитания на рыбу ")
    }
}