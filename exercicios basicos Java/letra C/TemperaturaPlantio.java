public class TemperaturaPlantio {
    public static void main(String[] args) {
        // Matriz de temperaturas
        double[][] temperaturas = {
            {21.4, 18.5, 19.2},
            {32.11, 34.5, 28.10}
        };
        
        // Nomes dos meses
        String[] meses = {"Janeiro", "Fevereiro", "Março"};
        
        // Verifica a média de cada mês
        for (int i = 0; i < meses.length; i++) {
            double media = (temperaturas[0][i] + temperaturas[1][i]) / 2;
            
            // Exibe o resultado
            if (media > 30) {
                System.out.println(meses[i] + ": Possível plantar milho. Média: " + media + "°C");
            } else {
                System.out.println(meses[i] + ": Impossível plantar milho. Média: " + media + "°C");
            }
        }
    }
}
