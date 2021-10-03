class SortSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        String ans = "";
        String[] s_Arr = s.split(" ");
        for (int i = 0; i < s_Arr.length; i++) {
            for (int j = 0; j < s_Arr.length - 1; j++) {

                if (s_Arr[j].charAt(s_Arr[j].length() - 1) > s_Arr[j + 1].charAt(s_Arr[j + 1].length() - 1)) {
                    String temp = s_Arr[j];
                    s_Arr[j] = s_Arr[j + 1];
                    s_Arr[j + 1] = temp;
                }
            }
        }
        int index = 0;
        for (String word : s_Arr) {
            s_Arr[index] = word.replace(word.charAt(word.length() - 1), ' ');
            s_Arr[index] = s_Arr[index].trim();
            ans += s_Arr[index] + " ";
            index++;

        }
        return ans.trim();

    }
}