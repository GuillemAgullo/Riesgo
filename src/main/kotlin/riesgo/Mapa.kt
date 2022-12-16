class Mapa() {
    val provincies: List<Provincia> = listOf(
        Provincia("Madrid"),
        Provincia("Salamanca"),
        Provincia("Barcelona"),
        Provincia("zaragoza"),
        Provincia("Albacete"),
        Provincia("Toledo"),
        Provincia("Valencia"),
        Provincia("Segovia"),
        Provincia("Valladolid"),
        Provincia("Vigo"),
        Provincia("A Coruña"),
        Provincia("Olivenza"),
        Provincia("Gijon"),
        Provincia("Bilbao"),
        Provincia("San sebastian"),
        Provincia("Pamplona"),
        Provincia("Cordoba"),
        Provincia("Alicante"),
        Provincia("Seville"),
        Provincia("Hueva"),
        Provincia("Granada"),
        Provincia("Malaga"),
        Provincia("Mojacar"),
        Provincia("Almeria"),
        Provincia("Gibraltar(UK)"),
        Provincia("Cadiz")
    )

    init {
        initAdjacents()
    }

    private fun initAdjacents() {
        val madrid = provincies.find { it.nom == "Madrid" } ?: return
        val salamanca = provincies.find { it.nom == "Salamanca" } ?: return
        val Barcelona = provincies.find {it.nom == "Barcelona" } ?: return
        val zaragoza = provincies.find {it.nom == "zaragoza" } ?: return
        val Albacete = provincies.find {it.nom == "Albacete" } ?: return
        val Toledo = provincies.find {it.nom == "Toledo" } ?: return
        val Valencia = provincies.find {it.nom == "Valencia" } ?: return
        val Segovia = provincies.find {it.nom == "Segovia" } ?: return
        val Valladolid = provincies.find {it.nom == "Valladolid" } ?: return
        val Vigo = provincies.find {it.nom == "Vigo" } ?: return
        val ACoruna = provincies.find {it.nom == "A Coruña" } ?: return
        val Olivenza = provincies.find {it.nom == "Olivenza" } ?: return
        val Gijon = provincies.find {it.nom == "Gijon" } ?: return
        val Bilbao = provincies.find {it.nom == "Bilbao" } ?: return
        val Sansebastian = provincies.find {it.nom == "San sebastian" } ?: return
        val Pamplona = provincies.find {it.nom == "Pamplona" } ?: return
        val Cordoba = provincies.find {it.nom == "Cordoba" } ?: return
        val Alicante = provincies.find {it.nom == "Alicante" } ?: return
        val Seville = provincies.find {it.nom == "Seville" } ?: return
        val Hueva = provincies.find {it.nom == "Hueva" } ?: return
        val Granada = provincies.find {it.nom == "Granada" } ?: return
        val Malaga = provincies.find {it.nom == "Malaga" } ?: return
        val Mojacar = provincies.find {it.nom == "Mojacar" } ?: return
        val Almeria = provincies.find {it.nom == "Almeria" } ?: return
        val GibraltarUK = provincies.find {it.nom == "Gibraltar(UK)" } ?: return
        val Cadiz = provincies.find {it.nom == "Cadiz" } ?: return


        madrid.veins.add(salamanca)
        salamanca.veins.add(madrid)

    }

}