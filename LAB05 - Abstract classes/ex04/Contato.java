public abstract class Contato {

    private String apelido;
    private String nome;
    private String email;
    private String aniversario;

    public Contato(String apelido, String nome, String email, String aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public String imprimirBasico(){
        String nome = "deu certo ";
        System.out.println("Nome: " + getNome());
        System.out.println("Apelido: " + getApelido());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Aniversario: " + getAniversario());
        return nome;
    }

    public abstract void imprimirContato();
}
