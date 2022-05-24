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
	
	public int compareTo(Object j) {
		if (((Jugador)j).getEdad() > getEdad()) {
			return ((Jugador)j).getEdad() - getEdad();		
		}
		else {
			return getEdad() - ((Jugador)j).getEdad();
		}
	}
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
	}
	public boolean jugarConLasManos() {
		return false;
	}
}
