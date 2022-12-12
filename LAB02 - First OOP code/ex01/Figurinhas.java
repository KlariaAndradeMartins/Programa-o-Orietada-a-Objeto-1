
public class Figurinhas {

    String Jogador;
    String DataNascimento;
    double Altura;
    double Peso;
    String Posição;
    String País;

    public Figurinhas(String Jogador, String dataNascimento, double altura, double peso, String posição, String país) {
        Jogador = Jogador;
        DataNascimento = dataNascimento;
        Altura = altura;
        Peso = peso;
        Posição = posição;
        País = país;

        System.out.println("Nome: " + Jogador + "\nData de Nascimento: " + dataNascimento + "\nAltura: " + altura + "\npeso: " + peso + "\nPosição: " + Posição + "\nPais: " + país + "\n");
    }
}
