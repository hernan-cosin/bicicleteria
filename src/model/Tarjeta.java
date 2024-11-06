package model;

public class Tarjeta extends Forma_de_pago{
    private long nro_tarjeta;
    private String tipo_tarjeta;

    public Tarjeta(long nro_tarjeta, String tipo_tarjeta){
        super();
        this.nro_tarjeta = nro_tarjeta;
        this.tipo_tarjeta = tipo_tarjeta;
    }
    
    public long getNro_tarjeta() {
        return nro_tarjeta;
    }
    public void setNro_tarjeta(long nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }
    public String getTipo_tarjeta() {
        return tipo_tarjeta;
    }
    public void setTipo_tarjeta(String tipo_tarjeta) {
        this.tipo_tarjeta = tipo_tarjeta;
    }

    
}
