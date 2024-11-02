package model;

public class Fecha extends Fecha_vencimiento{
    private Integer dia;

    public Fecha(Integer mes, Integer anio, Integer dia){
        super(mes, anio);
        this.dia = dia;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }
    
    
}
