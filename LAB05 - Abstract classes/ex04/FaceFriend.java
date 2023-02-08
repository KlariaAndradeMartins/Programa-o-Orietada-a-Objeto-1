import java.util.Scanner;

public class FaceFriend {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n Quantos contatos quer cadastrar?? ");
        int n = entrada.nextInt();
        Contato lista01 [] = new Contato[n];


        for (int i = 0; i < n; i++){

            System.out.println("\n-------------------------------------------------------");
            System.out.println("1 - Cadastrar Familiar\n2 - Cadastrar Amigo\n3 - Cadastrar o um outro tipo de contato. ");
            System.out.println("-------------------------------------------------------");
            int j = entrada.nextInt();

            String Apelido;
            String nome;
            String email;
            String aniversario;
            String familiar;
            int grau;
            String tipo;

            if (j == 1){
                System.out.println("\nDigite o nome: ");
                nome = entrada.next();
                System.out.println("\nApelido: ");
                Apelido = entrada.next();
                System.out.println("\nEmail: ");
                email = entrada.next();
                System.out.println("\nAniversario: ");
                aniversario = entrada.next();
                System.out.println("\nGrau Familiar: ");
                familiar = entrada.next();

                lista01[i] = new Familia(Apelido, nome, email, aniversario, familiar);
            }
            else if(j == 2){
                System.out.println("\nDigite o nome: ");
                nome = entrada.next();
                System.out.println("\nApelido: ");
                Apelido = entrada.next();
                System.out.println("\nEmail: ");
                email = entrada.next();
                System.out.println("\nAniversario: ");
                aniversario = entrada.next();
                System.out.println("\nGrau de proximidade: ");
                grau = entrada.nextInt();

                lista01[i] = new Amigos(Apelido, nome, email, aniversario, grau);
            }
            else{
                System.out.println("\nDigite o nome: ");
                nome = entrada.next();
                System.out.println("\nApelido: ");
                Apelido = entrada.next();
                System.out.println("\nEmail: ");
                email = entrada.next();
                System.out.println("\nAniversario: ");
                aniversario = entrada.next();
                System.out.println("\nO que esse contato: ");
                tipo = entrada.next();

                lista01[i] = new Trabalho(Apelido, nome, email, aniversario, tipo);
            }
        }

        System.out.println("\n-----------------------------Todos os contatos cadastrados---------------------------");
        for (int k = 0; k < n; k++){
            lista01[k].imprimirContato();
        }

        System.out.println("\n---------------------------Todos os Familiares ---------------------------------------");
        for (int m = 0; m < n; m++){
            if (lista01[m].getClass() == Familia.class){
                lista01[m].imprimirContato();
            }
        }

        System.out.println("\n--------------------------Todos os amigos----------------------------------------------");
        for (int m = 0; m < n; m++){
            if (lista01[m].getClass() == Amigos.class){
                lista01[m].imprimirContato();
            }
        }

        System.out.println("\n--------------------------Todos os Colegas de Trabalho ----------------------------------------------");
        for (int m = 0; m < n; m++){
            if (lista01[m].getClass() == Trabalho.class){
                lista01[m].imprimirContato();
            }
        }
    }
}
