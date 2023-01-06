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
    if (Provinciaescollida == "cataluña"){
       ++Mapa.Cat.numSoldats
        Mapa.Cat.propietari = Jugadorquelitoca
        Mapa.Cat.color = Jugadorquelitoca.color
    } else if (Provinciaescollida == "galicia"){
        ++Mapa.Gal.numSoldats
        Mapa.Gal.propietari = Jugadorquelitoca
        Mapa.Gal.color = Jugadorquelitoca.color
    } else if (Provinciaescollida == "Asturias"){
        ++Mapa.Ast.numSoldats
        Mapa.Ast.propietari = Jugadorquelitoca
        Mapa.Ast.color = Jugadorquelitoca.color
    } else if (Provinciaescollida == "cantabria"){
        ++Mapa.Cnt.numSoldats
        Mapa.Cnt.propietari = Jugadorquelitoca
        Mapa.Cnt.color = Jugadorquelitoca.color
    }else if (Provinciaescollida == "euskal herria"){
        ++Mapa.Euk.numSoldats
        Mapa.Euk.propietari = Jugadorquelitoca
        Mapa.Euk.color = Jugadorquelitoca.color
    }else if (Provinciaescollida == "navarra"){
        ++Mapa.Nvr.numSoldats
        Mapa.Nvr.propietari = Jugadorquelitoca
        Mapa.Nvr.color = Jugadorquelitoca.color
    }else if (Provinciaescollida == "la rioja"){
        ++Mapa.Lrj.numSoldats
        Mapa.Lrj.propietari = Jugadorquelitoca
        Mapa.Lrj.color = Jugadorquelitoca.color
    }else if (Provinciaescollida == "Zaragoza"){
        ++Mapa.Zrg.numSoldats
        Mapa.Zrg.propietari = Jugadorquelitoca
        Mapa.Zrg.color = Jugadorquelitoca.color
    }else if (Provinciaescollida == "castilla leon") {
        ++Mapa.CsL.numSoldats
        Mapa.CsL.propietari = Jugadorquelitoca
        Mapa.CsL.color = Jugadorquelitoca.color
    }else if (Provinciaescollida == "castlla la mancha") {
        ++Mapa.CsM.numSoldats
        Mapa.CsM.propietari = Jugadorquelitoca
        Mapa.CsM.color = Jugadorquelitoca.color
    }else if (Provinciaescollida == "madrid"){
        ++Mapa.Mdz.numSoldats
        Mapa.Mdz.propietari = Jugadorquelitoca
        Mapa.Mdz.color = Jugadorquelitoca.color
    }else if (Provinciaescollida == "valencia"){
        ++Mapa.Vln.numSoldats
        Mapa.Vln.propietari = Jugadorquelitoca
        Mapa.Vln.color = Jugadorquelitoca.color
    }else if (Provinciaescollida == "extremadura"){
        ++Mapa.Ext.numSoldats
        Mapa.Ext.propietari = Jugadorquelitoca
        Mapa.Ext.color = Jugadorquelitoca.color
    }else if (Provinciaescollida == "murcia"){
        ++Mapa.Mur.numSoldats
        Mapa.Mur.propietari = Jugadorquelitoca
        Mapa.Mur.color = Jugadorquelitoca.color
    }else if (Provinciaescollida == "andalucia"){
        ++Mapa.And.numSoldats
        Mapa.And.propietari = Jugadorquelitoca
        Mapa.And.color = Jugadorquelitoca.color
    }else if (Provinciaescollida == "islas baleares"){
        ++Mapa.Ibl.numSoldats
        Mapa.Ibl.propietari = Jugadorquelitoca
        Mapa.Ibl.color = Jugadorquelitoca.color
    }else if (Provinciaescollida == "islas canarias"){
        ++Mapa.Ica.numSoldats
        Mapa.Ica.propietari = Jugadorquelitoca
        Mapa.Ica.color = Jugadorquelitoca.color
    }

    if (Mapa.Cat.numSoldats > 1){
        Mapa.Cat.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Gal.numSoldats > 1){
        Mapa.Gal.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Ast.numSoldats > 1){
        Mapa.Ast.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Cnt.numSoldats > 1){
        Mapa.Cnt.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Euk.numSoldats > 1){
        Mapa.Euk.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Nvr.numSoldats > 1){
        Mapa.Nvr.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Lrj.numSoldats > 1){
        Mapa.Lrj.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Zrg.numSoldats > 1){
        Mapa.Zrg.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.CsL.numSoldats > 1){
        Mapa.CsL.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.CsM.numSoldats > 1){
        Mapa.CsM.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Mdz.numSoldats > 1){
        Mapa.Mdz.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Vln.numSoldats > 1){
        Mapa.Vln.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Ext.numSoldats > 1){
        Mapa.Ext.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Mur.numSoldats > 1){
        Mapa.Mur.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.And.numSoldats > 1){
        Mapa.And.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Ibl.numSoldats > 1){
        Mapa.Ibl.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }else if (Mapa.Ica.numSoldats > 1){
        Mapa.Ica.numSoldats = 1
        print("En la fase d'exploració només pots posar un soldat per zona")
    }
}

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
        println("Per reclamar un territori, haureu d'escriure")
        Thread.sleep(3000)

        val Mapadeljoc = Mapa()
        print(Mapadeljoc.asciimap)

        while (true){
            println("\nTorn de ${Jugador1.nom} :\n Quina província vols explorar?\n")
            FaseExploracioTorns(Jugador1, readln())
            print(Mapadeljoc.asciimap)
            println("\nTorn de ${Jugador2.nom} :\n Quina província vols explorar?\n")
            FaseExploracioTorns(Jugador2, readln())
            print(Mapadeljoc.asciimap)
        }


        print("\u001b[2J")

    }


}