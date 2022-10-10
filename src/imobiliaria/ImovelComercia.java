/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author Samsung
 */
public class ImovelComercia extends Imovel{
    private String area;
    private double metragem;

    public ImovelComercia(String area, double metragem, String endereco, int cep, String nomeProprietario, double valMinAluguel) {
        super(endereco, cep, nomeProprietario, valMinAluguel);
        this.area = area;
        this.metragem = metragem;
    }
    
    //getter e setter

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }
    
    //metodos
    
    @Override
    public boolean alugar(String corretor, double valMinAluguel){
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
    
    @Override
    public void print(){
        super.print();
        System.out.println("Area do comercio: " + area + "\n" +
                            "Metragem do imovel: " + metragem + " metros quadrados");
    }
}
