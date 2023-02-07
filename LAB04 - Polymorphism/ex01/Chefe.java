public class Chefe extends Funcionarios{

    public Chefe(String nome, String dtNascimento, double salario) {
        super(nome, dtNascimento, salario);
    }

    public void calculoSalario(){
        double calculo = getSalario();
        System.out.println("O salário do funcionario: " + getNome() + " é " + calculo);
    }
}
