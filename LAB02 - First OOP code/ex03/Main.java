public class Main {
    public static void main(String[] args) {
        Figurinhas [] jogadores = new Figurinhas[3];

//        jogadores[0] = new Figurinhas("klaria", "07/03/2002", 1.51,55, "Atacante","EUA");
//        jogadores[1] = new Figurinhas("Eduardo", "04/05/1996", 1.51,55, "Atacante","EUA");
//        jogadores[2] = new Figurinhas("Guilherme", "08/04/2022", 1.51,55, "Atacante","EUA");
//
//        jogadores[0].MostrarFigurinha();
//        jogadores[1].MostrarFigurinha();
//        jogadores[2].MostrarFigurinha();

        for (int x = 0; x < 3; x++) {
            jogadores[x] = new Figurinhas("klaria", "07/03/2002", 1.51,55, "Atacante","EUA");
        }
        jogadores[0].MostrarFigurinha();
        jogadores[1].MostrarFigurinha();
        jogadores[2].MostrarFigurinha();
    }
}
