package banco;

public class Cuenta {
    
	// Aquí definen los atributos
	private String nombreTitular;
	private double saldo;

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
	            
        // este es el constructor de la cuenta
	public Cuenta(String nombre, double inicial) {
		this.nombreTitular = nombre;
		this.saldo = inicial;
	} 
        
        //metodos depositar
	public void depositar(double cantidad) {
            if (cantidad >0) {            
		this.saldo = this.saldo + cantidad;
	} 
}
            //metodo retirar
	public void retirar(double cantidad) {
            
        if (this.saldo - cantidad >=0) {
                
		this.saldo = this.saldo - cantidad;
	} 
        else{
            System.out.println("Saldo insuficiente ");
            }
  } 

}