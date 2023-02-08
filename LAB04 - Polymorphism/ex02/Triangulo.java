public class Triangulo extends FormaBi{

    protected double base;

    protected double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calculaArea() {
        double calculo = getAltura();
        double calculo1 = getBase();
        calculo1 = calculo1 * calculo;
        System.out.println(calculo1);
        return 0;
    }
    public void imprimirDados(){
        System.out.println("Dados referentes a um triângulo");
    }
}
