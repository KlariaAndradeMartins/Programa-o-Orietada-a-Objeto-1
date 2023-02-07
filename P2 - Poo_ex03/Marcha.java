public class Marcha {
    protected int marchaAtual;
    protected int marchaMaxima;
    protected String fabricanteMarcha;

    public Marcha(int marchaMaxima, int maxima, String fabricanteMarcha) {
        this.marchaMaxima = marchaMaxima;
        this.fabricanteMarcha = fabricanteMarcha;
        this.marchaAtual = 1;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public int getMarchaMaxima() {
        return marchaMaxima;
    }

    public void setMarchaMaxima(int marchaMaxima) {
        this.marchaMaxima = marchaMaxima;
    }

    public String getFabricanteMarcha() {
        return fabricanteMarcha;
    }

    public void setFabricanteMarcha(String fabricanteMarcha) {
        this.fabricanteMarcha = fabricanteMarcha;
    }

    public void decrementar(int decremento){
        if (getMarchaAtual() - decremento <0){
            System.out.println("\nEssa velocidade e nula não e possivel decrementar!");
        }
        else{
            setMarchaAtual(getMarchaAtual() - decremento);
        }
    }

    public void aumentarMacha(int aumentar){
        if (getMarchaAtual() + aumentar > getMarchaMaxima()){
            System.out.println("Você ultrapassou o limite máximo da marcha");
        }
        else {
            setMarchaAtual(getMarchaAtual() + aumentar);
        }
    }

}
