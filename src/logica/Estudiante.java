package logica;

import persistencia.Conectar;

public class Estudiante {
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	private String nombre,apellido;
	private int cedula;
	private double nota1 ;
	private double nota2 ;
	private double nota3 ;
	private float total = (float) (nota1+nota2+nota3);

	public float  CalculaNotas(int escrito1, int escrito2, int oral) {
		
		nota1 = escrito1*0.40;
		nota2 = escrito2*0.40;
		nota3 = oral*0.20;
		total = (float) (nota1+nota2+nota3);
	
	return total;
} 

public String juicio (int d) {
		
	String juicio = null;
		if(d >= 11 && d <= 12 ) {
			juicio="exonerado,excelente desempeño";	
		}else {
			if(d >= 8 && d <= 10 ) {
				juicio="exonerado,satisfactorio";	
			}else {
				if(d >= 6 && d <= 7 ) {
					juicio="exonerado,aceptable";	
				}else {
					if(d >= 0 && d < 6) {
						juicio= "debe rendir examen";		
					}else {
				juicio="error en las notas ingresadas";
					}
				}
			}
		}
return juicio;		
}

private Conectar con= new Conectar();

public void AgregarEstudiante(Estudiante e) {
	con.EstudianteNuevo(e);	
}
public Estudiante(){	
}
	public Estudiante(int cedula,String nombre, String apellido,int nota1, int nota2, int nota3) {
		this.cedula= cedula;
		this.nombre= nombre;
		this.apellido= apellido;
		this.nota1= nota1;
		this.nota2= nota2;
		this.nota3=nota3;
	}
}