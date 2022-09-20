package main;

import java.util.ArrayList;
import main.entity.Jugador;
import main.service.ServiceJugador;

public class Main {
    
    public static void main(String[] args) {
        
        ServiceJugador sj = new ServiceJugador();
        ArrayList jugadores = sj.crearListaJugadores();
        sj.mostrarLista(jugadores);
        
        // Eliminamos un jugador de la lista
        sj.eliminarJugador(jugadores);
        sj.mostrarLista(jugadores);
        
        //Ordenar
        System.out.println("\nOrdenamos por Nacionalidad: ");
        sj.ordenarNacionalidad(jugadores);
        
        System.out.println("\nOrdenamos por Edad: ");
        sj.ordenarEdad(jugadores);
        
        System.out.println("\nOrdenamos por Altura: ");
        sj.ordenarAltura(jugadores);
    }
}
