public abstract class dongVat {
    private String moveOption; //could be "swim" or "walk"

    public dongVat(String moveOption) {
        this.moveOption = moveOption;
    }

    public String getMoveOption() {
        return moveOption;
    }

    public void setMoveOption(String moveOption) {
        this.moveOption = moveOption;
    }

    public abstract void move();
}

public class Pig extends dongVat {
    public Pig() {
        super("walk");
    }
}

public class Duck extends dongVat {
    public Duck() {
        super("walk and swim");
    }
}

public class Fish extends dongVat {
    public Fish() {
        super("swim");
    }
}

public class Main {
    public static void main(String[] args) {
        dongVat[] animals =
    }
}