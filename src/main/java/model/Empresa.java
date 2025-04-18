/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author laispaivaportela
 */
import javax.swing.*;

public class Empresa {
    private String nomeEmpresa;
    private String enderecoEmpresa;
    private String cidadeEmpresa;
    private String estadoEmpresa;
    private String cepEmpresa;
    private String telefoneEmpresa;


    public Empresa(){
        this.nomeEmpresa = "";
        this.enderecoEmpresa = "";
        this.cidadeEmpresa = "";
        this.estadoEmpresa = "";
        this.cepEmpresa ="";
        this.telefoneEmpresa = "";
    }
    public Empresa(String nomeEmpresa, String enderecoEmpresa, String  cidadeEmpresa, String estadoEmpresa, String cepEmpresa, String telefoneEmpresa ){
        setNomeEmpresa (nomeEmpresa);
        setEstadoEmpresa (enderecoEmpresa);
        setCidadeEmpresa (cidadeEmpresa);
        setEstadoEmpresa (estadoEmpresa);
        setCepEmpresa (cepEmpresa);
        setTelefoneEmpresa (telefoneEmpresa);
    }
public  void solicitarDados(){
    setNomeEmpresa (JOptionPane.showInputDialog (null , "Digite o nome da empresa:"));
    setEnderecoEmpresa (JOptionPane.showInputDialog (null , "Digite o endereco da empresa:"));
    setCidadeEmpresa (JOptionPane.showInputDialog (null , "Digite a cidade da empresa:"));
    setEstadoEmpresa (JOptionPane.showInputDialog (null , "Digite o estado da empresa:"));
    setCepEmpresa (JOptionPane.showInputDialog (null , "Digite o cep da empresa:"));
    setTelefoneEmpresa (JOptionPane.showInputDialog (null , "Digite o telefone da empresa:"));
    }

    public String informacoesEmpresa() {
        String informacoesEmpresa = String.format (
                "nome da empresa: %s\nendereco da empresa: %s\ncidade da empresa: %s\nestado da empresa: %s\ncep da empresa: %s\ntelefone da empresa: %s\n" ,
                this.getNomeEmpresa () ,
                this.getEnderecoEmpresa () ,
                this.getEstadoEmpresa () ,
                this.getCidadeEmpresa () ,
                this.getCepEmpresa () ,
                this.getTelefoneEmpresa ()
                                                  );
        return informacoesEmpresa;
    }
        public void imprimeDados(){
        JOptionPane.showMessageDialog (null , informacoesEmpresa());
    }

    public
    void setNomeEmpresa (String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }


    public
    String getNomeEmpresa () {
        return nomeEmpresa;
    }


    public
    void setEnderecoEmpresa (String enderecoEmpresa) {
        this.enderecoEmpresa = enderecoEmpresa;
    }


    public
    String getEnderecoEmpresa () {
        return enderecoEmpresa;
    }


    public
    void setEstadoEmpresa (String estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }


    public
    String getEstadoEmpresa () {
        return estadoEmpresa;
    }


    public
    void setCidadeEmpresa (String cidadeEmpresa) {
        this.cidadeEmpresa = cidadeEmpresa;
    }


    public
    String getCidadeEmpresa () {
        return cidadeEmpresa;
    }

    public void setCepEmpresa(String cepEmpresa){
        this.cepEmpresa = cepEmpresa;
    }

    public
    String getCepEmpresa () {
        return cepEmpresa;
    }
    public void setTelefoneEmpresa(String telefoneEmpresa){
        this.telefoneEmpresa = telefoneEmpresa;
    }

    public
    String getTelefoneEmpresa () {
        return telefoneEmpresa;
    }

}
