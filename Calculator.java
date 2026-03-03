
class Sum {
    int num1, num2;   // ✅ variables declared

    Sum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void displaySum() {
        int s = num1 + num2;
        System.out.println("Sum: " + s);
    }
}

class Multiply {
    void displayProduct(int a, int b) {
        int s = a * b;
        System.out.println("Product: " + s);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Sum s1 = new Sum(5, 10);
        s1.displaySum();

        Multiply m1 = new Multiply();
        m1.displayProduct(5, 10);
    }
}


