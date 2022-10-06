/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.cocacola;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class formulariologin extends JFrame implements ActionListener{
        private JLabel nombrecom,usuario,legacy,label1;
        private JTextField ingrenombre;
        private  JButton boton1;
        public static String error=" ";
        public static int num;
        
        public formulariologin(){
            setTitle("Coca-Cola Company ");
            setLayout(null);
            this.setUndecorated(true);
            setSize(400,420);
            setIconImage(new ImageIcon(getClass().getResource("icono.jpg")).getImage());
            getContentPane().setBackground(new Color(219,41,37));
            
            ImageIcon imagen = new ImageIcon(getClass().getResource("cocacola.png"));
            label1 = new JLabel(imagen);
            label1.setBounds(40, 15, 300, 150);
            add(label1);
            
            nombrecom = new JLabel("Sistema de control de vacaciones");
            nombrecom.setBounds(77, 130, 300, 30);
            nombrecom.setFont(new Font("Calibri", 3, 16));
            nombrecom.setForeground(Color.WHITE);
            add(nombrecom);
             
            usuario = new JLabel("Ingrese Nombre de Usuario");
            usuario.setBounds(67, 240, 300, 30);
            usuario.setFont(new Font("Calibri",3,12));
            usuario.setForeground(Color.WHITE);
            add(usuario);
            
            ingrenombre = new JTextField();
            ingrenombre.setBounds(67, 265, 250, 30);
            ingrenombre.setFont(new Font("Arial",3,12));
            ingrenombre.setForeground(Color.DARK_GRAY);
            add(ingrenombre);
            
            boton1 = new JButton("Ingresar");
            boton1.setBounds(95, 300, 200, 30);
            boton1.setBackground(new Color(219,41,37));
            boton1.setForeground(Color.WHITE);
            boton1.addActionListener(this);
            add(boton1);
            
            legacy = new JLabel("©2017 The Coca-Cola Company.");
            legacy.setBounds(20, 380, 200, 30);
            legacy.setForeground(Color.white);
            legacy.setFont(new Font("Calibri",1,13));
            add(legacy);
        }
         @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            error = ingrenombre.getText().trim();
        if(error.equals("")){
            JOptionPane.showMessageDialog(null, "debes escribir un nombre");
        }else{
        formularioterminos form1 = new formularioterminos();
        form1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form1.setVisible(true);
        form1.setResizable(false);
        form1.setLocationRelativeTo(null);
        this.dispose();
        }
    }
}
}

    


