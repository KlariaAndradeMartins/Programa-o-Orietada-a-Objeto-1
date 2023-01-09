public class C2 extends C1{

    public int a;
    private int b;
    protected int c;

    public C2(int a, int b, int c){
        super(1,2, 3);
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Classe C2: chamada do construtor com parametros: ");
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void MostrarAtributoC2(){
        System.out.println("Classe C2: chamada do construtor sem parametros: "+ this.a);
        System.out.println("Classe C2: chamada do construtor sem parametros: "+ this.b);
        System.out.println("Classe C2: chamada do construtor sem parametros: "+ this.c);
    }
}
