package models;

public class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;

    public Funcionario(String nome, String cpf, String endereco, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSalario() {
        return salario;
    }
}
