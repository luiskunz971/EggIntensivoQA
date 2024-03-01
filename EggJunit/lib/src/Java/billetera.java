package lib.src.Java;

public class billetera {
    private String dueño;
    private double saldo;

    public billetera(String dueño, double saldo) {
        this.dueño = dueño;
        this.saldo = saldo;
    }

    public void mostrarDuenio(){
        System.out.print("El dueño de la billetera es : " + dueño);
    }

    public void cargarSaldo(double ingreso){
        saldo += ingreso;
        System.out.print("El saldo actual es de : " + saldo);
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
