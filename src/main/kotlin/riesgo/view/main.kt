package riesgo.view
import riesgo.model.Jugador
import riesgo.controlador.Game

//Aquest arxiu és el riesgo.view.main i és des d'on cridaré totes les clases de l'inici del joc fins que s'acabi
//PRIMER CREEM LES VARIABLES GLOBALS PER ALS DOS JUGADORS
val Jugador1 = Jugador()
val Jugador2 = Jugador()
val Jugador0 = Jugador()

//FEM UNA FUNCIÓ PER A FER UN DIVERTIT I ENTRETINGUT EFECTE QUE ESCRIU UNA FRASE DONADA, PROGRESSIVAMENT.
fun textoFlama(frase: String) {
    print("\n")
    for (i in frase) {
        print("$i")
        Thread.sleep(250)
    }
    print("\n")
}

fun main() {
    val joc = Game()
    joc.joc()
}




