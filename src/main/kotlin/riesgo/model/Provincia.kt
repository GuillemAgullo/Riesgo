package riesgo.model

import riesgo.view.Jugador0

//AQUESTA CLASSE CONTÉ LES VARIABLES QUE TÉ CADA PROVÍNCIA.

class Provincia(
    val nom: String
) {
    val veins: ArrayList<Provincia> = arrayListOf()
    var propietari: Jugador = Jugador0
    var numSoldats: Int = 0
    var color: String = ""
}