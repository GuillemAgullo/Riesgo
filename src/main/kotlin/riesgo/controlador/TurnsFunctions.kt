package riesgo.controlador

import riesgo.Colors
import riesgo.view.Jugador1
import riesgo.view.Jugador2
import riesgo.view.textoFlama
import riesgo.view.Mapa

class TurnsFunctions {
    fun tornsExploracio() {
        val mapa = Mapa()
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

            //TORN DEL JUGADOR 1:
            println("\nTorn de " + Jugador1.color + Jugador1.nom + Colors.ANSI_RESET + ". ||Exèrcit:${Jugador1.numSoldats}||")
            println("\nQuina província vols explorar?(Recorda que has d'escriure el nom just com està al mapa)")

            mapa.provincies.forEachIndexed { index, provincia ->
                if (provincia.numSoldats == 0) {
                    println("$index - ${provincia.nom}")
                }
            }

            val mapaupdatedJ1 = mapa.faseExploracio(Jugador1, readln())
            print(mapaupdatedJ1)
            print("\n")
            if (mapaupdatedJ1 == "Fase d'exploració acabada.") {
                Thread.sleep(4000)
                switchTornsExploracio = false
                continue
            }

            //TORN DEL JUGADOR 2:
            println("\nTorn de " + Jugador2.color + Jugador2.nom + Colors.ANSI_RESET + ". ||Exèrcit:${Jugador2.numSoldats}||")
            println("\nQuina província vols explorar?(Recorda que has d'escriure el nom just com està al mapa)")

            mapa.provincies.forEachIndexed { index, provincia ->
                if (provincia.numSoldats == 0) {
                    println("$index - ${provincia.nom}")
                }
            }
            val mapaupdatedJ2 = mapa.faseExploracio(Jugador2, readln())
            print(mapaupdatedJ2)
            print("\n")
            //QUAN LA FUNCIÓ FASEEXPLORACIÓ ENS RETORNA LA FRASE: FASE D'EXPLORACIÓ ACABADA, S'ACABA EL BUCLE.
            if (mapaupdatedJ2 == "Fase d'exploració acabada.") {
                Thread.sleep(4000)
                switchTornsExploracio = false
                continue
            }
        }
    }

    fun tornsColonitzacio() {
        val mapa = Mapa()

        //INDIQUEM QUE INICIEM LA FASE 2: COLONITZACIÓ
        textoFlama("Fase 2: Colonització")
        print("\n En aquesta fase, colocareu els soldats restants en les províncies més convenients.\n")
        //CREEM EL BUCLE WHILE DELS TORNS DE LA SEGONA FASE.

        var switchTornsColonitzacio = true
        print(mapa.asciimapMain)

        while (switchTornsColonitzacio) {

            //TORN DEL JUGADOR 1:
            if (Jugador1.numSoldats > 0) {
                println("\nTorn de " + Jugador1.color + Jugador1.nom + Colors.ANSI_RESET + ". ||Exèrcit:${Jugador1.numSoldats}||")
                println("Quina província vols colonitzar?(recorda que has d'escriure-la igual que com està al mapa.\n")

                mapa.provincies.forEachIndexed { index, provincia ->
                    if (provincia.propietari == Jugador1) {
                        println("$index - ${provincia.nom}")
                    }
                }
                val mapaupdatedColonitzacioJ1 = mapa.faseColonitzacio(Jugador1, readln())
                println(mapaupdatedColonitzacioJ1)

                if (mapaupdatedColonitzacioJ1 == "Fase de colonització acabada.") {
                    switchTornsColonitzacio = false
                    Thread.sleep(4000)
                    continue
                }
            }
            //TORN DEL JUGADOR 2:
            if (Jugador2.numSoldats > 0) {
                println("\nTorn de " + Jugador2.color + Jugador2.nom + Colors.ANSI_RESET + ". ||Exèrcit:${Jugador2.numSoldats}||")
                println("Quina povíncia vols colonitzar?(recorda que has d'escriure-la igual que com està al mapa.\n")

                mapa.provincies.forEachIndexed { index, provincia ->
                   if (provincia.propietari == Jugador2) {
                       println("$index - ${provincia.nom}")
                   }
                }
                val mapaupdatedColonitzacioJ2 = mapa.faseColonitzacio(Jugador2, readln())
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