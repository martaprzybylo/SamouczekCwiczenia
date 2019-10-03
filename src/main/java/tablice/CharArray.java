package tablice;

public class CharArray {
    private static Character [] table = new Character[26];
    private static char aChar = 'a';
    private static char x;
    private static int index = 10;

    public static void main(String[] args) {
        CharArray charArray = new CharArray();


        System.out.println("While: ");
        charArray.printCharactersFromAtoZ();
        System.out.println("\n*********************************");
        System.out.println("For: ");
        charArray.printCharactersFromAtoZOtherWay();
        System.out.println("\n*********************************");

    }

    private void printCharactersFromAtoZOtherWay() {
        for(x = 'a'; x <= 'z'; x++ ) {
            table[(int)x - (int)'a']=x;
        }
        for (char c:table
        ) {
            System.out.print(c + ", ");
        }
    }

    private void printCharactersFromAtoZ() {
        while (aChar <= 'z') {
            System.out.print(aChar++ + ", ");
        }
    }


}

