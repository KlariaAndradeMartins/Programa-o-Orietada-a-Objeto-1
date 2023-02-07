import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercicios 2
        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos veiculos quer cadastrar? ");
        int n = ler.nextInt();

        Bike c1 [] = new Bike[n];
        for(int i = 0; i < n; i++){
            System.out.println("\n1 - SpeedBike"  +  "\n2- MountainBike" + "\n3- Bike"  + "\n4- Outros");
            int x = ler.nextInt();
            if (x == 1){
                // vou colocar os dados manuais para facilitar
                c1[i] = new SpeedBike(1.0, 1, 2, "SpeeedBike", "123456789", "Renault");
            }
            else if (x==2){
                c1[i] = new MountainBike(1.0, 1, "ar", "SpeeedBike", "123456789", "Renault");
            }
            else if (x==3) {
                c1[i] = new Bike(1, 1.0,  "SpeeedBike", "123456789", "Renault");
            }
            else{
                c1[i] = new Bike(1, 3.0, "patins", "12345", "sandero");
            }
        }
        for(int j = 0; j < n; j ++){
            c1[j].imprimirDados();
        }

    }
}
