package Universe;

import javax.swing.JOptionPane;

public class Saturno extends Planets {
    
    
    public Saturno (String nome, double massa, String satelites, int idade, 
     String descricao, double distancia) {

        super(nome, massa, satelites, idade, descricao, distancia);

    }

    public void  MostrarDados (){ 
       
        JOptionPane.showMessageDialog (null, "Nome: "+ nome);
       
       }

}
