package accessControl;

public class App {

    public static void main(String[] args) {
        new App();
    }

    App() {
        Apple apple = new Apple();

        apple.setTaste("Jummy");
        apple.setColor("Green");

        System.out.println("This " + apple.getColor() + " apple tastes " + apple.getTaste());
    }
}
