import riesgo.CONTROLLER.Jugador
import riesgo.VIEW.Mapa

//Aquest arxiu és el main i és des d'on cridaré totes les clases de l'inici del joc fins que s'acabi

fun main() {
    val fideljoc = true
    val mapa = Mapa()

    while (fideljoc == true){
        print("\u001b[2J")


            println("==========================================================================================")
            println("=============BENVINGUT A \"RIESGO\", EL RISK IBÈRIC=======================================")
            println("==========================================================================================")
            println("=============MENÚ DEL JOC=================================================================")
            println("==========================================================================================")

        //CREEM UNA INSTÀNCIA DE LA CLASSE JUGADOR I LI DEMANEM AL USUARI QUE INTRODUEIXI EL NOM I EL COLOR AMB EL QUE VULGUI SER REPRESENTAT.
        val Jugador1 = Jugador()
        println("Nom del jugador 1: ")
        Jugador1.nom = readLine()?:"Unnamed1"
        println("Color del jugador 1: ")
        println("LLEGENDA DE COLORS:")
        println("1-vermell, 2-verde que te quiero verde, 3-blau, 4-groc, 5-rosa que l'amor s'hi posa")
        Jugador1.color = readLine()?.toIntOrNull()?:0
        Jugador1.numSoldats = 30

        print("\u001b[2J")

        print("F")
        Thread.sleep(250)
        print("a")
        Thread.sleep(250)
        print("s")
        Thread.sleep(250)
        print("e ")
        Thread.sleep(250)
        print("1")
        Thread.sleep(250)
        print(":")
        Thread.sleep(1000)
        print("E")
        Thread.sleep(250)
        print("x")
        Thread.sleep(250)
        print("p")
        Thread.sleep(250)
        print("l")
        Thread.sleep(250)
        print("o")
        Thread.sleep(250)
        print("r")
        Thread.sleep(250)
        print("a")
        Thread.sleep(250)
        print("c")
        Thread.sleep(250)
        print("i")
        Thread.sleep(250)
        print("ó")
        Thread.sleep(2000)

        print("\u001b[2J")

    }


}