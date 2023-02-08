public class Esfera extends FormaTri{

    protected double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calculaArea() {
        double calculo = getRaio();
        calculo = (calculo*calculo) * 3.14 * 4.0;
        System.out.println(calculo);

        return 0;
    }

    @Override
    public double obterVolume() {
        double calculo = getRaio();
        calculo = (calculo * calculo * calculo) * 3.14  * 4/3;
        System.out.println(calculo);
        return 0;
    }
    public void imprimirDados(){
        System.out.println("Dados referentes a uma esfera");
    }
}
