public class Horista extends Funcionarios{

    protected double valorHora;

    protected  int horasTrabalhadas;

    public Horista(String nome, String dtNascimento, double salario, double valorHora,int horasTrabalhadas) {
        super(nome, dtNascimento, salario);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public void calculoSalario(){
        double salario = super.getSalario();
        double salarioLiquido = salario + (horasTrabalhadas * valorHora);
        System.out.println("O Salário do " + super.getNome() + "final: " + salarioLiquido);
    }
}
