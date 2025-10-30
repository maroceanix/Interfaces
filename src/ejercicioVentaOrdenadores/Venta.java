package ejercicioVentaOrdenadores;

public class Venta {

	private String nombreCliente;

	private String localidad;

	private String procesador;

	private String memoria;

	private String monitor;

	private String discoDuro;

	private boolean grabadoraDVD;

	private boolean wifi;

	private boolean sintonizadorTV;

	private boolean backupRestore;



	public Venta(String nombreCliente, String localidad, String procesador, String memoria, String monitor,

			String discoDuro, boolean grabadoraDVD, boolean wifi, boolean sintonizadorTV, boolean backupRestore) {

		this.nombreCliente = nombreCliente;

		this.localidad = localidad;

		this.procesador = procesador;

		this.memoria = memoria;

		this.monitor = monitor;

		this.discoDuro = discoDuro;

		this.grabadoraDVD = grabadoraDVD;

		this.wifi = wifi;

		this.sintonizadorTV = sintonizadorTV;

		this.backupRestore = backupRestore;

	}



	public String getNombreCliente() {

		return nombreCliente;

	}



	public String getLocalidad() {

		return localidad;

	}



	public String getProcesador() {

		return procesador;

	}



	public String getMemoria() {

		return memoria;

	}



	public String getMonitor() {

		return monitor;

	}



	public String getDiscoDuro() {

		return discoDuro;

	}



	public boolean isGrabadoraDVD() {

		return grabadoraDVD;

	}



	public boolean isWifi() {

		return wifi;

	}



	public boolean isSintonizadorTV() {

		return sintonizadorTV;

	}



	public boolean isBackupRestore() {

		return backupRestore;

	}



	@Override

	public String toString() {

		return nombreCliente + " (" + localidad + ")";

	}

}