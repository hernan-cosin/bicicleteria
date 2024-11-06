package model;

public class Tarjeta_credito extends Tarjeta{
    private Fecha_vencimiento vencimiento;

    public Tarjeta_credito(Double monto, long nro_tarjeta, String tipo_tarjeta, Fecha_vencimiento vencimiento) {
        super(nro_tarjeta, tipo_tarjeta);
        this.vencimiento = vencimiento;
    }
    public Fecha_vencimiento getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Fecha_vencimiento vencimiento) {
        this.vencimiento = vencimiento;
    }

    
}
