public class Marcha {

    private String fabricante;
    private int numeroMaximoMarchas;
    private int marchaAtual;

    public Marcha(String fabricante, int numeroMaximoMarchas) {
        this.fabricante = fabricante;
        this.numeroMaximoMarchas = numeroMaximoMarchas;
        this.marchaAtual = 1;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getNumeroMaximoMarchas() {
        return numeroMaximoMarchas;
    }

    public void setNumeroMaximoMarchas(int numeroMaximoMarchas) {
        this.numeroMaximoMarchas = numeroMaximoMarchas;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void aumentaMarcha() {
        if(this.marchaAtual < numeroMaximoMarchas) {
            this.marchaAtual++;
        }
        else {
            System.out.println("Marcha já está no maximo");
        }
    }

    public void diminuiMarcha() {
        if(this.marchaAtual > 1) {
            this.marchaAtual--;
        }
        else {
            System.out.println("Marcha já está no minimo");
        }
    }
}