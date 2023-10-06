package questao1;

public class Usuario extends AchadoPerdido{
private String nome;
private String email;
private String senha;


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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(String titulo, String descricao, String foto, String tipo, String local_achado, String data_hora, String status, String nome, String email, String senha) {
        super(titulo, descricao, foto, tipo, local_achado, data_hora, status);
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }




}
