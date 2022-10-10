/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author Samsung
 */
public abstract class Imovel {
    private String endereco;
    private int cep;
    private String nomeProprietario;
    private double valMinAluguel;
    private String status;
    private String corretor;
    private String statusVenda;

    public Imovel(String endereco, int cep, String nomeProprietario, double valMinAluguel) {
        this.endereco = endereco;
        this.cep = cep;
        this.nomeProprietario = nomeProprietario;
        this.valMinAluguel = valMinAluguel;
        status = "Disponivel";
        statusVenda = "Disponivel";
        corretor = "";
    }
    //getter e setter
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double getValMinAluguel() {
        return valMinAluguel;
    }

    public void setValMinAluguel(double valMinAluguel) {
        this.valMinAluguel = valMinAluguel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(String statusVenda) {
        this.statusVenda = statusVenda;
    }
    
    
    //metodos
    
    public boolean alugar(String corretor, double valMinAluguel){
        if(!disponivelAluguel()){
            System.out.print("************************************\n");
            System.out.println("ERRO: Imovel nao esta disponivel");
            System.out.print("************************************\n");
            return false;
        }
        if(valMinAluguel < this.valMinAluguel){
            System.out.print("*******************************************\n");
            System.out.println("ERRO: Valor do aluguel menor que pedido");
            System.out.print("*******************************************\n");
            return false;
        }
        status = "Alugado";
        this.corretor = corretor;
        return true;  
    }
    
    public boolean disponivelAluguel(){
        return status.equals("Disponivel");
    }
    
    public boolean cancelarAluguel(){
        if(disponivelAluguel() != false){
            System.out.print("************************************\n");
            System.out.println("ERRO: imovel ja esta disponivel");
            System.out.print("************************************\n");
            return false;
        }
        if(statusVenda.equals("Vendido") == true){
            System.out.print("************************************\n");
            System.out.println("ERRO: imovel Vendido");
            System.out.print("************************************\n");
            return false;
        }
        status = "Disponivel";
        return true;
    }
    
    public void print(){
        System.out.println("---------------------------------------------------");
        System.out.print("\n" + "Endereço: " + endereco + "\n" +
                            "CEP: " + cep + "\n" +
                            "Nome do proprietário: " + nomeProprietario + "\n" +
                            "Status do imovel para aluguel: " + status + "\n" +
                            "Status do imvoel para venda: " + statusVenda + "\n");
        if(disponivelAluguel() == false){
            System.out.println("Nome do corretor: " + corretor);
        }
    }

    
    
    
    
}
