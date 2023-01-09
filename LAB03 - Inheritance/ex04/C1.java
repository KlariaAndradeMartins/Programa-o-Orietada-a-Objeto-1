public class C1 {
    public int a;
    private int b;
    protected int c;

    public C1(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Classe C1: chamada do construtor com parametros: ");
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void MostrarAtributoC1(){
        System.out.println("Classe C1: chamada do construtor sem parametros: "+ this.a);
        System.out.println("Classe C1: chamada do construtor sem parametros: "+ this.b);
        System.out.println("Classe C1: chamada do construtor sem parametros: "+ this.c);
    }
}
