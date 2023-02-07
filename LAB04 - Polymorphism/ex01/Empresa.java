public class Empresa {
    public static void main(String[] args) {
        Funcionarios Lista01 [] = new Funcionarios[4];
        Lista01[1] = new Chefe("Roberto", "01/09/1999", 3.000);
        Lista01[0] = new Vendendor("Carlos", "07/03/2002", 1.200, 6, 30.0);
        Lista01[2] = new Operario("Milena", "04/05/1967", 0.00, 100, 90.0);
        Lista01[3] = new Horista("Mariah", "23/031998", 0.00, 4.00, 60);

        System.out.println("-------------------------------------------------------------");
        System.out.println("\nFolha de Pagamento");
        System.out.println("\n-------------------------------------------------------------");
        for (int i = 0; i < 4; i ++){
            System.out.println(Lista01[i].calculoSalario());
        }

    }
}
