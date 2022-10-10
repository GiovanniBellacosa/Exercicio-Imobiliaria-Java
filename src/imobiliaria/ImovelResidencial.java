/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author Samsung
 */
public class ImovelResidencial extends Imovel{
    private int qtdeQuartos;
    private int numVagas;
    private double valMinVenda;
    private String corretor;

    public ImovelResidencial(int qtdeQuartos, int numVagas, double valMinVenda, String endereco, int cep, String nomeProprietario, double valMinAluguel) {
        super(endereco, cep, nomeProprietario, valMinAluguel);
        this.qtdeQuartos = qtdeQuartos;
        this.numVagas = numVagas;
        this.valMinVenda = valMinVenda;
        this.corretor = "";
    }
    
    //gettrer e setter

    public int getQtdeQuartos() {
        return qtdeQuartos;
    }

    public void setQtdeQuartos(int qtdeQuartos) {
        this.qtdeQuartos = qtdeQuartos;
    }

    public int getNumVagas() {
        return numVagas;
    }

    public void setNumVagas(int numVagas) {
        this.numVagas = numVagas;
    }

    public double getValMinVenda() {
        return valMinVenda;
    }

    public void setValMinVenda(double valMinVenda) {
        this.valMinVenda = valMinVenda;
    }
    
    //metodos
    
    @Override
    public boolean alugar(String corretor,double valMinAluguel){
        return super.alugar(corretor, valMinAluguel);
    }
    
    @Override
    public boolean disponivelAluguel(){
        return super.disponivelAluguel();
    }
    
    @Override
    public boolean cancelarAluguel(){
        return super.cancelarAluguel();
    }
    
    public boolean vender(String corretor,double valMinVenda){
        if(disponivelVenda() != false){
            System.out.print("***********************************************\n");
            System.out.println("ERRO: Imovel nao esta disponivel para venda");
            System.out.print("***********************************************\n");
            return false;
        }
        if(valMinVenda < this.valMinVenda){
            System.out.print("*****************************************\n");
            System.out.println("ERRO: Valor de venda menor que pedido");
            System.out.print("*****************************************\n");
            return false;
        }
        System.out.println(valMinVenda);
        super.setStatusVenda("Vendido");
        super.setStatus("Indisponivel");
        this.corretor = corretor;
        return true;
    }
    
    public boolean disponivelVenda(){
        return super.getStatusVenda().equals("Vendido");
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("\n" + "Quantidade de quartos: " + qtdeQuartos + "\n" +
                            "Numeor de vagas: " + numVagas + "\n" +
                            "Valor minnimo para venda: " + valMinVenda);
        if(disponivelVenda() != false){
            System.out.println("Nome do corretor: " + corretor);
        }
    }
    
    
    
    
    
    
}
