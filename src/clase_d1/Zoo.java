package clase_d1;

import java.util.ArrayList;
import java.util.List;



public class Zoo implements ZooInterface{
	private Zookeeper zookeeper;
	private List<Animal> animalList;
	
	
	
	public Zoo() {
		super();
		this.animalList = new ArrayList<>();
		this.zookeeper = new Zookeeper("Ion");
	}



	public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
		super();
		this.zookeeper = zookeeper;
		this.animalList = animalList;
	}
	
	public void adaugaAnimal(Animal animal) {
		animalList.add(animal);
	}
	
	public void feedAllAnimals() {
		for(Animal animal:animalList) {
			zookeeper.feed(animal);
		}
	}
}
