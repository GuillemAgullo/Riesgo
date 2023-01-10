package riesgo.VIEW

import riesgo.CONTROLLER.Jugador
import riesgo.MODEL.Provincia

class Mapa() {
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

    //SEGUIDAMENT, INICIEM UNA FUNCIÓ QUE ES DIGUI INITADJECENTS
    init {
        initAdjacents()
    }

    //DINTRE D'AQUESTA, CREEM VARIABLES QUE CONTINGUIN EL NOM DE LES COMUNITATS AUTONOMES DINTRE DE LA CLASSE PROVÍNCIES. AIXÒ HO FEM AMB LA FUNCIÓ FIND, QUE ITERA DINTRE DE PROVINCIES FINS QUE TROVA EL NOM INDICAT.
    private fun initAdjacents() {
        val Madrid = provincies.find { it.nom == "Madrid" } ?: return
        val Catalunya = provincies.find { it.nom == "Catalunya" } ?: return
        val Zaragoza = provincies.find { it.nom == "Zaragoza" } ?: return
        val Euskal_Herria = provincies.find { it.nom == "Euskal_Herria" } ?: return
        val Navarra = provincies.find { it.nom == "Navarra" } ?: return
        val La_Rioja = provincies.find { it.nom == "La_Rioja" } ?: return
        val Cantabria = provincies.find { it.nom == "Cantábria" } ?: return
        val Asturias = provincies.find { it.nom == "Astúrias" } ?: return
        val Galicia = provincies.find { it.nom == "Galícia" } ?: return
        val Castilla_Leon = provincies.find { it.nom == "Castilla_León" } ?: return
        val Valencia = provincies.find { it.nom == "València" } ?: return
        val Castilla_la_mancha = provincies.find { it.nom == "Castilla_la_mancha" } ?: return
        val Extremadura = provincies.find { it.nom == "Extremadura" } ?: return
        val Murcia = provincies.find { it.nom == "Múrcia" } ?: return
        val Andalucia = provincies.find { it.nom == "Andalucía" } ?: return
        val Islas_Canarias = provincies.find { it.nom == "Islas_Canarias" } ?: return
        val Ses_illes_balears = provincies.find { it.nom == "Ses_illes_balears" } ?: return

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

    val Madrid = provincies.find { it.nom == "Madrid" }
    val Catalunya = provincies.find { it.nom == "Catalunya" }
    val Zaragoza = provincies.find { it.nom == "Zaragoza" }
    val Euskal_Herria = provincies.find { it.nom == "Euskal_Herria" }
    val Navarra = provincies.find { it.nom == "Navarra" }
    val La_Rioja = provincies.find { it.nom == "La_Rioja" }
    val Cantabria = provincies.find { it.nom == "Cantábria" }
    val Asturias = provincies.find { it.nom == "Astúrias" }
    val Galicia = provincies.find { it.nom == "Galícia" }
    val Castilla_Leon = provincies.find { it.nom == "Castilla_León" }
    val Valencia = provincies.find { it.nom == "València" }
    val Castilla_la_mancha = provincies.find { it.nom == "Castilla_la_mancha" }
    val Extremadura = provincies.find { it.nom == "Extremadura" }
    val Murcia = provincies.find { it.nom == "Múrcia" }
    val Andalucia = provincies.find { it.nom == "Andalucía" }
    val Islas_Canarias = provincies.find { it.nom == "Islas_Canarias" }
    val Ses_illes_balears = provincies.find { it.nom == "Ses_illes_balears" }
    val asciimapMain: String = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,|.....ASTÚRIAS....%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%,,,,,,,,,,,,,,,,,,,,|......${Asturias?.numSoldats}..................|.,CANTÁBRIA,,,,).....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,\\_________________.......|,,,${Cantabria?.numSoldats},,,,,_____|...........|,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,|.................-------|-(,,,,,,)...EUSKAL HERRIA /.....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&,,,,,,GALÍCIA,,,,,,,,,,|..........................(____)......${Euskal_Herria?.numSoldats}..........|,,,NAVARRA,,,,|..@@@@@@@@@@@@@@..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,,,,,,${Galicia?.numSoldats},,,,,,,,,,,,/..................................\\______..........|,,,,${Navarra?.numSoldats},,,,,,,/.........@...@...|........@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/,@,,,,,,,,,,,,,,,,,,|.........................................|________/___________/....................|........@@@..@@@@@@@@@#....@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,\\........................................|....LA RIOJA......../.....................\\...........................@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,@@,,,,,,,,,,,,,/........................................\\....${La_Rioja?.numSoldats}............../.......................|...........................@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,@@@@@@@,,,,,,,,,,,,,|............................................\\_./\\___/\\_____/........................|...........................@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@........CASTILLA LEÓN................................./......................../..........................@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,..........${Castilla_Leon?.numSoldats}......................................./........................./.......CATALUNYA.......@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@...............................................|.......ZARAGOZA.........../...........${Catalunya?.numSoldats}........@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.................................________________|.........${Zaragoza?.numSoldats}.................\\.................,oo@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.................................../\\................\\........................,/...........@@@@@@@@@@oo@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.................................../,,,|.................\\......................./.......@@@@@@@@@@@@@@@@@oo@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@................................/,,,,,\\..................\\......................|.....@@@@@@@@@@@@@@@@@@@@@oooooo@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@............................../,,,,,,,,\\...................\\...............____|.......@@@@@@@@@@@@@@@@@@@@@@@@@@ooooooo@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@............................/,,MADRIZ,,,\\...................\\............/,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@--------______............/.....${Madrid?.numSoldats}........\\..................|............|,,,,,,,,@@@@@@@@@@@@@@@@ SES ILLES BALEARS @@@@o@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,%|__________-----______,,,,,,\\..................\\......../,,,,,,,.,@@@@@@@@@@@@@@@@@@@@@@@ ${Ses_illes_balears?.numSoldats} @@@@@@@@@@@@@@@..../@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,|....................----___\\.................|__,.../,,,,,,,,.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.@@@@@@@@@@@@(.\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,|_.............................................|____|,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@......#&.@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,|...........................................|,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/...........@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,|___....................................../,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.....%@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(,,,,,,,,,,,,,,,,,,,,,,,,,,,,|,...........CASTILLA LA MANCHA.......\\,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,EXTREMADURA,,,,,,,,,,|,.................${Castilla_la_mancha?.numSoldats}.....................\\,VALÈNCIA,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,${Extremadura?.numSoldats},,,,,,,,,,,,,,,,,|........................................../,,,,,,${Valencia?.numSoldats},,,@@@@@@@@@@@oooooo...@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,|...........................................\\,,,,,,,,,,,@@@@@ooo@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,,,,,,,,,,,,,,,,,,,,,,,,,,|............................................/,,,,,,,,,,,,,,ooo@@@@@@@@@@@.@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\___________.._____________..................\\,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,/,,,.......\\/,,.,,,,,,,,,,\\.............___/,,,,,,,/@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%,,,,,,,,,,,,,,,,_______/,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\..,.......\\....\\,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-------------____/,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,-----------___\\...|,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,|_____..............\\,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\....MÚRCIA....,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\...${Murcia?.numSoldats}......@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,ANDALUCÍA,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,${Andalucia?.numSoldats},,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@#,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@ ISLAS CANÁRIAS @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o@@@/,,,,,,,,,,,,,,,,,,,#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
            "@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ${Islas_Canarias?.numSoldats} @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o@@@@@,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
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

