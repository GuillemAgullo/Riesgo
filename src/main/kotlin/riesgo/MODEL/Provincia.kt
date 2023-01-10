package riesgo.MODEL
//AQUESTA CLASSE CONTÉ LES VARIABLES QUE TÉ CADA PROVÍNCIA.
import riesgo.CONTROLLER.Jugador

class Provincia(
    val nom: String
) {
    val veins: ArrayList<Provincia> = arrayListOf()
    var propietari: Jugador? = null
    var numSoldats: Int = 0
    var color: Int? = 0
}