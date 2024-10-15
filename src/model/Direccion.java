package model;

public class Direccion {
    private String calle;
    private Integer numero;

    public void modificar_direccion(Direccion dir) {
        if (this.getCalle() == dir.calle & this.getNumero() == dir.numero) {
            throw new Error("La nueva dirección coincide con la dirección actual.");
        } else {
            this.setCalle(dir.calle);
            this.setNumero(dir.numero);
        }
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

}
