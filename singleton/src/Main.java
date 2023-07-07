class Main{
    public static void main(String args[])
    {
        // Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();

        // Condition check
        if (x == y ) {
            System.out.println(
                    "Three objects point to the same memory location on the heap.");
        }

        else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}