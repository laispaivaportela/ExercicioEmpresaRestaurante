/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;

/**
 *
 * @author laispaivaportela 
 */
import model.Restaurante;
import javax.swing.*;

/*
A. Crie uma classe Empresa capaz de armazenar os dados de uma empresa (Nome,
Endereço, Cidade, Estado, CEP e Fone). Para esta classe implemente os seguintes métodos. ok
• Crie um construtor que inicialize os dados com zero e “” ok
• Crie um construtor que inicialize os dados com valores passados por parâmetro. ok
• Crie métodos set’s para alterar os dados. ok
• Crie métodos get’s para retornar os dados. ok
• Crie um método para solicitar os dados para o usuário.
• Crie um método para imprimir os dados para o usuário.
• Construa um programa para testar a classe Empresa.
B. Use a classe Empresa como base para criar a classe Restaurante. Inclua o tipo de comida,
o preço médio de um prato. ok
• Crie um construtor que inicialize os dados com zero e “”. ok
• Crie um construtor que inicialize os dados com valores passados por parâmetro. ok
• Crie métodos set’s para alterar os dados. ok
• Crie métodos get’s para retornar os dados. ok
• Crie um método para solicitar os dados para o usuário. ok
• Crie um método para imprimir os dados para o usuário. ok
• Construa um programa para testar a classe Restaurante.
 */
public class Principal {
    public static
    void main (String[] args) {



        Restaurante restaurante = new Restaurante();

        JOptionPane.showMessageDialog (null , "Cadastro de Restaurante");
        restaurante.solicitarDados ();
        restaurante.imprimeDados ();
    }
}
