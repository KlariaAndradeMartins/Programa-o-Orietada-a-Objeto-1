public class Produto implements Classificavel{

    private int codigo;
    @Override
    public boolean eMenorQue(Classificavel obj) {
        Produto compara = (Produto) obj;
        if(this.codigo < compara.codigo){
            return true;
        }
        else{
            return false;
        }
    }
}
