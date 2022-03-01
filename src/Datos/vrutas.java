
package Datos;

public class vrutas {
    private int idrutas;
    private String origen;
    private String destino;
    private String limite;

    public vrutas() {
    }

    public vrutas(int idrutas, String origen, String destino, String limite) {
        this.idrutas = idrutas;
        this.origen = origen;
        this.destino = destino;
        this.limite = limite;
    }

    public int getIdrutas() {
        return idrutas;
    }

    public void setIdrutas(int idrutas) {
        this.idrutas = idrutas;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }
    
    
}
