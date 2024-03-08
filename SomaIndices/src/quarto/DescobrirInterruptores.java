package quarto;

import java.util.Random;

public class DescobrirInterruptores {
    public static void main(String[] args) {
        // Simulando as lâmpadas em três salas
        boolean[] lampadas = new boolean[3];
        Random random = new Random();

        // Ligar um interruptor aleatório
        int interruptor1 = random.nextInt(3);
        ligarInterruptor(interruptor1, lampadas);

        // Desligar o interruptor aleatório e ligar outro interruptor aleatório
        int interruptor2;
        do {
            interruptor2 = random.nextInt(3);
        } while (interruptor2 == interruptor1);
        desligarInterruptor(interruptor1, lampadas);
        ligarInterruptor(interruptor2, lampadas);

        // Verificar o estado das lâmpadas para determinar qual interruptor controla cada lâmpada
        for (int i = 0; i < lampadas.length; i++) {
            System.out.println("Lâmpada " + (i + 1) + ": " + (lampadas[i] ? "ligada" : "desligada"));
        }
    }

    // Método para ligar o interruptor e acender a lâmpada correspondente
    public static void ligarInterruptor(int interruptor, boolean[] lampadas) {
        lampadas[interruptor] = true;
    }

    // Método para desligar o interruptor e apagar a lâmpada correspondente
    public static void desligarInterruptor(int interruptor, boolean[] lampadas) {
        lampadas[interruptor] = false;
    }
}

