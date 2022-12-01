package ec.edu.espol.patron1;

public class EmitirTarjetaPremium extends EmitirTarjeta {

	public Tarjeta crearTarjeta() {
		
		return new TarjetaPremium();
	}

}