public class Main {
    public static void main(String[] args) {

        Figurinhas J1 = new Figurinhas("Brasil");
        Seleção Brasil = new Seleção(J1.getTime(), "Tite");

        J1.MostrarFigurinha();
        Brasil.MostrarTime();
    }
}