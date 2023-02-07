public class Vendendor extends Funcionarios{

    private int qtcvendas;
    private double valorcomissão;

    public Vendendor(String nome, String dtNascimento, double salario, int qtcvendas, double valorcomissão) {
        super(nome, dtNascimento, salario);
        this.qtcvendas = qtcvendas;
        this.valorcomissão = valorcomissão;
    }

    public int getQtcvendas() {
        return qtcvendas;
    }

    public void setQtcvendas(int qtcvendas) {
        this.qtcvendas = qtcvendas;
    }

    public double getValorcomissão() {
        return valorcomissão;
    }

    public void setValorcomissão(double valorcomissão) {
        this.valorcomissão = valorcomissão;
    }
    public void calculoSalario(){
        double salario = super.getSalario();
        double salarioLiquido = salario + (valorcomissão * qtcvendas);
        System.out.println("O Salário do " + super.getNome() + " final: " + salarioLiquido);
    }
}
