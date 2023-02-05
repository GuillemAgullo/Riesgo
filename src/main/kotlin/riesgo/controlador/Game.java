package riesgo.controlador;

import riesgo.Colors;
import riesgo.view.Jugador1;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static riesgo.view.MainKt.Jugador1;

class Game {

public void joc() {
        // Set the charset to UTF 8 to the Standard Output
        if (!StandardCharsets.UTF_8.name().equals(System.out.getClass().getName())) {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out), true, StandardCharsets.UTF_8));
        }
        boolean fideljoc = true;

        //FEM UN BUCLE WHILE QUE SERÀ L'EXECUCIÓ DEL JOC EN SI.
        while (fideljoc) {
        System.out.print("\u001b[2J");

        //PRESENTEM EL JOC D'UNA MANERA AMENA I AGRADABLE A LA VISTA
        System.out.println("\n==========================================================================================");
        System.out.println("=============BENVINGUT A \"RIESGO\", EL RISK IBÈRIC=========================================");
        System.out.println("==========================================================================================");
        System.out.println("=============MENÚ DEL JOC=================================================================");
        System.out.println("==========================================================================================");


        //DEMANEM LES CREDENCIALS ALS JUGADORS. (NOM I COLOR)
        System.out.println("Nom del jugador 1: ");
        Scanner scanner = new Scanner(System.in);
        Jugador1.nom = (scanner.hasNextLine()) ? scanner.nextLine() : "Unnamed1";
        System.out.println("Color del jugador 1: ");
        System.out.println("LLEGENDA DE COLORS:");
        System.out.println("1-vermell, 2-verde que te quiero verde, 3-blau, 4-groc, 5-rosa que l'amor s'hi posa");
        try {
        switch (scanner.nextInt()) {
        case 1:
        Jugador1.color = Colors.ANSI_RED;
        break;
        case 2:
        Jugador1.color = Colors.ANSI_GREEN;
        break;
        case 3:
        Jugador1.color = Colors.ANSI_BLUE;
        break;
        case 4:
        Jugador1.color = Colors.ANSI_YELLOW;
        break;
        case 5:
        Jugador1.color = Colors.ANSI_PURPLE;
        break;
default:
        Jugador1.color = Colors.ANSI_RED;
        break;
        }
        } catch (Exception e) {
        Jugador1.color = Colors.ANSI_RED;
        }
        Jugador1.numSoldats = 30;


        System