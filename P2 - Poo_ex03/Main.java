public class Main {
    public static void main(String[] args) {

//        Exercicio 03 -

        Bike c1 [] = new Bike[3];
        c1[0] = new Bike(1, "123", "caloi", "caloi", 5);
        c1[1] = new SpeedBike(3.0, 2, "456", "monark", "monark", 6);
        c1[2] = new MountainBike(3.0, "Ar", "789", "ONER", "ONER", 5);

        for (int i = 0; i < 3; i++){
            c1[i].imprimirDados();
        }

        c1[2].aumentaMarcha();
        c1[1].diminuirMarcha();
        c1[2].imprimirDados();

    }
}