// /**
//  * You can edit, run, and share this code.
//  * play.kotlinlang.org
//  */
// fun main() {
//     val str: String? = null
   
//     if (str == null){
//         println("NULO TEXTO INFORMATIVO")	
//     } else{
//         println(str)
//     }
//     println(str ?: "Nulo texto informativo")
// }

fun main() {
    val str: String = null
   
    if (str == null){
        println("Valor nulo")	
    } else{
        println(str)
    }
    println(str ?: "Nulo texto informativo")
}