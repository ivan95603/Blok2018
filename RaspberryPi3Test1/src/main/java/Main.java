import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

public class Main
{
    public static void main(String[] args) {

        System.out.println("Hello, Raspberry Pi!");

        /* Initialize pi4j */
        final GpioController gpio = GpioFactory.getInstance();

        /* Initialize GPIO 0 as an input pin called "MyButton" and set
           it low using the pull-down resistor.
        */
        GpioPinDigitalInput myButton =
                gpio.provisionDigitalInputPin(RaspiPin.GPIO_00,
                        "MyButton",
                        PinPullResistance.PULL_DOWN);

        /* Read the state (high or low) of the pin. Remember, it should be "low" */
        PinState pinState = myButton.getState();
        System.out.println("GPIO 0 is set to " + pinState.getName());

        /* Close all open connections. */
        gpio.shutdown();
    }
}
