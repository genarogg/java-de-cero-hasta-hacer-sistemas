package pkg2.poo.computador;

/**
 *
 * @author Genarogg
 */
public class Computador {
    public class Computador {
	boolean Apagada;
	boolean Encendida;
	boolean Estado;
	
	double NumeroRam;
	double NumeroGrafica;
	
	int NumeroProcesadores;
	int NumeroCornetas;
	int NumeroMonitores;
	int NumeroMause;
	int NumeroTeclado;
	
	String ModeloRam;
	String ModeloGrafica;
	String ModeloProcesador;
	String ModeloMonitor;
	String ModeloMause;
	String ModeloTeclado;
	
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
}
