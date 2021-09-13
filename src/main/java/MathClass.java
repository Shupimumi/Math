import methods.Sqrt;

public class MathClass {
    public static void main(String[] args) {
        double summ, divide, multiply, minus, square_root;
        double firstEnteredNumber = 15.98, secondEnteredNuber = 87.98;
        square_root = 15;
        Sqrt sqrt = new Sqrt(square_root);

        summ = firstEnteredNumber+secondEnteredNuber;
        divide = firstEnteredNumber/secondEnteredNuber;
        multiply = firstEnteredNumber*secondEnteredNuber;
        minus = firstEnteredNumber-secondEnteredNuber;


        System.out.println("1. Summ is " + summ + "\n"
                + "2. Divide is " + divide + "\n"
                + "3. Multiply is " + multiply + "\n"
                + "4. Difference is " + minus);
        System.out.println("Square root is: " + sqrt.sqrt());
    }
}
