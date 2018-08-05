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
}
