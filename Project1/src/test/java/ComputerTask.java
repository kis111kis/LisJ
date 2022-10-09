public class ComputerTask {
    public interface Computer {
        default void Turn_on() {
            System.out.println("включен\n");
        }
        default void Turn_off() {
            System.out.println("выключен\n");
        }
        default void Internet() {
            System.out.println(" подключился к интернету");
        }
    }

    public static abstract class ComputerImpl implements Computer {
        String processor, RAM, hard;
        boolean is_turn_on = false;

        public void Turn() {
            if (is_turn_on) {
                Turn_off();
                is_turn_on = false;
            } else {
                Turn_on();
                is_turn_on = true;
            }
        }

        public void Specifications() {
            System.out.print(this.getClass().getSimpleName() + "\n" +
                    "с процессором: " + processor + "\n" +
                    "с оперативной памятью: " + RAM + "\n" +
                    "с жестким диском: " + hard + "\n");
        }

    }

    public static abstract class PortableComputer extends ComputerImpl {
        Keyboard keyboard;
        Screen screen;

        @Override
        public void Specifications() {
            System.out.print("Портативный компьютер ");
            super.Specifications();
            System.out.println("с клавиатурой: " + keyboard.name);
            System.out.println("с монитором: " + screen.name);
        }

        @Override
        public void Turn() {
            Specifications();
            super.Turn();
        }

        @Override
        public void Internet() {
            Specifications();
            super.Internet();
        }

    }

    public static class Laptop extends PortableComputer {
        public Laptop(String processor, String RAM, String hard,
                      String screen, String keyboard) {
            this.processor = processor;
            this.RAM = RAM;
            this.hard = hard;
            this.screen = new Screen(screen);
            this.keyboard = new Keyboard(keyboard);
        }
    }

    public static class Netbook extends PortableComputer {
        public Netbook(String processor, String RAM, String hard,
                       String screen, String keyboard) {
            this.processor = processor;
            this.RAM = RAM;
            this.hard = hard;
            this.screen = new Screen(screen);
            this.keyboard = new Keyboard(keyboard);
        }
    }

    public static abstract class DesktopComputer extends ComputerImpl {
        @Override
        public void Specifications() {
            System.out.print("Настольный компьютер ");
            super.Specifications();
        }
    }

    public static class Desktop extends DesktopComputer {
        String videocard;

        public Desktop(String processor, String RAM, String hard, String videocard) {
            this.processor = processor;
            this.RAM = RAM;
            this.hard = hard;
            this.videocard = videocard;
        }

        @Override
        public void Specifications() {
            super.Specifications();
            System.out.println("с видеокартой: " + videocard);
        }

        @Override
        public void Turn() {
            Specifications();
            super.Turn();
        }

        @Override
        public void Internet() {
            Specifications();
            super.Internet();
        }
    }

    public static class Nettop extends DesktopComputer {
        public Nettop(String processor, String RAM, String hard) {
            this.processor = processor;
            this.RAM = RAM;
            this.hard = hard;
        }

        public void Turn() {
            super.Specifications();
            super.Turn();
        }
    }

    public static class Monoblock extends DesktopComputer {
        Screen screen;

        public Monoblock(String processor, String RAM, String hard, String screen) {
            this.processor = processor;
            this.RAM = RAM;
            this.hard = hard;
            this.screen = new Screen(screen);
        }

        public void Turn() {
            super.Specifications();
            super.Turn();
        }
    }

    public static class ServerComputer extends ComputerImpl {
        public ServerComputer(String processor, String RAM, String hard) {
            this.processor = processor;
            this.RAM = RAM;
            this.hard = hard;
        }

        public void Turn() {
            super.Specifications();
            super.Turn();
        }
    }

    public static class Keyboard {
        String name;

        public Keyboard(String name) {
            this.name = name;
        }
    }

    public static class Screen {
        String name;

        public Screen(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("intel i5", "16gb",
                "ssd 250gb", "Hrtiim25.6", "Samsung");
        laptop1.Turn();
        laptop1.Turn();
        Netbook netbook = new Netbook("intel i5", "16gb",
                "ssd 250gb", "Hrtiim25.6", "Samsung");
        netbook.Turn();
        netbook.Turn();
        Desktop desktop = new Desktop("intel i5", "16gb",
                "ssd 250gb", "GeForce GTX");
        desktop.Turn();
        desktop.Turn();
        Nettop nettop = new Nettop("intel i5", "16gb",
                "ssd 250gb");
        nettop.Turn();
        nettop.Turn();
        Monoblock monoblock = new Monoblock("intel i5", "16gb",
                "ssd 250gb", "Monitor PH");
        monoblock.Turn();
        monoblock.Turn();
        ServerComputer server = new ServerComputer("intel i5", "16gb",
                "ssd 250gb");
        server.Turn();
        server.Turn();
    }
}
