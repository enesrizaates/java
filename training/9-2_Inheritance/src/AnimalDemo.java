public class AnimalDemo {
    public static void main(String[] args) {
//        Animal myAnimal = new Animal("Fido", 80);  -> if Animal class is abstract we cannot create variable from this class directly
        Dog myDog = new Dog("Rover", 50);
        Cat myCat = new Cat("Kitty", 20);

        System.out.println(myDog.move());
        System.out.println(myCat.move());
//        System.out.println("Name: " + myAnimal.getName());
//        System.out.println("Weight: " + myAnimal.getWeight());
//        System.out.println("Animal says, " + myAnimal.makeNoise());
//
//        System.out.println("\nName: " + myDog.getName());
//        System.out.println("Weight: " + myDog.getWeight());
//        System.out.println("Doggy says, " + myDog.makeNoise());
//
//        System.out.println("\nName: " + myCat.getName());
//        System.out.println("Weight: " + myCat.getWeight());
//        System.out.println("Kitty says, " + myCat.makeNoise());

        // Polymorphism
//        Animal anotherAnimal = new Dog("Sam", 100);
//        System.out.println("Name: " + anotherAnimal.getName());
//        System.out.println("Weight: " + anotherAnimal.getWeight());
//        System.out.println("Animal says, " + anotherAnimal.makeNoise());

        Animal[] myAnimals = new Animal[5];
        Animal dog1 = new Dog("Rover", 30);
        Animal dog2 = new Dog("Hover", 40);
        Animal dog3 = new Dog("Cover", 50);
        Animal cat1 = new Cat("Kitty", 20);
        Animal cat2 = new Cat("Felix", 25);

        myAnimals[0] = dog1;
        myAnimals[1] = dog2;
        myAnimals[2] = dog3;
        myAnimals[3] = cat1;
        myAnimals[4] = cat2;
//        printAnimals(myAnimals);
    }

    public static void printAnimals(Animal[] myAnimals) {
        for (Animal animal : myAnimals) {
            System.out.println(animal.getName());
            System.out.println(animal.getWeight());
            System.out.println(animal.makeNoise());
            System.out.println();
        }
    }


}
