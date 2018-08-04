package pkg2POO.computador;

/**
 *
 * @author Genarogg
 */
public class Computador {
    private boolean Apagada;
    private boolean Encendida;
    private boolean Estado;

    private double NumeroRam;
    private double NumeroGrafica;

    private int NumeroProcesadores;
    private int NumeroCornetas;
    private int NumeroMonitores;
    private int NumeroMause;
    private int NumeroTeclado;

    private String ModeloRam;
    private String ModeloGrafica;
    private String ModeloProcesador;
    private String ModeloMonitor;
    private String ModeloMause;
    private String ModeloTeclado;

    String SistemaOperativo;

    public Computador(){
        this.NumeroRam = 4.096;
        this.NumeroGrafica = 12.288;

        this.NumeroProcesadores = 6;
        this.NumeroCornetas = 2;
        this.NumeroMonitores = 1;
        this.NumeroMause = 1;
        this.NumeroTeclado = 1;

        this.ModeloRam = "Kiston";
        this.ModeloGrafica = "Nvidia gt";
        this.ModeloProcesador = "Intel core i7";
        this.ModeloMonitor = "AOC";
        this.ModeloMause = "Genius";
        this.ModeloTeclado = "Genius";

        this.SistemaOperativo = "Windows 10";
    }

    public Computador(double NumeroRam,double NumeroGrafica,int Procesadores,int Cornetas,
        int NumeroMonitores,int NumeroMause,int NumeroTeclado,String ModeloRam,String ModeloGrafica,
        String ModeloProcesador,String ModeloMonitor,String ModeloMause,String ModeloTeclado,
        String SistemaOperativo) {

        this.NumeroRam = NumeroRam;
        this.NumeroGrafica = NumeroGrafica;

        this.NumeroProcesadores = Procesadores;
        this.NumeroCornetas = Cornetas;
        this.NumeroMonitores = NumeroMonitores;
        this.NumeroMause = NumeroMause;
        this.NumeroTeclado = NumeroTeclado;

        this.ModeloRam = ModeloRam;
        this.ModeloGrafica = ModeloGrafica;
        this.ModeloProcesador = ModeloProcesador;
        this.ModeloMonitor = ModeloMonitor;
        this.ModeloMause = ModeloMause;
        this.ModeloTeclado = ModeloTeclado;

        this.SistemaOperativo = SistemaOperativo;

    }	
    public double ObtenerNumeroRam() {
        return NumeroRam;
    }
    public double ObtenerNumeroGrafica() {
        return NumeroGrafica;
    }
    public int ObtenerNumeroProcesadores() {
        return NumeroProcesadores;
    }
    public int ObtenerNumeroCornetas() {
        return NumeroCornetas; 
    }
    public int ObtenerNumeroMonitores() {
        return NumeroMonitores;
    }
    public int ObtenerNumeroMause() {
        return NumeroMause;
    }
    public int ObtenerNumeroTeclado() {
        return NumeroTeclado;
    }
    public String ObtenerModeloRam() {
        return ModeloRam;
    }
    public String ObtenerModeloGrafica() {
        return ModeloGrafica;
    }
    public String ObtenerModeloProcesado() {
        return ModeloProcesador;
    }
    public String ObtenerModeloMonitor() {
        return ModeloMonitor;
    }
    public String ObtenerModeloMause() {
        return ModeloMause;
    }
    public String ObtenerModelooTeclado() {
        return ModeloTeclado;
    }
    public String ObtenerSistemaOperativo() {
        return SistemaOperativo;
    }
    public void ComputadoraApagada() {
        Apagada = true;
        System.out.println("Has apagado la Computadora");
    }
    public void ComputadoraEncendida() {
        Encendida = true;
        System.out.println("Has encendido el Computador");
    }
    public void Estado() {
        if(Encendida == true) {
            System.out.println("El computador esta encendido" );
        }
        if(Apagada == true) {
            System.out.println("El computador esta apagado");
        }
    }
                
    public static void main(String[] args) {
        Computador computador = new Computador();
    }
}
