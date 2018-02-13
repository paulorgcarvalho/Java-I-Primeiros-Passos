public class TestaLaco3 {
    public static void main(String[] args) {
        //Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.
        for(int contador = 1; contador <= 100; contador++){
            if(contador % 3 == 0){
                System.out.print(contador);
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("Outra abordagem:");

        for(int i = 3; i <= 100; i+=3){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
