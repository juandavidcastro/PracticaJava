package banco;

public class Banco {

      public static void main(String[] args) {
        
        // aquí estoy instanciando osea que creo un objeto cuenta
        Cuenta primerCuenta;
        primerCuenta = new Cuenta("Lius Muriel", 1000000);

       //ejemplo de retiro
        double retiro=1400000;
        primerCuenta.retirar(retiro);
        if (retiro<=primerCuenta.getSaldo()){
          System.out.println("Se retiró : "+" $" + retiro + " de la cuenta");
        System.out.println("el saldo es : "+" $" + primerCuenta.getSaldo() );   
        }               
        // ejemplo de ingreso
        double ingreso = 17000;
        
        primerCuenta.depositar(ingreso);
        System.out.println("Se ingrsó : "+" $" + ingreso + " en la cuenta");
        System.out.println("el saldo es : "+" $" + primerCuenta.getSaldo() );       

          
        
    }
    
}
