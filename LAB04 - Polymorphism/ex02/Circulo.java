public class Circulo extends FormaBi{

    protected  double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calculaArea() {
        double calculo = getRaio();
        calculo = (calculo*calculo) * 3.14;
        System.out.println(calculo);
        return 0;
    }

    public void imprimirDados(){
        System.out.println("Dados referentes a um circulo");
    }
}
