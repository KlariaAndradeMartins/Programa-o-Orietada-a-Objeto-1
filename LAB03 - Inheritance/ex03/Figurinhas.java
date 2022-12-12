public class Figurinhas {
    protected String nomeJogador;
    protected String datanascimento;
    protected double altura;
    protected double peso;
    protected String posição;
    protected String pais;
    protected String time;

//    public Figurinhas(){
//
//    }
    public Figurinhas(String nomeJogador, String datanascimento, double altura, double peso, String posição, String pais, String time) {
        this.nomeJogador = nomeJogador;
        this.datanascimento = datanascimento;
        this.altura = altura;
        this.peso = peso;
        this.posição = posição;
        this.pais = pais;
        this.time = time;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPosição() {
        return posição;
    }

    public void setPosição(String posição) {
        this.posição = posição;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
