package TPO;

import java.util.Scanner;

public class MainTurnos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SistemaTurnos sistema = new SistemaTurnos();

        int opcion;
        do {
            System.out.println("\n--- MENÚ DE TURNOS ---");
            System.out.println("1. Asignar turno");
            System.out.println("2. Llamar siguiente turno");
            System.out.println("3. Ver turnos en espera");
            System.out.println("4. Ver historial de atención");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = input.nextLine();
                    System.out.print("Trámite (apertura de cuenta / consulta de saldo / pago de servicios): ");
                    String tramite = input.nextLine();
                    //sistema.asignarTurno(nombre, tramite);
                    break;
                case 2:
                    //sistema.llamarTurno();
                    break;
                case 3:
                    //sistema.mostrarTurnos();
                    break;
                case 4:
                    //sistema.mostrarHistorial();
                    break;
                case 0:
                    System.out.println("👋 Fin del sistema.");
                    break;
                default:
                    System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 0);
    }
}
