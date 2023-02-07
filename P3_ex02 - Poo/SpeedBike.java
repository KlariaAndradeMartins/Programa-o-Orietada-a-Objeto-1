public class SpeedBike extends Bike implements Qualidade{

    private int espessuraPneu;


    public SpeedBike (double velocidadeInicial, int marchaInicial, int espessuraPneu){
        super(marchaInicial, velocidadeInicial);
        this.espessuraPneu = espessuraPneu;
    }

    public int getEspessuraPneu() {
        return this.espessuraPneu;
    }

    public void setEspessuraPneu(int espessuraPneu) {
        this.espessuraPneu = espessuraPneu;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("A SpeedBike tem pneus de " + getEspessuraPneu() + "MM");

    }

    public boolean ehMelhor(Qualidade obj) {
        SpeedBike obj1 = (SpeedBike) obj;
        if(this.espessuraPneu < obj1.getEspessuraPneu()){
            return true;
        }
        return false;
    }

    public void imprimeGarantia() {
        System.out.println("Garantia de 03 anos");
    }
}