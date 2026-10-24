public class HemijskiProizvodi extends Proizvod {
	private float temperaturaSkladistenja;
	private boolean zapaljivo;

	public HemijskiProizvodi(String opisProizvoda, String barKod, String zemljaPorijekla, int godinaProizvodnje,
			double uvoznaCijena, float temperaturaSkladistenja, boolean zapaljivo) {
		super(opisProizvoda, barKod, zemljaPorijekla, godinaProizvodnje, uvoznaCijena);
		this.temperaturaSkladistenja = temperaturaSkladistenja;
		this.zapaljivo = zapaljivo;
	}

	public float getTemperaturaSkladistenja() {
		return temperaturaSkladistenja;
	}
	public void setTemperaturaSkladistenja(float temperaturaSkladistenja) {
		this.temperaturaSkladistenja = temperaturaSkladistenja;
	}
	public boolean isZapaljivo() {
		return zapaljivo;
	}
	public void setZapaljivo(boolean zapaljivo) {
		this.zapaljivo = zapaljivo;
	}

	@Override
	public void izracunajCijenu() {
		if (this.zapaljivo) {
			this.setUvoznaCijena(getUvoznaCijena() * 1.125);
		} else {
			this.setUvoznaCijena(getUvoznaCijena() * 1.1);
		}
	}
}