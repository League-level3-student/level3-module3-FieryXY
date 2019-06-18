package _01_AnimalFarm;

public abstract class Animal {
	public abstract void makeNoise();
	
	public void walk(int steps) {
		System.out.println("The animal has walked "+steps+" steps!");
	}
}
