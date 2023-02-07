public class MoutainBike extends Bike{

    private String tipoSuspensão;

    public MoutainBike(double velocidadeInicial, int marchaInicial, String tipoSuspensão, String veiculo, String identificação, String fabricante, int marchaMaxima, String fabricanteMarcha){
        super(marchaInicial, velocidadeInicial, veiculo, identificação,fabricante,marchaMaxima, fabricanteMarcha);
        this.setTipoSuspensão(tipoSuspensão);
    }

    public String getTipoSuspensão() {
        return tipoSuspensão;
    }

    public void setTipoSuspensão(String tipoSuspensão) {
        this.tipoSuspensão = tipoSuspensão;
    }
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("A" + "MountainBike possui" + "suspensão do tipo " + getTipoSuspensão() );
    }
}