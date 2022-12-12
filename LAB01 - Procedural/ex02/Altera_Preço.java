package Com_Classe;

public class Altera_Preço {
    float preço;
    float porcetagem;
    float temp;

    public Altera_Preço(float preço, float porcetagem){
        this.preço = preço;
        this.porcetagem = porcetagem;
        this.temp = temp;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public float getPorcetagem() {
        return porcetagem;
    }

    public void setPorcetagem(float porcetagem) {
        this.porcetagem = porcetagem;
    }

    public float porcetagem(float preço, float porcetagem){
        if (porcetagem > -100) {
            temp = 1 + porcetagem/100; // 10 >>> 1 + 10/100 = 1.1  ;; -5  =>> 1 + (-5/100) 0.95
        preço = (preço)*temp;  // preço modificado
            return 0;
        } else {
            return -1;
        }
    }
    public void print(){
        System.out.println(temp);
    }

}
