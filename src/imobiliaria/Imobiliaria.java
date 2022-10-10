/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imobiliaria;

/**
 *
 * @author Samsung
 */
public class Imobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ImovelResidencial casa = new ImovelResidencial(2,1,500000.0,"rua das rosas",1234,"Carlos",1500.0);
        
        casa.print();
        casa.alugar("João",1500.0);
        casa.print();
        casa.vender("Celso",600000.0);
        casa.print();
        casa.disponivelAluguel();
        casa.print();*/
        
        ImovelComercia loja = new ImovelComercia("loja",200,"Rua do girassol",1233,"Toninho",1200);
        
        loja.print();
        loja.alugar("Victor", 1700.0);
        loja.print();
        loja.cancelarAluguel();
        loja.print();
    }
    
}
