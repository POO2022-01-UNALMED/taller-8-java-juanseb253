package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}
	public int compareTo(Portero p) {
		if (p.golesRecibidos > golesRecibidos) {
			return p.golesRecibidos - golesRecibidos;
		}
		else {
			return golesRecibidos - p.golesRecibidos;
		}
	}
	public boolean jugarConLasManos() {
		return true;
	}
}
