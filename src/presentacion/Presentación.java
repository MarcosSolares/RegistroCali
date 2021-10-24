package presentacion;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import logica.Estudiante;


public class Presentación extends JFrame  {
	
                                                  	
	protected static final String SQL = null;
	JPanel panel;
	JButton boton,botonC,botAgre,botModi,botEli,botLis;
	JLabel etiquetaDatos,etiquetaCedula,etiquetaApe,etiquetaNom,etiqueta,etiqueta2,etiqueta3,etiqueta4,etiquetaImagen, saludo, saludo2;
	
	private void LimipiarCajas() {
		cajaCed.setText(null);
		cajaNom.setText(null);
		cajaApe.setText(null);
		cajaTexto.setText(null);
		cajaTexto2.setText(null);
		cajaTexto3.setText(null);
	}
	
	private JTextField cajaCed,cajaNom,cajaApe,cajaTexto,cajaTexto2,cajaTexto3;
	
	public Presentación() {
		
		panel = new JPanel();
		panel.setLayout(null);///desactivar el diseño por defecto del panel.
		panel.setBackground(Color.yellow);
		this.getContentPane().add(panel);	
		
		JLabel etiquetaDatos= new JLabel();
		etiquetaDatos.setText("Ingrese los datos del estudiante");
		etiquetaDatos.setBounds(10, 5, 280, 25);
		etiquetaDatos.setForeground(Color.blue);
		etiquetaDatos.setFont(new Font("Garamond",3,20));
		panel.add(etiquetaDatos);
		
		JLabel etiquetaCedula= new JLabel();
		etiquetaCedula.setText("Cedula");
		etiquetaCedula.setBounds(30, 30, 280, 25);
		etiquetaCedula.setForeground(Color.blue);
		etiquetaCedula.setFont(new Font("Garamond",0,15));
		panel.add(etiquetaCedula);
		
		JLabel etiquetaNom= new JLabel();
		etiquetaNom.setText("Nombre");
		etiquetaNom.setBounds(30, 50, 280, 25);
		etiquetaNom.setForeground(Color.blue);
		etiquetaNom.setFont(new Font("Garamond",0,15));
		panel.add(etiquetaNom);
		
		JLabel etiquetaApe= new JLabel();
		etiquetaApe.setText("Apellido");
		etiquetaApe.setBounds(30, 70, 280, 25);
		etiquetaApe.setForeground(Color.blue);
		etiquetaApe.setFont(new Font("Garamond",0,15));
		panel.add(etiquetaApe);
		
		JLabel etiqueta= new JLabel();
		etiqueta.setText("Ingrese la nota del estudiante");
		etiqueta.setBounds(10, 130, 250, 25);
		etiqueta.setForeground(Color.blue);
		etiqueta.setFont(new Font("Garamond",3,20));
		panel.add(etiqueta);
		
		JLabel etiqueta2= new JLabel();
		etiqueta2.setText(" Nota del primer escrito");
		etiqueta2.setBounds(10, 170, 250, 25);
		etiqueta2.setForeground(Color.blue);
		etiqueta2.setFont(new Font("Garamond",3,15));
		panel.add(etiqueta2);
		
		JLabel etiqueta3= new JLabel();
		etiqueta3.setText(" Nota del segundo escrito");
		etiqueta3.setBounds(10, 200, 250, 25);
		etiqueta3.setForeground(Color.blue);
		etiqueta3.setFont(new Font("Garamond",3,15));
		panel.add(etiqueta3);
		
		JLabel etiqueta4= new JLabel();
		etiqueta4.setText(" Nota de oral");
		etiqueta4.setBounds(10, 230, 250, 25);
		etiqueta4.setForeground(Color.blue);
		etiqueta4.setFont(new Font("Garamond",3,15));
		panel.add(etiqueta4);
		
		JLabel etiquetaImagen=new JLabel(new ImageIcon("profe.png"));
		etiquetaImagen.setBounds(450,0, 130, 150);
		panel.add(etiquetaImagen);
		
		cajaCed= new JTextField();
		cajaCed.setBounds(120,30, 80, 20);
		panel.add(cajaCed);
		
		cajaNom= new JTextField();
		cajaNom.setBounds(120,50, 80, 20);
		panel.add(cajaNom);
		
		cajaApe= new JTextField();
		cajaApe.setBounds(120,70, 80, 20);
		panel.add(cajaApe);
		
		cajaTexto= new JTextField();
		cajaTexto.setBounds(200, 170, 20, 20);
		panel.add(cajaTexto);
		
		cajaTexto2= new JTextField();
		cajaTexto2.setBounds(200, 200, 20, 20);
		panel.add(cajaTexto2);
		
		cajaTexto3= new JTextField();
		cajaTexto3.setBounds(200, 230, 20, 20);
		panel.add(cajaTexto3);	
		
		botLis = new JButton("Mostrar");
		botLis.setBounds(190, 290, 90, 30);
		botLis.setForeground(Color.blue);
		botLis.setFont(new Font("Garamond",0,15));
		panel.add(botLis);
		
		boton = new JButton("Determinar Juicio");
		boton.setBounds(100, 320, 180, 30);
		boton.setForeground(Color.blue);
		boton.setFont(new Font("Garamond",3,15));
		panel.add(boton);
		
		
		JButton botAgre = new JButton("nuevo");
		botAgre.setBounds(10, 290, 80, 30);
		botAgre.setForeground(Color.blue);
		botAgre.setFont(new Font("Garamond",0,15));
		panel.add(botAgre);
		
		botAgre.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Estudiante Nuevo= new Estudiante();
			
				Nuevo.setCedula(Integer.valueOf(cajaCed.getText()));
				Nuevo.setNombre(cajaNom.getText());
				Nuevo.setApellido(cajaApe.getText());
				Nuevo.setNota1(Double.valueOf(cajaTexto.getText()));
				Nuevo.setNota2(Double.valueOf(cajaTexto2.getText()));
				Nuevo.setNota3(Double.valueOf(cajaTexto3.getText()));
				Nuevo.AgregarEstudiante(Nuevo);	
				LimipiarCajas();
				
				
			}
			});
	
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(220, 30, 125, 23);
		panel.add(btnBuscar); 
		btnBuscar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		
			try {
				
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost/curso","root","root");
				PreparedStatement sentenciaSQL = con.prepareStatement("select * from estudiante where cedula = ?");
				sentenciaSQL.setString(1,cajaCed.getText().trim());
				
				
			ResultSet rs= sentenciaSQL.executeQuery();
			
				if(rs.next()) {
						
					cajaNom.setText(rs.getString("nombre"));
					cajaApe.setText(rs.getString("apellido"));
					cajaTexto.setText(rs.getString("primerparcial"));
					cajaTexto2.setText(rs.getString("segundoparcial"));
					cajaTexto3.setText(rs.getString("oral"));
				
				}else {
					JOptionPane.showMessageDialog(null,"estudiante no registrado.");
				}
			} catch (Exception e1) {
				}				
			}	
		});
		
		botModi = new JButton("Modificar");
		botModi.setBounds(90, 290,100, 30);
		botModi.setForeground(Color.blue);
		botModi.setFont(new Font("Garamond",0,15));
		panel.add(botModi);
		botModi.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					String cedula= cajaCed.getText().trim();
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost/curso","root","root");
					PreparedStatement sentenciaSQL = con.prepareStatement("update estudiante set nombre=?, apellido=?"
					+ ",primerparcial=?,segundoparcial=?,oral=? where cedula= " +cedula);
					sentenciaSQL.setString(1,cajaNom.getText().trim());
					sentenciaSQL.setString(2,cajaApe.getText().trim());
					sentenciaSQL.setString(3,cajaTexto.getText().trim());
					sentenciaSQL.setString(4,cajaTexto2.getText().trim());
					sentenciaSQL.setString(5,cajaTexto3.getText().trim());
					sentenciaSQL.executeUpdate();
					LimipiarCajas();
					
				} catch (Exception e2) {
					
				}
			}
		});
		
		botEli = new JButton("Eliminar");
		botEli.setBounds(10, 320,90, 30);
		botEli.setForeground(Color.blue);
		botEli.setFont(new Font("Garamond",3,15));
		panel.add(botEli);
		botEli.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					String cedula= cajaCed.getText().trim();
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost/curso","root","root");
					PreparedStatement sentenciaSQL = con.prepareStatement("delete from estudiante where cedula= ?");
					sentenciaSQL.setString(1,cajaCed.getText().trim());
					
					sentenciaSQL.executeUpdate();
					LimipiarCajas();
					
				} catch (Exception e2) {
					
				}
			}
		});
			
		
		saludo = new JLabel();
		saludo.setBounds(260,40, 300,300);
		boton.setFont(new Font("Garamond",0,15));
		panel.add(saludo);
		saludo2 = new JLabel();
		saludo2.setBounds(260,60, 300,300);
		boton.setFont(new Font("Garamond",0,15));
		panel.add(saludo2);
		
		this.add(panel);
		panel.add(boton);
		panel.add(cajaTexto);
		panel.add(etiqueta);
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		boton.addActionListener(accionCalcular());
	}
	
	

	private ActionListener accionCalcular() {	
	return new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		
		int escrito1=0;
		int escrito2=0;
		int oral=0;
		escrito1= Integer.valueOf(cajaTexto.getText());
		escrito2= Integer.valueOf(cajaTexto2.getText());
		oral= Integer.valueOf(cajaTexto3.getText());
		Estudiante Nuevo= new Estudiante();
		saludo.setText("El promedio de notas es: "+String.valueOf(Nuevo.CalculaNotas(escrito1, escrito2, oral)));
		saludo2.setText("Juicio sugerido: " +Nuevo.juicio((int) Math.round(Nuevo.CalculaNotas(escrito1, escrito2, oral))));
		
			}
	
		};		
	}
}

