package app;
import models.*;

public class Main {

	public static void main(String[] args) {
        // Criando um cliente pessoa física
        ClienteFisico cliente1 = new ClienteFisico("João Silva", "Rua A, 123", "joao@email.com", "123.456.789-00");
        
        // Criando um cliente pessoa jurídica
        ClienteJuridico cliente2 = new ClienteJuridico("Empresa XYZ", "Rua B, 456", "contato@xyz.com", "12.345.678/0001-90");
        
        // Criando um funcionário
        Funcionario funcionario1 = new Funcionario("Maria Oliveira", "987.654.321-00", "Avenida C, 789", 3000.0);

        // Exibindo informações
        System.out.println("Cliente Pessoa Física: " + cliente1.getNome() + ", CPF: " + cliente1.getCpf());
        System.out.println("Cliente Pessoa Jurídica: " + cliente2.getNome() + ", CNPJ: " + cliente2.getCnpj());
        System.out.println("Funcionário: " + funcionario1.getNome() + ", Salário: " + funcionario1.getSalario());
	}

}
