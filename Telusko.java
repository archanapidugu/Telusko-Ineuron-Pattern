public class Telusko {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // T
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }

            // E
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 2 || i == 4 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }

            // L
            for (int j = 0; j < 5; j++) {
                if (i == 4 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }

            // U
            for (int j = 0; j < 5; j++) {
                if ((j == 0 && i != 4) || (j == 4 && i != 4) || ((j != 0 && j != 4) && i == 4)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }

            // S
            for (int j = 0; j < 5; j++) {
                if ((j == 0 && i != 3 && i != 0) || ((j == 1 || j == 2 || j == 3) && i != 1 && i != 3)
                        || (j == 4 && i != 1 && i != 4)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }

            // K
            for (int j = 0; j < 5; j++) {
                if (j == 0 || (j == 1 && i == 2) || (j == 2 && (i == 1 || i == 2)) || (j == 3 && (i == 0 || i == 3))
                        || (i == 4 && j == 4)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }

            // O
            for (int j = 0; j < 5; j++) {

                if (((j == 0 || j == 4) && (i != 0 && i != 4)) || ((j == 1 || j == 2 || j == 3) && (i == 0 || i == 4)))

                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println(" ");
        }

        System.out.println("");
        for (int i = 0; i < 5; i++) {
            // I
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }

            // N
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }

            // E
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 2 || i == 4 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }

            // U
            for (int j = 0; j < 5; j++) {
                if (((j == 0 || j == 4) && i != 4) || ((j == 1 || j == 2 || j == 3) && (i == 4)))

                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }

            // R
            for (int j = 0; j < 5; j++) {
                if (j == 0 || ((i == 0 || i == 2) && j != 4) || (j == 4 && (i != 0 && i != 2))) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }

            // O
            for (int j = 0; j < 5; j++) {
                if (((j == 0 || j == 4) && (i != 0 && i != 4)) || ((j == 1 || j == 2 || j == 3) && (i == 0 || i == 4)))

                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }

            // N
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println(" ");
        }

    }
}