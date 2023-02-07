public class Folha_Pagemento extends Funcionarios{

    public Folha_Pagemento(String nome, String dtNascimento, double salario) {
        super(nome, dtNascimento, salario);
    }

    public void FolhaPagamento(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("\nFolha de Pagamento");
        System.out.println("\n-------------------------------------------------------------");
    }
}
