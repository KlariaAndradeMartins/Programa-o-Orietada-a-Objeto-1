public class MountainBike extends Bike{

    private String tipoSuspensão;

    public MountainBike(double velocidadeInicial, int marchaInicial, String tipoSuspensão, String veiculo, String identificação, String fabricante){
        super(marchaInicial,velocidadeInicial, veiculo, identificação,fabricante);
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