class Provincia(
    val nom: String
) {
    val veins: ArrayList<Provincia> = arrayListOf()
    var propietari: Jugador? = null
    var numSoldats: Int = 0
}