public class MainApplication {
    public static void main(String[] args) {
        MaxCar myCar = new MaxCar();
        System.out.println("Array Length: " + myCar.getArray().length);
        System.out.println("Max Element: " + myCar.getTransformedArray()[myCar.getTransformedArray().length/2]);
        System.out.println("Generated Array: ");
        for (int element : myCar.getArray()){
            System.out.print(element + " ");
        }
        System.out.println("\nTransformed Array:");
        for (int element : myCar.getTransformedArray()){
            System.out.print(element + " ");
        }
    }
}
