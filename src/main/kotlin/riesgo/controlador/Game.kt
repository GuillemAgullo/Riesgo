package riesgo.controlador

import riesgo.Colors
import riesgo.view.Jugador1
import riesgo.view.Jugador2
import java.io.FileDescriptor
import java.io.FileOutputStream
import java.io.PrintStream
import java.nio.charset.StandardCharsets

class Game {

    fun joc() {

        // Set the charset to UTF 8 to the Standard Output
        if (System.out.charset() != StandardCharsets.UTF_8) {
            System.setOut(PrintStream(FileOutputStream(FileDescriptor.out), true, StandardCharsets.UTF_8))
        }
        val fideljoc = true

        //FEM UN BUCLE WHILE QUE SERÀ L'EXECUCIÓ DEL JOC EN SI.
        while (fideljoc) {
            print("\u001b[2J")

            //PRESENTEM EL JOC D'UNA MANERA AMENA I AGRADABLE A LA VISTA
            println("\n==========================================================================================")
            println("=============BENVINGUT A \"RIESGO\", EL RISK IBÈRIC=========================================")
            println("==========================================================================================")
            println("=============MENÚ DEL JOC=================================================================")
            println("==========================================================================================")


            //DEMANEM LES CREDENCIALS ALS JUGADORS. (NOM I COLOR)
            println("Nom del jugador 1: ")
            Jugador1.nom = readlnOrNull() ?: "Unnamed1"
            println("Color del jugador 1: ")
            println("LLEGENDA DE COLORS:")
            println("1-vermell, 2-verde que te quiero verde, 3-blau, 4-groc, 5-rosa que l'amor s'hi posa")
            when (readln().toIntOrNull()) {
                1 -> {
                    Jugador1.color = Colors.ANSI_RED
                }

                2 -> {
                    Jugador1.color = Colors.ANSI_GREEN
                }

                3 -> {
                    Jugador1.color = Colors.ANSI_BLUE
                }

                4 -> {
                    Jugador1.color = Colors.ANSI_YELLOW
                }

                5 -> {
                    Jugador1.color = Colors.ANSI_PURPLE
                }

                else -> {
                    Jugador1.color = Colors.ANSI_RED
                }
            }
            Jugador1.numSoldats = 30


            println("Nom del jugador 2: ")
            Jugador2.nom = readlnOrNull() ?: "Unnamed2"
            println("Color del jugador 2: ")
            println("LLEGENDA DE COLORS:")
            println("1-vermell, 2-verde que te quiero verde, 3-blau, 4-groc, 5-rosa que l'amor s'hi posa")
            when (readln().toIntOrNull()) {
                1 -> {
                    Jugador2.color = Colors.ANSI_RED
                }

                2 -> {
                    Jugador2.color = Colors.ANSI_GREEN
                }

                3 -> {
                    Jugador2.color = Colors.ANSI_BLUE
                }

                4 -> {
                    Jugador2.color = Colors.ANSI_YELLOW
                }

                5 -> {
                    Jugador2.color = Colors.ANSI_PURPLE
                }

                else -> {
                    Jugador2.color = Colors.ANSI_GREEN
                }
            }
            Jugador2.numSoldats = 30


            print("\u001b[2J")

            print("\n")
            val torns = TurnsFunctions()
            torns.tornsDeTot()
        }
    }
}