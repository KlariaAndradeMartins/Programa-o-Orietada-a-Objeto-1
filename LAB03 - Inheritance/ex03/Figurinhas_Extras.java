public class Figurinhas_Extras extends Figurinhas{
    protected int idade;
    protected String endereço;

    public Figurinhas_Extras(int idade, String endereço){
        this.idade = idade;
        this.endereço= endereço;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setEndereço(String endereço){
        this.endereço = endereço;
    }

    public String getEndereço(){
        return endereço;
    }

    public void MostrarFigurinhas(){
        System.out.println("Nome: " + super.getNomeJogador() + "\nData de Nascimento: " + super.getDatanascimento() + "\nAltura; " + super.getAltura() + "\nPeso: " + super.getPeso() + "\nPosição: " + super.getPosição() + "\nPais: " + super.getPais() + "\nTime: " + super.getTime());
        System.out.println("\nIdade: " + getIdade() + "\nEndereço: " + getEndereço());
    }
}
