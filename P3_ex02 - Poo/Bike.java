public class Bike {
    protected int marcha;
    protected double velocidade;

    public Bike(int marchaInicial, double velocidadeInicial) {
        this.marcha = marchaInicial;
        this.velocidade = velocidadeInicial;
    }

    public void setMarcha(int novoValor) {
        this.marcha = novoValor;
    }

    public void frear(int decremento){
        velocidade -= decremento;
    }

    public void acelerar(int incremento){
        velocidade += incremento;
    }

    public void imprimirDados(){
        System.out.println("\nBike está na marcha " + this.marcha + " e com velocidade de " + this.velocidade + " Km/h");
    }

}