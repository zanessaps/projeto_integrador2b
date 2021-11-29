package projetoIntegradorParte1;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class main {
	static String senha = "123";

	public static void main(String[] args) {
		
		  Desconto desconto = new Desconto();
		  String login = JOptionPane.showInputDialog("Login: ");
		  
		  
		  JLabel label = new JLabel("Senha:");
		  JPasswordField jpf = new JPasswordField();

		  JOptionPane.showConfirmDialog(null,
				  new Object[]{label, jpf}, "Senha:",
				  JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
		   
			
	       if(login.equals("Vanessa") && senha.equals("123")) {
	    	  JOptionPane.showMessageDialog(null,"Login realizado com sucesso!");
	       }
	       
	       else {
	    	   JOptionPane.showMessageDialog(null," Senha e/ou login incorretos, tente novamente!");
	   		    String login1 = JOptionPane.showInputDialog("Login: ");
	   		
	   		    JLabel label1 = new JLabel("Senha:");
			  JPasswordField jpf1 = new JPasswordField();

			  JOptionPane.showConfirmDialog(null,
					  new Object[]{label1, jpf1}, "Senha:",
					  JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
			   
           }
	   
		       String venda =  JOptionPane.showInputDialog("Informe o valor da venda: ");
		       double valorVenda = Double.parseDouble(venda);

		       JOptionPane.showMessageDialog(null, " O valor da venda é: R$" + venda);
	       
	       
	        String[] opcoes = {"Crédito", "Débito", "Pix", "Sair"};
	        
	         int opcao = JOptionPane.showInternalOptionDialog(null, "Forma de Pagamento: ", "Opções", 0, 
	          		                                            JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
	         
		         switch(opcao) {
		         
		         case 0: JOptionPane.showMessageDialog (null, " Opção Escolhida: Crédito \n "
		      		   + "Valor a pagar: R$" + venda);break;
		         
		         case 1: JOptionPane.showMessageDialog(null, "Opção Escolhida: Débito \n"
		      		   + "Valor a pagar: R$" + desconto.AdicionarDescontoDebito(valorVenda));break;
		      	
		         case 2: JOptionPane.showMessageDialog(null, "Opção Escolhida: Pix \n" 
		      		   + "Valor a pagar: R$" + desconto.AdicionarDescontoPix(valorVenda));break;
		         
		         case 3: JOptionPane.showMessageDialog(null, " Sessão Encerrada!");
		         }
	         
	        

	         

	  	
	       
	            
	      
	       
	     
	     
	     
	}

}
