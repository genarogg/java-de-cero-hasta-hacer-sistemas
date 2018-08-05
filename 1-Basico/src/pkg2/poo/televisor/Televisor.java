package pkg2.poo.televisor;

/**
 *
 * @author Genarogg
 */
public class Televisor {
    private double Peso,Altura,ResolucionAncho,ResolucionAltura;
    private String Marca,Color;
    private boolean Ensendido,Apagado,Estado;
    
    public Televisor(){
        this.Peso = 8;
        this.Altura = 50;
        this.ResolucionAncho = 1080;
        this.ResolucionAltura = 1920;
        
        this.Marca = "LG";
        this.Color = "negro";
        
        this.Ensendido = false;
        this.Apagado = true;
        
    }
    public Televisor(double Peso,double Altura,double ResolucionAncho, double ResolucionAltura,
        String Marca,String Color,boolean Ensendido,boolean Apagado,boolean Estado){
        
        this.Peso = Peso;
        this.Altura = Altura;
        this.ResolucionAncho = ResolucionAncho;
        this.ResolucionAltura = ResolucionAltura;
        
        this.Marca = Marca;
        this.Color = Color;
        
        this.Ensendido = Ensendido;
        this.Apagado = Apagado;
        this.Estado = Estado;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getResolucionAncho() {
        return ResolucionAncho;
    }

    public void setResolucionAncho(double ResolucionAncho) {
        this.ResolucionAncho = ResolucionAncho;
    }

    public double getResolucionAltura() {
        return ResolucionAltura;
    }

    public void setResolucionAltura(double ResolucionAltura) {
        this.ResolucionAltura = ResolucionAltura;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public boolean isEnsendido() {
        return Ensendido;
    }

    public void setEnsendido(boolean Ensendido) {
        this.Ensendido = Ensendido;
    }

    public boolean isApagado() {
        return Apagado;
    }

    public void setApagado(boolean Apagado) {
        this.Apagado = Apagado;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
}
