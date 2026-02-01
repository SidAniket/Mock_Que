package namepattern;

public class NamePattern {
    public void pattern(String name) {
        int n = name.length();
        int rows = 0, sum = 0;
        while (sum < n) {
            rows++;      // 1 -> 2 -> 3
            sum += rows; // 1 -> 3 -> 6
        }


        int index = 0;

        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i && index < n; j++) {
                System.out.print(name.charAt(index) + " ");
                index++;
            }

            System.out.println();
        }
    }
}

