public class Figurinhas_extras extends Figurinhas{
    private String Tipo, qualidade;

    public Figurinhas_extras(String Tipo, String qualidade) {
        super("Neymar", "07/03/2002", 1.76, 78.0, "Atacante", "Brasil");
        this.Tipo = Tipo;
        this.qualidade= qualidade;
    }

    public void MostrarFigurinhas(){
        System.out.println("Tipo:" + getTipo());
        System.out.println("Qualidade: " + getQualidade());
        System.out.println("Nome do Jogador: " + getNomedoJogador());
        System.out.println("Data de Nascimento: " + getDatadeNascimento());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Posição: " + getPosição());
        System.out.println("Pais: " + getPaís());
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getQualidade() {
        return qualidade;
    }

    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }
}
