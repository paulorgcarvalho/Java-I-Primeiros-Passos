public class CalculaFatorial {
    public static void main(String[] args) {
        int fatorial = 1;

        for(int n = 1; n < 11; n++){
                fatorial *= n;
                System.out.println("O fatorial de " + n + " é " + fatorial);
        }
    }
}
