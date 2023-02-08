public class SpeedBike extends Bike{

    private int espessuraPneu;

    public SpeedBike (double velocidadeInicial, int espessuraPneu, String identificação, String fabricante,
                      String fabricanteMarcha,
                      int numeroMaximoMarchas){
        super(velocidadeInicial, identificação, fabricante, fabricanteMarcha, numeroMaximoMarchas);
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
}