package models;

// criando uma superclasse.
public class Cliente {
	// criando os atributos.
    protected String nome;
    protected String endereco;
    protected String email;

    // criando o contrutor.
    public Cliente(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    // metodo retornar nome.
    public String getNome() {
        return nome;
    }

    // metodo retornar endereço.
    public String getEndereco() {
        return endereco;
    }

    // metodo retornar email.
    public String getEmail() {
        return email;
    }

}
