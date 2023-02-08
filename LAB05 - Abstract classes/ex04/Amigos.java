public class Amigos extends Contato{
    private int grau;

    public Amigos(String apelido, String nome, String email, String aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    @Override
    public void imprimirContato() {
        imprimirBasico();
        String nivelGrau = null;
        int grau = getGrau();
        if (grau == 1){nivelGrau = "melhor amigo";}
        else if (grau == 2) {nivelGrau = "amigo";}
        else if (grau == 3){nivelGrau = "Conhecido";}
        System.out.println("Grau de amizade: " + nivelGrau);
    }
}
