public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 18;
        int quantidadePessoas = 2;
        boolean acompanhado = quantidadePessoas >= 2; // nao necessariamente true ou false

        //Na linha acima, "quantidadePessoas >= 2" é uma expressão booleana que retorna true ou false
        //System.out.println("O valor de acompanhado é " + acompanhado);

        if (idade >= 18 && acompanhado) { //Nao é necessario declarar acompanhado == true
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar...");
        }
    }
}
