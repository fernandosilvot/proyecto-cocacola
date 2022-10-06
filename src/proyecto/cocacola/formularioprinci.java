/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.cocacola;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class formularioprinci extends JFrame implements ActionListener{
    String nombre="";
    private JMenuBar menup;
    private JMenu opt,acer,colors,salir,e_p;
    private JMenuItem Negro,pred,s_exit,s_home,prog,emp;
    private JLabel bien,titu,titu1,nom,ap_p,ap_m,depto,anti,res_cal,legacy,label1,label2,label3,label4;
    private JTextField res_nom,ap1,ap2;
    private JComboBox combo1,combo2;
    private JTextArea resultado;
    private JScrollPane bajar;
    private JButton boton1, boton2;
    
    public formularioprinci(){
        setTitle("Coca-Cola Company ");
        setIconImage(new ImageIcon(getClass().getResource("icono.jpg")).getImage());
        getContentPane().setBackground(new Color(219,41,37));
        setLayout(null);
        this.setUndecorated(true);
        setSize(700, 560);
        formulariologin ventanaBienvenida = new formulariologin();
        nombre = ventanaBienvenida.error;
        
        

        menup = new JMenuBar();
        ///menup.setBackground(new Color(255, 0, 0));
        setJMenuBar(menup);
        
        opt = new JMenu("Opcions");
        menup.add(opt);
        
        acer = new  JMenu("Acerca de..");
        menup.add(acer);
        
        colors = new JMenu("Color Ventana");
        opt.add(colors);
        
        salir = new JMenu("Salir, Volver al Login");
        opt.add(salir);
        
        e_p = new JMenu("Programador y Empresa");
        acer.add(e_p);
        
        pred = new JMenuItem("Predeterminado");
        pred.setVisible(false);
        pred.addActionListener(this);
        colors.add(pred);
        
        Negro = new JMenuItem("Negro");
        Negro.setEnabled(true);
        Negro.setVisible(true);
        Negro.addActionListener(this);
        colors.add(Negro);
        
        s_exit = new JMenuItem("Salir del Programa");
        s_exit.addActionListener(this);
        salir.add(s_exit);
        
        s_home = new JMenuItem("Volver al Login");
        s_home.addActionListener(this);
        salir.add(s_home);
        
        emp = new JMenuItem("Empresa");
        emp.addActionListener(this);
        e_p.add(emp);
        
        prog = new JMenuItem("Programador");
        prog.addActionListener(this);
        e_p.add(prog);
        
        ImageIcon imagen = new ImageIcon(getClass().getResource("cocacoladefault.png"));
        label1 = new JLabel(imagen);
        label1.setEnabled(true);
        label1.setBounds(-43, -32, 300, 150);
        add(label1);
        
        ImageIcon imagenb = new ImageIcon(getClass().getResource("cocacolaversion_oscuro1.png"));
        label3 = new JLabel(imagenb);
        label3.setVisible(false);
        label3.setBounds(-43, -32, 300, 150);
        add(label3);
        
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("iconcocacola.png"));
        label2 = new JLabel(imagen1);
        label2.setVisible(true);
        label2.setBounds(420, -20, 300, 150);
        add(label2);
        
        ImageIcon imagenbv = new ImageIcon(getClass().getResource("cocacolaversion_oscuro1.png"));
        label4 = new JLabel(imagenbv);
        label4.setVisible(false);
        label4.setBounds(400, -32, 300, 150);
        add(label4);
        
        bien = new JLabel("BIenvenido "+nombre);
        bien.setBounds(20, 95, 200, 15);
        bien.setFont(new Font("Calibri",3,18));
        bien.setForeground(Color.WHITE);
        add(bien);
        
        titu = new JLabel("Calculo de vacaciones");
        titu.setBounds(265, 20, 200, 15);
        titu.setFont(new Font("Calibri",3,18));
        titu.setForeground(Color.WHITE);
        add(titu);
        
        titu1 = new JLabel("Ingrese los datos del trabajador ");
        titu1.setBounds(225, 50, 250, 15);
        titu1.setFont(new Font("Calibri",3,18));
        titu1.setForeground(Color.WHITE);
        add(titu1);
        
        nom = new JLabel("Ingresa Nombre Completo");
        nom.setBounds(20, 150, 250, 15);
        nom.setFont(new Font("Calibri",1,15));
        nom.setForeground(Color.WHITE);
        add(nom);
        
        ap_p = new JLabel("Ingresa Apellido Paterno Completo");
        ap_p.setBounds(20, 230, 250, 15);
        ap_p.setFont(new Font("Calibri",1,15));
        ap_p.setForeground(Color.WHITE);
        add(ap_p);
        
        ap_m = new JLabel("Ingresa Apellido Materno Completo");
        ap_m.setBounds(20, 310, 250, 15);
        ap_m.setFont(new Font("Calibri",1,15));
        ap_m.setForeground(Color.WHITE);
        add(ap_m);
        
        depto = new JLabel("Seleciona el Departamento");
        depto.setBounds(410, 150, 250, 15);
        depto.setFont(new Font("Calibri",1,15));
        depto.setForeground(Color.WHITE);
        add(depto);
        
        anti = new JLabel("Seleciona la antigüedad del trabajador");
        anti.setBounds(410, 230, 250, 15);
        anti.setFont(new Font("Calibri",1,15));
        anti.setForeground(Color.WHITE);
        add(anti);
        
        res_cal = new JLabel("resultado");
        res_cal.setBounds(410, 310, 250, 15);
        res_cal.setFont(new Font("Calibri",1,15));
        res_cal.setForeground(Color.WHITE);
        add(res_cal);
        
        res_nom = new JTextField();
        res_nom.setBounds(20, 175, 220, 35);
        add(res_nom);
        
        ap1 = new JTextField();
        ap1.setBounds(20, 255, 220, 35);
        add(ap1);
        
        ap2 = new JTextField();
        ap2.setBounds(20, 335, 220, 35);
        add(ap2);
        
        combo1 = new JComboBox();
        combo1.setBounds(410, 175, 250, 35);
        add(combo1);
        combo1.addItem("");
        combo1.addItem("Atención al cliente");
        combo1.addItem("Logistica");
        combo1.addItem("Gerencia");
        
        combo2 = new JComboBox();
        combo2.setBounds(410, 255, 250, 35);
        add(combo2);
        combo2.addItem("");
        combo2.addItem("1 año de servicio");
        combo2.addItem("2 a 6 años de servicios");
        combo2.addItem("7 o más años de servicios");
        
        resultado = new JTextArea("aqui se mostrara el resultado de las vacaciones");
        resultado.setEditable(false);
        resultado.setFont(new Font("Calibri",3,14));
        resultado.setForeground(Color.blue);
        bajar = new JScrollPane(resultado);
        bajar.setBounds(400, 335, 285, 70);
        add(bajar);
        
        boton1 = new JButton("Calcular");
        boton1.setBounds(150, 470, 120, 30);
        boton1.addActionListener(this);
        add(boton1);
        
        boton2 = new JButton("Nuevo Trabajador");
        boton2.setBounds(370, 470, 150, 30);
        boton2.addActionListener(this);
        add(boton2);
        
        legacy = new JLabel("©2017 The Coca-Cola Company.");
        legacy.setBounds(520, 500, 200, 30);
        legacy.setForeground(Color.white);
        legacy.setFont(new Font("Calibri",1,13));
        add(legacy);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()== pred){
            getContentPane().setBackground(new Color(219,41,37));
            pred.setVisible(false);
            Negro.setVisible(true);
            label1.setVisible(true);
            label2.setVisible(true);
            label3.setVisible(false);
            label4.setVisible(false);
            
        }
        if (e.getSource() == Negro){
            getContentPane().setBackground(Color.BLACK);
            pred.setVisible(true);
            Negro.setVisible(false);
            label1.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(true);
            label4.setVisible(true);
            
        }
        if(e.getSource() ==s_exit){
            dispose();
           System.exit(0);
        }
        if(e.getSource() ==s_home){
            formulariologin log = new formulariologin();
            log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            log.setVisible(true);
            log.setResizable(false);
            log.setLocationRelativeTo(null);
            this.dispose();
        }
        if (e.getSource() == prog){
            int seleccion =
            JOptionPane.showOptionDialog( null,"\t\tHola Soy Fernando el Programador \n"+
                    "\tque realizo este codigo si quieres saber donde  encontrarme\n"+
                    "\t\tescoje una opcion",
            "Selector de opciones",JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,// null para icono por defecto.
            new Object[] { "Linkedin", "Github", "Cancelar"},"Linkedin");
     
            if (seleccion == 0){
           if(java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop1 = java.awt.Desktop.getDesktop();

                    if(desktop1.isSupported(java.awt.Desktop.Action.BROWSE)){

                        try{ 
                        java.net.URI uri = new java.net.URI("www.linkedin.com/in/fernando-silvo-t");
                        desktop1.browse(uri);
                    }
                        catch(URISyntaxException | IOException ex){}
                    }
            }
        }   if (seleccion == 1){
           if(java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop1 = java.awt.Desktop.getDesktop();

                    if(desktop1.isSupported(java.awt.Desktop.Action.BROWSE)){

                        try{ 
                        java.net.URI uri = new java.net.URI("https://github.com/fernandosilvot");
                        desktop1.browse(uri);
                    }
                        catch(URISyntaxException | IOException ex){}
                    }
            }
        }if (seleccion == 2){
           
        }
        
            /*if (chec.isSelected()){
            System.out.println("Selecciona el Chec");
        }
            JOptionPane.showMessageDialog(null,"desarrollado por Fernando Silva\n"+
                                               "                    Github\n"+
                                               "https://github.com/fernandosilvot \n"+
                                               "                   Linkedin\n"+
                                               "www.linkedin.com/in/fernando-silvo-T");
        */}
        if(e.getSource() == emp){
            if(java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

                    if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){

                        try{ 
                        java.net.URI uri = new java.net.URI("https://www.coca-cola.cl");
                        desktop.browse(uri);
                    }
                        catch(URISyntaxException | IOException ex){}
                    }
            }
        }
        if (e.getSource() == boton1) {
        String nombreTrabajador = res_nom.getText();
	    String AP = ap1.getText();
	    String AM = ap2.getText();
	    String Departamento = combo1.getSelectedItem().toString();
	    String Antiguedad = combo2.getSelectedItem().toString();

            if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") ||
               Departamento.equals("") || Antiguedad.equals("")){
               
                JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos.");

            } else {

                if(Departamento.equals("Atención al cliente")){

                                if(Antiguedad.equals("1 año de servicio")){
					resultado.setText("   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien trabaja  en el Departamento  " + Departamento + " y posee " + Antiguedad + ","+
                                                          "\n   Por eso recibe 6 dias de vacaciones.");
				}
				if(Antiguedad.equals("2 a 6 años de servicios")){
					resultado.setText("   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien trabaja  en el Departamento  " + Departamento + "  y posee " + Antiguedad +","+
                                                          "\n   Por eso recibe 14 dias de vacaciones.");
				}
				if(Antiguedad.equals("7 o más años de servicios")){
					resultado.setText("   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + ","+
                                                          "\n   Por eso recibe 20 dias de vacaciones.");
				}
                     
                }
	        if(Departamento.equals("Logistica")){

				if(Antiguedad.equals("1 año de servicio")){
					resultado.setText("   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + ","+
                                                          "\n   Por eso recibe 7 dias de vacaciones.");
				}
				if(Antiguedad.equals("2 a 6 años de servicios")){
					resultado.setText("   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + ","+
                                                          "\n   Por eso recibe 15 dias de vacaciones.");
				}
				if(Antiguedad.equals("7 o más años de servicios")){
					resultado.setText("   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + ","+
                                                          "\n   Por eso recibe 22 dias de vacaciones.");
				}
	    	}
	    	if(Departamento.equals("Gerencia")){

				if(Antiguedad.equals("1 año de servicio")){
					resultado.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + ","+
                                                          "\n   Por eso recibe 10 dias de vacaciones.");
				}
				if(Antiguedad.equals("2 a 6 años de servicios")){
					resultado.setText("   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + ","+
                                                          "\n   Por eso recibe 20 dias de vacaciones.");
				}
				if(Antiguedad.equals("7 o más años de servicios")){
					resultado.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + ","+
                                                          "\n   Por eso recibe 30 dias de vacaciones.");
				}
	    		}
            }
        }
        if (e.getSource() == boton2){	

	    res_nom.setText("");
	    ap1.setText("");
	    ap2.setText("");
                            combo1.setSelectedIndex(0);
	    combo2.setSelectedIndex(0);
	    resultado.setText("\n   calculor vacaciones.");	 
   
        }
    }
        
}
