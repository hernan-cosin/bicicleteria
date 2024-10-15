package model;

public abstract class Tarjeta_credito {
    private Fecha_vencimiento vencimiento;

    public Fecha_vencimiento getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Fecha_vencimiento vencimiento) {
        this.vencimiento = vencimiento;
    }

    
}
