public class Bike {
    protected int marcha;
    protected double velocidade;

    protected String veiculo;

    protected String identificação;

    protected String fabricante;

    public Bike(int marchaInicial, double velocidadeInicial, String veiculo, String identificação,String fabricante) {
        this.marcha = marchaInicial;
        this.velocidade = velocidadeInicial;
        this.veiculo = veiculo;
        this.identificação = identificação;
        this.fabricante = fabricante;
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
        System.out.println("\nO veiculo " + this.veiculo + " está na marcha " + this.marcha + " e com velocidade de " + this.velocidade + " Km/h" + ".Seu numero de identificação é " + this.identificação + " e o seu fabricante é " + this.fabricante);
    }
}