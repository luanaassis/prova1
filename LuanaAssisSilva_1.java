import java.util.Scanner;
public class LuanaAssisSilva_1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int maiorAndar = 0, numAndar = 0, pessoaDesce = 0,  entSai =0;
        System.out.println("Informe quantos andares tem o elevador: ");
        int andares = teclado.nextInt();
        for (int i = 1; i <= andares; i++) {
            System.out.println("Quantas pessoas entraram no andar " + i + "?");
            int entrada = teclado.nextInt();
            System.out.println("Quantas pessoas saíram no andar " + i + "?");
            int saida = teclado.nextInt();
            if (entrada >= 0 && saida >= 0) {
                entSai += entrada - saida;
                if (entSai >= 0) {
                    if (entSai > maiorAndar) {
                        maiorAndar = entSai;
                        numAndar = i;
                    }
                    if (entSai > 15) {
                        System.out.println("Excesso de passageiros ! ");
                        System.out.println("Devem sair " + (entSai - 15));
                    }
                    if (i == andares) {
                        pessoaDesce = entSai;
                        System.out.println("No último andar, " + pessoaDesce + " estarão no elevador para descer");
                    }
                } else{
                    System.out.println("Número de pessoas inválido");
                    break;
                }
            }
        }
        System.out.println("O andar que continha maior número de passageiros é " + numAndar);
    }
}
