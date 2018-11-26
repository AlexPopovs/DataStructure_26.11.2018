public class ArrayOfStrings {
    public static void main(String[] args) {
        String[] strings = new String[10];                           // one type of Array
        strings[0] = "alex";
        strings[1] = "andrew";
        strings[2] = "oleg";
        strings[3] = "sergey";
        strings[4] = "ivan";
        strings[5] = "olga";
        strings[6] = "dana";
        strings[7] = "dima";

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].startsWith("o")){
                System.out.println(strings[i]);
            }
        }
        }
}
// here we have EXCEPTION because I told that there are 10 strings, but wrote only 7.