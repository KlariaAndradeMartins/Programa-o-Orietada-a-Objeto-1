public class CamaroteInferior extends VIP {

    public String localizacao;
    public  CamaroteInferior(int valor, int valorAdicional, String localizacao){
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public void imprimeValor(){
        super.imprimeValor();
        System.out.println("valor do Camarote Inferior = "+(Valor+ValorAdicional)+" e sua localizacao eh "+localizacao);

    }

}
