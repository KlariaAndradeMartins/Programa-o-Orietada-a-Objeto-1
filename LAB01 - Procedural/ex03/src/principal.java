import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.*;


public class principal {

   public static void ex01(){
       Scanner sc = new Scanner(System.in);
       int val1,val2,val3,val4,val5,val6;

       System.out.println("<< Listando um vetor >>");
       System.out.println("Entre com o número 1:");
       val1 = sc.nextInt();

       System.out.println("Entre com o número 2:");
       val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        int [] arm = new int[5];
        arm[0] = val1;
        arm[1] = val2;
        arm[2] = val3;
        arm[3] = val4;
        arm[4] = val5;
        arm[5] = val6;

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", arm[0], arm[1], arm[2], arm[3], arm[4], arm[5]);
    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int [] vet = new int[6];

        System.out.println("<<Listando Vetores: >>");
        for (int i = 0; i<6; i ++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }
        System.out.println("Os valores lidos são:");
        for (int i = 5; i >=0 ; i--){
            System.out.printf("%d ",vet[i]);
        }

    }

    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<<Listando Vetores:>>");

        int i = 0;

        while(i < 6){
            System.out.println("Entre com o número %d:\n");
            vet[i] = sc.nextInt();
            if (vet[i] % 2 == 0){
                i++;
            }
            else{
               System.out.println("<<Erro: Valor inválido>>");
            }

        }

        System.out.println("Os valores lidos são:");
        for (i = 0; i < 6; i++){
            System.out.printf("%d, ",vet[i]);
        }

    }

    public static void ex05(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int media = 0;
        int maior = 0;
        int menor = 0;
        System.out.println("<< 5 valores >>");

        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            media = media + vet[i];
        }
        System.out.printf("Os números digitados são: ");
        for (int i = 0; i < 5; i++){
            System.out.printf("%d ",vet[i]);
        }
        BubbleSort b1 = new BubbleSort();
        b1.ordenar(vet);
        System.out.printf("\nO maior valor é: %d ", vet[4]);
        System.out.printf("\nO menor valor é: %d ", vet[0]);
        System.out.printf("\nA média é: %d ",media/4);
    }
    public static void ex06(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int media = 0;
        int maior = 0;
        int menor = 0;
        int cout_maior = 0;
        int cout_menor = 0;
        System.out.println("<< 5 valores >>");

        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            media = media + vet[i];
            if(vet[i] > maior){
                maior = vet[i];
                cout_maior = i;
            }
        }
        for (int j = 0; j < 5; j++) {
            if(vet[j] < menor){
                menor = vet[j];
                cout_menor = j;
            }
        }
        System.out.printf("Os números digitados são: ");
        for (int i = 0; i < 5; i++){
            System.out.printf("%d ",vet[i]);
        }

        System.out.printf("\nO maior valor é: %d ", maior);
        System.out.printf(",localizado na posição %d", cout_maior);
        System.out.printf(" do vetor");
        System.out.printf("\nO menor valor é: %d ", menor);
        System.out.printf(",localizado na posição %d", cout_menor);
        System.out.printf(" do vetor");
        System.out.printf("\nA média é: %d ",media/4);
    }
    public static void ex07(){

        System.out.println("<<Normalizando as notas>>\n");
        Scanner sc = new Scanner(System.in);
        int [] vet = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com a nota do aluno %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Notas normalizadas\n");
        for (int j = 0; j < 5; j++){
            System.out.printf("\nA nota do aluno 1 %d:",j+1);
            System.out.printf("é %d", +vet[j] * 2);
        }
    }

    public static void ex08(){
        System.out.println("<< Média e desvio-padrão >>");
        Scanner entrada = new Scanner(System.in);
        int [] vet = new int[5];
        int media = 0;

        for (int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d:\n", i+1);
            vet[i] = entrada.nextInt();
            media = media + vet[i];
        }
        media = media/5;

        double mediadif = media;
        double [] dif = new double[5];
        double somaquad = 0.0;

        for(int j = 0; j < 5; j++){
            dif[j] = vet[j] - media;
            Math.pow(dif[j], 2);
            somaquad = somaquad + dif[j];
        }
        double desvio = Math.pow(somaquad/5, 0.5);

        System.out.printf("A média é %d", media);
        System.out.printf(" e o desvio-padrão é %d ", desvio);
    }

    public static void ex09(){
       int qtdAlunos = 0;
       Scanner entrada = new Scanner(System.in);

       System.out.printf("<< Média de n alunos. Máximo 100 alunos>>\n");

        do {
            System.out.printf("Entre com o número de alunos:\n");
            qtdAlunos = entrada.nextInt();

            if(qtdAlunos > 100){
                System.out.printf("Quantidade de alunos somente 100\n");
            }
        }
        while (qtdAlunos > 100);
        int [] vet = new int[qtdAlunos];
        int media = 0;

        for(int i = 0; i < qtdAlunos; i++){
            System.out.printf("Digite a nota do aluno %d:\n", i+1);
            vet[i] = entrada.nextInt();
            media = vet[i]+ media;
        }
        System.out.printf("%d", media);
    }

    public static void ex10(){
        System.out.printf("<< Subtração de Vetores>>\n");

        int [] vetA = new int[3];
        int [] vetB = new int[3];
        int [] vetC = new int[3];

        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < 3; i ++){
            System.out.printf("Digite o valor %d de A:\n", i+1);
            vetA[i] = entrada.nextInt();
        }

        for(int j = 0; j < 3; j ++){
            System.out.printf("Digite o valor %d de B:\n", j+1);
            vetB[j] = entrada.nextInt();
        }

        for(int n = 0; n < 3; n++){
            vetC[n] = vetA[n] - vetB[n];
        }

        System.out.printf("O vetor C, definido como C = A-B é ");

        for(int k = 0; k < 3; k++){
            System.out.println(vetC[k]);
        }

    }

    public static void ex11(){
       System.out.printf("<< Pares e Ímpares >>");

       int [] vet = new int[5];
        int [] impar = new int[5];
        int [] par = new int[5];
       Scanner entrada = new Scanner(System.in);

       for(int i = 0; i < 0; i ++){
           System.out.printf("Digite o valor %d:", i + 1);
           vet[i] = entrada.nextInt();
           if(vet[i] % 2 == 0){
                par[i] = vet[i];
           }
           else{
               impar[i] = vet[i];
           }
       }

    }

    public static void main(String[] args) {
//        ex01();
//        ex02();
//        ex03();
//        ex04();
//        ex05();
//        ex06();
//        ex07();
//        ex08();
//        ex09();
//        ex10();
    }


}
