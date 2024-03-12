import Animales.*;
import Hábitats.*;
import Mantenimiento_Seguridad.*;
import Recursos.*;
import Visitantes.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Zoologico {

    public static void main(String[] args) {
        List <Hábitat> habitats = new ArrayList<>();
        List <Animales> animales = new ArrayList<>();
        List <Recursos> recursos = new ArrayList<>();
        List <Mantenimiento> mantenimientos = new ArrayList<>();
        List <Camara> camaras = new ArrayList<>();
        List <Sensores> sensores = new ArrayList<>();
        Seguridad seguridad = new Seguridad(camaras, sensores);
        Kiosko_Interactivo kiosko = new Kiosko_Interactivo();
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al Zoologico, por favor seleccione una opcion:");
            System.out.println("1. Visitantes");
            System.out.println("2. Trabajador");
            System.out.println("3. Salir");

        }


    }
}
