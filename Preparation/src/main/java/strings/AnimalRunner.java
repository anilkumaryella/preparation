package strings;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Pet();

		Pet pet = new Pet();
		System.out.println(pet instanceof Pet);
		System.out.println(pet instanceof Dog);
		System.out.println(pet instanceof Animal);
		
		System.out.println(animal instanceof Pet);
		System.out.println(animal instanceof Dog);
		System.out.println(animal instanceof Animal);
	}

}
