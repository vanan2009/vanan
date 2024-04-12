package javanangcao3;

public class Dog extends Animal {
    @Override
    public void greets() {
        System.out.println("Woof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + ']';
    }
    public void greetss(Dog another) {
        System.out.println("Woooooof!");
    }
}

