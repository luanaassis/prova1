import java.util.Scanner;
public class LuanaAssisSilva_5 {
    public static void main(String args[]) {
        boolean interruptor1 = false, interruptor2 = false;
        int interruptor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe quantas vezes os interruptores foram apertados no total: ");
        int numApertos = teclado.nextInt();
        for (int i = 0; i < numApertos; i++) {
            boolean validacao = false;
            while (!validacao){
                System.out.println("Informe o interruptor apertado: ");
                interruptor  =  teclado.nextInt();
                if (interruptor == 1 ){
                    interruptor1 = !interruptor1;
                    validacao = true;
                }else if (interruptor == 2 ){
                    interruptor1 = !interruptor1;
                    interruptor2 = !interruptor2;
                    validacao = true;
                }
            }
        }
        if (interruptor1 && interruptor2){
            System.out.println(" A lâmpada 1 e a lâmpada 2 estão ligadas");
        }else if(interruptor1){
            System.out.println( " A lâmpada 1 está ligada e a lâmpada 2 está desligada");
        }else if(interruptor2){
            System.out.println(" A lâmpada 1 está desligada e a lâmpada 2 está ligada");
        }else{
            System.out.println( " A lâmpada 1 e a lâmpada 2 estão desligadas");
        }
    }
}
