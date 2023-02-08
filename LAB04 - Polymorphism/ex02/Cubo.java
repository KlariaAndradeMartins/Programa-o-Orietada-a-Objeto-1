public class Cubo extends FormaTri{

    protected double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    @Override
    public double calculaArea() {
        double calculo = getLado();
        calculo = (calculo*calculo)* 6.0;
        System.out.println(calculo);

        return 0;
    }

    @Override
    public double obterVolume() {
        double calculo = getLado();
        calculo = (calculo * calculo * calculo);
        System.out.println(calculo);
        return 0;
    }
    public void imprimirDados(){
        System.out.println("Dados referentes a uma cubo");
    }
}
