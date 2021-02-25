package pachet1;

import clase_d1.Girafa;
import clase_d1.Zebra;
import clase_d1.Zoo;

public class Program {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();

		Girafa g1 = new Girafa("girafa galbena");
		Girafa g2 = new Girafa("girafa roz");
		
		zoo.adaugaAnimal(g1);
		zoo.adaugaAnimal(g2);
		
		Zebra z1 = new Zebra("zebra cu dungi");
		Zebra z2 = new Zebra("zebra cu buline");
		
		zoo.adaugaAnimal(z1);
		zoo.adaugaAnimal(z2);
		
		zoo.feedAllAnimals();

		//testare din intellij
	}

}
