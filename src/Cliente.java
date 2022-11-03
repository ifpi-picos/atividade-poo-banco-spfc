import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Endereco endereco;

    
    public Cliente (String nome, String cpf, LocalDate dataNascimento, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco =  endereco;
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
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString(){
       return "Nome: " + this.getNome() + 
            "\nCPF: " + this.getCpf() + 
            "\nData de Nascimento: " + this.getDataNascimento() + 
            "\nEndereço: " + this.getEndereco();    
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}