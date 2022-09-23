public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Değişken isimlendirmeleri java'da camelCase yazılır
        String ilkMetin = "Raşit Eşdemir";
        String ikinciMetin = "Ömer Eşdemir";

        System.out.println("ilkMetin");
        System.out.println(ilkMetin);

        // integer
        int value = 12;

        double dolarBugun = 18.15;
        double dolarDun = 18.15;

        boolean value3 = true;
        boolean value4 = false;

        String okYonu;

        if(dolarBugun < dolarDun){
            okYonu ="down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu="up.svg";
            System.out.println(okYonu);
        } else {
            okYonu="equal.svg";
            System.out.println(okYonu);
        }

        // Array
        String [] strings = {"array1" ,"array2","array3"};
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);

        System.out.println("***");

        for (int i = 0; i < strings.length ; i++) {
            System.out.println(strings[i]);
        }


    }
}