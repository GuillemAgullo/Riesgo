package riesgo.view

import riesgo.Colors
import riesgo.model.Jugador
import riesgo.model.Provincia

class Mapa {
    //DINTRE DE LA CLASSE MAPA I DE LA VARIABLE PROVINCIES(QUE ES DE "MAPA"), INTRODUÏM TOTES LES PROVÍNCIES QUE TINGUI EL TERRENY UTILITZANT LA CLASSE PROVÍNCIA
    val provincies: List<Provincia> = listOf(
            Provincia("Madrid"),
            Provincia("Catalunya"),
            Provincia("Zaragoza"),
            Provincia("Euskal_Herria"),
            Provincia("Navarra"),
            Provincia("La_Rioja"),
            Provincia("Cantábria"),
            Provincia("Astúrias"),
            Provincia("Galícia"),
            Provincia("Castilla_León"),
            Provincia("València"),
            Provincia("Castilla_la_mancha"),
            Provincia("Extremadura"),
            Provincia("Múrcia"),
            Provincia("Andalucía"),
            Provincia("Islas_Canarias"),
            Provincia("Ses_illes_balears")
    )


     val madrid = provincies.find { it.nom == "Madrid" } ?: throw IllegalStateException("provincia no trobada")
     val catalunya = provincies.find { it.nom == "Catalunya" } ?: throw IllegalStateException("provincia no trobada")
     val zaragoza = provincies.find { it.nom == "Zaragoza" } ?: throw IllegalStateException("provincia no trobada")
     val euskalHerria = provincies.find { it.nom == "Euskal_Herria" } ?: throw IllegalStateException("provincia no trobada")
     val navarra = provincies.find { it.nom == "Navarra" } ?: throw IllegalStateException("provincia no trobada")
     val laRioja = provincies.find { it.nom == "La_Rioja" } ?: throw IllegalStateException("provincia no trobada")
     val cantabria = provincies.find { it.nom == "Cantábria" } ?: throw IllegalStateException("provincia no trobada")
     val asturias = provincies.find { it.nom == "Astúrias" } ?: throw IllegalStateException("provincia no trobada")
     val galicia = provincies.find { it.nom == "Galícia" } ?: throw IllegalStateException("provincia no trobada")
     val castillaLeon = provincies.find { it.nom == "Castilla_León" } ?: throw IllegalStateException("provincia no trobada")
     val valencia = provincies.find { it.nom == "València" } ?: throw IllegalStateException("provincia no trobada")
     val castillaLaMancha = provincies.find { it.nom == "Castilla_la_mancha" } ?: throw IllegalStateException("provincia no trobada")
     val extremadura = provincies.find { it.nom == "Extremadura" } ?: throw IllegalStateException("provincia no trobada")
     val murcia = provincies.find { it.nom == "Múrcia" } ?: throw IllegalStateException("provincia no trobada")
     val andalucia = provincies.find { it.nom == "Andalucía" } ?: throw IllegalStateException("provincia no trobada")
     val islasCanarias = provincies.find { it.nom == "Islas_Canarias" } ?: throw IllegalStateException("provincia no trobada")
     val sesIllesBalears = provincies.find { it.nom == "Ses_illes_balears" } ?: throw IllegalStateException("provincia no trobada")


