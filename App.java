package pract8;

import java.util.Random;
import java.util.Scanner;

 class Main {  
    public static void main(String[] args) {
        Torneo t1 = new Torneo();
        
        int i, j;

        System.out.println("Torneo: " +t1.getNombretorneo());
        System.out.println("Region: " + t1.getRegion());
        System.out.println("Equipos participantes: " + t1.getNumeroEquipos());
        System.out.println("Partidos jugados: " +t1.getPartidosJugados());
        System.out.println("Partido pendientes: "+t1.getPartidosPendientes());

        for(i=0;i<5;i++){ //Cantidad de equipos por torneo
            System.out.println("Nombre del equipo :"+ Torneo.equipos[i].getNameEquipo());
            System.out.println("Division "+ Torneo.equipos[i].getDivision());
            System.out.println("Jugadores totales" + Torneo.equipos[i].jugadoresTotales());
            System.out.println("Puntos totales: " + Torneo.equipos[i].puntosTotales());
            
            for( j=0;j<10;j++){ //Cantidad de jugadores por equipo
                System.out.println("Jugador: " + Torneo.equipos[i].jugadores[j].getNombreJugador());
                System.out.println("Numero del jugador: " + Torneo.equipos[i].jugadores[j].getnumUniforme());
            }
        }
    }
}