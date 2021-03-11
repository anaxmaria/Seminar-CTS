package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class AngajatiReader extends IReader {

    public AngajatiReader(String filePath) {
        super(filePath);
    }

    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.filePath));
        input.useDelimiter(",");
        List<Aplicant> listaAngajati = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Angajat angajat = new Angajat();
            super.citireAplicant(input, angajat);

            int salariu = input.nextInt();
            angajat.setSalariu(salariu);

            String ocupatie = input.next();
            angajat.setOcupatie(ocupatie);

            listaAngajati.add(angajat);
        }

        input.close();
        return listaAngajati;
    }
}
