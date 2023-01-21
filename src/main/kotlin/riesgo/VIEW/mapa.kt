package riesgo.VIEW

import riesgo.MODEL.Jugador
import riesgo.MODEL.Provincia
import java.lang.IllegalStateException

class mapa() {
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

    val Madrid = provincies.find { it.nom == "Madrid" } ?: throw IllegalStateException("provincia no trobada")
    val Catalunya = provincies.find { it.nom == "Catalunya" } ?: throw IllegalStateException("provincia no trobada")
    val Zaragoza = provincies.find { it.nom == "Zaragoza" } ?: throw IllegalStateException("provincia no trobada")
    val Euskal_Herria = provincies.find { it.nom == "Euskal_Herria" } ?: throw IllegalStateException("provincia no trobada")
    val Navarra = provincies.find { it.nom == "Navarra" } ?: throw IllegalStateException("provincia no trobada")
    val La_Rioja = provincies.find { it.nom == "La_Rioja" } ?: throw IllegalStateException("provincia no trobada")
    val Cantabria = provincies.find { it.nom == "Cantábria" } ?: throw IllegalStateException("provincia no trobada")
    val Asturias = provincies.find { it.nom == "Astúrias" } ?: throw IllegalStateException("provincia no trobada")
    val Galicia = provincies.find { it.nom == "Galícia" } ?: throw IllegalStateException("provincia no trobada")
    val Castilla_Leon = provincies.find { it.nom == "Castilla_León" } ?: throw IllegalStateException("provincia no trobada")
    val Valencia = provincies.find { it.nom == "València" } ?: throw IllegalStateException("provincia no trobada")
    val Castilla_la_mancha = provincies.find { it.nom == "Castilla_la_mancha" } ?: throw IllegalStateException("provincia no trobada")
    val Extremadura = provincies.find { it.nom == "Extremadura" } ?: throw IllegalStateException("provincia no trobada")
    val Murcia = provincies.find { it.nom == "Múrcia" } ?: throw IllegalStateException("provincia no trobada")
    val Andalucia = provincies.find { it.nom == "Andalucía" } ?: throw IllegalStateException("provincia no trobada")
    val Islas_Canarias = provincies.find { it.nom == "Islas_Canarias" } ?: throw IllegalStateException("provincia no trobada")
    val Ses_illes_balears = provincies.find { it.nom == "Ses_illes_balears" } ?: throw IllegalStateException("provincia no trobada")

    //SEGUIDAMENT, INICIEM UNA FUNCIÓ QUE ES DIGUI INITADJECENTS
    init {
        initAdjacents()
    }

