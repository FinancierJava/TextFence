public class Main {
    public static void main(String[] args) {
        String str = "привет как дела";


        StringBuilder builder = new StringBuilder();
        int[] arrayOfGaps = new int[str.length()];
        int indexOfGap;
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                builder.append(str.charAt(i));
            } else {
                indexOfGap = i;
                arrayOfGaps[counter] = indexOfGap;
                counter++;

            }
        }


        StringBuilder builder1 = new StringBuilder();
        for (int i = 0; i < builder.length(); i++) {
            if (i % 2 != 0) {
                builder1.append(Character.toUpperCase(builder.charAt(i)));
            } else {
                builder1.append(Character.toLowerCase(builder.charAt(i)));
            }
        }

        for (int i = 0; i < counter; i++) {
            builder1.insert(arrayOfGaps[i], " ");
        }

        String result = builder1.toString();
        System.out.println(result);

    }
}