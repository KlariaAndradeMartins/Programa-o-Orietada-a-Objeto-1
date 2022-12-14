public class Figurinhas {
    private String NomedoJogador, DatadeNascimento;
    private double Altura, Peso;
    private String Posição, País;

    public Figurinhas(String nomedoJogador, String datadeNascimento, double altura, double peso, String posição, String país) {
        NomedoJogador = nomedoJogador;
        DatadeNascimento = datadeNascimento;
        Altura = altura;
        Peso = peso;
        Posição = posição;
        País = país;
    }

    public String getNomedoJogador() {
        return NomedoJogador;
    }

    public void setNomedoJogador(String nomedoJogador) {
        NomedoJogador = nomedoJogador;
    }

    public String getDatadeNascimento() {
        return DatadeNascimento;
    }

    public void setDatadeNascimento(String datadeNascimento) {
        DatadeNascimento = datadeNascimento;
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

    public void MostrarFigurinhas(){
        System.out.println("Nome: " + getNomedoJogador());
        System.out.println("Data de Nascimento: " + getDatadeNascimento());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Posição " + getPosição());
        System.out.println("Pais " + getPaís());
    }
}
