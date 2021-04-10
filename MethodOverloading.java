class MethodOverloading {
    private static void area(int a){
        System.out.println("Area of a Square: " + a*a);
    }

    private static void area(int a, int b){
        System.out.println("Area of Rectangle: " + a *b);
    }

    public static void main(String[] args) {
        area(2);
        area(5, 10);
    }
}