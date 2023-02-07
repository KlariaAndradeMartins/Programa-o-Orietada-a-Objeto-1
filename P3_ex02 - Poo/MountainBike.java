public class MountainBike extends Bike implements Qualidade{

    private String tipoSuspensão;



    public MountainBike(double velocidadeInicial, int marchaInicial, String tipoSuspensão){
        super(marchaInicial, velocidadeInicial);
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


    @Override
    public boolean ehMelhor(Qualidade obj) {
        MountainBike obj1 = (MountainBike) obj;
        if(this.tipoSuspensão == "Óleo" && (obj1.getTipoSuspensão() == "Ar" || obj1.getTipoSuspensão() == "Molas")){
            return true;
        }
        if(this.tipoSuspensão == "Ar" && obj1.getTipoSuspensão() == "Óleo"){
            return false;
        }
        if(this.tipoSuspensão == "Ar" && obj1.getTipoSuspensão() == "Molas"){
            return true;
        }
        if(this.tipoSuspensão == "Molas" && (obj1.getTipoSuspensão() == "Ar" || obj1.getTipoSuspensão() == "Óleo")){
            return false;
        }

        return false;
    }

    @Override
    public void imprimeGarantia() {
        System.out.println("Garantia de 03 anos");
    }
}