public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("Testando condicionais");
        int idade = 18;
        int quantidadePessoas = 2;
        boolean acompanhado;

        //boolean acompanhado = quantidadePessoas >= 2;
        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }


        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar...");
        }
    }
}
