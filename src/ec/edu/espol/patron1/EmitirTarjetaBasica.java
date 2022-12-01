package ec.edu.espol.patron1;

public class EmitirTarjetaBasica extends EmitirTarjeta {

	public Tarjeta crearTarjeta() {
		
		return new TarjetaBasica();
	}

}