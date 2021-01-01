
//Created in kotlinplayground
fun main(){
    
    val dice = Dice(6)
    val dice2 = Dice(20)
   	println (dice.roll())
    println (dice2.roll())
}

class Dice(val sides:Int){
    
    fun roll(): Int {
        
        return (1..sides).random()
	}
}