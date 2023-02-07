public class Main {
    public static void main(String[] args) {
//        Exercicio 01 -
        Bike c1 [] = new Bike[3];
        c1[0] = new Bike(1, 3.0);
        c1[1] = new SpeedBike(3.0, 2, 3);
        c1[2] = new MountainBike(3.0, 2, "Ar");

        for (int i = 0; i < 3; i++){
            c1[i].imprimirDados();
        }
//        Nesse caso especifico, e possivel chamar o metodo imprimir dados pois ele possui em todas as classes.
    }
}
