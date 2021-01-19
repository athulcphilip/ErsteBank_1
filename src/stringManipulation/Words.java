package stringManipulation;

public class Words {

    public static int wordCount(String s) {

        int count = 0;

        final String temp = s;

        //StringUtils.isNotBlank
        if (temp != null && temp.length() > 0) {
            for (int i = 0; i < temp.length() - 1; i++) {

                //if (isChar(temp.charAt(i)) && !(isChar(temp.charAt(i-1)))) {
                if (isChar(temp.charAt(i))) {
                    if ((i - 1 >= 0 && !isChar(temp.charAt(i - 1)) || (i - 1 < 0))) {
                        count++;
                    }
                }

            }
        }
        //count ++;

        return count;

    }

    private static boolean isChar(char c) {

        final int ascii = (int) c;

        return (ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122);

    }


}
