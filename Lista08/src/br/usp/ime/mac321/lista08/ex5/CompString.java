package ex5;

public class CompString {

    public static void main(String[] args) {
        int n = 100000; // número de concatenações

        // Medir tempo de concatenação com String
        long inicio = System.currentTimeMillis();

        // Em uma string normal, a concatenação será feita
        // com um += a cada concatenação.
        String palavra = "";
        for (int i = 0; i < n; i++) {
            palavra += "a";
        }
        long fim = System.currentTimeMillis();
        long durationString = fim - inicio;

        // Medir tempo de concatenação com StringBuffer
        inicio = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();

        // Em um StringBuffer, a concatenação será feita
        // com um append a cada concatenação.
        for (int i = 0; i < n; i++) {
            stringBuffer.append("a");
        }
        fim = System.currentTimeMillis();
        long durationStringBuffer = fim - inicio;

        // Exibir resultados
        System.out.println("Número de concatenações: " + n);
        System.out.println("Palavra resultante: " + palavra);
        System.out.println("Tempo de concatenação com String: " + durationString + " ms");
        System.out.println("Tempo de concatenação com StringBuffer: " + durationStringBuffer + " ms");

        // Resposta:
        // O tempo de concatenação com String é muito maior do que com stringbuffer. Isso ocorre
        // porque o '+=' ao concatenar a string irá criar um novo objeto type string a cada concatenação,
        // enquanto o append do StringBuffer irá apenas adicionar o caractere ao buffer, sem criar um novo objeto.
    }
}
