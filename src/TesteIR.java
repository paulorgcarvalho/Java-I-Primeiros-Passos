public class TesteIR {
    public static void main(String[] args) {

        double salario = 3300.0;

        if (salario >= 1900.0 && salario < 2800.0){
            System.out.println("O IR é de 7.5% e pode deduzir o valor de R$ 142");
        }else if (salario >= 2800.0 && salario < 3751.00){
            System.out.println("O IR é de 15% e pode deduzir R$ 350");
        }else if (salario >= 3751.00 && salario < 4664.0){
            System.out.println("O IR é de 22.5% e pode deduzir R$ 636");
        }
    }
}
