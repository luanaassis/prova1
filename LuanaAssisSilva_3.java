import java.util.Scanner;
public class LuanaAssisSilva_3 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0, count = 1;
        System.out.println("Informe um número: ");
        int numero  = teclado.nextInt();
        for(int i = numero; i > 0;  i--) {
            if (numero % i == 0) {
                soma += i;
            }
        }
        if(soma % 2 == 0){
            System.out.println("Número Irmão Par");
        } else{
            System.out.println("Número Irmão Ímpar");
        }
    }
}
