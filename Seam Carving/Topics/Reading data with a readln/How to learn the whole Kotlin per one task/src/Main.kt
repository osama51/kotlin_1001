fun main() {
    // put your code here
    val inputs = ArrayList<String>()
    for (a in 0..4){
        val input = readln()
        inputs.add(input)
    }
    println(inputs[0] + " " + inputs[1] + " " +
            inputs[2] + " " + inputs[3] + " " + inputs[4])
}