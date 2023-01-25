package riesgo.view

import riesgo.Colors
import riesgo.model.Jugador
import java.io.FileDescriptor
import java.io.FileOutputStream
import java.io.PrintStream
import java.nio.charset.StandardCharsets


//Aquest arxiu és el riesgo.view.main i és des d'on cridaré totes les clases de l'inici del joc fins que s'acabi
//PRIMER CREEM LES VARIABLES GLOBALS PER ALS DOS JUGADORS
val Jugador1 = Jugador()
val Jugador2 = Jugador()
val Jugador0 = Jugador()

//FEM UNA FUNCIÓ PER A FER UN DIVERTIT I ENTRETINGUT EFECTE QUE ESCRIU UNA FRASE DONADA, PROGRESSIVAMENT.
fun textoFlama(frase: String) {
    print("\n")
    for (i in frase) {
        print("$i")
        Thread.sleep(250)
    }
    print("\n")
}

fun main() {
    // Set the charset to UTF 8 to the Standard Output
    if (System.out.charset() != StandardCharsets.UTF_8) {
        System.setOut(PrintStream(FileOutputStream(FileDescriptor.out), true, StandardCharsets.UTF_8))
    }
    val fideljoc = true
    val mapa = Mapa()

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

        //INICIEM LA FASE D'EXPLORACIÓ (1)
        textoFlama("Fase 1: Exploració")
        println("En aquesta fase, haureu de posar un soldat a cada província per torns.\n")
        Thread.sleep(3000)

        println(mapa.asciimapMain)
        //FEM UN BUCLE WHILE QUE DETERMINARÀ ELS TORNS DELS JUGADORS EN LA FASE D'EXPLORACIÓ
        var switchTornsExploracio = true
        //EN AQUEST BUCLE CRIDEM A LA FUNCIÓ FASEEXPLORACIO DE MAPA() PER FER ELS TORNS I ANEM CONSTANTMENT INDICANT
        //ALS USUARIS DE QUÍ ÉS EL TORN I QUANS SOLDATS TÉ CADASCÚ
        while (switchTornsExploracio) {

            println("\nTorn de "+ Jugador1.color + Jugador1.nom + Colors.ANSI_RESET +". ||Exèrcit:${Jugador1.numSoldats}||")
            println("\nQuina província vols explorar?(Recorda que has d'escriure el nom just com està al mapa)")
            val mapaupdatedJ1 = mapa.faseExploracioTorns(Jugador1, readln())
            print(mapaupdatedJ1)
            print("\n")
            if (mapaupdatedJ1 == "Fase d'exploració acabada.") {
                Thread.sleep(4000)
                switchTornsExploracio = false
                continue
            }

            println("\nTorn de "+ Jugador2.color + Jugador2.nom + Colors.ANSI_RESET +". ||Exèrcit:${Jugador2.numSoldats}||")
            println("\nQuina província vols explorar?(Recorda que has d'escriure el nom just com està al mapa)")
            val mapaupdatedJ2 = mapa.faseExploracioTorns(Jugador2, readln())
            print(mapaupdatedJ2)
            print("\n")
            //QUAN LA FUNCIÓ FASEEXPLORACIÓ ENS RETORNA LA FRASE: FASE D'EXPLORACIÓ ACABADA, S'ACABA EL BUCLE.
            if (mapaupdatedJ2 == "Fase d'exploració acabada.") {
                Thread.sleep(4000)
                switchTornsExploracio = false
                continue
            }
        }
        //INDIQUEM QUE INICIEM LA FASE 2: COLONITZACIÓ
        textoFlama("Fase 2: Colonització")
        print("\n En aquesta fase, colocareu els soldats restants en les províncies més convenients.\n")
        //CREEM EL BUCLE WHILE DELS TORNS DE LA SEGONA FASE.

        var switchTornsColonitzacio = true
        print(mapa.asciimapMain)

        while (switchTornsColonitzacio) {
            if (Jugador1.numSoldats > 0) {
                println("\nTorn de "+ Jugador1.color + Jugador1.nom + Colors.ANSI_RESET +". ||Exèrcit:${Jugador1.numSoldats}||")
                println("Quina província vols colonitzar?(recorda que has d'escriure-la igual que com està al mapa.\n")
                val mapaupdatedColonitzacioJ1 = mapa.faseColonitzacioTorns(Jugador1, readln())
                println(mapaupdatedColonitzacioJ1)
                if (mapaupdatedColonitzacioJ1 == "Fase de colonització acabada.") {
                    switchTornsColonitzacio = false
                    Thread.sleep(4000)
                    continue
                }
            }
            if (Jugador2.numSoldats > 0) {
                println("\nTorn de "+ Jugador2.color + Jugador2.nom + Colors.ANSI_RESET +". ||Exèrcit:${Jugador2.numSoldats}||")
                println("Quina povíncia vols colonitzar?(recorda que has d'escriure-la igual que com està al mapa.\n")
                val mapaupdatedColonitzacioJ2 = mapa.faseColonitzacioTorns(Jugador2, readln())
                println(mapaupdatedColonitzacioJ2)
                if (mapaupdatedColonitzacioJ2 == "Fase de colonització acabada.") {
                    switchTornsColonitzacio = false
                    Thread.sleep(4000)
                    continue
                }
            }

        }


    }
}




