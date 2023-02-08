public class UsaBanco extends ContaEspecial{

    protected double valorCompra;

//    numConta = num;
//    senha = pwd;
//    saldo = val;
//    estado = 1; // conta ativa

    public UsaBanco(float val, int num, int pwd, float limite, double valorCompra) {
        super(val, num, pwd, limite);
        this.valorCompra = valorCompra;
    }
    @Override
    public void debitaValor(float val) {
        super.debitaValor(val);
    }
}
