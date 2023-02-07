public class Bike {
    protected int marcha;
    protected double velocidade;
    private double velocidaMáxima;

    public Bike(int marchaInicial, double velocidadeInicial) {
        this.marcha = marchaInicial;
        this.velocidade = velocidadeInicial;
        this.velocidaMáxima = 120.0;
    }

    public void setVelocidaMáxima(double velocidaMáxima){
        this.velocidaMáxima = velocidaMáxima;
    }

    public double getVelocidaMáxima() {
        return velocidaMáxima;
    }

    public void setMarcha(int novoValor) {
        this.marcha = novoValor;
    }


    public void frear(int decremento){
        if(this.velocidade - decremento < 0){
            throw new RuntimeException("Velocidade Inválida (negativa)");
        }
        else {
            velocidade -= decremento;
        }
    }

    public void acelerar(int incremento){
        if(this.velocidade + incremento > this.velocidaMáxima){
            throw new RuntimeException("Valor ultrapassa o máximo permitido");

        }
        else {
            velocidade += incremento;
        }
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void imprimirDados(){
        System.out.println("\nBike está na marcha " + this.marcha + " e com velocidade de " + this.velocidade + " Km/h");
    }

}