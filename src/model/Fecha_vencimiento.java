package model;

public class Fecha_vencimiento {
    private Integer mes;
    private Integer anio;

    public Fecha_vencimiento (Integer mes, Integer anio) {
        this.mes = mes;
        this.anio = anio;
    }
    
    public Integer getMes() {
        return mes;
    }
    public void setMes(Integer mes) {
        this.mes = mes;
    }
    public Integer getAnio() {
        return anio;
    }
    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    
    
}
