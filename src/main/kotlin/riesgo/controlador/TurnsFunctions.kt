package riesgo.controlador

import riesgo.Colors
import riesgo.model.FaseAtac
import riesgo.view.*

class TurnsFunctions {
    private fun guanyador(mapa: Mapa): Int {
        var guanyadorJ1 = 0
        var guanyadorJ2 = 0
        for (i in mapa.provincies) {
            if (i.propietari == Jugador1) {
                guanyadorJ1 += 1
            } else if (i.propietari == Jugador2) {
                guanyadorJ2 += 1
            }
        }
        return if (guanyadorJ1 == 17) {
            1
        } else if (guanyadorJ2 == 17) {
            2
        } else 0
    }

    fun tornsDeTot() {
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
        val faseAtacar = FaseAtac()
        var switchFaseAtac = true
        textoFlama("Fase 3: Atacar! que soi epañoleh!")
        var tornsparells = 2
        var decisio: Int
        var actualguanyador = Jugador0
        while (switchFaseAtac) {
            decisio = guanyador(mapa)
            if (decisio == 1) {
                switchFaseAtac = false
                actualguanyador = Jugador1

            } else if (decisio == 2) {
                switchFaseAtac = false
                actualguanyador = Jugador2
            }

            if (tornsparells % 2 == 0) {
                //Torn del  jugador 1 a atacar
                println(mapa.asciimapMain)
                println("\nTorn de " + Jugador1.color + Jugador1.nom + Colors.ANSI_RESET)
                println("Vols atacar o traspassar soldats? 1 - Atacar, 2 - Traspassar: \n")
                val eleccio = readln().toIntOrNull() ?: 1
                if (eleccio == 1) {
                    println("Provincia atacant:\n")
                    mapa.provincies.forEachIndexed { index, provincia ->
                        if (provincia.propietari == Jugador1) {
                            println("$index - ${provincia.nom}")
                        }
                    }
                    val provinciaAtacJ1 = readln()

                    println("Ara una provincia que vulguis atacar:\n")
                    mapa.provincies.forEachIndexed { index, provincia ->
                        if (provincia.propietari == Jugador2) {
                            println("$index - ${provincia.nom}")
                        }
                    }
                    val provinciaAAtacarJ1 = readln()
                    faseAtacar.decidimGuanyador(provinciaAtacJ1, provinciaAAtacarJ1, mapa)
                    tornsparells += 1
                }else if (eleccio == 2){
                    faseAtacar.volstraspassarSoldats(Jugador1, mapa)
                    tornsparells += 1
                }
            } else {
                //Torn del jugador 2 de atacar

                println(mapa.asciimapMain)
                println("\nTorn de " + Jugador2.color + Jugador2.nom + Colors.ANSI_RESET)
                println("Vols atacar o traspassar soldats? 1 - Atacar, 2 - Traspassar: \n")
                val eleccio = readln().toIntOrNull() ?: 1
                if (eleccio == 1) {
                    println("Provincia atacant:\n")

                    mapa.provincies.forEachIndexed { index, provincia ->
                        if (provincia.propietari == Jugador2) {
                            println("$index - ${provincia.nom}")
                        }
                    }
                    val provinciaAtacJ2 = readln()

                    println("Ara una provincia que vulguis atacar:\n")
                    mapa.provincies.forEachIndexed { index, provincia ->
                        if (provincia.propietari == Jugador1) {
                            println("$index - ${provincia.nom}")
                        }
                    }
                    val provinciaAtacadaJ2 = readln()
                    faseAtacar.decidimGuanyador(provinciaAtacJ2, provinciaAtacadaJ2, mapa)
                    tornsparells += 1
                }else if (eleccio == 2){
                    faseAtacar.volstraspassarSoldats(Jugador2, mapa)
                    tornsparells += 1
                }
            }
        }
        println("Ha guanyat: " + actualguanyador.color + actualguanyador.nom + Colors.ANSI_RESET + ". Facilitats!!!")
    }
}