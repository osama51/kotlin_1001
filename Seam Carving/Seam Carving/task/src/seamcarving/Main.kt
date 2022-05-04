package seamcarving

import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO


fun main() {
    val scalar = 10
    println("Enter Width: ")
    val width = Integer.parseInt(readln())

    println("Enter Height: ")
    val height = Integer.parseInt(readln())
    print("Enter the image name: \n")
    val imgName = readln()

    val bufferedImage = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)

    val graph = bufferedImage.graphics
    graph.color = Color.BLACK
    graph.drawRect(0, 0, width, height)
    graph.color = Color.RED
    graph.drawLine(0,0,width-1, height-1)
    graph.drawLine(width-1,0,0, height-1)
//    for (i in 0..9){          // in case you wanted the rectangular diagonals
//        graph.color = Color.RED
//        graph.drawRect((2*i) * (width / (2*scalar)), (2*i) * (height / (2*scalar)), width/scalar, height/scalar)
//        graph.drawRect((width - width/scalar) - ((2*i) * (width / (2*scalar))), (2*i) * (height / (2*scalar)), width/scalar, height/scalar)
//    }

//    graph.drawRect(0, 0,width , height)
//    graph.drawString("_____________________________    ", 20, 20)
//    graph.drawString("|*                                                        ", 20, 40)
//    graph.drawString("|*  *                             ", 20, 60)
//    graph.drawString("|*  *  *________________________   ", 20, 80)
//    graph.drawString("|*  *  *  *                                                 ", 20, 100)
//    graph.drawString("|*  *  *________________________   ", 20, 120)
//    graph.drawString("|*  *                                                     ", 20, 140)
//    graph.drawString("|*                                 ", 20, 160)
//    graph.drawString("_____________________________    ", 20, 180)

    ImageIO.write(bufferedImage, "png", File("$imgName"))

}
