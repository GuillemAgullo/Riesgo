import riesgo.CONTROLLER.Jugador
import riesgo.VIEW.Mapa

//Aquest arxiu és el main i és des d'on cridaré totes les clases de l'inici del joc fins que s'acabi

fun FaseExploracioTorns(Provinciaescollida: String){
    val Mapa = Mapa()
    if (Provinciaescollida == "cataluña"){
       ++Mapa.Cat.numSoldats
    } else if (Provinciaescollida == "galicia"){
        ++Mapa.Gal.numSoldats
    } else if (Provinciaescollida == "Asturias"){
        ++Mapa.Ast.numSoldats
    } else if (Provinciaescollida == "cantabria"){
        ++Mapa.Cnt.numSoldats
    }else if (Provinciaescollida == "euskal herria"){
        ++Mapa.Euk.numSoldats
    }else if (Provinciaescollida == "navarra"){
        ++Mapa.Nvr.numSoldats
    }else if (Provinciaescollida == "la rioja"){
        ++Mapa.Lrj.numSoldats
    }else if (Provinciaescollida == "Zaragoza"){
        ++Mapa.Zrg.numSoldats
    }else if (Provinciaescollida == "castilla leon") {
        ++Mapa.CsL.numSoldats
    }else if (Provinciaescollida == "castlla la mancha") {
        ++Mapa.CsM.numSoldats
    }else if (Provinciaescollida == "madrid"){
        ++Mapa.Mdz.numSoldats
    }else if (Provinciaescollida == "valencia"){
        ++Mapa.Vln.numSoldats
    }else if (Provinciaescollida == "extremadura"){
        ++Mapa.Ext.numSoldats
    }else if (Provinciaescollida == "murcia"){
        ++Mapa.Mur.numSoldats
    }else if (Provinciaescollida == "andalucia"){
        ++Mapa.And.numSoldats
    }else if (Provinciaescollida == "islas baleares"){
        ++Mapa.Ibl.numSoldats
    }else if (Provinciaescollida == "islas canarias"){
        ++Mapa.Ica.numSoldats
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
        val Jugador1 = Jugador()
        println("Nom del jugador 1: ")
        Jugador1.nom = readLine()?:"Unnamed1"
        println("Color del jugador 1: ")
        println("LLEGENDA DE COLORS:")
        println("1-vermell, 2-verde que te quiero verde, 3-blau, 4-groc, 5-rosa que l'amor s'hi posa")
        Jugador1.color = readLine()?.toIntOrNull()?:1
        Jugador1.numSoldats = 30

        //FEM LO MATEIX PERÒ PEL JUGADOR 2
        val Jugador2 = Jugador()
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

        val Mapadeljoc = Mapa()
        print(Mapadeljoc.asciimap)

        println("Torn del jugador 1:\n Quina província vols explorar?")
        FaseExploracioTorns(readln())


        print("\u001b[2J")

    }


}