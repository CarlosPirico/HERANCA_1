package models;

// criando uma subclasse extendendo da superclasse Client.
public class ClienteJuridico extends Cliente {
	
	//criando atributo.
    private String cnpj;

    // criando o construtor e usando o construtor da superclasse via herança(super).
    public ClienteJuridico(String nome, String endereco, String email, String cnpj) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
    }

    // metodo para retornar cnpj.
    public String getCnpj() {
        return cnpj;
    }
}
