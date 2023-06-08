public class BinOps {
    public String sum(String a, String b) {
        int valueFirst = Integer.parseInt(a, 2);
        int valueSecond = Integer.parseInt(b, 2);
        return Integer.toBinaryString(valueFirst + valueSecond);
    }

    public String mult(String a, String b) {
        int valueFirst = Integer.parseInt(a, 2);
        int valueSecond = Integer.parseInt(b, 2);
        return Integer.toBinaryString(valueFirst * valueSecond);
    }
}
