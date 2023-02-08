
public class Main {
    public static void main(String[] args) {
        ContaEspecial c1 = new ContaEspecial(500.0F, 9198, 2104, 500.0F);
        System.out.println(c1.getClass());
        System.out.println();
        ContaCorrente c2 = c1.compraNoCredito(499.0f, 2104);
        System.out.println(c2.getClass());

    }
}