
class RotageString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "abced"));
    }

    public static boolean rotateString(String s, String goal) {
        String ans = s;
        for (int i = 0; i < s.length(); i++) {
            ans = ans.substring(1) + ans.substring(0, 1);
            if (ans.equals(goal))
                return true;
        }
        return false;
    }
}