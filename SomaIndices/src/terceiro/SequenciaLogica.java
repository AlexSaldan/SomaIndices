package terceiro;

public class SequenciaLogica {
    public static void main(String[] args) {
        // Chama os métodos para calcular o próximo elemento de cada sequência e imprime os resultados
        System.out.println("a) " + proximoElementoA(7));
        System.out.println("b) " + proximoElementoB(64));
        System.out.println("c) " + proximoElementoC(36));
        System.out.println("d) " + proximoElementoD(64));
        System.out.println("e) " + proximoElementoE(8));
        System.out.println("f) " + proximoElementoF(19));
    }

    // Calcula o próximo elemento da sequência A: soma 2 ao último elemento
    public static int proximoElementoA(int ultimoElemento) {
        return ultimoElemento + 2;
    }

    // Calcula o próximo elemento da sequência B: multiplica o último elemento por 2
    public static int proximoElementoB(int ultimoElemento) {
        return ultimoElemento * 2;
    }

    // Calcula o próximo elemento da sequência C: eleva ao quadrado a raiz quadrada do último elemento e soma 1
    public static int proximoElementoC(int ultimoElemento) {
        return (int) Math.pow(Math.sqrt(ultimoElemento) + 1, 2);
    }

    // Calcula o próximo elemento da sequência D: eleva ao quadrado a raiz quadrada do último elemento e soma 1
    public static int proximoElementoD(int ultimoElemento) {
        int raiz = (int) Math.sqrt(ultimoElemento);
        return (raiz + 1) * (raiz + 1);
    }

    // Calcula o próximo elemento da sequência E: soma os dois últimos elementos
    public static int proximoElementoE(int ultimoElemento) {
        int anterior = 8;
        int anteriorAnterior = 5;
        int proximo = anterior + anteriorAnterior;
        return proximo;
    }

    // Calcula o próximo elemento da sequência F: utiliza um array de incrementos e o último elemento
    public static int proximoElementoF(int ultimoElemento) {
        int[] incrementos = {8, 2, 4, 1, 1, 1}; // Array com os incrementos
        int indice = ultimoElemento - 2; // Calcula o índice no array de incrementos

        // Garante que o índice esteja dentro dos limites do array
        if (indice >= 0 && indice < incrementos.length) {
            return ultimoElemento + incrementos[indice]; // Retorna o próximo elemento calculado
        } else {
            return -1; // Retorna -1 para indicar que o índice está fora dos limites do array
        }
    }
}



