public class Empresa {
    public static void main(String[] args) {

        Funcionario [] j1 = new Funcionario[3];
        j1[0] = new Chefe("Jose", "07/03/2002", "Chefe", 1.200);
        System.out.println("Salario:" + j1[0].getSalario());

    }
}