public class C1 {

    public int a;
    public int b;
    public int c;

    public C1(){
        //System.out.println("Indisponivel // Sem Parametro");
    }

    public C1(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void mostar_atributos(){
        System.out.println("Classe C1: chamada do construtor com parametros: "+ this.a);
        System.out.println("Classe C1: chamada do construtor com parametros: "+ this.b);
        System.out.println("Classe C1: chamada do construtor com parametros: "+ this.c);
    }
}