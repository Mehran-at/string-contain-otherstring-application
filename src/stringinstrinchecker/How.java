package stringinstrinchecker;

public class How implements What{
    @Override
    public String getFirstString() {
        return "abcdefgh";
    }

    @Override
    public String getSecondString() {
        return "efg";
    }

    @Override
    public Boolean contain(String one, String two) {
        if (one.contains(two)) {
            return true;
        }
    return false;
    }

}
