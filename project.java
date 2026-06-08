import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Name : ");
        String name = sc.nextLine().toUpperCase();

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int mid = size / 2;

        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < name.length(); k++) {
                char ch = name.charAt(k);
                print(ch, i, size, mid);
                System.out.print("  "); 
            }
            System.out.println();
        }
       
    }

    public static void print(char ch, int i, int size, int mid) {
        for (int j = 0; j < size; j++) {
            boolean Names= false;

            switch (ch) {
                case 'A':
                  Names   = ((j == 0 || j == size - 1) && i > 0) || i == mid || (i == 0 && j > 0 && j < size - 1);
                    break;
                case 'B':
                    Names = j == 0 || (i == 0 || i == mid || i == size - 1) && j < size - 1 || (j == size - 1 && i != 0 && i != mid && i != size - 1);
                    break;
                case 'C':
                      Names = (j == 0 && i > 0 && i < size - 1) || ((i == 0 || i == size - 1) && j > 0);
                    break;
                case 'D':
                    Names= j == 0 || ((i == 0 || i == size - 1) && j < size - 1) || (j == size - 1 && i > 0 && i < size - 1);
                    break;
                case 'E':
                  Names = j == 0 || i == 0 || i == mid || i == size - 1;
                    break;
                case 'F':
                    Names = j == 0 || i == 0 || i == mid;
                    break;
                case 'G':
                 Names = (j == 0 && i > 0 && i < size - 1) || ((i == 0 || i == size - 1) && j > 0) || (i >= mid && j == size - 1) || (i == mid && j >= mid);
                    break;
                case 'H':
                    Names = j == 0 || j == size - 1 || i == mid;
                    break;
                case 'I':
                    Names = i == 0 || i == size - 1 || j == mid;
                    break;
                case 'J':
                    Names = i == 0 || (j == mid && i < size - 1) || (i == size - 1 && j < mid && j > 0) || (i == size - 1 - 1 && j == 0 && i >= mid);
                    break;
                case 'K':
                   Names = j == 0 || (i < mid && j == size - 1 - i) || (i >= mid && j == i);
                    break;
                case 'L':
                   Names = j == 0 || i == size - 1;
                    break;
                case 'M':
                    Names = j == 0 || j == size - 1 || (i <= mid && (j == i || j == size - 1 - i));
                    break;
                case 'N':
                   Names = j == 0 || j == size - 1 || j == i;
                    break;
                case 'O':
                   Names = (j == 0 && i > 0 && i < size - 1) || (j == size - 1 && i > 0 && i < size - 1) || ((i == 0 || i == size - 1) && j > 0 && j < size - 1);
                    break;
                case 'P':
                 Names= j == 0 || (i == 0 || i == mid) && j < size - 1 || (j == size - 1 && i > 0 && i < mid);
                    break;
                case 'Q':
                   Names = ((j == 0 || j == size - 2) && i > 0 && i < size - 2) || ((i == 0 || i == size - 2) && j > 0 && j < size - 2) || (i >= mid && j == i);
                    break;
                case 'R':
                    Names = j == 0 || (i == 0 || i == mid) && j < size - 1 || (j == size - 1 && i > 0 && i < mid) || (i > mid && j == i);
                    break;
                case 'S':
                   Names = i == 0 || i == mid || i == size - 1 || (i < mid && j == 0) || (i > mid && j == size - 1);
                    break;
                case 'T':
                   Names = i == 0 || j == mid;
                    break;
                case 'U':
                  Names = ((j == 0 || j == size - 1) && i < size - 1) || (i == size - 1 && j > 0 && j < size - 1);
                    break;
                case 'V':
                 Names = (i < mid && (j == 0 || j == size - 1)) || (i >= mid && (j == i - mid || j == size - 1 - (i - mid)));
                    break;
                case 'W':
                  Names = j == 0 || j == size - 1 || (i >= mid && (j == i || j == size - 1 - i));
                    break;
                case 'X':
                   Names= j == i || j == size - 1 - i;
                    break;
                case 'Y':
                    Names = (i < mid && (j == i || j == size - 1 - i)) || (i >= mid && j == mid);
                    break;
                case 'Z':
                 Names = i == 0 || i == size - 1 || j == size - 1 - i;
                    break;
                case '.':
                   Names = (i == size - 1 && j == mid);
                    break;
                default:
                    Names = false;
                    break;
            }

            if (Names) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}