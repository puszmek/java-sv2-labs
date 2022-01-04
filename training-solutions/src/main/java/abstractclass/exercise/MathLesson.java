package abstractclass.exercise;

public class MathLesson {

    public static void main(String[] args) {
        MathExercise adder = new Adder();
        System.out.println(adder.getSolution(8, 5));

        MathExercise subtracter = new Subtracter();
        System.out.println(subtracter.getSolution(8, 5));

        MathExercise multiplier = new Multiplier();
        System.out.println(multiplier.getSolution(8, 5));

        MathExercise divisor = new Divisor();
        System.out.println(divisor.getSolution(8, 5));
    }
}
