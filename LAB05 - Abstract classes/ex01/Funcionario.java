public abstract class Funcionario {

    private String Nome;
    private String DtdeNascimento;
    private String Função;
    private double Salario;

    public Funcionario(String Nome, String DtdeNascimento, String Função, Double Salario){
        this.Nome = Nome;
        this.DtdeNascimento = DtdeNascimento;
        this.Função = Função;
        this.Salario = Salario;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public String getNome(){
        return Nome;
    }

    public String getDtdeNascimento() {
        return DtdeNascimento;
    }

    public void setDtdeNascimento(String dtdeNascimento) {
        DtdeNascimento = dtdeNascimento;
    }

    public String getFunção() {
        return Função;
    }

    public void setFunção(String função) {
        Função = função;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario() {
        Salario = Salario;
    }
}