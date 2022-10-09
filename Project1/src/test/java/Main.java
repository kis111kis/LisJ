public class Main {
    public static void main(String[] args) {
        ComputerImpl laptop = new Laptop("intel i5", "16gb",
                "ssd 250gb", "Hrtiim25.6", "Samsung");
        ComputerImpl netbook = new Netbook("intel i5", "16gb",
                "ssd 250gb", "Hrtiim25.6", "Samsung");
        ComputerImpl desktop = new Desktop("intel i5", "16gb",
                "ssd 250gb", "GeForce GTX");
        ComputerImpl nettop = new Nettop("intel i5", "16gb",
                "ssd 250gb");
        ComputerImpl monoblock = new Monoblock("intel i5", "16gb",
                "ssd 250gb", "Monitor PH");
        ComputerImpl server = new ServerComputer("intel i5", "16gb",
                "ssd 250gb");
        ComputerImpl[] computer = new ComputerImpl[]{laptop, netbook,
                                desktop, nettop, monoblock, server};
        for (ComputerImpl x : computer) {
            System.out.print(x.getClass().getSimpleName());
            x.Turn();
            x.Turn();
            x.Internet();
        }
    }
}
