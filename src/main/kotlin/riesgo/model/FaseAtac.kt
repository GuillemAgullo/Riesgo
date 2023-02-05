package riesgo.model


import riesgo.view.Mapa

class FaseAtac {
    private fun provinciesAdjacents(provincieta: Provincia, provinciaza: Provincia, mapa: Mapa): Boolean {
        //AQUÍ AFEGIM ELS VEÏNS:

        //DE MADRID
        mapa.madrid.veins.add(mapa.castillaLeon)
        mapa.madrid.veins.add(mapa.castillaLaMancha)
        //DE EXTREMADURA
        mapa.extremadura.veins.add(mapa.castillaLeon)
        mapa.extremadura.veins.add(mapa.castillaLaMancha)
        mapa.extremadura.veins.add(mapa.andalucia)
        //DE CATALUNYA
        mapa.catalunya.veins.add(mapa.zaragoza)
        mapa.catalunya.veins.add(mapa.valencia)
        mapa.catalunya.veins.add(mapa.sesIllesBalears)
        //DE GALÍCIA
        mapa.galicia.veins.add(mapa.asturias)
        mapa.galicia.veins.add(mapa.castillaLeon)
        //DE CANTÁBRIA
        mapa.cantabria.veins.add(mapa.euskalHerria)
        mapa.cantabria.veins.add(mapa.asturias)
        mapa.cantabria.veins.add(mapa.castillaLeon)
        //DE EUSKAL HERRIA
        mapa.euskalHerria.veins.add(mapa.cantabria)
        mapa.euskalHerria.veins.add(mapa.navarra)
        mapa.euskalHerria.veins.add(mapa.laRioja)
        mapa.euskalHerria.veins.add(mapa.castillaLeon)
        //DE ZARAGOZA
        mapa.zaragoza.veins.add(mapa.catalunya)
        mapa.zaragoza.veins.add(mapa.navarra)
        mapa.zaragoza.veins.add(mapa.laRioja)
        mapa.zaragoza.veins.add(mapa.valencia)
        mapa.zaragoza.veins.add(mapa.castillaLeon)
        mapa.zaragoza.veins.add(mapa.castillaLaMancha)
        //DE NAVARRA
        mapa.navarra.veins.add(mapa.euskalHerria)
        mapa.navarra.veins.add(mapa.laRioja)
        mapa.navarra.veins.add(mapa.zaragoza)
        //DE LA RIOJA
        mapa.laRioja.veins.add(mapa.castillaLeon)
        mapa.laRioja.veins.add(mapa.zaragoza)
        mapa.laRioja.veins.add(mapa.navarra)
        mapa.laRioja.veins.add(mapa.euskalHerria)
        //DE ASTURIES
        mapa.asturias.veins.add(mapa.cantabria)
        mapa.asturias.veins.add(mapa.castillaLeon)
        mapa.asturias.veins.add(mapa.galicia)
        //DE CASTILLA I LEÓN
        mapa.castillaLeon.veins.add(mapa.galicia)
        mapa.castillaLeon.veins.add(mapa.asturias)
        mapa.castillaLeon.veins.add(mapa.cantabria)
        mapa.castillaLeon.veins.add(mapa.euskalHerria)
        mapa.castillaLeon.veins.add(mapa.laRioja)
        mapa.castillaLeon.veins.add(mapa.zaragoza)
        mapa.castillaLeon.veins.add(mapa.madrid)
        mapa.castillaLeon.veins.add(mapa.extremadura)
        //DE VALENCIA
        mapa.valencia.veins.add(mapa.catalunya)
        mapa.valencia.veins.add(mapa.zaragoza)
        mapa.valencia.veins.add(mapa.castillaLaMancha)
        mapa.valencia.veins.add(mapa.murcia)
        mapa.valencia.veins.add(mapa.sesIllesBalears)
        //DE MURCIA
        mapa.murcia.veins.add(mapa.andalucia)
        mapa.murcia.veins.add(mapa.valencia)
        mapa.murcia.veins.add(mapa.castillaLaMancha)
        //DE ANDALUCIA
        mapa.andalucia.veins.add(mapa.murcia)
        mapa.andalucia.veins.add(mapa.castillaLaMancha)
        mapa.andalucia.veins.add(mapa.extremadura)
        mapa.andalucia.veins.add(mapa.islasCanarias)

        return provincieta.veins.contains(provinciaza)
    }

    private fun numeroSoldatsCombatents(provincia: Provincia): Int {
        val soldatsEnProvincia = provincia.numSoldats
        println("Posa el número de soldats amb els que vols atacar (Has de deixar com a mínim un soldat en la província): \n")
        val soldatsRealsAtacant = readln().toIntOrNull() ?: 0

        if (soldatsRealsAtacant > soldatsEnProvincia) {
            println("No tens tants soldats a la província.")
            Thread.sleep(3000)
        } else if (soldatsRealsAtacant < soldatsEnProvincia) {
            return soldatsRealsAtacant
        } else {
            println("Has de deixar com a mínim un soldat a la província.")
            Thread.sleep(3000)
        }
        return 0
    }

