// write your function here

fun main() {
    val letter = readLine()!!.first()
    fun isVowel(letter: Char) = listOf('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U').contains(letter)
    println(isVowel(letter))

    // TOOOOO MUCH
//        var result = false
//        run breaking@{
//            vowels.forEach {
//                result = letter == it
//                if (result) return@breaking
//            }
//        }
//        return result

//    // another nice solution
//    fun isVowel(l: Char) = l in "aeiouAEIOU"
//
//    fun main() {
//        val letter = readLine()!!.first()
//
//        println(isVowel(letter))
//    }

}
