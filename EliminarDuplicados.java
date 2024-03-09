package Primer2024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EliminarDuplicados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una lista para almacenar los números ingresados por el usuario
        List<Integer> numeros = new ArrayList<>();

        // Solicitar al usuario que ingrese los elementos a la lista
        System.out.println("Ingrese los numeros enteros (ingrese 'fin' para terminar):");
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equals("fin")) {
                break;
            }
            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero entero valido o 'fin' para terminar.");
            }
        }

        // Mostrar la lista con los enteros ingresados
        System.out.println("Lista con los enteros ingresados:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Preguntar al usuario si desea ver la lista sin duplicados
        System.out.print("---Quiere ver la lista sin duplicados? (s/n): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            // Eliminar duplicados directamente en la lista original
            Set<Integer> numerosSet = new HashSet<>(numeros);
            numeros.clear();
            numeros.addAll(numerosSet);

            // Mostrar la lista resultante sin duplicados
            System.out.println("Lista resultante sin duplicados:");
            for (Integer numero : numeros) {
                System.out.println(numero);
            }
        } else {
            System.out.println("Ha elegido no ver la lista sin duplicados. Fin del programa.");
        }
    }
}