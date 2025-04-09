package TPO;

public class Turno {
    int dni;
    String nombre;
    String tramite;
    int prioridad;

    public Turno(int dni, String nombre, String tramite) {
        this.dni = dni;
        this.nombre = nombre;
        this.tramite = tramite;
        this.prioridad = calcularPrioridad(tramite);
    }

    private int calcularPrioridad(String tramite) {
        tramite = tramite.toLowerCase();
        if (tramite.equals("apertura de cuenta")) return 3;
        if (tramite.equals("consulta de saldo")) return 2;
        return 1;
    }

    public String toString() {
        return "[DNI: " + dni + "] " + nombre + " - " + tramite + " (P: " + prioridad + ")";
    }
}
