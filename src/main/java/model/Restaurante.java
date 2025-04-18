/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author laispaivaportela
 */
import model.Empresa;
import javax.swing.*;

public
class Restaurante  extends Empresa {
    private String tipoDeComida;
    private double precoMedioPrato;

    public Restaurante(){
        this.tipoDeComida = "";
        this.precoMedioPrato = 0;
    }
    public Restaurante(String nomeEmpresa, String enderecoEmpresa, String  cidadeEmpresa, String estadoEmpresa, String cepEmpresa, String telefoneEmpresa, String tipoDeComida,  double precoMedioPrato){
        setTipoDeComida (tipoDeComida);
        setPrecoMedioPrato (precoMedioPrato);
    }
    public void setTipoDeComida (String tipoDeComida) {
        this.tipoDeComida = tipoDeComida;
    }
    public String getTipoDeComida () {
        return tipoDeComida;
    }
    public void setPrecoMedioPrato (double precoMedioPrato) {
        this.precoMedioPrato = precoMedioPrato;
    }
    public double getPrecoMedioPrato () {
        return precoMedioPrato;
    }

    public void solicitarDados() {
        super.solicitarDados();
        setTipoDeComida (JOptionPane.showInputDialog("Digite o tipo de comida:"));
        setPrecoMedioPrato (Double.parseDouble(JOptionPane.showInputDialog("Digite o preco médio do prato:")));
    }
    public void imprimeDados(){
        JOptionPane.showMessageDialog (null , informacoesEmpresa());
    }
    public String informacoesEmpresa(){
     String informacoesEmpresa =  String.format(
                        "%s\ntipo de comida: %s\npreco medio do prato: %.2f\n",
                super.informacoesEmpresa (),
                getTipoDeComida(),
                getPrecoMedioPrato ()
                     );
        return informacoesEmpresa;
    }



}
