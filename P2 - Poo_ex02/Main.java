public class Main {
    public static void main(String[] args) {

//        Exercicio 02 -

        Bike c1 [] = new Bike[3];
        c1[0] = new Bike(1, 3.0, "123", "caloi");
        c1[1] = new SpeedBike(3.0, 2, 3, "456", "monark");
        c1[2] = new MountainBike(3.0, 2, "Ar", "789", "ONER");

        for (int i = 0; i < 3; i++){
            c1[i].imprimirDados();
        }

    }
}