package _01_AnimalFarm;

public class Farm {

	public static void main(String[] args) {
		Animal cow = new Cow();
		walkAndTalk(cow);
		Animal pig = new Pig();
		walkAndTalk(pig);
		Animal chicken = new Chicken();
		walkAndTalk(chicken);
		Animal sheep = new Sheep();
		walkAndTalk(sheep);
	}
	
	static void walkAndTalk(Animal a) {
		a.walk(10);
		a.makeNoise();
	}

}
