public class Main {
    public static void main(String[] args) {
        Forma Lista01 [] = new Forma[5];
        Lista01[0] = new Circulo(3.0);
        Lista01[1] = new Quadrado(3.0);
        Lista01[2] = new Triangulo(2.0, 3.0);
        Lista01[3] = new Esfera(3.0);
        Lista01[4] = new Cubo(3.0);

        for (int i = 0; i < 5; i++){
            if (i <= 2){
                Lista01[i].imprimirDados();
                Lista01[i].calculaArea();
            } else if (i>=3) {
                Lista01[i].imprimirDados();
                Lista01[i].obterVolume();
                Lista01[i].calculaArea();
            }
        }
    }
}
