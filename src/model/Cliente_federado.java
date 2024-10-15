package model;

public abstract class Cliente_federado {
    private Integer nro_matricula;
    private Agrupacion agrupacion;
    
    public Integer getNro_matricula() {
        return nro_matricula;
    }
    public void setNro_matricula(Integer nro_matricula) {
        this.nro_matricula = nro_matricula;
    }
    public Agrupacion getAgrupacion() {
        return agrupacion;
    }
    public void setAgrupacion(Agrupacion agrupacion) {
        this.agrupacion = agrupacion;
    }

    
}
