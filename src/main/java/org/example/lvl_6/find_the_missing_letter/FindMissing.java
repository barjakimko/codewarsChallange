package org.example.lvl_6.find_the_missing_letter;

public class FindMissing {

    public static char findMissingLetter(char[] array)
    {
        for(int i = 0; i < array.length; i++){
            int char1 = array[i];
            int char2 = array[i + 1];
            if(char2-char1 != 1){
                return (char) (array[i] + 1);
            }
        }

        return ' ';
    }


    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[]{'a', 'b', 'd'}));
    }
}
