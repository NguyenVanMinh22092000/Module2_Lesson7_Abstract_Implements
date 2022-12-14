package Practice1;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "I am a beautiful chicken";
    }
    @Override
    public String howToEat(){
        return " thích ăn là ăn";
    }

}
