public class Main {
    public static void main(String[] args) {
        Figurinhas j1 = new Figurinhas("Neymar", "07/03/1996,", 1.76, 76.0,"Atacante", "Brasil");
        j1.MostrarFigurinhas();

        Figurinhas_Extras j2 = new Figurinhas_Extras("Legend", "Rokie", "Neymar", "07/03/1996", 1.76, 78.0, "Atacante", "|Brasil");
        j2.MostrarFigurinha();

    }
}