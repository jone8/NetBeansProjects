
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(muotoile(t));

    }

    public static String muotoile(int[] t) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < t.length; i++) {
            stringBuilder.append(t[i] + ", ");
            if ((i + 1) % 4 != 0|| i==t.length-1) {
                continue;
            }
            stringBuilder.append("\n ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 2);
        return "{\n " + stringBuilder + "\n}";

    }
}
