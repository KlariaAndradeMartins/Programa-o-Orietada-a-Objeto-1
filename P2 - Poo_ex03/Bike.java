public class Bike extends VeiculoDeDuasRodas {
    protected Marcha marcha;
    protected double velocidade;

    public Bike(double velocidadeInicial, String identificação, String fabricante, String fabricanteMarcha,
                int numeroMaximoMarchas) {
        super(identificação, fabricante);
        this.marcha = new Marcha(fabricante, numeroMaximoMarchas);
        this.velocidade = velocidadeInicial;
    }

    public void aumentaMarcha() {
        this.marcha.aumentaMarcha();
    }

    public void diminuirMarcha() {
        this.marcha.diminuiMarcha();
    }

    public void frear(int decremento){
        velocidade -= decremento;
    }

    public void acelerar(int incremento){
        velocidade += incremento;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Bike está na marcha " + this.marcha.getMarchaAtual() + " e com velocidade de " + this.velocidade + " Km/h");
    }

}