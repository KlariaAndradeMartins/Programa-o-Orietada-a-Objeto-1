,public class Ex_02 {

    private String NomeJogador;
    private String DtNascimento;
    private double Altura;
    private double Peso;
    private String Posição;
    private String País;

    public Ex_02(String nomeJogador, String dtNascimento, double altura, double peso, String posição, String país) {
        this.NomeJogador = nomeJogador;
        this.DtNascimento = dtNascimento;
        this.Altura = altura;
        this.Peso = peso;
        this.Posição = posição;
        this.País = país;
    }

    public String getNomeJogador() {
        return NomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        NomeJogador = nomeJogador;
    }

    public String getDtNascimento() {
        return DtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        DtNascimento = dtNascimento;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public String getPosição() {
        return Posição;
    }

    public void setPosição(String posição) {
        Posição = posição;
    }

    public String getPaís() {
        return País;
    }

    public void setPaís(String país) {
        País = país;
    }

    public void print(){
        System.out.println("Nome Jogador: " + getNomeJogador() + "\nData de Nascimento: " + getDtNascimento());
        System.out.println("Altura: " + getAltura() + "\nPeso: " + getPeso() + "\nPosição: " + getPosição() + "\nPaís: "+ getPaís());
    }
}
