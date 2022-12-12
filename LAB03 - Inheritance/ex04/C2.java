public class C2 {

    public int a2;
    public int b2;
    public int c2;

    public C2() {}
    public C2(int a, int b, int c){
        this.a2 = a;
        this.b2 = b;
        this.c2 = c;
    }

    public void mostar_atributos(){
        System.out.println("Classe C2: chamada do construtor com parametros: "+ this.a2);
        System.out.println("Classe C2: chamada do construtor com parametros: "+ this.b2);
        System.out.println("Classe C2: chamada do construtor com parametros: "+ this.c2);
    }

    public void mostar_atributos_super(){
        System.out.println("Classe C2: chamada do construtor com parametros: "+ this.a2);
        System.out.println("Classe C2: chamada do construtor com parametros: "+ this.b2);
        System.out.println("Classe C2: chamada do construtor com parametros: "+ this.c2);

    }
}