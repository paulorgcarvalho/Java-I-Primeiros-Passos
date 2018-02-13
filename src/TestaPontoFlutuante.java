public class TestaPontoFlutuante {

    public static void main(String[] args){

        double salario = 1250.70;

        System.out.println("meu salario é " + salario);

        double idade = 37;

        double divisao = 3.14 / 2;
        System.out.println("O resultado da divisao é " + divisao);

        int outraDivisao = 5/2; //Mesmo que o resultado seja double, ele força um INTEIRO
        System.out.println(outraDivisao);

        double novaTentativa = 5/2; //O java primeiro faz a conta, depois atribui ao double
        System.out.println(novaTentativa);

        double novaTentativa2 = 5.0/2;
        System.out.println(novaTentativa2); //usando um double na conta força o resultado correto neste caso







    }
}
