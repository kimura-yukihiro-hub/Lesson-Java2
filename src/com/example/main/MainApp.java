package com.example.main;

//片方だけ import する（もう片方はフルネームで書くため）
import com.example.animal.Dog;

public class MainApp {
	public static void main(String[] args) {
		Dog animalDog = new Dog();
		animalDog.shout();

		//import していない方の Dog (vehicleパッケージ)
		com.example.vehicle.Dog vheicleDog = new com.example.vehicle.Dog();
		vheicleDog.shout();

	}

}
