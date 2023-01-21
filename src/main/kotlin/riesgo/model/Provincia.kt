package riesgo.model
//AQUESTA CLASSE CONTÉ LES VARIABLES QUE TÉ CADA PROVÍNCIA.

class Provincia(
    val nom: String
) {
    val veins: ArrayList<Provincia> = arrayListOf()
    var propietari: Jugador? = null
    var numSoldats: Int = 0
    var color: String = ""
}