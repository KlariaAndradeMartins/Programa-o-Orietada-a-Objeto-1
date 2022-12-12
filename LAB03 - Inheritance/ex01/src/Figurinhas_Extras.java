import java.util.Date;

public class Figurinhas_Extras {

    //Crie uma nova classe chamada Selecao, que é composta pelo nome da seleção,
    // por 11 jogadores titulares, o nome do técnico, e outras informações que julgar pertinente.
    // Instancie 2 seleções.

    private String categoria;

    private String nomeSelecao, nomeTecnico,nome, posicao, pais;
    private int nVitorias;
    private Date DataNascimento;
    private double altura, peso;
    private String cor;

    public Figurinhas_Extras(String nome, Date dataNascimento,double altura, double peso, String posicao, String pais, String nomeSelecao, String nomeTecnico, int nVitorias, String categoria,String cor){
        this.cor = cor;
        this.categoria = categoria;
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
        //Figurinha selecao = new Figurinha("Guilherme top", new Date(10 / 12 / 1000), 1.70, 94.2, "Atacante", "Peru", "Flamengo", "vagner",11 );
        //selecao.MostrarFigurinha();
        System.out.println("Jogador: "+getNome());
        System.out.println("Nascimaneto: "+getData());
        System.out.println("Altura: "+getAltura());
        System.out.println("Peso: "+getPeso());
        System.out.println("Posicao: "+getPosicao());
        if (getPais()!="Brasil"){
            setPais("Brasil");
        }
        System.out.println("Pais: "+getPais());
        System.out.println("Categoria: "+getCategoria());
        System.out.println("Cor: "+getCor());
    }

    public String getCategoria() {
        return categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCor(String cor) {
        this.cor = cor;
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