    //DINTRE D'AQUESTA, CREEM VARIABLES QUE CONTINGUIN EL NOM DE LES COMUNITATS AUTONOMES DINTRE DE LA CLASSE PROVÍNCIES. AIXÒ HO FEM AMB LA FUNCIÓ FIND, QUE ITERA DINTRE DE PROVINCIES FINS QUE TROVA EL NOM INDICAT.
    private fun initAdjacents() {


//AQUÍ AFEGIM ELS VEÏNS:

        //DE MADRID
        Madrid.veins.add(Castilla_Leon)
        Madrid.veins.add(Castilla_la_mancha)
        //DE EXTREMADURA
        Extremadura.veins.add(Castilla_Leon)
        Extremadura.veins.add(Castilla_la_mancha)
        Extremadura.veins.add(Andalucia)
        //DE CATALUNYA
        Catalunya.veins.add(Zaragoza)
        Catalunya.veins.add(Valencia)
        Catalunya.veins.add(Ses_illes_balears)
        //DE GALÍCIA
        Galicia.veins.add(Asturias)
        Galicia.veins.add(Castilla_Leon)
        //DE CANTÁBRIA
        Cantabria.veins.add(Euskal_Herria)
        Cantabria.veins.add(Asturias)
        Cantabria.veins.add(Castilla_Leon)
        //DE EUSKAL HERRIA
        Euskal_Herria.veins.add(Cantabria)
        Euskal_Herria.veins.add(Navarra)
        Euskal_Herria.veins.add(La_Rioja)
        Euskal_Herria.veins.add(Castilla_Leon)
        //DE ZARAGOZA
        Zaragoza.veins.add(Catalunya)
        Zaragoza.veins.add(Navarra)
        Zaragoza.veins.add(La_Rioja)
        Zaragoza.veins.add(Valencia)
        Zaragoza.veins.add(Castilla_Leon)
        Zaragoza.veins.add(Castilla_la_mancha)
        //DE NAVARRA
        Navarra.veins.add(Euskal_Herria)
        Navarra.veins.add(La_Rioja)
        Navarra.veins.add(Zaragoza)
        //DE LA RIOJA
        La_Rioja.veins.add(Castilla_Leon)
        La_Rioja.veins.add(Zaragoza)
        La_Rioja.veins.add(Navarra)
        La_Rioja.veins.add(Euskal_Herria)
        //DE ASTURIES
        Asturias.veins.add(Cantabria)
        Asturias.veins.add(Castilla_Leon)
        Asturias.veins.add(Galicia)
        //DE CASTILLA I LEÓN
        Castilla_Leon.veins.add(Galicia)
        Castilla_Leon.veins.add(Asturias)
        Castilla_Leon.veins.add(Cantabria)
        Castilla_Leon.veins.add(Euskal_Herria)
        Castilla_Leon.veins.add(La_Rioja)
        Castilla_Leon.veins.add(Zaragoza)
        Castilla_Leon.veins.add(Madrid)
        Castilla_Leon.veins.add(Extremadura)
        //DE VALENCIA
        Valencia.veins.add(Catalunya)
        Valencia.veins.add(Zaragoza)
        Valencia.veins.add(Castilla_la_mancha)
        Valencia.veins.add(Murcia)
        Valencia.veins.add(Ses_illes_balears)
        //DE MURCIA
        Murcia.veins.add(Andalucia)
        Murcia.veins.add(Valencia)
        Murcia.veins.add(Castilla_la_mancha)
        //DE ANDALUCIA
        Andalucia.veins.add(Murcia)
        Andalucia.veins.add(Castilla_la_mancha)
        Andalucia.veins.add(Extremadura)
        Andalucia.veins.add(Islas_Canarias)

    }

