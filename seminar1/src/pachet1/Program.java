package pachet1;

import clase_d1.Girafa;
import clase_d1.Zebra;
import clase_d1.Zoo;

public class Program {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();

		Girafa g1 = new Girafa("g1");
		Girafa g2 = new Girafa("g2");
		
		zoo.adaugaAnimal(g1);
		zoo.adaugaAnimal(g2);
		
		Zebra z1 = new Zebra("z1");
		Zebra z2 = new Zebra("z2");
		
		zoo.adaugaAnimal(z1);
		zoo.adaugaAnimal(z2);
		
		zoo.feedAllAnimals();
	}

}
