import java.util.Random;

class Task1{
    public static void main(String [] args) {
    for (int i = 0; i <= 30; i++)
        {
            System.out.println(i);
        }
    }
}

class Task2 {
    public static void main(String[] args) {
    for (int i = 30; i >= 0; i--)
        {
        System.out.println(i);
        }
    }
}

class Task3 {
    public static void main(String[] args) {
    for (int i = 0; i <= 18; i += 3)
        {
        System.out.println(i);
        }
    }
}

class Task4 {
    public static void main(String[] args) {
    for (int i = 10; i >= 0; i -= 2)
        {
        System.out.println(i);
        }
    }
}

class Task5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Task6 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Task7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++)
                System.out.print("*");
        }
        System.out.println();
    }
}

class Task8 {
    public static void main(String[] args) {
        Random generator = new Random();
        int tries = 0;
        int sum = 0;
        int roll1, roll2, roll3;

        System.out.println("Roll,Die1, Die2, Die3, Sum");
        System.out.println("---------------------------");

        do {
            roll1 = generator.nextInt(6) + 1;
            roll2 = generator.nextInt(6) + 1;
            roll3 = generator.nextInt(6) + 1;
            sum = roll1 + roll2 + roll3;
            tries++;

            System.out.printf("%-6d\t%-6d\t%-6d\t%-6d\t%-6d\n", tries, roll1, roll2, roll3, sum);

        } while (!(roll1 == roll2 && roll2 == roll3));

        System.out.println("You won after " + tries + " tries.");
    }
}
