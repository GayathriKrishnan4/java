import java.util.*;

class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = Integer.parseInt(sc.nextLine());

        List<String> list = new ArrayList<>();

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        Collections.sort(list);

        System.out.println("Sorted strings:");
        for (String s : list) {
            System.out.println(s);
        }

        sc.close();
    }
}
/*Enter number of strings: 5  
Enter the strings:
apple 
orange
yellow
brown
tree
Sorted strings:
apple
brown
orange
tree
yellow*/