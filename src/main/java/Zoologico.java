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
                System.out.println("2. Registrar un nuevo animal");
                System.out.println("3. Ver hábitat y cuidados de los animales");
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
                            break;
                        case 2: // Animal Acuatico
                            System.out.println("Ingrese el tipo de aleta del animal:");
                            String setTipo_aleta = scanner.nextLine();
                            System.out.println("Ingrese si el animal nada:");
                            Boolean setNada = scanner.nextBoolean();
                            System.out.println("Ingrese si el animal tiene branquias:");
                            Boolean setBranquias = scanner.nextBoolean();
                            nuevo_animal = new Animales_Acuaticos(setNombre, setEdad, setRaza, setColor, setPeso, setAltura, setVacunado, setEsterilizado, setTipo_aleta, setNada, setBranquias);
                            break;

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
                }

                else if (opcion_visitante == 4) {
                        System.out.println("Bienvenido al kiosko interactivo, por favor seleccione una opcion:");
                        System.out.println("1. Ver informacion de un animal");
                        System.out.println("2. Ver informacion de un habitat");
                        System.out.println("3. Buscar informacion específica");
                        System.out.println("4. Salir al menu principal");

                        int opcion_kiosko = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcion_kiosko){
                            case 1:
                                //mostrar informacion de un animal
                                System.out.println("Por favor ingrese el nombre del animal que desea ver:");
                                String nombre_animal = scanner.nextLine();
                                for (Animales animal : animales) {
                                    if (animal.getNombre().equals(nombre_animal)) {
                                        kiosko.interactuarConAnimales(animal);
                                    }
                                }
                                break;

                            case 2:
                                //mostrar informacion de un habitat
                                System.out.println("Por favor ingrese el nombre del habitat que desea ver:");
                                String nombre_habitat = scanner.nextLine();
                                for (Hábitat habitat : habitats) {
                                    if (habitat.getNombre().equals(nombre_habitat)) {
                                        kiosko.interactuarConHabitat(habitat);
                                    }
                                }
                                break;

                            case 3:
                                System.out.println("Por favor ingrese su busqueda:");
                                String busqueda = scanner.nextLine();
                                kiosko.buscarInformacion(busqueda);
                                break;

                            case 4:
                                //salir al menu principal
                                continue;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                }
                else if (opcion_visitante == 5) {
                        continue;
                }



            }
            else if (opcion == 2) {
                System.out.println("Bienvenido al Zoologico, por favor seleccione una opcion:");
                System.out.println("1. Ver inventario");
                System.out.println("2. Agregar recurso al inventario");
                System.out.println("3. Eliminar recurso del inventario");
                System.out.println("4. Realizar mantenimiento");
                System.out.println("5. Salir al menu principal");

                int opcion_trabajador = scanner.nextInt();
                scanner.nextLine();

                if (opcion_trabajador == 1) {
                    System.out.println("El inventario tiene:");
                    System.out.println("Medicinas: " + inventario.cantidadMedicinas());
                    System.out.println("Alimentos: " + inventario.cantidadAlimentos());
                    System.out.println("Equipamiento: " + inventario.cantidadEquipamiento());
                }
                else if (opcion_trabajador == 2) {
                    System.out.println("Bienvenido al inventario, por favor seleccione una opcion:");
                    System.out.println("1. Agregar medicina");
                    System.out.println("2. Agregar alimento");
                    System.out.println("3. Agregar equipamiento");
                    System.out.println("4. Salir al menu principal");

                    int opcion_agregar = scanner.nextInt();
                    scanner.nextLine();

                    if (opcion_agregar == 1) {
                        System.out.println("Por favor ingrese la informacion de la medicina");
                        System.out.println("Ingrese el tipo de medicina:");
                        String tipo_medicina = scanner.nextLine();
                        System.out.println("Ingrese la fecha de caducidad:");
                        String fecha_caducidad = scanner.nextLine();
                        System.out.println("Ingrese el precio:");
                        Double precio = scanner.nextDouble();
                        scanner.nextLine();

                        Medicinas medicina = new Medicinas(tipo_medicina, fecha_caducidad);
                        medicina.setPrecio(precio);
                        inventario.agregarMedicina(medicina);
                    }
                    else if (opcion_agregar == 2) {
                        System.out.println("Por favor ingrese la informacion del alimento");
                        System.out.println("Ingrese el tipo de alimento:");
                        String tipo_alimento = scanner.nextLine();
                        System.out.println("Ingrese la fecha de caducidad:");
                        String fecha_caducidad = scanner.nextLine();
                        System.out.println("Ingrese el precio:");
                        Double precio = scanner.nextDouble();
                        scanner.nextLine();

                        Alimentos alimento = new Alimentos(tipo_alimento, fecha_caducidad);
                        alimento.setPrecio(precio);
                        inventario.agregarAlimento(alimento);
                    }

                    else if (opcion_agregar == 3) {
                        System.out.println("Por favor ingrese la informacion del equipamiento");
                        System.out.println("Ingrese el tipo de equipamiento:");
                        String tipo_equipamiento = scanner.nextLine();
                        System.out.println("Ingrese la fecha de adquisicion:");
                        String fecha_adquisicion = scanner.nextLine();
                        System.out.println("Ingrese el precio:");
                        Double precio = scanner.nextDouble();
                        scanner.nextLine();

                        Equipamiento equipamiento = new Equipamiento(tipo_equipamiento, fecha_adquisicion);
                        equipamiento.setPrecio(precio);
                        inventario.agregarEquipamiento(equipamiento);
                    }
                    else if (opcion_agregar == 4) {
                        continue;
                    }
                    else {
                        System.out.println("Opcion no valida");
                    }

                if (opcion_trabajador == 3) {
                        System.out.println("Bienvenido al inventario, por favor seleccione una opcion:");
                        System.out.println("1. Eliminar medicina");
                        System.out.println("2. Eliminar alimento");
                        System.out.println("3. Eliminar equipamiento");
                        System.out.println("4. Salir al menu principal");

                        int opcion_eliminar = scanner.nextInt();
                        scanner.nextLine();

                        if (opcion_eliminar == 1) {
                            System.out.println("Por favor ingrese el tipo de medicina a eliminar:");
                            String tipo_medicina = scanner.nextLine();
                            inventario.eliminarMedicina(tipo_medicina);
                        }
                        else if (opcion_eliminar == 2) {
                            System.out.println("Por favor ingrese el tipo de alimento a eliminar:");
                            String tipo_alimento = scanner.nextLine();
                            inventario.eliminarAlimento(tipo_alimento);
                        }
                        else if (opcion_eliminar == 3) {
                            System.out.println("Por favor ingrese el tipo de equipamiento a eliminar:");
                            String tipo_equipamiento = scanner.nextLine();
                            inventario.eliminarEquipamiento(tipo_equipamiento);
                        }
                        else if (opcion_eliminar == 4) {
                            continue;
                        }
                        else {
                            System.out.println("Opcion no valida");
                        }

                if (opcion_trabajador == 4) {
                            System.out.println("Bienvenido al mantenimiento, por favor seleccione una opcion:");
                            System.out.println("1. Realizar mantenimiento a un habitat");
                            System.out.println("2. Realizar mantenimiento a un recurso");
                            System.out.println("3. Salir al menu principal");

                            int opcion_mantenimiento = scanner.nextInt();
                            scanner.nextLine();

                            if (opcion_mantenimiento == 1) {
                                System.out.println("Por favor ingrese el nombre del habitat al que desea realizar mantenimiento:");
                                String nombre_habitat = scanner.nextLine();
                                for (Hábitat habitat : habitats) {
                                    if (habitat.getNombre().equals(nombre_habitat)) {
                                        // Aquí puedes llamar a un método para realizar mantenimiento al habitat
                                        // Por ejemplo: mantenimiento.realizarMantenimientoHabitat(habitat);
                                    }
                                }
                            }
                            else if (opcion_mantenimiento == 2) {
                                System.out.println("Por favor ingrese el tipo de recurso al que desea realizar mantenimiento:");
                                String tipo_recurso = scanner.nextLine();
                                // Aquí puedes llamar a un método para realizar mantenimiento al recurso
                                // Por ejemplo: mantenimiento.realizarMantenimientoRecurso(tipo_recurso);
                            }
                            else if (opcion_mantenimiento == 3) {
                                continue;
                            }
                            else {
                                System.out.println("Opcion no valida");
                            }
                        }

                else if (opcion_trabajador == 5) {
                    continue;
                }

                else {
                    System.out.println("Opcion no valida");
                }


                if (opcion == 3) {
                // Salir del programa
                System.out.println("Gracias por visitar el Zoologico");
                break;
                }




                }

                }

                }
                }

    }
}