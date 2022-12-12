import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        C1 numero1 = new C1();
        C2 numero2 = new C2(30,60,90);
        C3 numero3 = new C3(100,200,300);

        numero1.mostar_atributos();
        numero2.mostar_atributos();
        numero3.mostar_atributos();
        System.out.println("");
        numero3.mostar_atributos_super();

    }
}