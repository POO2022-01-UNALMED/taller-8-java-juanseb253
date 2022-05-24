package futbol;

public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		golesMarcados = 289;
		dorsal = 7;
	}
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public int compareTo(Jugador j) {
		if (j.getEdad() > getEdad()) {
			return j.getEdad() - getEdad();		
		}
		else {
			return getEdad() - j.getEdad();
		}
	}
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
	}
	public boolean jugarConLasManos() {
		return false;
	}
	public int compareTo(Futbolista t) {
		return 1;
	}
}
