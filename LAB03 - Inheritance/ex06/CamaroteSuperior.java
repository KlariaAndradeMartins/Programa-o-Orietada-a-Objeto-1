public class CamaroteSuperior extends VIP {
    private int ValorAdicionalsup;


    public CamaroteSuperior(int valor, int valorAdicional) {
        super(valor, valorAdicional);
        this.ValorAdicionalsup = valor+valorAdicional+valorAdicional;
    }

    public void imprimeCamaroteSuperior(){
        System.out.println("valor do Camarote Superior = "+ValorAdicionalsup+" Area Exclusiva");

    }

    @Override
    public void imprimeValor(){
        super.imprimeValor();
        System.out.println("valor do Camarote Superior = "+ValorAdicionalsup+"Area Exclusiva");

    }
}
