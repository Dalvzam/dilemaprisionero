import java.util.Scanner;

public class DilemaDelPrisionero {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int numeroDePartidas = 10; // Número de partidas, se puede modificar.

        // Mostrar mensaje de inicio
        System.out.println("¡Comenzando el juego del Dilema del Prisionero!\n");
        System.out.println("Elige quién quieres que juegue como Jugador1 (1 para Bob, 2 para Alice, 3 para Charlie, 4 para Colaborativo, 5 para Ratero): ");
        int opcionJugador1 = scanner.nextInt();
        System.out.println("Elige quién quieres que juegue como Jugador2 (1 para Bob, 2 para Alice, 3 para Charlie, 4 para Colaborativo, 5 para Ratero): ");
        int opcionJugador2 = scanner.nextInt();


        // Ciclo para jugar varias partidas
        for (int i = 0; i < numeroDePartidas; i++) {
            System.out.println("\nPartida " + (i + 1) + ":");
            
            Thread jugador1 = null;
            Thread jugador2 = null;

            switch (opcionJugador1) {
                case 1: // Opción 1: Bob 
                    jugador1 = new Thread(new JugadorBob(1, i+1));
                    break;
                case 2: // Opción 2: Alice
                    jugador1 = new Thread(new JugadorAlice(1));
                    break;
                case 3: // Opción 3: Charlie
                    jugador1 = new Thread(new JugadorCharlie(1, i+1));
                    break;
                case 4: // Opción 4: Colaborativo
                    jugador1 = new Thread(new JugadorColaborador(1));
                    break;
                case 5: // Opción 5: Ratero
                    jugador1 = new Thread(new JugadorRatero(1));
                    break;
                default:
                    System.out.println("Opción no válida, eligiendo Alice. (Por tonto ahora elijo yo)");
                    jugador1 = new Thread(new JugadorAlice(2));
                    break;
            }
            switch (opcionJugador2) {
                case 1: // Opción 1: Bob 
                    jugador2 = new Thread(new JugadorBob(1, i+1));
                    break;
                case 2: // Opción 2: Alice
                    jugador2 = new Thread(new JugadorAlice(1));
                    break;
                case 3: // Opción 3: Charlie
                    jugador2 = new Thread(new JugadorCharlie(1, i+1));
                    break;
                case 4: // Opción 4: Colaborativo
                    jugador2 = new Thread(new JugadorColaborador(1));
                    break;
                case 5: // Opción 5: Ratero
                    jugador2 = new Thread(new JugadorRatero(1));
                    break;
                default:
                    System.out.println("Opción no válida, eligiendo Alice. (Por tonto ahora elijo yo)");
                    jugador2 = new Thread(new JugadorAlice(2));
                    break;
            }

            // Crear la partida
            Partida partida = new Partida(jugador1, jugador2);
            partida.jugar();
        }

        // Mostrar mensaje de finalización
        System.out.println("\nJuego terminado. ¡Gracias por jugar!");
        scanner.close();
    }
}
