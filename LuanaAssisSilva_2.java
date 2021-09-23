import java.util.Scanner;
public class LuanaAssisSilva_2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um  valor inteiro: ");
        int numero = teclado.nextInt();
        String resultado = "";
        int resto = numero;
        while (resto > 0) {
            resultado = (resto % 2) + resultado;
            resto = resto / 2;
        }
        System.out.println( resultado + " é o número "+ numero +" em  binário.");
    }
}