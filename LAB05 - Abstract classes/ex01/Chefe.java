import java.net.SocketOption;

public class Chefe extends Funcionario{

    public Chefe(String Nome, String DtdeNascimento, String Função, Double Salario) {
        super(Nome, DtdeNascimento, Função, Salario);
        super.getNome();
        super.getDtdeNascimento();
        super.getFunção();
        super.setSalario();
    }
}