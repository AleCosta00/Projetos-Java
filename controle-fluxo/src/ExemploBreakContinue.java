public class ExemploBreakContinue {
    public static void main(String[] args) {

        //Exemplo de laço de repetição utilizando o BREAK

        for(int numero = 1; numero <= 5; numero ++){
            if (numero == 3) {
                break;
            }
            System.out.println(numero);
        }

        System.out.println("============");

        //Exemplo de laço de repetição utilizando o CONTINUE

        for(int contador = 1; contador <= 5; contador ++){
            if (contador == 3) {
                continue;
            }
            System.out.println(contador);
        }
    }
    
}
