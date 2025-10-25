/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prjvezesretaurante;

import java.util.Scanner;

/**
 *
 * @author morei
 */
public class VezesRestaurante {

 public static void main(String[] args) {

        Scanner alunos = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos pesquisados: ");
        int totalAlunos = alunos.nextInt();

        int menosDeDez = 0;
        int entreDezEQuinze = 0;
        int maisDeQuinze = 0;

        // Loop para ler o número de vezes que cada aluno utilizou o restaurante
        for (int i = 1; i <= totalAlunos; i++) {
            System.out.print("Digite o número de vezes que o aluno " + i + " utilizou o restaurante: ");
            int vezes = alunos.nextInt();

            // Classifica o aluno de acordo com o número de vezes
            if (vezes < 10) {
                menosDeDez++;
            } else if (vezes <= 15) {
                entreDezEQuinze++;
            } else {
                maisDeQuinze++;
            }
        }

        // Calculando os percentuais
        double percentualMenosDeDez = (menosDeDez * 100.0) / totalAlunos;
        double percentualEntreDezEQuinze = (entreDezEQuinze * 100.0) / totalAlunos;
        double percentualMaisDeQuinze = (maisDeQuinze * 100.0) / totalAlunos;

        // Exibindo os resultados formatados
        System.out.println("\n===== RESULTADOS =====");
        System.out.printf("Percentual de alunos que usaram menos de 10 vezes: %.2f%%\n", percentualMenosDeDez);
        System.out.printf("Percentual de alunos que usaram entre 10 e 15 vezes: %.2f%%\n", percentualEntreDezEQuinze);
        System.out.printf("Percentual de alunos que usaram mais de 15 vezes: %.2f%%\n", percentualMaisDeQuinze);

        alunos.close();
    }
}