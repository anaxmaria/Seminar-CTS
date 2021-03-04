package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class IReader {

	//initial fusese interfata, acum este clasa abstracta

	protected String filePath;
	
	public IReader(String filePath) {
		super();
		this.filePath = filePath;
	}

	public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;
}
