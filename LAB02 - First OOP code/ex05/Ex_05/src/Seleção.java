public class Seleção {

    private String nomeTime;
    private String nomeTecnico;
    private String [] jogadores = new String [11];

    public Seleção(String nomeTime, String nomeTecnico){
        this.nomeTime = nomeTime;
        this.nomeTecnico = nomeTecnico;
        this.jogadores = getJogadores();
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public String getNomeTecnico(){
        return nomeTecnico;
    }

    public String[] getJogadores() {
        return jogadores;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public void setNomeTecnico(String nomeTecnico){
        this.nomeTecnico = nomeTecnico;
    }

    public void setJogadores(String[] jogadores){
        this.jogadores = jogadores;
    }

    public void MostrarTime(){
        System.out.println("Time: " + getNomeTime() + "\n");
        System.out.println("Tecnico: " + getNomeTecnico() + "\n");
        System.out.println("jogador: " + getJogadores()+ "\n");
    }
}
