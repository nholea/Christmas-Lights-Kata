package christmas.lights.kata;

import java.util.Random;

public class ChristmasLights {
    private int status;
    Random random = new Random();

    public ChristmasLights() {
        this.status = random.nextInt(2);
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;

    }
}
