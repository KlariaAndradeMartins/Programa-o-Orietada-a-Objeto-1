import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String time;
        String tecnico;
        String [] jogadores = new String[11];

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome do Time: ");
        time = ler.next();

        System.out.println("\nDigite o nome do Tecnico: ");
        tecnico = ler.next();

        System.out.println("Digite o nome dos jogadores: ");
        for (int i = 0; i < 11; i++){
            jogadores[i]= ler.next();
        }

        Seleção t1 = new Seleção(time, tecnico, jogadores);

        String time2;
        String tecnico2;
        String [] jogadores2 = new String[11];

        System.out.println("Digite o nome do Time: ");
        time2 = ler.next();

        System.out.println("\nDigite o nome do Tecnico: ");
        tecnico2 = ler.next();

        System.out.println("Digite o nome dos jogadores: ");
        for (int i = 0; i < 11; i++){
            jogadores2[i]= ler.next();
        }

        Seleção t2 = new Seleção(time2, tecnico2, jogadores2);

    }
}
