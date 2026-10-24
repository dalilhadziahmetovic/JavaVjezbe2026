public class Kuvar extends Zaposleni {
	private final double FIKSNI_IZNOS = 1500;

	public Kuvar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
	}

	@Override
	public double izracunajPlatu() {
		return FIKSNI_IZNOS + 4 * ukupanBrojSati * plataPoSatu;
	}

	@Override
	public String getTip() {
		return "Kuvar";
	}

	@Override
	public String getNapomena() {
		return "-";
	}
}