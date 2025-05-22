import java.util.Scanner;

public class CotacaoDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário o valor do dólar
        System.out.print("Digite a cotação do dólar: R$ ");
        double dolar = scanner.nextDouble();
        
        // Verifica a viabilidade da compra
        if (dolar <= 5.00) {
            System.out.println("Comprar dólar");
        } else if (dolar >= 5.50 && dolar <= 6.00) {
            System.out.println("Esperar compra");
        } else if (dolar >= 6.50 && dolar <= 8.00) {
            System.out.println("Não comprar");
        } else {
            System.out.println("Valores fora do intervalo de análise");
        }
        
        scanner.close();
    }
}