    //IMPRIMIM EL MAPA PER PRIMERA VEGADA AMB ELS SOLDATS (QUE TOTS SÓN 0).
    val asciimapMain: String
        get() = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,|.....ASTÚRIAS....%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%,,,,,,,,,,,,,,,,,,,,|......${Asturias.numSoldats}..................|.,CANTÁBRIA,,,,).....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,\\_________________.......|,,,${Cantabria.numSoldats},,,,,_____|...........|,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,|.................-------|-(,,,,,,)...EUSKAL HERRIA /.....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&,,,,,,GALÍCIA,,,,,,,,,,|..........................(____)......${Euskal_Herria.numSoldats}..........|,,,NAVARRA,,,,|..@@@@@@@@@@@@@@..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,,,,,,${Galicia.numSoldats},,,,,,,,,,,,/..................................\\______..........|,,,,${Navarra.numSoldats},,,,,,,/.........@...@...|........@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/,@,,,,,,,,,,,,,,,,,,|.........................................|________/___________/....................|........@@@..@@@@@@@@@#....@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,\\........................................|....LA RIOJA......../.....................\\...........................@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,@@,,,,,,,,,,,,,/........................................\\....${La_Rioja.numSoldats}............../.......................|...........................@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,@@@@@@@,,,,,,,,,,,,,|............................................\\_./\\___/\\_____/........................|...........................@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@........CASTILLA LEÓN................................./......................../..........................@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,..........${Castilla_Leon.numSoldats}......................................./........................./.......CATALUNYA.......@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@...............................................|.......ZARAGOZA.........../...........${Catalunya.numSoldats}........@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.................................________________|.........${Zaragoza.numSoldats}.................\\.................,oo@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.................................../\\................\\........................,/...........@@@@@@@@@@oo@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.................................../,,,|.................\\......................./.......@@@@@@@@@@@@@@@@@oo@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@................................/,,,,,\\..................\\......................|.....@@@@@@@@@@@@@@@@@@@@@oooooo@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@............................../,,,,,,,,\\...................\\...............____|.......@@@@@@@@@@@@@@@@@@@@@@@@@@ooooooo@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@............................/,,MADRIZ,,,\\...................\\............/,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@--------______............/.....${Madrid.numSoldats}........\\..................|............|,,,,,,,,@@@@@@@@@@@@@@@@ SES ILLES BALEARS @@@@o@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,%|__________-----______,,,,,,\\..................\\......../,,,,,,,.,@@@@@@@@@@@@@@@@@@@@@@@ ${Ses_illes_balears.numSoldats} @@@@@@@@@@@@@@@..../@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,|....................----___\\.................|__,.../,,,,,,,,.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.@@@@@@@@@@@@(.\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,|_.............................................|____|,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@......#&.@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,|...........................................|,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/...........@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,|___....................................../,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.....%@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(,,,,,,,,,,,,,,,,,,,,,,,,,,,,|,...........CASTILLA LA MANCHA.......\\,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,EXTREMADURA,,,,,,,,,,|,.................${Castilla_la_mancha.numSoldats}.....................\\,VALÈNCIA,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,${Extremadura.numSoldats},,,,,,,,,,,,,,,,,|........................................../,,,,,,${Valencia.numSoldats},,,@@@@@@@@@@@oooooo...@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,|...........................................\\,,,,,,,,,,,@@@@@ooo@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,,,,,,,,,,,,,,,,,,,,,,,,,,|............................................/,,,,,,,,,,,,,,ooo@@@@@@@@@@@.@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\___________.._____________..................\\,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,/,,,.......\\/,,.,,,,,,,,,,\\.............___/,,,,,,,/@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%,,,,,,,,,,,,,,,,_______/,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\..,.......\\....\\,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-------------____/,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,-----------___\\...|,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,|_____..............\\,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\....MÚRCIA....,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\...${Murcia.numSoldats}......@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,ANDALUCÍA,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,${Andalucia.numSoldats},,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@#,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@ ISLAS CANÁRIAS @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o@@@/,,,,,,,,,,,,,,,,,,,#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ${Islas_Canarias.numSoldats} @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o@@@@@,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
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
       if (provincia.numSoldats == 0 && provincia.propietari == null){
           provincia.numSoldats += 1
           jugador.numSoldats -= 1
           provincia.propietari = jugador
           provincia.color = jugador.color

       } else if (provincia.numSoldats > 1 && provincia.propietari == jugador) {
           println("Només pots tenir un soldat per província en la fase d'exploració.")
           provincia.numSoldats = 1
           Thread.sleep(4000)
       } else if (provincia.propietari != jugador && provincia.propietari != null){
           println("Aquesta província no és teva campió.")
           Thread.sleep(4000)
       }

    }
    private fun colonitzaProvincia(provincia: Provincia, jugador: Jugador) {

        provincia.numSoldats += 1
        jugador.numSoldats -= 1
        if (provincia.propietari != jugador) {
            provincia.numSoldats -= 1
            jugador.numSoldats += 1
            print("Aquesta província no es de la  teva posessió.")
            Thread.sleep(4000)
        }
    }
    private fun checkSoldatsProvincia(): Int{
        var soldatsTotals = 0
        for (i in provincies){
            soldatsTotals = soldatsTotals + i.numSoldats
        }
        return soldatsTotals
    }
    //AQUÍ CREARÉM LA FUNCIÓ DELS TORNS DE LA FASE D'EXPLORACIÓ.
    fun FaseExploracioTorns(jugador: Jugador, provincia: String): String {
        //SI LA PROVÍNCIA COINCIDEIX AMB ALGUNA DE LES VARIABLES DE DALT HI HA UNA SERIE DE NORMES QUE ES COMPLIRÁN


        when (provincia) {
            "MADRIZ" -> exploraProvincia(Madrid, jugador)
            "CATALUNYA" -> exploraProvincia(Catalunya, jugador)
            "ZARAGOZA" -> exploraProvincia(Zaragoza, jugador)
            "EUSKAL HERRIA" -> exploraProvincia(Euskal_Herria, jugador)
            "NAVARRA" -> exploraProvincia(Navarra, jugador)
            "LA RIOJA" -> exploraProvincia(La_Rioja, jugador)
            "CANTÁBRIA" -> exploraProvincia(Cantabria, jugador)
            "ASTÚRIAS" -> exploraProvincia(Asturias, jugador)
            "GALÍCIA" -> exploraProvincia(Galicia, jugador)
            "CASTILLA LEÓN" -> exploraProvincia(Castilla_Leon, jugador)
            "VALÈNCIA" -> exploraProvincia(Valencia, jugador)
            "CASTILLA LA MANCHA" -> exploraProvincia(Castilla_la_mancha, jugador)
            "EXTREMADURA" -> exploraProvincia(Extremadura, jugador)
            "MÚRCIA" -> exploraProvincia(Murcia, jugador)
            "ANDALUCÍA" -> exploraProvincia(Andalucia, jugador)
            "ISLAS CANÁRIAS" -> exploraProvincia(Islas_Canarias, jugador)
            "SES ILLES BALEARS" -> exploraProvincia(Ses_illes_balears, jugador)
            //SI PROVÍNCIA NO COINCIDEIX AMB CAP VARIABLE, SURT UN MISSATGE QUE DIU QUE NO EXISTEIX LA PROVÍNCIA INSERTADA
            else -> {
                println("Aquesta província no existeix")
                Thread.sleep(4000)
            }
        }
        val soldatsTotalsExploracio = checkSoldatsProvincia()
        //SI TOTES LES PROVÍNCIES TENEN UN SOLDAT, S'EXECUTA AQUESTA FRASE QUE SERÀ ANALITZADA A MAIN I TANCARÀ EL BUCLE WHILE DELS TORNS DE LA FASE DEXPLORACIÓ DE MAIN
        if (soldatsTotalsExploracio >= 17){
            return "Fase d'exploració acabada."

        }
        return asciimapMain
    }
    fun FaseColonitzacioTorns(jugador: Jugador, Provincia: String): String {
        when (Provincia) {
            "MADRIZ" -> colonitzaProvincia(Madrid, jugador)
            "CATALUNYA" -> colonitzaProvincia(Catalunya, jugador)
            "ZARAGOZA" -> colonitzaProvincia(Zaragoza, jugador)
            "LA RIOJA" -> colonitzaProvincia(La_Rioja, jugador)
            "CASTILLA LA MANCHA" -> colonitzaProvincia(Castilla_la_mancha, jugador)
            "NAVARRA" -> colonitzaProvincia(Navarra, jugador)
            "EUSKAL HERRIA" -> colonitzaProvincia(Euskal_Herria, jugador)
            "CANTÁBRIA" -> colonitzaProvincia(Cantabria, jugador)
            "VALÉNCIA" -> colonitzaProvincia(Valencia, jugador)
            "CASTILLA LEÓN" -> colonitzaProvincia(Castilla_Leon, jugador)
            "MÚRCIA" -> colonitzaProvincia(Murcia, jugador)
            "EXTREMADURA" -> colonitzaProvincia(Extremadura, jugador)
            "ANDALUCÍA" -> colonitzaProvincia(Andalucia, jugador)
            "SES ILLES BALEARS" -> colonitzaProvincia(Ses_illes_balears, jugador)
            "ISLAS CANÁRIAS" -> colonitzaProvincia(Islas_Canarias, jugador)
            "ASTÚRIAS" -> colonitzaProvincia(Asturias, jugador)
            "GALÍCIA" -> colonitzaProvincia(Galicia, jugador)
        }

        return asciimapMain
    }

}

