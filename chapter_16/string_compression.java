public class string_compression {
    public static StringBuilder compression(String str) {
        StringBuilder m = new StringBuilder(" ");
        for (int i = 0; i < str.length(); i++) {
            Integer cout = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                cout++;
                i++;
            }
            m.append(str.charAt(i));
            if (cout > 1) {
                m.append(cout.toString());
            }
        }
        return m;
    }

    public static void main(String[] args) {
        String str = "abcddd";
        System.out.println(compression(str));
    }
}
