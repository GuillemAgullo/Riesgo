import riesgo.CONTROLLER.Jugador
import riesgo.VIEW.Mapa

//Aquest arxiu és el main i és des d'on cridaré totes les clases de l'inici del joc fins que s'acabi
//PRIMER CREEM LES VARIABLES PER ALS DOS JUGADORS
val Jugador1 = Jugador()
val Jugador2 = Jugador()

//FUNCIÓ PER DEFINIR ELS TORNS DE LA FASE D'EXPLORACIÓ: SI ESCRIUS EL NOM D'UNA PROVÍNCIA, S'AFEGEIX UN SOLDAT A UNA PROVÍNCIA


fun main() {
    val fideljoc = true
    val Mapa = Mapa()


    while (fideljoc == true){
        print("\u001b[2J")


            println("\n==========================================================================================")
            println("=============BENVINGUT A \"RIESGO\", EL RISK IBÈRIC=========================================")
            println("==========================================================================================")
            println("=============MENÚ DEL JOC=================================================================")
            println("==========================================================================================")

        //CREEM UNA INSTÀNCIA DE LA CLASSE JUGADOR I LI DEMANEM AL USUARI QUE INTRODUEIXI EL NOM I EL COLOR AMB EL QUE VULGUI SER REPRESENTAT.

        println("Nom del jugador 1: ")
        Jugador1.nom = readLine()?:"Unnamed1"
        println("Color del jugador 1: ")
        println("LLEGENDA DE COLORS:")
        println("1-vermell, 2-verde que te quiero verde, 3-blau, 4-groc, 5-rosa que l'amor s'hi posa")
        Jugador1.color = readLine()?.toIntOrNull()?:1
        Jugador1.numSoldats = 30

        //FEM LO MATEIX PERÒ PEL JUGADOR 2

        println("Nom del jugador 2: ")
        Jugador2.nom = readLine()?:"Unnamed2"
        println("Color del jugador 2: ")
        println("LLEGENDA DE COLORS:")
        println("1-vermell, 2-verde que te quiero verde, 3-blau, 4-groc, 5-rosa que l'amor s'hi posa")
        Jugador2.color = readLine()?.toIntOrNull()?:2
        Jugador2.numSoldats = 30


        print("\u001b[2J")

        print("\n")

        //FEM UN BUCLE FOR PER QUE FAGI UN EFECTE DE QUE S'ESCRIGUI "FASE 1: EXPLORACIÓ" UTILITZANT EL THREAD SLEEP
        val saludos:String = "Fase 1: Exploració\n"
        for (i in saludos) {
            print("$i")
            Thread.sleep(250)
        }
        println("En aquesta fase, haureu de posar un soldat a cada província per torns.\n")

        Thread.sleep(3000)
        println(Mapa.asciimapMain)
        while (true){

            println("\nTorn de ${Jugador1.nom}")
            println("\nQuina província vols explorar?(Recorda que has d'escriure el nom just com està al mapa)")
            val MapaupdatedJ1 = Mapa.FaseExploracioTorns(Jugador1, readln(), Jugador1.color!!)
            print(MapaupdatedJ1)
            print("\n")

            println("\nTorn de ${Jugador2.nom}")
            println("\nQuina província vols explorar?(Recorda que has d'escriure el nom just com està al mapa)")
            val MapaupdatedJ2 = Mapa.FaseExploracioTorns(Jugador2, readln(), Jugador2.color!!)
            print(MapaupdatedJ2)
            print("\n")
        }


    }
}




