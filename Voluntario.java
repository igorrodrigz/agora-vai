public class Voluntario {

    private int id;
    private String nome;
    private String cpf;
    private String municipio;
    private String formacao;
    private String telefone;
    private String email;
    private String disponibilidade;

    public Voluntario(int id, String nome, String cpf, String municipio,
            String formacao, String telefone, String email,
            String disponibilidade) {

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.municipio = municipio;
        this.formacao = formacao;
        this.telefone = telefone;
        this.email = email;
        this.disponibilidade = disponibilidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}