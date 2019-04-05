package stringinstrinchecker;

public class StringContainsStringApplication {
    public static void main(String[] args) {
        How how = new How();
        String firstString = how.getFirstString();
        System.out.println(firstString);
        String secondString = how.getSecondString();
        System.out.println(secondString);
        System.out.println(how.contain(firstString, secondString));
    }
}
