public class Funcionarios {

    protected String Nome;
    protected String dtNascimento;

    protected double salario;
    public Funcionarios(String nome, String dtNascimento, double salario) {
        Nome = nome;
        this.dtNascimento = dtNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calculoSalario() {
        double calculo = getSalario();
        System.out.println("O salário do funcionario: " + getNome() + " é " + calculo);
    }
}
