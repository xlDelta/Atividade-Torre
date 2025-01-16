import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Torre {

    private static int movimento = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de discos: ");
        int n = scanner.nextInt();

        movimento = 0;
        Instant inicio = Instant.now();
        System.out.printf("Qnt de Discos  %d discos.%n", n);
        resolverTorresDeHanoi(n, 'A', 'C', 'B');
        Instant fim = Instant.now();

        Duration duracao = Duration.between(inicio, fim);
        long horas = duracao.toHours();
        long minutos = duracao.toMinutesPart();
        long segundos = duracao.toSecondsPart();
        long milissegundos = duracao.toMillisPart();

        System.out.printf("Tempo gasto: %02d:%02d:%02d:%03d%n", horas, minutos, segundos, milissegundos);
        System.out.printf("Quantidade de movimentos: %d%n", movimento);
        
       
    
    }

    private static void resolverTorresDeHanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            movimento++;
            return;
        }
        resolverTorresDeHanoi(n - 1, origem, auxiliar, destino);
        movimento++;
        resolverTorresDeHanoi(n - 1, auxiliar, destino, origem);
    }
}

/*

1) 1 disco

2) 10 discos

3) 20 discos

4) 30 discos

5) 40 discos

6) 41 discos

*/  