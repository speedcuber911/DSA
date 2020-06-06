public class Steps {

    private static int stepper(int distance) {
        if (distance == 0 || distance == 1)
            return 1;
        return stepper(distance - 1) + stepper(distance - 2);

    }

    public static void main(String[] args) {
        System.out.println(stepper(4));
    }
}
