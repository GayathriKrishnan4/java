import java.util.Arrays;
class SortStrings
{
    public static void main(String[] args)
    {
        String[]names={"Banana","Apple","Mango","Orange"};
        Arrays.sort(names);
        System.out.println("Sorted Strings:");
        for(String s:names)
        {
            System.out.println(s);
        }
    }
}
/*Output:
Sorted Strings:
Apple
Banana
Mango
Orange*/