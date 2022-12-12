import java.util.Date;


public class Figurinha {
    private String nomeSelecao, nomeTecnico,nome, posicao, pais;
    private int nVitorias;
    private Date DataNascimento;
    private double altura, peso;


    public Figurinha(String nome, Date dataNascimento,double altura, double peso, String posicao, String pais, String nomeSelecao, String nomeTecnico, int nVitorias){
        this.nomeSelecao = nomeSelecao;
        this.nomeTecnico = nomeTecnico;
        this.nVitorias = nVitorias;
        this.nome = nome;
        this.DataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.pais = pais;


    }

    public void MostrarFigurinha(){
        System.out.println("Jogador: "+getNome());
        System.out.println("Nascimaneto: "+getData());
        System.out.println("Altura: "+getAltura());
        System.out.println("Peso: "+getPeso());
        System.out.println("Posicao: "+getPosicao());
        if (getPais()!="Brasil"){
            setPais("Brasil");
        }
        System.out.println("Pais: "+getPais());
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getPais() {
        return pais;
    }

    public Date getData() {
        return DataNascimento;
    }

    public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setData(Date data) {
        this.DataNascimento = data;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}