package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumiriProiecte;

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void afisareRaspunsProiect(Proiect proiect) {

		boolean esteAcceptat = punctaj >= proiect.getPragDeAcceptare();
		StringBuilder stringBuilder = new StringBuilder("Aplicantul ").append(nume).append(" ").append(prenume)
				.append(" ");
		stringBuilder.append(esteAcceptat ? "a fost acceptat." : "a fost respins.");

		System.out.println(stringBuilder.toString());
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public Aplicant() {
		super();
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumiriProiecte = denumireProiect;
	}

	public void setVectorDenumiri(String[] denumireProiecte, int nr_proiecte) {
		this.nr_proiecte = nr_proiecte;
		this.denumiriProiecte = denumireProiecte;
	}

	public abstract float getSumaFinantata();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nume=");
		builder.append(nume);
		builder.append(", prenume=");
		builder.append(prenume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", punctaj=");
		builder.append(punctaj);
		builder.append(", nr_proiecte=");
		builder.append(nr_proiecte);
		builder.append(", denumireProiect=");
		builder.append(Arrays.toString(denumiriProiecte));
		return builder.toString();
	}

}
