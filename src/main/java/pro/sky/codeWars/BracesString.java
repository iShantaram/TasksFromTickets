package pro.sky.codeWars;

public class BracesString {
    public static boolean isValid(String braces) {
        String result = braces;
        for (int i = 0; i < braces.length(); i++) {
            result = result.replace("{}", "").replace("()", "").replace("[]", "");
        }
        return result.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(BracesString.isValid("{()}()[][][(())]()"));
    }
}
