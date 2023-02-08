public class VeiculoDeDuasRodas {

    private String identificação;

    private String fabricante;

    public String getIdentificação() {
        return identificação;
    }

    public VeiculoDeDuasRodas(String identificação, String fabricante) {
        this.identificação = identificação;
        this.fabricante = fabricante;
    }

    public void setIdentificação(String identificação) {
        this.identificação = identificação;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void imprimirDados(){
        System.out.println("\nNúmero de Identificação do veículo é " + this.identificação + " e o fabricante é " + this.fabricante);
    }
}