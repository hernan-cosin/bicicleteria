package model;

public class Bicicleta {
    private String marca;
    private String modelo;
    private Integer rodado;
    private Tipo_bicicleta tipo_bicicleta;
    private Especialidad especialidad;
    private Integer stock;
    private Double valor;
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getRodado() {
        return rodado;
    }
    public void setRodado(Integer rodado) {
        this.rodado = rodado;
    }
    public Tipo_bicicleta getTipo_bicicleta() {
        return tipo_bicicleta;
    }
    public void setTipo_bicicleta(Tipo_bicicleta tipo_bicicleta) {
        this.tipo_bicicleta = tipo_bicicleta;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}