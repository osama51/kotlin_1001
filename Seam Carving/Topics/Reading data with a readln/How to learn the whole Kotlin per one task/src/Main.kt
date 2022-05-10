fun main() {
    // put your code here
    val inputs = ArrayList<String>()
    val numOfInputs = 5
    for (a in 0..numOfInputs-1) {
        val input = readln()
        inputs.add(input)
    }
    println(
        inputs[0] + " " + inputs[1] + " " + inputs[2] + " " + inputs[3] + " " + inputs[4]
    )
}
