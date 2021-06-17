import javax.swing.*;
import java.awl.*;
public class Dados 
{
   private JFrame frame;
   private JPanel tela; 
   private JLabel titulo;
   private JTextField  nome;
private JTextField matrícula ;
   private JButton Ad;
   public Inicio( )
      {
        frame=new JFrame();
        tela= new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        painel.setLayout(new GridLayout(0,1));
        titulo= new JLabel("Dados:");
        painel.add(titulo);
        titulo.setFont(new Font("Arial"), Font.BOLD,25 );
        frame.add(painel, BorderLayout.CENTER);
        frame..setDefaultClosedOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setTitle("Banco de dados");
       frame.size(200,200);
        frame.pack();
        frame.setvisible(true);
        nome=TextField("Nome :");
        tela.add(nome );
matricula=TextField(Matrcula:);
tela.add(matricula);
        Ad = new JButton("Adicionar");
        tela.add(Ad);
        Ad=insert(nome, matricula);
        
}   
}