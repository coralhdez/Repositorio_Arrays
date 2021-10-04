package proyecto_arrays;

import java.util.Scanner;
import proyecto_arrays.dominio.Persona;

public class Proyecto_Arrays {

    public static void main(String[] args) {

        Persona personas[] = new Persona[3];
        Scanner entrada = new Scanner(System.in);

        //Persona personas[] ={new Persona("Santi"), new Persona ("Iker"), new Persona ("Maria")};
//        personas[0] = new Persona("Santiago");
//        personas[1] = new Persona("Iker");
//        personas[2] = new Persona("María");

        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona();
            System.out.println("Introduce un nombre: ");
            personas[i].setNombre(entrada.nextLine());
            System.out.println("Mostrando nombre almacenado en el array Personas: ");
            
            System.out.println("personas [" + i + "] -> " + personas[i].getNombre());

        }

    }

}
