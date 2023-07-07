public class Interface {
    public static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle.");
        }
    }
    public static class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a rectangle.");
        }
    }

    public static class Square implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a square.");
        }
    }
}
