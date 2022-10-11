import java.io.*;

public class Main {
    public static void main(String[] args) {
        ComputerImpl laptop = new Laptop("intel i5", "16gb",
                "ssd_250gb", "Hrtiim25.6", "Samsung");
        ComputerImpl netbook = new Netbook("intel i5", "16gb",
                "ssd_250gb", "Hrtiim25.6", "Samsung");
        ComputerImpl desktop = new Desktop("intel i5", "16gb",
                "ssd_250gb", "GeForce GTX");
        ComputerImpl nettop = new Nettop("intel i5", "16gb",
                "ssd_250gb");
        ComputerImpl monoblock = new Monoblock("intel i5", "16gb",
                "ssd_250gb", "Monitor_PH");
        ComputerImpl server = new ServerComputer("intel i5", "16gb",
                "ssd_250gb");
        ComputerImpl[] computer = new ComputerImpl[]{laptop, netbook,
                                desktop, nettop, monoblock, server};
        for (ComputerImpl x : computer) {
            System.out.println(x.turnOn());
            System.out.println(x.turnOff());
            System.out.println(x.connect());
        }
    }
}
