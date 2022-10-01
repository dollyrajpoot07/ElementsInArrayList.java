import java.util.*;

class ElementsInArrayList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> LIST = new ArrayList<Integer>();
        while (sc.hasNextInt()) {
            int i = sc.nextInt();
            LIST.add(i);
        }
        for(int i : LIST) {
            System.out.print(i + " ");

        }
        sc.close();
    }
}