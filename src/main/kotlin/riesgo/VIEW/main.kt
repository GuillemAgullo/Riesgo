import riesgo.CONTROLLER.Jugador
import riesgo.VIEW.Mapa

//Aquest arxiu és el main i és des d'on cridaré totes les clases de l'inici del joc fins que s'acabi
//PRIMER CREEM LES VARIABLES GLOBALS PER ALS DOS JUGADORS
val Jugador1 = Jugador()
val Jugador2 = Jugador()

//FEM UNA FUNCIÓ PER A FER UN DIVERTIT I ENTRETINGUT EFECTE QUE ESCRIU UNA FRASE DONADA, PROGRESSIVAMENT.
fun TextGuai(Frase: String){
    print("\n")
    for (i in Frase){
        print("$i")
        Thread.sleep(250)
    }
    print("\n")
}
fun main() {
    val fideljoc = true
    val Mapa = Mapa()

    //FEM UN BUCLE WHILE QUE SERÀ L'EXECUCIÓ DEL JOC EN SI.
    while (fideljoc == true){
        print("\u001b[2J")

//PRESENTEM EL JOC D'UNA MANERA AMENA I AGRADABLE A LA VISTA
            println("\n==========================================================================================")
            println("=============BENVINGUT A \"RIESGO\", EL RISK IBÈRIC=========================================")
            println("==========================================================================================")
            println("=============MENÚ DEL JOC=================================================================")
            println("==========================================================================================")


        //DEMANEM LES CREDENCIALS ALS JUGADORS. (NOM I COLOR)
        println("Nom del jugador 1: ")
        Jugador1.nom = readLine()?:"Unnamed1"
        println("Color del jugador 1: ")
        println("LLEGENDA DE COLORS:")
        println("1-vermell, 2-verde que te quiero verde, 3-blau, 4-groc, 5-rosa que l'amor s'hi posa")
        Jugador1.color = readLine()?.toIntOrNull()?:1
        Jugador1.numSoldats = 30


        println("Nom del jugador 2: ")
        Jugador2.nom = readLine()?:"Unnamed2"
        println("Color del jugador 2: ")
        println("LLEGENDA DE COLORS:")
        println("1-vermell, 2-verde que te quiero verde, 3-blau, 4-groc, 5-rosa que l'amor s'hi posa")
        Jugador2.color = readLine()?.toIntOrNull()?:2
        Jugador2.numSoldats = 30


        print("\u001b[2J")

        print("\n")

        //INICIEM LA FASE D'EXPLORACIÓ (1)
        TextGuai("Fase 1: Exploració")
        println("En aquesta fase, haureu de posar un soldat a cada província per torns.\n")
        Thread.sleep(3000)

        println(Mapa.asciimapMain)
        //FEM UN BUCLE WHILE QUE DETERMINARÀ ELS TORNS DELS JUGADORS EN LA FASE D'EXPLORACIÓ
        var switchTornsExploracio = true
        //EN AQUEST BUCLE CRIDEM A LA FUNCIÓ FASEEXPLORACIO DE MAPA() PER FER ELS TORNS I ANEM CONSTANTMENT INDICANT
        //ALS USUARIS DE QUÍ ÉS EL TORN I QUANS SOLDATS TÉ CADASCÚ
        while (switchTornsExploracio){

            println("\nTorn de ${Jugador1.nom}. Exèrcit:${Jugador1.numSoldats}")
            println("\nQuina província vols explorar?(Recorda que has d'escriure el nom just com està al mapa)")
            val MapaupdatedJ1 = Mapa.FaseExploracioTorns(Jugador1, readln())
            print(MapaupdatedJ1)
            print("\n")

            println("\nTorn de ${Jugador2.nom}. Exèrcit:${Jugador2.numSoldats}")
            println("\nQuina província vols explorar?(Recorda que has d'escriure el nom just com està al mapa)")
            val MapaupdatedJ2 = Mapa.FaseExploracioTorns(Jugador2, readln())
            print(MapaupdatedJ2)
            print("\n")
            //QUAN LA FUNCIÓ FASEEXPLORACIÓ ENS RETORNA LA FRASE: FASE D'EXPLORACIÓ ACABADA, S'ACABA EL BUCLE.
            if (MapaupdatedJ1 == "Fase d'exploració acabada." || MapaupdatedJ2 == "Fase d'exploració acabada."){
                Thread.sleep(4000)
                switchTornsExploracio = false
            }
        }
        //INDIQUEM QUE INICIEM LA FASE 2: COLONITZACIÓ
        TextGuai("Fase 2: Colonització")
        print("\n En aquesta fase, colocareu els soldats restants en les províncies més convenients.\n")



    }
}