    //IMPRIMIM EL MAPA PER PRIMERA VEGADA AMB ELS SOLDATS (QUE TOTS SÓN 0).
    val asciimapMain: String
        get() = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,|.....ASTÚRIAS....%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%,,,,,,,,,,,,,,,,,,,,|......"+ asturias.propietari.color + asturias.numSoldats + Colors.ANSI_RESET + "..................|.,CANTÁBRIA,,,,).....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,\\_________________.......|,,,"+ cantabria.propietari.color + cantabria.numSoldats + Colors.ANSI_RESET + ",,,,,_____|...........|,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,|.................-------|-(,,,,,,)...EUSKAL HERRIA /.....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&,,,,,,GALÍCIA,,,,,,,,,,|..........................(____)......"+ euskalHerria.propietari.color + euskalHerria.numSoldats + Colors.ANSI_RESET + "..........|,,,NAVARRA,,,,|..@@@@@@@@@@@@@@..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,,,,,,"+ galicia.propietari.color + galicia.numSoldats + Colors.ANSI_RESET + ",,,,,,,,,,,,/..................................\\______..........|,,,,"+ navarra.propietari.color + navarra.numSoldats + Colors.ANSI_RESET + ",,,,,,,/.........@...@...|........@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/,@,,,,,,,,,,,,,,,,,,|.........................................|________/___________/....................|........@@@..@@@@@@@@@#....@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,\\........................................|....LA RIOJA......../.....................\\...........................@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,@@,,,,,,,,,,,,,/........................................\\...."+ laRioja.propietari.color + laRioja.numSoldats + Colors.ANSI_RESET + "............../.......................|...........................@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,@@@@@@@,,,,,,,,,,,,,|............................................\\_./\\___/\\_____/........................|...........................@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@........CASTILLA LEÓN................................./......................../..........................@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,.........."+ castillaLeon.propietari.color + castillaLeon.numSoldats + Colors.ANSI_RESET + "......................................./........................./.......CATALUNYA.......@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@...............................................|.......ZARAGOZA.........../..........."+ catalunya.propietari.color + catalunya.numSoldats + Colors.ANSI_RESET + "........@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.................................________________|........."+ zaragoza.propietari.color + zaragoza.numSoldats + Colors.ANSI_RESET + ".................\\.................,oo@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.................................../\\................\\........................,/...........@@@@@@@@@@oo@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.................................../,,,|.................\\......................./.......@@@@@@@@@@@@@@@@@oo@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@................................/,,,,,\\..................\\......................|.....@@@@@@@@@@@@@@@@@@@@@oooooo@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@............................../,,,,,,,,\\...................\\...............____|.......@@@@@@@@@@@@@@@@@@@@@@@@@@ooooooo@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@............................/,,MADRIZ,,,\\...................\\............/,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@--------______............/....."+ madrid.propietari.color + madrid.numSoldats + Colors.ANSI_RESET + "........\\..................|............|,,,,,,,,@@@@@@@@@@@@@@@@ SES ILLES BALEARS @@@@o@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,%|__________-----______,,,,,,\\..................\\......../,,,,,,,.,@@@@@@@@@@@@@@@@@@@@@@@ "+ sesIllesBalears.propietari.color + sesIllesBalears.numSoldats + Colors.ANSI_RESET + " @@@@@@@@@@@@@@@..../@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,|....................----___\\.................|__,.../,,,,,,,,.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.@@@@@@@@@@@@(.\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,|_.............................................|____|,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@......#&.@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,|...........................................|,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/...........@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,|___....................................../,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.....%@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(,,,,,,,,,,,,,,,,,,,,,,,,,,,,|,...........CASTILLA LA MANCHA.......\\,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,EXTREMADURA,,,,,,,,,,|,................."+ castillaLaMancha.propietari.color + castillaLaMancha.numSoldats + Colors.ANSI_RESET + ".....................\\,VALÈNCIA,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,"+ extremadura.propietari.color + extremadura.numSoldats + Colors.ANSI_RESET + ",,,,,,,,,,,,,,,,,|........................................../,,,,,,"+ valencia.propietari.color + valencia.numSoldats + Colors.ANSI_RESET + ",,,@@@@@@@@@@@oooooo...@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,|...........................................\\,,,,,,,,,,,@@@@@ooo@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,,,,,,,,,,,,,,,,,,,,,,,,,,|............................................/,,,,,,,,,,,,,,ooo@@@@@@@@@@@.@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\___________.._____________..................\\,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,/,,,.......\\/,,.,,,,,,,,,,\\.............___/,,,,,,,/@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%,,,,,,,,,,,,,,,,_______/,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\..,.......\\....\\,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-------------____/,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,-----------___\\...|,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,|_____..............\\,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\....MÚRCIA....,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\..."+ murcia.propietari.color + murcia.numSoldats + Colors.ANSI_RESET + "......@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,ANDALUCÍA,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,"+ andalucia.propietari.color + andalucia.numSoldats + Colors.ANSI_RESET + ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@#,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@ ISLAS CANÁRIAS @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o@@@/,,,,,,,,,,,,,,,,,,,#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@ "+ islasCanarias.propietari.color + islasCanarias.numSoldats + Colors.ANSI_RESET + " @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o@@@@@,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@oo@@@@@@@,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@oo@@@@@@@@@@@@@&,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,ooo@@@@@@@@@@@@@@@@@@@,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@,@@@@@@@@@@@@@@@@@@,,*@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@,,,@@@@,,,,,@@@@@@@@@@(@@@@@@@@@@@@@@@@@,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"

    private fun exploraProvincia(provincia: Provincia, jugador: Jugador) {
        if (provincia.numSoldats == 0 && provincia.propietari == Jugador0) {
            provincia.numSoldats += 1
            jugador.numSoldats -= 1
            provincia.propietari = jugador
            provincia.color = jugador.color

        } else if (provincia.numSoldats > 1 && provincia.propietari == jugador) {
            println("Només pots tenir un soldat per província en la fase d'exploració.")
            provincia.numSoldats = 1
            Thread.sleep(4000)
        } else if (provincia.propietari != jugador && provincia.propietari != Jugador0) {
            println("Aquesta província no és teva campió.")
            Thread.sleep(4000)
        }

    }

    private fun colonitzaProvincia(provincia: Provincia, jugador: Jugador) {

        provincia.numSoldats += 1
        jugador.numSoldats -= 1
        if (provincia.propietari != jugador && provincia.propietari != Jugador0) {
            provincia.numSoldats -= 1
            jugador.numSoldats += 1
            print("Aquesta província no es de la  teva posessió.")
            Thread.sleep(4000)
        }

    }

    private fun checkSoldatsProvincia(): Int {
        var soldatsTotals = 0
        for (i in provincies) {
            soldatsTotals += i.numSoldats
        }
        return soldatsTotals
    }

    //AQUÍ CREARÉM LA FUNCIÓ DELS TORNS DE LA FASE D'EXPLORACIÓ.
    fun faseExploracio(jugador: Jugador, userInput: String): String {
        //SI LA PROVÍNCIA COINCIDEIX AMB ALGUNA DE LES VARIABLES DE DALT HI HA UNA SERIE DE NORMES QUE ES COMPLIRÁN

        val index = userInput.toIntOrNull()

        if (index == null) {
            println("Has de posar un número enter")
        }
        when (index) {
            0 -> exploraProvincia(madrid, jugador)
            1 -> exploraProvincia(catalunya, jugador)
            2 -> exploraProvincia(zaragoza, jugador)
            3 -> exploraProvincia(euskalHerria, jugador)
            4 -> exploraProvincia(navarra, jugador)
            5 -> exploraProvincia(laRioja, jugador)
            6 -> exploraProvincia(cantabria, jugador)
            7 -> exploraProvincia(asturias, jugador)
            8 -> exploraProvincia(galicia, jugador)
            9 -> exploraProvincia(castillaLeon, jugador)
            10 -> exploraProvincia(valencia, jugador)
            11 -> exploraProvincia(castillaLaMancha, jugador)
            12 -> exploraProvincia(extremadura, jugador)
            13 -> exploraProvincia(murcia, jugador)
            14 -> exploraProvincia(andalucia, jugador)
            15 -> exploraProvincia(islasCanarias, jugador)
            16 -> exploraProvincia(sesIllesBalears, jugador)
            //SI PROVÍNCIA NO COINCIDEIX AMB CAP VARIABLE, SURT UN MISSATGE QUE DIU QUE NO EXISTEIX LA PROVÍNCIA INSERTADA
            else -> {
                println("Aquesta província no existeix")
                Thread.sleep(4000)
            }
        }
        val soldatsTotalsExploracio = checkSoldatsProvincia()
        //SI TOTES LES PROVÍNCIES TENEN UN SOLDAT, S'EXECUTA AQUESTA FRASE QUE SERÀ ANALITZADA A MAIN I TANCARÀ EL BUCLE WHILE DELS TORNS DE LA FASE DEXPLORACIÓ DE MAIN
        if (soldatsTotalsExploracio >= 17) {
            return "Fase d'exploració acabada."

        }
        return asciimapMain
    }

    fun faseColonitzacio(jugador: Jugador, userInput: String): String {
        val index = userInput.toIntOrNull()

        if (index == null) {
            println("Has de posar un número enter")
        }
        when (index) {
            0 -> colonitzaProvincia(madrid, jugador)
            1 -> colonitzaProvincia(catalunya, jugador)
            2 -> colonitzaProvincia(zaragoza, jugador)
            3 -> colonitzaProvincia(euskalHerria, jugador)
            4 -> colonitzaProvincia(navarra, jugador)
            5 -> colonitzaProvincia(laRioja, jugador)
            6 -> colonitzaProvincia(cantabria, jugador)
            7 -> colonitzaProvincia(asturias, jugador)
            8 -> colonitzaProvincia(galicia, jugador)
            9 -> colonitzaProvincia(castillaLeon, jugador)
            10 -> colonitzaProvincia(valencia, jugador)
            11 -> colonitzaProvincia(castillaLaMancha, jugador)
            12 -> colonitzaProvincia(extremadura, jugador)
            13 -> colonitzaProvincia(murcia, jugador)
            14 -> colonitzaProvincia(andalucia, jugador)
            15 -> colonitzaProvincia(islasCanarias, jugador)
            16 -> colonitzaProvincia(sesIllesBalears, jugador)
            else -> {
                println("Aquesta província no existeix")
                Thread.sleep(4000)
            }
        }
        if (Jugador1.numSoldats <= 0 && Jugador2.numSoldats <= 0){
            return "Fase de colonització acabada."
        }

        return asciimapMain
    }

}

