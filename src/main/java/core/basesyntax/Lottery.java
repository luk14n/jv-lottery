package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int BALL_NUM_COUNT = 100;
    private static final Random random = new Random();

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Lottery(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }
    //This constructor allows you to inject a custom ColorSupplier.
    // instance into the Lottery. This is useful if you want to use.
    // a specific implementation of ColorSupplier, perhaps for testing or customization.
    // It ensures that the Lottery class can be initialized with any ColorSupplier you provide.

    public Lottery() {
    }
    //The default constructor initializes the Lottery class with a default ColorSupplier.
    // This is useful for scenarios where you want to create a Lottery object with standard
    // behavior without needing to provide a ColorSupplier explicitly.

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomNumber = random.nextInt(BALL_NUM_COUNT);
        return new Ball(randomColor, randomNumber);
    }
}
