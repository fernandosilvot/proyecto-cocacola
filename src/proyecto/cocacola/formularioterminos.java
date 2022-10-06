/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.cocacola;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class formularioterminos extends JFrame implements ActionListener,ChangeListener{
    private JLabel titu,label1,label2,lega;
    private JTextArea terminos;
    private JCheckBox check1;
    String nombre ="";
    private JButton acepto,rechazo;
    
    public formularioterminos(){
        setTitle("Coca-Cola Company ");
        this.setUndecorated(true);
        setIconImage(new ImageIcon(getClass().getResource("icono.jpg")).getImage());
        getContentPane().setBackground(new Color(219,41,37));
        setLayout(null);
        setSize(800, 430);
        formulariologin ventanaBienvenida = new formulariologin();
        nombre = ventanaBienvenida.error;
        
        
        
        titu = new JLabel("Aceptar Terminos Y Condiciones ");
        titu.setBounds(265, 30, 500, 30);
        titu.setForeground(Color.WHITE);
        titu.setFont(new Font("Calibri",3,20));
        add(titu);
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("cocacola.png"));
        label1 = new JLabel(imagen);
        label1.setBounds(-10, -10, 300, 150);
        add(label1);
          
        terminos = new JTextArea(" \t\t\t        TERMINOS Y CONDICIONES"
                + "\n            Al firmar los Terminos Y condiciones usted toma consiencia que este programa puede realizar y lo que no puede realizar"
                +"\n\n          - No puede alterar ni distribuir el codigo "
                +"\n\n          - No puede dar acceso a terceras personas "
                +"\n\n          - El sofware puede acceder a su nombre ingresado "
                +"\n\n          Ud al leer los terminos y condiciones puede aceptar con el boton \"Aceptar \" rechazarlo \"Rechazar \" "
                +"\n          Es requerido marcar la casilla \"He leido los terminos y condiciones\" ");
        terminos.setEditable(false);
        terminos.setBounds(25, 120, 740, 200);
        terminos.setFont(new Font("Calibri",2,14));
        terminos.setForeground(Color.blue);
        add(terminos);
        
      /*label2 = new JLabel("Yo "+nombre+" he leido los terminos y condiciones");
       label2.setBounds(80, 245, 300, 200);
       label2.setFont(new Font("Calibri",3,14));
       label2.setForeground(Color.black);
       add(label2);*/
        
       check1 = new JCheckBox("Yo "+nombre+" he leido los terminos y condiciones");
       check1.setBounds(60, 335, 300, 20);
       check1.setForeground(Color.white);
       check1.setBackground(new Color(219,41,37));
       check1.addChangeListener(this);
       add(check1);
       
       acepto = new JButton("Aceptar");
       acepto.setBounds(50, 370, 130, 50);
       acepto.setBackground(new Color(219,41,37));
       acepto.setForeground(Color.white);
       acepto.addActionListener(this);
       acepto.setEnabled(false);
       add(acepto);
       
       rechazo = new JButton("Rechazar");
       rechazo.setBounds(200, 370, 130, 50);
       rechazo.setBackground(new Color(219,41,37));
       rechazo.setForeground(Color.white);
       rechazo.addActionListener(this);
       add(rechazo);
       
       lega = new JLabel("©2017 The Coca-Cola Company.");
       lega.setBounds(600, 400, 200, 30);
       lega.setForeground(Color.white);
       lega.setFont(new Font("Calibri",1,13));
       add(lega);
       
    }
    public void stateChanged(ChangeEvent e) {
        if(check1.isSelected()==true){
            acepto.setEnabled(true);
            rechazo.setEnabled(false);
        }else{
            acepto.setEnabled(false);
            rechazo.setEnabled(true);
        }
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == acepto ){
            formularioprinci prin = new formularioprinci();
            prin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            prin.setVisible(true);
            prin.setResizable(false);
            prin.setLocationRelativeTo(null);
            this.dispose();
        }
        if(e.getSource() == rechazo){
            formulariologin log = new formulariologin();
            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            log.setVisible(true);
            log.setResizable(false);
            log.setLocationRelativeTo(null);
            this.dispose();
        }
    }
}
 
