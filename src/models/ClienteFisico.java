package models;

//criando uma subclasse extendendo da superclasse Client.
public class ClienteFisico extends Cliente  {
	
	// criando o atributo.
    private String cpf;

    // criando o construtor e usando o construtor da superclasse via herança(super).
    public ClienteFisico(String nome, String endereco, String email, String cpf) {
    	super(nome, endereco, email);
        this.cpf = cpf;
    }

    // metodo para retornar o cpf.
    public String getCpf() {
        return cpf;
    }

}
