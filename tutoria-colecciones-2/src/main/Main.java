package main;

import java.util.ArrayList;
import main.entity.Jugador;
import main.service.ServiceJugador;

public class Main {
    
    public static void main(String[] args) {
        
        // Creamos ArrayList llamado jugadores, del tipo Jugador
        ArrayList<Jugador> futbolistas = new ArrayList<>();
        
        // Añadimos un elemento al ArrayList
            // Primero creamos un jugador
        Jugador jugador1 = new Jugador("Lionel Messi", 35, 1.70, 72, "Argentina");
            // Ahora añadimos nuestro jugador al ArrayList
        futbolistas.add(jugador1);
        
        // Hacemos lo mismo con otro jugador
        Jugador jugador2 = new Jugador("Cristiano Ronaldo", 37, 1.87, 83, "Portugal");
        futbolistas.add(jugador2);
        
        // Mostramos los objetos
            // debemos sobreescribir (@Override) toString() sino muestra: clase, objeto, @, código Hash
        for (Jugador jugador : futbolistas){
            System.out.println(jugador);
        }
        
        // Trabajamos con muchos jugadores
        ServiceJugador sj = new ServiceJugador();
        ArrayList jugadores = sj.crearArrayJugadores();
        sj.mostrarArray(jugadores);
        
        // Eliminamos un jugador de la lista
        sj.eliminarJugador(jugadores);
        sj.mostrarArray(jugadores);
        
        //Ordenar
        System.out.println("\nOrdenamos por Nacionalidad: ");
        sj.ordenarNacionalidad(jugadores);
        
        System.out.println("\nOrdenamos por Edad: ");
        sj.ordenarEdad(jugadores);
        
        System.out.println("\nOrdenamos por Altura: ");
        sj.ordenarAltura(jugadores);
    }
}
