public class ComputerTask {
    public interface Computer {
        default void Turn_on() {
            System.out.println("включен");
        }
        default void Turn_off() {
            System.out.println("выключен");
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
            System.out.println("с клавиатурой: " + keyboard.name);
            System.out.println("с монитором: " + screen.name);
        }

        @Override
        public void Turn() {
            super.Specifications();
            Specifications();
            super.Turn();
        }

        @Override
        public void Internet() {
            super.Specifications();
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

//    public class Netbook extends PortableComputer {
//        Keyboard keyboard;
//        Screen screen;
//
//        public Netbook(String processor, String RAM, String hard,
//                      String videocard) {
//            this.processor = processor;
//            this.RAM = RAM;
//            this.hard = hard;
//            screen = new Screen();
//            keyboard = new Keyboard();
//        }
//
//        @Override
//        public void Turn() {
//            super.Specifications();
//
//        }
//    }
//
//    public abstract class DesktopComputer extends ComputerImpl {
//        public void Turn() {
//            System.out.print(this.getClass().getSimpleName() +
//                    " с процессором: " + processor +
//                    " с оперативной памятью: " + RAM +
//                    " с жестким диском: " + hard);
//            if (is_turn_on) {
//                System.out.println(" выключен");
//            } else {
//                System.out.println(" включен");
//            }
//        }
//    }
//
//    public class Desktop extends DesktopComputer {
//
//    }
//
//    public class Nettop extends DesktopComputer {
//
//    }
//
//    public class Monoblock extends DesktopComputer {
//
//    }
//
//    public class ServerComputer extends ComputerImpl {
//        public void Turn() {
//            System.out.print(this.getClass().getSimpleName() +
//                    " с процессором: " + processor +
//                    " с оперативной памятью: " + RAM +
//                    " с жестким диском: " + hard);
//            if (is_turn_on) {
//                System.out.println(" выключен");
//            } else {
//                System.out.println(" включен");
//            }
//        }
//    }

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
    }
}
