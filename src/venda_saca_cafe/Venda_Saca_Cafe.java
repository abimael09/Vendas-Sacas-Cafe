
package venda_saca_cafe;

import javax.swing.JOptionPane;

public class Venda_Saca_Cafe{
    
    public static void main(String[] args){
        
        String entrada1 = JOptionPane.showInputDialog("Informe o custo da sua Plantação:");
        int custo = Integer.parseInt(entrada1);
        System.out.println("Custo da plantação de Café = "+custo+" R$.");
        
        String entrada2 = JOptionPane.showInputDialog("Informe a quantidade de sacas vendidas de Café:");
        int QuantsacasVend = Integer.parseInt(entrada2);
        System.out.println("Quantidade de sacas vendidas de Café = "+QuantsacasVend+".");
        
        int sacaDeCafe = 100;
        int valorTotalVend = QuantsacasVend * sacaDeCafe;
        System.out.println("Valor total das vendas de Café = "+valorTotalVend+" R$.\n");
        
        if(valorTotalVend > custo){
            int operacao1 = valorTotalVend - custo;
            System.out.println("- O seu lucro é de "+operacao1+" R$.\n");
        }else{
            if(valorTotalVend == custo){
                System.out.println("O valor total das vendas de Café,");
                System.out.println(" se igualaram aos gastos de Plantação,");
                System.out.println("  por isso, você NÃO obteve Lucro.\n");
            }else{
                int operacao2 = custo - valorTotalVend;
                System.out.println("- O seu prejuizo é de "+operacao2+" R$.\n");
            }           
        }
        
    }
}