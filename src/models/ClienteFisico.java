package models;

public class ClienteFisico extends Cliente  {
	
    private String cpf;

    public ClienteFisico(String nome, String endereco, String email, String cpf) {
    	super(nome, endereco, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

}
