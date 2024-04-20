
package lab11task2;

public class Lamp {
    
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("The lamp is now turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("The lamp is now turned off.");
    }
}
    
}
