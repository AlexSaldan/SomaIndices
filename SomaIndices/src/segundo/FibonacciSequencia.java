package segundo;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSequencia {
    public static ArrayList<Integer> fibonacciSequence(int n) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        
        while (fibonacci.get(fibonacci.size() - 1) < n) {
            int next = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            fibonacci.add(next);
        }
        
        return fibonacci;
    }
    
    public static boolean pertenceSequencia(int numero, ArrayList<Integer> fibonacci) {
        return fibonacci.contains(numero);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numeroInformado = scanner.nextInt();
        
        ArrayList<Integer> sequenciaFibonacci = fibonacciSequence(numeroInformado);
        
        if (pertenceSequencia(numeroInformado, sequenciaFibonacci)) {
            System.out.println("O número " + numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroInformado + " não pertence à sequência de Fibonacci até o valor máximo calculado.");
        }
        
        scanner.close();
    }
}

