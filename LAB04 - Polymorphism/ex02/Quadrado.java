public class Quadrado extends FormaBi{
    protected  double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calculaArea() {
        double calculo = getLado();
        calculo = (calculo*calculo);
        System.out.println(calculo);
        return 0;
    }
    public void imprimirDados(){
        System.out.println("Dados referentes a um quadrado");
    }
}
