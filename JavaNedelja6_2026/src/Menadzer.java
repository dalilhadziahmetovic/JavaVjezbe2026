public class Menadzer extends Zaposleni {
	private final double OSNOVICA = 1300;
	private double bonus;

	public Menadzer(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double bonus) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		if (bonus >= 0)
			this.bonus = bonus;
	}

	@Override
	public double izracunajPlatu() {
		return OSNOVICA + 4 * ukupanBrojSati * plataPoSatu + bonus;
	}

	@Override
	public String getTip() {
		return "Menadzer";
	}

	@Override
	public String getNapomena() {
		if (bonus > 0) {
			return "bonus: " + bonus + " EUR";
		}
		return "-";
	}
}