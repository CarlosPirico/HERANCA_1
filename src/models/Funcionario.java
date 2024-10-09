package models;

public class Funcionario {
	// criando os atributos. 
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;

    // criando o construtor base de funcionario.
    public Funcionario(String nome, String cpf, String endereco, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    // metodo retornar nome.
    public String getNome() {
        return nome;
    }

    // metodo retornar cpf.
    public String getCpf() {
        return cpf;
    }
    
    // metodo retornar endereço.
    public String getEndereco() {
        return endereco;
    }

    // metodo retornar salario.
    public double getSalario() {
        return salario;
    }
}
