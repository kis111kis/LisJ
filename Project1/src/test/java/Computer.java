public interface Computer {
    default void Turn_on() {
        System.out.println("включен\n");
    }
    default void Turn_off() {
        System.out.println("выключен\n");
    }
    default void Internet() {
        System.out.println("подключился к интернету\n");
    }
}