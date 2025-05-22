public class MatrizBinaria {
    public static void main(String[] args) {
        
        String[][] matriz = {
            {"10101101", "10101101", "10101101", "10101101"},
            {"11101101", "10101111", "11101101", "10101111"},
            {"10101111", "10101101", "10101111", "10101111"},
            {"11101101", "10111101", "10111101", "11101101"}
        };
        
        int somaDecimal = 0;
        
        
        for (int i = 0; i < 4; i++) {
            somaDecimal += Integer.parseInt(matriz[i][i], 2); 
        }
        
        
        System.out.println("Código de acesso: " + somaDecimal);
    }
}
