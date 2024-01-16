class Main{
    public static void main(String[] args) {
        Singleton firstInstance = Singleton.getInstance();

        System.out.println("First Instance: " + firstInstance.s);

        Singleton secondInstance = Singleton.getInstance();

        System.out.println("Second Instance: " + secondInstance.s);

        // Both references should point to the same instance
        if (firstInstance == secondInstance) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("References do not point to the same instance.");
        }
    }
}
