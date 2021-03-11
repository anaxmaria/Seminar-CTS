package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class EleviReader extends IReader {
    public EleviReader(String filePath) {
        super(filePath);
    }

    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.filePath));
        input.useDelimiter(",|\n");
        List<Aplicant> listaElevi = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Elev elev = new Elev();
            super.citireAplicant(input, elev);

            int clasa = input.nextInt();
            elev.setClasa(clasa);

            String tutore = input.next();
            elev.setTutore(tutore);

            listaElevi.add(elev);
        }

        input.close();
        return listaElevi;
    }
}
