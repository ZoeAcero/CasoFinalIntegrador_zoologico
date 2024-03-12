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

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1 ) {
                System.out.println("Bienvenido al Zoologico, por favor seleccione una opcion:");
                System.out.println("1. Ver un animal");
                System.out.println("2. Ver hábitat y cuidados de los animales");
                System.out.println("3. Registrar un nuevo animal");
                System.out.println("4. Ir al kiosko interactivo");
                System.out.println("5. Salir al menu principal");

                int opcion_visitante = scanner.nextInt();
                scanner.nextLine();

                if (opcion_visitante == 1) {
                    System.out.println("Por favor ingreses el nombre del animal que desea ver:");
                    String nombre_animal = scanner.nextLine();
                    for (Animales animal : animales) {
                        if (animal.getNombre().equals(nombre_animal)) {
                            System.out.println(animal);
                        }
                    }

                }

                else if (opcion_visitante == 2){
                    System.out.println("Por favor ingrese la información del nuevo animal");
                    System.out.println("Ingrese el tipo de animal (1.Terrestre, 2.Acuatico, 3.Aviario:");
                    int tipo_animal = scanner.nextInt();
                    scanner.nextLine();


                    System.out.println("Ingrese el nombre del animal:");
                    String setNombre = scanner.nextLine();
                    System.out.println("Ingrese la edad del animal:");
                    String setEdad = scanner.nextLine();
                    System.out.println("Ingrese la raza del animal:");
                    String setRaza = scanner.nextLine();
                    System.out.println("Ingrese el color del animal:");
                    String setColor = scanner.nextLine();
                    System.out.println("Ingrese el peso del animal:");
                    Float setPeso = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.println("Ingrese la altura del animal:");
                    Float setAltura = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.println("Ingrese si el animal esta vacunado (true/false):");
                    Boolean setVacunado = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.println("Ingrese si el animal esta esterilizado (true/false):");
                    Boolean setEsterilizado = scanner.nextBoolean();
                    scanner.nextLine();


                    Animales nuevo_animal = null;

                    switch (tipo_animal){
                        case 1: // Animal Terrestrees
                            System.out.println("Ingrese el pelaje del animal:");
                            String setPelaje = scanner.nextLine();
                            System.out.println("Ingrese el numero de patas del animal:");
                            int setNumero_patas = scanner.nextInt();
                            nuevo_animal = new Animales_Terrestres(setNombre, setEdad, setRaza, setColor, setPeso, setAltura, setVacunado, setEsterilizado, setPelaje, setNumero_patas);
                        case 2: // Animal Acuatico
                            System.out.println("Ingrese el tipo de aleta del animal:");
                            String setTipo_aleta = scanner.nextLine();
                            System.out.println("Ingrese si el animal nada:");
                            Boolean setNada = scanner.nextBoolean();
                            System.out.println("Ingrese si el animal tiene branquias:");
                            Boolean setBranquias = scanner.nextBoolean();
                            nuevo_animal = new Animales_Acuaticos(setNombre, setEdad, setRaza, setColor, setPeso, setAltura, setVacunado, setEsterilizado, setTipo_aleta, setNada, setBranquias);

                        case 3: // Animal Aviario
                            System.out.println("Ingrese el tipo de pico del animal:");
                            String setTipo_pico = scanner.nextLine();
                            System.out.println("Ingrese si el animal vuela:");
                            Boolean setVuela = scanner.nextBoolean();
                            System.out.println("Ingrese si el animal tiene plumas:");
                            Boolean setPlumas = scanner.nextBoolean();
                            nuevo_animal = new Animales_Aviarios(setNombre, setEdad, setRaza, setColor, setPeso, setAltura, setVacunado, setEsterilizado, setTipo_pico, setVuela, setPlumas);


                        default:
                            System.out.println("Opcion no valida");
                            break;

                    }

                    if (nuevo_animal != null) {
                        animales.add(nuevo_animal);
                        System.out.println("El animal ha sido registrado con exito");
                    }
                }
                else if (opcion_visitante == 3) {
                    System.out.println("Por favor ingrese el nombre del habitat que desea ver:");
                    String nombre_habitat = scanner.nextLine();
                    for (Hábitat habitat : habitats) {
                        if (habitat.getNombre().equals(nombre_habitat)) {
                            System.out.println(habitat);
                        }
                        else {
                            System.out.println("Habitat no encontrado");
                        }
                    }

                else if (opcion_visitante == 4) {
                        System.out.println("Bienvenido al kiosko interactivo, por favor seleccione una opcion:");
                    }
                else if (opcion_visitante == 5) {
                    continue;
                }







            }

        }


    }
}
