package modelo;

/**
 * Clase Operaciones
 */
public class Operaciones {
	
	int operandoa;
	int operandob;
	
	
    /**
     * Default constructor. 
     */
    public Operaciones() {
        // TODO Auto-generated constructor stub
    	
    }


	public int getOperandoa() {
		return operandoa;
	}


	public void setOperandoa(int operandoa) {
		this.operandoa = operandoa;
	}


	public int getOperandob() {
		return operandob;
	}


	public void setOperandob(int operandob) {
		this.operandob = operandob;
	}
    
	// Metodo que realiza la suma de los operandos
	public int suma(){
		int resultado;
		resultado=this.operandoa+this.operandob;
		return resultado;
	}
	
	//Método que realiza la resta de los operandos.
	public int resta(){
		int resultado;
		resultado=this.operandoa-this.operandob;
		return resultado;
	}

}
