package riesgo.model

import riesgo.view.Jugador0

class FaseAtac( private var atacant: Jugador,
                private var defensor: Jugador){
    fun faseIvanQueOsPongoChicos(provinciadefensa: Provincia, provinciaatac: Provincia): Jugador{

        val daus = listOf(1,2,3,4,5,6)
        val numeroDeDausDelDefensa = provinciadefensa.numSoldats
        val numeroDeDausDelAtacant = provinciaatac.numSoldats
        var resultatAtacant = 0
        var resultatDefensor = 0
        for (i in 0..numeroDeDausDelDefensa){
            resultatDefensor += daus.random()
        }
        for (i in 0..numeroDeDausDelAtacant){
            resultatAtacant  += daus.random()
        }
        val guanyador:Jugador = if (resultatAtacant > resultatDefensor){
            atacant
        }else{
            defensor
        }
        return guanyador
    }
}

