public class Operario extends Funcionarios{

    protected int qtdProduzida;

    protected double valorProdução;

    public Operario(String nome, String dtNascimento, double salario, int qtdProduzida, double valorProdução) {
        super(nome, dtNascimento, salario);
        this.qtdProduzida = qtdProduzida;
        this.valorProdução = valorProdução;
    }

    public int getQtdProduzida() {
        return qtdProduzida;
    }

    public void setQtdProduzida(int qtdProduzida) {
        this.qtdProduzida = qtdProduzida;
    }

    public double getValorProdução() {
        return valorProdução;
    }

    public void setValorProdução(double valorProdução) {
        this.valorProdução = valorProdução;
    }
    public void calculoSalario(){
        double salario = super.getSalario();
        double salarioLiquido = salario + (valorProdução * qtdProduzida);
        System.out.println("O Salário do "+ super.getNome() + " final: " + salarioLiquido);
    }
}
