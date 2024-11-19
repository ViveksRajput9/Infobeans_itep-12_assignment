class p2 {
    public static void main(String[] args) {
    int a=7, b=5;
    switch(a = a % b)
    {
        case 1:
            a = a - b;
        case 2:
            a = a + b;
        case 3:
            a = a * b;
        case 4:
            a = a / b;
        default:
            a = a;
    }
            System.out.println("a ="+a);
    }
}