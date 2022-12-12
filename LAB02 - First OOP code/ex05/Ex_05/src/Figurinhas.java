public class Figurinhas {
    private String nomeJogador;
    private String datanascimento;
    private double altura;
    private double peso;
    private String posição;
    private String pais;
    private String time;

    public Figurinhas(String pais){
        this.nomeJogador = "Neymar";
        this.datanascimento = "05/02/1992";
        this.altura = 1.75;
        this.peso = 75.0;
        this.posição = "Atacante";
        this.time= "Brasil";
        this.pais = pais;
    }
    public String getTime(){
        return time;
    }
    public void SetTime(String time){
        time = time;
    }
    public String getNomeJogador() {
        return nomeJogador;
    }

    public String getDatanascimento(){
        return datanascimento;
    }

    public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

    public String getPosição(){
        return posição;
    }

    public String getPais(){
        return pais;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public void setDatanascimento(String datanascimento){
        this.datanascimento = datanascimento;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setPosição(String posição) {
        this.posição = posição;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void MostrarFigurinha(){
        System.out.println("Jogador: " + getNomeJogador());
        System.out.println("Data de Nascimento: " + getDatanascimento());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Posição: " + getPosição());
        System.out.println("País: " + getPais());
        System.out.println("Time: " + getTime());
        System.out.println("");
    }
}
