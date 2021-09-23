import java.util.Scanner;
public class LuanaAssisSilva_4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int NotasAbaixo50 = 0;
        System.out.println("Informe o número de alunos: ");
        int alunos = teclado.nextInt();
        String[] nome = new String[alunos];
        double[] nota = new double[alunos];
        double maiorNota = nota[0];
        double menorNota = nota[0];
        double somaNota =  nota[0];
        String alunoMaior = nome[0];
        String alunoMenor = nome[0];
        for(int i = 0; i < alunos; i++){
            teclado.nextLine();
            System.out.println("Informe o nome do aluno: ");
            nome[i] = teclado.nextLine();
            System.out.println("Informe a nota do aluno: ");
            nota[i] = teclado.nextDouble();
            if(nota[i]<0&&nota[i]>100){
                System.out.println("Nota inválida");
                break;
            }
        }
        for (int j = 0 ; j < alunos; j++){
            if (j==0){
               menorNota = nota[j];
               alunoMenor = nome[j];
               maiorNota = nota[j];
               alunoMaior = nome[j];
            }
            if ( nota[j] > maiorNota) {
                maiorNota = nota[j];
                alunoMaior = nome[j];
            }
            if(nota[j] < menorNota){
                menorNota = nota[j];
                alunoMenor = nome[j];
            }
            if(nota[j] < 50){
                NotasAbaixo50 += 1;
            }
            somaNota += nota[j];
        }
        System.out.println("A soma das notas é "+somaNota+", e a média é "+ (somaNota/alunos));
        System.out.println(NotasAbaixo50+", tiraram notas abaixo de  50.");
        System.out.println(alunoMaior+", tirou a maior nota, sendo ela : "+maiorNota);
        System.out.println(alunoMenor+", tirou a menor nota, sendo ela : "+menorNota);
    }
}
