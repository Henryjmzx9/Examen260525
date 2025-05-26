package ejerciciotrabajadores;

public class Main {
    public static void main(String[] args) {
        Futbolista jugador = new Futbolista(1, "Carlos", "Gómez", 28, 10, "Delantero");
        Entrenador tecnico = new Entrenador(2, "Miguel", "Pérez", 50, "FED123");
        Masajista masajista = new Masajista(3, "Sofía", "Martínez", 35, "Fisioterapia", 8);

        jugador.viajar();
        jugador.concentrarse();
        jugador.jugarPartido();

        tecnico.viajar();
        tecnico.concentrarse();
        tecnico.dirigirPartido();

        masajista.viajar();
        masajista.concentrarse();
        masajista.darMasaje();
    }
}