public class ContaEspecial extends ContaCorrente {
    private float limite;
    public ContaEspecial(float val, int num, int pwd, float limite) {
        super(val, num, pwd);
        if(limite > 0.0F) {
            this.limite = limite;
        }
        //Limite mínimo caso na inicialização seja passado o valor 0
        else {
            this.limite = 100.0F;
        }
    }

    @Override
    public boolean debitaValor(float val, int pwd) {

        if (pwd != super.getSenha())
            return (false); // senha deve ser vá lida
        if (super.getEstado(pwd) != 1)
            return (false); // conta deve ser ativa
        if (val <= 0)
            return (false); // val > 0
        if (val > super.getSaldo(pwd))
            return (false);
        return (true);
    }

    public ContaCorrente compraNoCredito(float val, int pwd){
        float limiteFinal = limite - val;
        this.limite = limiteFinal;
        if(limiteFinal > 0){
            return this;
        }
        else {
            return new ContaComum(super.getSaldo(pwd), super.getNumConta(), pwd);
        }
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}
