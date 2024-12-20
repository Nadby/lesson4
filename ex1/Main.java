package ex1;

public class Main {

    private static final String str = "некоторая строка-кулебяка содержит несколько слов бяка, бяка";
    private static final String UNCENS_WORDS = "бяка";

    public static void main(String[] args) {
        final String res = censor(str, "{вырезано цензурой}");
        System.out.println(res);
    }

    private static String censor(String s, String cens_words) {
        return s.replaceAll(UNCENS_WORDS, cens_words);
    }
}