    private fun transformaProvincia(userInput: String, mapa: Mapa): Provincia {
        val index = userInput.toIntOrNull()
        if (index == null) {
            println("Has de posar un número enter.")
            Thread.sleep(3000)
        }
        when (index) {
            0 -> return mapa.provincies[0]
            1 -> return mapa.provincies[1]
            2 -> return mapa.provincies[2]
            3 -> return mapa.provincies[3]
            4 -> return mapa.provincies[4]
            5 -> return mapa.provincies[5]
            6 -> return mapa.provincies[6]
            7 -> return mapa.provincies[7]
            8 -> return mapa.provincies[8]
            9 -> return mapa.provincies[9]
            10 -> return mapa.provincies[10]
            11 -> return mapa.provincies[11]
            12 -> return mapa.provincies[12]
            13 -> return mapa.provincies[13]
            14 -> return mapa.provincies[14]
            15 -> return mapa.provincies[15]
            16 -> return mapa.provincies[16]
        }
        return mapa.provincies[0]

    }

    fun decidimGuanyador(userInputAtac: String, userInputDefensa: String, mapa: Mapa) {

        val provinciaatac = transformaProvincia(userInputAtac, mapa)
        val provinciadefensa = transformaProvincia(userInputDefensa, mapa)

        if (provinciesAdjacents(provinciaatac, provinciadefensa, mapa)) {
            val dau = listOf(1, 2, 3, 4, 5, 6)
            val numeroDeDausDelDefensa = provinciadefensa.numSoldats
            val numeroDeDausDelAtacant = numeroSoldatsCombatents(provinciaatac)
            var resultatAtacant = 0
            var resultatDefensor = 0
            for (i in 0..numeroDeDausDelDefensa) {
                resultatDefensor += dau.random()
            }
            for (i in 0..numeroDeDausDelAtacant) {
                resultatAtacant += dau.random()
            }
            val guanyador: Jugador = if (resultatAtacant > resultatDefensor) {
                provinciaatac.propietari
            } else {
                provinciadefensa.propietari
            }

            faseDePostguerra(guanyador, provinciaatac, provinciadefensa, numeroDeDausDelAtacant)
        } else {
            println("Les províncies escollides no són veïnes.")
            Thread.sleep(2000)
        }
    }

    private fun faseDePostguerra(guanyador: Jugador, provinciaAtacant: Provincia, provinciaDefensa: Provincia, soldatsCombatents: Int) {

        if (guanyador == provinciaAtacant.propietari) {
            provinciaDefensa.propietari = provinciaAtacant.propietari
            provinciaDefensa.numSoldats = soldatsCombatents
            provinciaAtacant.numSoldats = provinciaAtacant.numSoldats - soldatsCombatents
            print("Ha guanyat ${guanyador.nom}")
            Thread.sleep(3000)

        } else if (guanyador == provinciaDefensa.propietari) {
            provinciaAtacant.numSoldats -= soldatsCombatents
            print("Ha guanyat ${guanyador.nom}")
            Thread.sleep(3000)
        }
    }

    fun volstraspassarSoldats(jugador: Jugador, mapa: Mapa) {
        println("Agafar soldats de: ")
        mapa.provincies.forEachIndexed { index, provincia ->
            if (provincia.propietari == jugador) {
                println("$index - ${provincia.nom}")
            }
        }
        val provinciaAgafar = transformaProvincia(readln(), mapa)

        println("I posar-los a: ")
        mapa.provincies.forEachIndexed { index, provincia ->
            if (provincia.propietari == jugador) {
                println("$index - ${provincia.nom}")
            }
        }
        val provinciaPosar = transformaProvincia(readln(), mapa)
        println("Quants soldats vols traspassar?: ")
        val numeroDeSoldatsTraspassats = readln().toIntOrNull() ?: 0
        if (numeroDeSoldatsTraspassats > provinciaAgafar.numSoldats){
            print("Has posat més soldats dels que tens.")
            return
        }
        if (provinciaAgafar.propietari == provinciaPosar.propietari && provinciaAgafar.propietari == jugador) {

            provinciaAgafar.numSoldats -= numeroDeSoldatsTraspassats
            provinciaPosar.numSoldats += numeroDeSoldatsTraspassats
            println("Soldats traspassats.")
            Thread.sleep(3000)
            return
        }else{
            print("Estas posant-li soldats a l'enemic. Traïdor!! desertor!! LLuita per la pàtria covard!!!")
            Thread.sleep(4000)
            return
        }
    }
}