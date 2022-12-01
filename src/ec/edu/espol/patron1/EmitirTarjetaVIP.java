package ec.edu.espol.patron1;

public class EmitirTarjetaVIP extends EmitirTarjeta {

	public Tarjeta crearTarjeta() {
		
		return new TarjetaVIP();
		
	}

}