import java.util.Scanner;

public class FrutasPreco {
    public static void main(String[] args) {
        
        String[] vetFruta = {"banana", "20", "maçã", "32", "pera", "11"};
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o nome da fruta: ");
        String frutaBuscada = scanner.nextLine();
        
        boolean frutaEncontrada = false; 

        
        for (int i = 0; i < vetFruta.length; i += 2) { 
            if (vetFruta[i].equalsIgnoreCase(frutaBuscada)) { 
                int precoOriginal = Integer.parseInt(vetFruta[i + 1]);
                double precoComAcrescimo = precoOriginal * 1.05; 
                
                
                System.out.println("O novo preço da " + frutaBuscada + " com 5% de acréscimo é: R$ " + precoComAcrescimo);
                frutaEncontrada = true;
                break; 
            }
        }

        
        if (!frutaEncontrada) {
            System.out.println("FRUTA INEXISTENTE");
        }
        
        scanner.close(); 
    }
}
