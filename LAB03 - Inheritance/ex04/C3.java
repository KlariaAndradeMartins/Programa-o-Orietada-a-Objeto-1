public class C3  extends  C2 {
    public int a3;
    public int b3;
    public int c3;

    public C3() {}

    public C3(int a, int b, int c){
        this.a3 = a;
        this.b3 = b;
        this.c3 = c;
    }
    public void mostar_atributos(){
        System.out.println("Classe C3: chamada do construtor com parametros: "+ this.a3);
        System.out.println("Classe C3: chamada do construtor com parametros: "+ this.b3);
        System.out.println("Classe C3: chamada do construtor com parametros: "+ this.c3);
    }


    public void mostar_atributos_super(){
        super.mostar_atributos_super();
        System.out.println("Classe C3: chamada do construtor com parametros: "+ this.a3);
        System.out.println("Classe C3: chamada do construtor com parametros: "+ this.b3);
        System.out.println("Classe C3: chamada do construtor com parametros: "+ this.c3);
    }

}