    //AQUÍ CREARÉM LES VARIABLES QUE DEFINEIXEN QUANTS SOLDATS TÉ CADA ZONA.
    fun FaseExploracioTorns(Jugador: Jugador, Provincia: String, Color: Int): String {
        val Madrid = provincies.find { it.nom == "Madrid" }
        val Catalunya = provincies.find { it.nom == "Catalunya" }
        val Zaragoza = provincies.find { it.nom == "Zaragoza" }
        val Euskal_Herria = provincies.find { it.nom == "Euskal_Herria" }
        val Navarra = provincies.find { it.nom == "Navarra" }
        val La_Rioja = provincies.find { it.nom == "La_Rioja" }
        val Cantabria = provincies.find { it.nom == "Cantábria" }
        val Asturias = provincies.find { it.nom == "Astúrias" }
        val Galicia = provincies.find { it.nom == "Galícia" }
        val Castilla_Leon = provincies.find { it.nom == "Castilla_León" }
        val Valencia = provincies.find { it.nom == "València" }
        val Castilla_la_mancha = provincies.find { it.nom == "Castilla_la_mancha" }
        val Extremadura = provincies.find { it.nom == "Extremadura" }
        val Murcia = provincies.find { it.nom == "Múrcia" }
        val Andalucia = provincies.find { it.nom == "Andalucía" }
        val Islas_Canarias = provincies.find { it.nom == "Islas_Canarias" }
        val Ses_illes_balears = provincies.find { it.nom == "Ses_illes_balears" }


        if (Provincia == "MADRIZ") {
            Madrid!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Madrid!!.numSoldats > 1 && Madrid.propietari != Jugador) {
                Madrid.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Madrid.numSoldats > 1 && Madrid.propietari == Jugador) {
                Madrid.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Madrid.propietari = Jugador
                Madrid.color = Jugador.color

            }


        } else if (Provincia == "CATALUNYA") {
            Catalunya!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Catalunya!!.numSoldats > 1 && Catalunya.propietari != Jugador) {
                Catalunya.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Catalunya.numSoldats > 1 && Catalunya.propietari == Jugador) {
                Catalunya.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Catalunya.propietari = Jugador
                Catalunya.color = Jugador.color

            }



        } else if (Provincia == "ZARAGOZA") {
            Zaragoza!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Zaragoza!!.numSoldats > 1 && Zaragoza.propietari != Jugador) {
                Zaragoza.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Zaragoza.numSoldats > 1 && Zaragoza.propietari == Jugador) {
                Zaragoza.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Zaragoza.propietari = Jugador
                Zaragoza.color = Jugador.color

            }
        } else if (Provincia == "EUSKAL HERRIA") {
            Euskal_Herria!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Euskal_Herria!!.numSoldats > 1 && Euskal_Herria.propietari != Jugador) {
                Euskal_Herria.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Euskal_Herria.numSoldats > 1 && Euskal_Herria.propietari == Jugador) {
                Euskal_Herria.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Euskal_Herria.propietari = Jugador
                Euskal_Herria.color = Jugador.color

            }
        } else if (Provincia == "NAVARRA") {
            Navarra!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Navarra!!.numSoldats > 1 && Navarra.propietari != Jugador) {
                Navarra.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Navarra.numSoldats > 1 && Navarra.propietari == Jugador) {
                Navarra.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Navarra.propietari = Jugador
                Navarra.color = Jugador.color

            }
        } else if (Provincia == "LA RIOJA") {
            La_Rioja!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (La_Rioja!!.numSoldats > 1 && La_Rioja.propietari != Jugador) {
                La_Rioja.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (La_Rioja.numSoldats > 1 && La_Rioja.propietari == Jugador) {
                La_Rioja.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                La_Rioja.propietari = Jugador
                La_Rioja.color = Jugador.color

            }
        } else if (Provincia == "CANTÁBRIA") {
            Cantabria!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Cantabria!!.numSoldats > 1 && Cantabria.propietari != Jugador) {
                Cantabria.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Cantabria.numSoldats > 1 && Cantabria.propietari == Jugador) {
                Cantabria.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Cantabria.propietari = Jugador
                Cantabria.color = Jugador.color

            }

        } else if (Provincia == "ASTÚRIAS") {
            Asturias!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Asturias!!.numSoldats > 1 && Asturias.propietari != Jugador) {
                Asturias.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Asturias.numSoldats > 1 && Asturias.propietari == Jugador) {
                Asturias.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Asturias.propietari = Jugador
                Asturias.color = Jugador.color

            }

        } else if (Provincia == "GALÍCIA") {
            Galicia!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Galicia!!.numSoldats > 1 && Galicia.propietari != Jugador) {
                Galicia.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Galicia.numSoldats > 1 && Galicia.propietari == Jugador) {
                Galicia.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Galicia.propietari = Jugador
                Galicia.color = Jugador.color

            }
        } else if (Provincia == "CASTILLA LEÓN") {
            Castilla_Leon!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Castilla_Leon!!.numSoldats > 1 && Castilla_Leon.propietari != Jugador) {
                Castilla_Leon.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Castilla_Leon.numSoldats > 1 && Castilla_Leon.propietari == Jugador) {
                Castilla_Leon.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Castilla_Leon.propietari = Jugador
                Castilla_Leon.color = Jugador.color

            }
        } else if (Provincia == "VALÈNCIA") {
            Valencia!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Valencia!!.numSoldats > 1 && Valencia.propietari != Jugador) {
                Valencia.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Valencia.numSoldats > 1 && Valencia.propietari == Jugador) {
                Valencia.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Valencia.propietari = Jugador
                Valencia.color = Jugador.color

            }
        } else if (Provincia == "CASTILLA LA MANCHA") {
            Castilla_la_mancha!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Castilla_la_mancha!!.numSoldats > 1 && Castilla_la_mancha.propietari != Jugador) {
                Castilla_la_mancha.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Castilla_la_mancha.numSoldats > 1 && Castilla_la_mancha.propietari == Jugador) {
                Castilla_la_mancha.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Castilla_la_mancha.propietari = Jugador
                Castilla_la_mancha.color = Jugador.color

            }
        } else if (Provincia == "EXTREMADURA") {
            Extremadura!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Extremadura!!.numSoldats > 1 && Extremadura.propietari != Jugador) {
                Extremadura.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Extremadura.numSoldats > 1 && Extremadura.propietari == Jugador) {
                Extremadura.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Extremadura.propietari = Jugador
                Extremadura.color = Jugador.color

            }
        } else if (Provincia == "MÚRCIA") {
            Murcia!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Murcia!!.numSoldats > 1 && Murcia.propietari != Jugador) {
                Murcia.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Murcia.numSoldats > 1 && Murcia.propietari == Jugador) {
                Murcia.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Murcia.propietari = Jugador
                Murcia.color = Jugador.color

            }
        } else if (Provincia == "ANDALUCÍA") {
            Andalucia!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Andalucia!!.numSoldats > 1 && Andalucia.propietari != Jugador) {
                Andalucia.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Andalucia.numSoldats > 1 && Andalucia.propietari == Jugador) {
                Andalucia.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Andalucia.propietari = Jugador
                Andalucia.color = Jugador.color

            }
        } else if (Provincia == "ISLAS CANÁRIAS") {
            Islas_Canarias!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Islas_Canarias!!.numSoldats > 1 && Islas_Canarias.propietari != Jugador) {
                Islas_Canarias.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Islas_Canarias.numSoldats > 1 && Islas_Canarias.propietari == Jugador) {
                Islas_Canarias.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Islas_Canarias.propietari = Jugador
                Islas_Canarias.color = Jugador.color

            }
        } else if (Provincia == "SES ILLES BALEARS") {
            Ses_illes_balears!!.numSoldats += 1
            Jugador.numSoldats -= 1
            if (Ses_illes_balears!!.numSoldats > 1 && Ses_illes_balears.propietari != Jugador) {
                Ses_illes_balears.numSoldats = 1
                println("Aquesta província no és teva campió")
                Jugador.numSoldats += 1
                Thread.sleep(4000)

            } else if (Ses_illes_balears.numSoldats > 1 && Ses_illes_balears.propietari == Jugador) {
                Ses_illes_balears.numSoldats = 1
                println("La província no pot tenir més d'un soldat.")
                Jugador.numSoldats += 1
                Thread.sleep(4000)
            } else {
                Ses_illes_balears.propietari = Jugador
                Ses_illes_balears.color = Jugador.color

            }
        }else {
            println("Aquesta província no existeix")
            Thread.sleep(4000)
        }
        if (Madrid!!.numSoldats == 1 && Catalunya!!.numSoldats == 1 && Zaragoza!!.numSoldats == 1 && Navarra!!.numSoldats == 1 && La_Rioja!!.numSoldats == 1 && Euskal_Herria!!.numSoldats == 1 && Cantabria!!.numSoldats == 1 && Asturias!!.numSoldats == 1 && Galicia!!.numSoldats == 1 && Castilla_Leon!!.numSoldats == 1 && Castilla_la_mancha!!.numSoldats == 1 && Extremadura!!.numSoldats == 1 && Murcia!!.numSoldats == 1 && Valencia!!.numSoldats == 1 && Andalucia!!.numSoldats == 1 && Islas_Canarias!!.numSoldats == 1 && Ses_illes_balears!!.numSoldats == 1) {

            return "Fase d'exploració acabada."

        }
        val asciimapExploracio: String = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,|.....ASTÚRIAS....%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%,,,,,,,,,,,,,,,,,,,,|......${Asturias?.numSoldats}..................|.,CANTÁBRIA,,,,).....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,\\_________________.......|,,,${Cantabria?.numSoldats},,,,,_____|...........|,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,|.................-------|-(,,,,,,)...EUSKAL HERRIA /.....@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&,,,,,,GALÍCIA,,,,,,,,,,|..........................(____)......${Euskal_Herria?.numSoldats}..........|,,,NAVARRA,,,,|..@@@@@@@@@@@@@@..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,,,,,,${Galicia?.numSoldats},,,,,,,,,,,,/..................................\\______..........|,,,,${Navarra?.numSoldats},,,,,,,/.........@...@...|........@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/,@,,,,,,,,,,,,,,,,,,|.........................................|________/___________/....................|........@@@..@@@@@@@@@#....@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,\\........................................|....LA RIOJA......../.....................\\...........................@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,@@,,,,,,,,,,,,,/........................................\\....${La_Rioja?.numSoldats}............../.......................|...........................@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,@@@@@@@,,,,,,,,,,,,,|............................................\\_./\\___/\\_____/........................|...........................@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@........CASTILLA LEÓN................................./......................../..........................@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,..........${Castilla_Leon?.numSoldats}......................................./........................./.......CATALUNYA.......@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@...............................................|.......ZARAGOZA.........../...........${Catalunya?.numSoldats}........@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.................................________________|.........${Zaragoza?.numSoldats}.................\\.................,oo@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.................................../\\................\\........................,/...........@@@@@@@@@@oo@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.................................../,,,|.................\\......................./.......@@@@@@@@@@@@@@@@@oo@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@................................/,,,,,\\..................\\......................|.....@@@@@@@@@@@@@@@@@@@@@oooooo@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@............................../,,,,,,,,\\...................\\...............____|.......@@@@@@@@@@@@@@@@@@@@@@@@@@ooooooo@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@............................/,,MADRIZ,,,\\...................\\............/,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@--------______............/.....${Madrid?.numSoldats}........\\..................|............|,,,,,,,,@@@@@@@@@@@@@@@@ SES ILLES BALEARS @@@@o@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,%|__________-----______,,,,,,\\..................\\......../,,,,,,,.,@@@@@@@@@@@@@@@@@@@@@@@ ${Ses_illes_balears?.numSoldats} @@@@@@@@@@@@@@@..../@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,|....................----___\\.................|__,.../,,,,,,,,.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.@@@@@@@@@@@@(.\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,|_.............................................|____|,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@......#&.@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,|...........................................|,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/...........@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,|___....................................../,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.....%@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(,,,,,,,,,,,,,,,,,,,,,,,,,,,,|,...........CASTILLA LA MANCHA.......\\,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,EXTREMADURA,,,,,,,,,,|,.................${Castilla_la_mancha?.numSoldats}.....................\\,VALÈNCIA,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,${Extremadura?.numSoldats},,,,,,,,,,,,,,,,,|........................................../,,,,,,${Valencia?.numSoldats},,,@@@@@@@@@@@oooooo...@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,|...........................................\\,,,,,,,,,,,@@@@@ooo@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,,,,,,,,,,,,,,,,,,,,,,,,,,|............................................/,,,,,,,,,,,,,,ooo@@@@@@@@@@@.@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\___________.._____________..................\\,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,/,,,.......\\/,,.,,,,,,,,,,\\.............___/,,,,,,,/@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%,,,,,,,,,,,,,,,,_______/,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\..,.......\\....\\,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@-------------____/,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,-----------___\\...|,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,|_____..............\\,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\....MÚRCIA....,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\...${Murcia?.numSoldats}......@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,ANDALUCÍA,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\\.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,${Andalucia?.numSoldats},,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,@@@@#,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@ ISLAS CANÁRIAS @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o@@@/,,,,,,,,,,,,,,,,,,,#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ${Islas_Canarias?.numSoldats} @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@o@@@@@,,,,,,,,,,,,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
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

        return asciimapExploracio
    }


}

