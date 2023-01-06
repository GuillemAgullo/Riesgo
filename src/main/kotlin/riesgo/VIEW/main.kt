import riesgo.CONTROLLER.Jugador
import riesgo.MODEL.Provincia
import riesgo.VIEW.Mapa

//Aquest arxiu és el main i és des d'on cridaré totes les clases de l'inici del joc fins que s'acabi
//PRIMER CREEM LES VARIABLES PER ALS DOS JUGADORS
val Jugador1 = Jugador()
val Jugador2 = Jugador()

//FUNCIÓ PER DEFINIR ELS TORNS DE LA FASE D'EXPLORACIÓ: SI ESCRIUS EL NOM D'UNA PROVÍNCIA, S'AFEGEIX UN SOLDAT A UNA PROVÍNCIA
fun FaseExploracioTorns(Jugadorquelitoca: Jugador, Provinciaescollida: String){
    val Mapa = Mapa()

    val Madrid = Mapa.provincies.find { it.nom == "Madrid" }
    val Catalunya = Mapa.provincies.find { it.nom == "Catalunya" }
    val Zaragoza = Mapa.provincies.find { it.nom == "Zaragoza" }
    val Euskal_Herria = Mapa.provincies.find { it.nom == "Euskal_Herria" }
    val Navarra = Mapa.provincies.find { it.nom == "Navarra" }
    val La_Rioja = Mapa.provincies.find { it.nom == "La_Rioja" }
    val Cantabria = Mapa.provincies.find { it.nom == "Cantábria" }
    val Asturias = Mapa.provincies.find { it.nom == "Astúrias" }
    val Galicia = Mapa.provincies.find { it.nom == "Galícia" }
    val Castilla_Leon = Mapa.provincies.find { it.nom == "Castilla_León" }
    val Valencia = Mapa.provincies.find { it.nom == "València" }
    val Castilla_la_mancha = Mapa.provincies.find { it.nom == "Castilla_la_mancha" }
    val Extremadura = Mapa.provincies.find { it.nom == "Extremadura" }
    val Murcia = Mapa.provincies.find { it.nom == "Múrcia" }
    val Andalucia = Mapa.provincies.find { it.nom == "Andalucía" }
    val Islas_Canarias = Mapa.provincies.find { it.nom == "Islas_Canarias" }
    val Ses_illes_balears = Mapa.provincies.find { it.nom == "Ses_illes_balears" }
    if (Provinciaescollida == "CATALUNYA"){
        Catalunya?.numSoldats = Catalunya?.numSoldats?.plus(1)!!
        Catalunya.propietari = Jugadorquelitoca
        Catalunya.color = Jugadorquelitoca.color
    } else if (Provinciaescollida == "GALÍCIA"){
        Mapa.Galicia?.numSoldats = Mapa.Galicia?.numSoldats?.plus(1)!!
        Mapa.Galicia.propietari = Jugadorquelitoca
        Mapa.Galicia.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    } else if (Provinciaescollida == "ASTÚRIAS"){
        Mapa.Asturias?.numSoldats = Mapa.Asturias?.numSoldats?.plus(1)!!
        Mapa.Asturias.propietari = Jugadorquelitoca
        Mapa.Asturias.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    } else if (Provinciaescollida == "CANTÁBRIA"){
        Mapa.Cantabria?.numSoldats = Mapa.Cantabria?.numSoldats?.plus(1)!!
        Mapa.Cantabria.propietari = Jugadorquelitoca
        Mapa.Cantabria.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    }else if (Provinciaescollida == "EUSKAL HERRIA"){
        Mapa.Euskal_Herria?.numSoldats = Mapa.Euskal_Herria?.numSoldats?.plus(1)!!
        Mapa.Euskal_Herria.propietari = Jugadorquelitoca
        Mapa.Euskal_Herria.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    }else if (Provinciaescollida == "NAVARRA"){
        Mapa.Euskal_Herria?.numSoldats = Mapa.Euskal_Herria?.numSoldats?.plus(1)!!
        Mapa.Euskal_Herria.propietari = Jugadorquelitoca
        Mapa.Euskal_Herria.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    }else if (Provinciaescollida == "LA RIOJA"){
        Mapa.La_Rioja?.numSoldats = Mapa.La_Rioja?.numSoldats?.plus(1)!!
        Mapa.La_Rioja.propietari = Jugadorquelitoca
        Mapa.La_Rioja.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    }else if (Provinciaescollida == "ZARAGOZA"){
        Mapa.Zaragoza?.numSoldats = Mapa.Zaragoza?.numSoldats?.plus(1)!!
        Mapa.Zaragoza.propietari = Jugadorquelitoca
        Mapa.Zaragoza.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    }else if (Provinciaescollida == "CASTILLA LEÓN") {
        Mapa.Castilla_Leon?.numSoldats = Mapa.Castilla_Leon?.numSoldats?.plus(1)!!
        Mapa.Castilla_Leon.propietari = Jugadorquelitoca
        Mapa.Castilla_Leon.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    }else if (Provinciaescollida == "CASTILLA LA MANCHA") {
        Mapa.Castilla_la_mancha?.numSoldats = Mapa.Castilla_la_mancha?.numSoldats?.plus(1)!!
        Mapa.Castilla_la_mancha.propietari = Jugadorquelitoca
        Mapa.Castilla_la_mancha.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    }else if (Provinciaescollida == "MADRIZ"){
        Mapa.Madrid?.numSoldats = Mapa.Madrid?.numSoldats?.plus(1)!!
        Mapa.Madrid.propietari = Jugadorquelitoca
        Mapa.Madrid.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    }else if (Provinciaescollida == "VALÈNCIA"){
        Mapa.Valencia?.numSoldats = Mapa.Valencia?.numSoldats?.plus(1)!!
        Mapa.Valencia.propietari = Jugadorquelitoca
        Mapa.Valencia.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    }else if (Provinciaescollida == "EXTREMADURA"){
        Mapa.Extremadura?.numSoldats = Mapa.Extremadura?.numSoldats?.plus(1)!!
        Mapa.Extremadura.propietari = Jugadorquelitoca
        Mapa.Extremadura.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    }else if (Provinciaescollida == "MÚRCIA"){
        Mapa.Murcia?.numSoldats = Mapa.Murcia?.numSoldats?.plus(1)!!
        Mapa.Murcia.propietari = Jugadorquelitoca
        Mapa.Murcia.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    }else if (Provinciaescollida == "ANDALUCÍA"){
        Mapa.Andalucia?.numSoldats = Mapa.Andalucia?.numSoldats?.plus(1)!!
        Mapa.Andalucia.propietari = Jugadorquelitoca
        Mapa.Andalucia.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    }else if (Provinciaescollida == "SES ILLES BALEARS"){
        Mapa.Ses_illes_balears?.numSoldats = Mapa.Ses_illes_balears?.numSoldats?.plus(1)!!
        Mapa.Ses_illes_balears.propietari = Jugadorquelitoca
        Mapa.Ses_illes_balears.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    }else if (Provinciaescollida == "ISLAS CANÁRIAS"){
        Mapa.Islas_Canarias?.numSoldats = Mapa.Islas_Canarias?.numSoldats?.plus(1)!!
        Mapa.Islas_Canarias.propietari = Jugadorquelitoca
        Mapa.Islas_Canarias.color = Jugadorquelitoca.color
        print(Mapa.asciimap)
    }

    if (Mapa.Catalunya!!.numSoldats > 1){
        Mapa.Catalunya.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Galicia!!.numSoldats > 1){
        Mapa.Galicia.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Asturias!!.numSoldats > 1){
        Mapa.Asturias.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Cantabria!!.numSoldats > 1){
        Mapa.Cantabria.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Euskal_Herria!!.numSoldats > 1){
        Mapa.Euskal_Herria.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Navarra!!.numSoldats > 1){
        Mapa.Navarra.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.La_Rioja!!.numSoldats > 1){
        Mapa.La_Rioja.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Zaragoza!!.numSoldats > 1){
        Mapa.Zaragoza.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Castilla_Leon!!.numSoldats > 1){
        Mapa.Castilla_Leon.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Castilla_la_mancha!!.numSoldats > 1){
        Mapa.Castilla_la_mancha.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Madrid!!.numSoldats > 1){
        Mapa.Madrid.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Valencia!!.numSoldats > 1){
        Mapa.Valencia.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Extremadura!!.numSoldats > 1){
        Mapa.Extremadura.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Murcia!!.numSoldats > 1){
        Mapa.Murcia.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Andalucia!!.numSoldats > 1){
        Mapa.Andalucia.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Ses_illes_balears!!.numSoldats > 1){
        Mapa.Ses_illes_balears.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Islas_Canarias!!.numSoldats > 1){
        Mapa.Islas_Canarias.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }

}

fun main() {
    val fideljoc = true
    val mapa = Mapa()

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
        println("Per reclamar un territori, haureu d'escriure el nom de la província tal i com està escrit al mapa.\n")
        Thread.sleep(6000)

        val Mapadeljoc = Mapa()
        print(Mapadeljoc.asciimap)

        while (true){
            println("\nTorn de ${Jugador1.nom} :\n Quina província vols explorar?\n")
            FaseExploracioTorns(Jugador1, readln())
            print(Mapadeljoc.asciimap)
            println("\nTorn de ${Jugador2.nom} :\n Quina província vols explorar?\n")
            FaseExploracioTorns(Jugador2, readln())
        }
    }
}