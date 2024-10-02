package models;

public class ClienteJuridico extends Cliente {
    private String cnpj;

    public ClienteJuridico(String nome, String endereco, String email, String cnpj) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
