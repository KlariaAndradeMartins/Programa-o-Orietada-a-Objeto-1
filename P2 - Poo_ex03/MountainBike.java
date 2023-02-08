public class MountainBike extends Bike{

    private String tipoSuspensão;

    public MountainBike(double velocidadeInicial, String tipoSuspensão, String identificação, String fabricante,
                        String fabricanteMarcha,
                        int numeroMaximoMarchas){
        super(velocidadeInicial, identificação, fabricante, fabricanteMarcha, numeroMaximoMarchas);
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
        System.out.println("A MountainBike possui suspensão do tipo: " + getTipoSuspensão());
    }
}