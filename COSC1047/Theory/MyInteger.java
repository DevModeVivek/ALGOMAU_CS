package OOP;

class MyInteger {
    private int value;

    // Constructor
    public MyInteger(int value) {
        this.value = value;
    }

    // Getter
    public int getValue() {
        return value;
    }

    // Instance methods
    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    // Static methods with int parameter
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Static methods with MyInteger parameter
    public static boolean isEven(MyInteger n) {
        return n.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger n) {
        return n.getValue() % 2 != 0;
    }

    public static boolean isPrime(MyInteger n) {
        return n.isPrime();
    }

    // Equals methods
    public boolean equals(int n) {
        return value == n;
    }

    public boolean equals(MyInteger n) {
        return value == n.getValue();
    }

    // Static parseInt methods
    public static int parseInt(char[] chars) {
        return Integer.parseInt(new String(chars));
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}