package Com_Classe;
public class Main {
    public static void main(String[] args){
        Altera_Preço A1 = new Altera_Preço(200, 1000);
        A1.porcetagem(A1.getPreço(), A1.getPorcetagem());
        A1.print();
    }
}