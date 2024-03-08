package quinto;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        try (// Inserindo a string via entrada do usuário
		Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite uma string para inverter: ");
			String inputString = scanner.nextLine();
			
			// Chamando o método para inverter a string
			String invertedString = inverterString(inputString);
			
			// Imprimindo a string invertida
			System.out.println("String invertida: " + invertedString);
		}
    }
    
    // Método para inverter a string
    public static String inverterString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        
        // Invertendo os caracteres
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        
        // Criando uma nova string a partir do array de caracteres invertidos
        return new String(charArray);
    }
}

