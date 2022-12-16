class Mapa() {
    val provincies: List<Provincia> = listOf(
        Provincia("Madrid"),
        Provincia("Salamanca")
    )

    init {
        initAdjacents()
    }

    private fun initAdjacents() {
        val madrid = provincies.find { it.nom == "Madrid" } ?: return
        val salamanca = provincies.find { it.nom == "Salamanca" } ?: return
        madrid.veins.add(salamanca)
        salamanca.veins.add(madrid)
    }

}