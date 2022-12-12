public class Ingresso {

    int Valor;
    public Ingresso(int valor) {
        this.Valor = valor;
    }

    public void escreveValor(){
        System.out.println(this.Valor);
    }

    public void imprimeValor(){
        System.out.printf("valor do Ingresso = %d\n", Valor);

    }

}