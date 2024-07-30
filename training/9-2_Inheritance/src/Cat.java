public class Cat extends Animal implements IMovable{
    public Cat(String name, double weight) {
        super(name, weight);
    } // ctor
    
    @Override
    public String makeNoise() {
        return "Meooow!";
    }

    @Override
    public String move() {
        return "I'm stalking you, waiting on my dinner!";
    }
}
