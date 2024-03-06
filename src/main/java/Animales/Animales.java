package Animales;

public class Animales {

    String nombre;
    String tipo;
    String raza;
    String color;
    String edad;
    Float peso;
    Float altura;

    public Animales(String nombre, String tipo, String raza, String color, String edad, Float peso, Float altura) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Raza: " + raza);
        System.out.println("Color: " + color);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }

    public void mostrarTipo(){
        System.out.println("Tipo: " + tipo);
    }

    public void mostrarRaza(){
        System.out.println("Raza: " + raza);
    }


}

