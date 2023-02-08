public class Bike extends VeiculoDeDuasRodas {
    protected int marcha;
    protected double velocidade;

    public Bike(int marchaInicial, double velocidadeInicial, String identificação, String fabricante) {
        super(identificação, fabricante);
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
        super.imprimirDados();
        System.out.println("Bike está na marcha " + this.marcha + " e com velocidade de " + this.velocidade + " Km/h");
    }

}