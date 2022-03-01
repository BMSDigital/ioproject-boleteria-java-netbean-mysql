
package Datos;

import java.sql.Date;

public class vprecio_rutas {
    private int idprecio_rutas;
    private String rutas;
    private String destino;
    private String tipo_pasaje;
    private Double precio;
    private Date desde;
    private Date hasta;

    public vprecio_rutas() {
    }

    public vprecio_rutas(int idprecio_rutas, String rutas, String destino, String tipo_pasaje, Double precio, Date desde, Date hasta) {
        this.idprecio_rutas = idprecio_rutas;
        this.rutas = rutas;
        this.destino = destino;
        this.tipo_pasaje = tipo_pasaje;
        this.precio = precio;
        this.desde = desde;
        this.hasta = hasta;
    }

    public int getIdprecio_rutas() {
        return idprecio_rutas;
    }

    public void setIdprecio_rutas(int idprecio_rutas) {
        this.idprecio_rutas = idprecio_rutas;
    }

    public String getRutas() {
        return rutas;
    }

    public void setRutas(String rutas) {
        this.rutas = rutas;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTipo_pasaje() {
        return tipo_pasaje;
    }

    public void setTipo_pasaje(String tipo_pasaje) {
        this.tipo_pasaje = tipo_pasaje;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getDesde() {
        return desde;
    }

    public void setDesde(Date desde) {
        this.desde = desde;
    }

    public Date getHasta() {
        return hasta;
    }

    public void setHasta(Date hasta) {
        this.hasta = hasta;
    }

    
}
