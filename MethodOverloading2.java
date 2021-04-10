class MethodOverloading2 {
    private static void area(int a){
        System.out.println("Area of a Square: " + a*a);
    }

    private static void area(double l, double b){
        System.out.println("Area of Rectangle: " + l*b);
    }
    private static void area(String s){
        System.out.println("Debraj Karmakar");
    }	

    public static void main(String[] args) {
        area(2);
        area(5.5, 10.2);
        area("hi");
    }
}