package utm.colas2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Colas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear las dos colas para almacenar los valores
        Queue<Integer> cola1 = new LinkedList<>();
        Queue<Integer> cola2 = new LinkedList<>();
        
        // Solicitar al usuario que ingrese los valores para la primera cola
        System.out.println("Ingrese 5 valores para la primera cola:");
        for (int i = 0; i < 5; i++) {
            int valor = scanner.nextInt();
            cola1.add(valor);
        }
        
        // Solicitar al usuario que ingrese los valores para la segunda cola
        System.out.println("Ingrese 5 valores para la segunda cola:");
        for (int i = 0; i < 5; i++) {
            int valor = scanner.nextInt();
            cola2.add(valor);
        }
        
        // Crear una cola de prioridad (min-heap) para ordenar los valores de ambas colas
        PriorityQueue<Integer> colaOrdenada = new PriorityQueue<>(cola1);
        colaOrdenada.addAll(cola2);
        
        // Crear la cola final unida y ordenada
        Queue<Integer> colaFinal = new LinkedList<>();
        while (!colaOrdenada.isEmpty()) {
            colaFinal.add(colaOrdenada.poll());
        }
        
        // Mostrar los valores de la cola final unida y ordenada
        System.out.println("La cola final unida y ordenada en forma ascendente es:");
        while (!colaFinal.isEmpty()) {
            System.out.print(colaFinal.poll() + " ");
        }
    }
}
