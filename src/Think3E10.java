/*

    Bruce Eckel "Think in Java": Chapter 3 Exercise 10
    Binary operations demo

*/

public class Think3E10 {

    /* Binary form of int with + left zeroes = 32bit length */
    private static String IntToBinary(int intVar) {
        String binString = Integer.toBinaryString(intVar);
        StringBuilder leftZeoroes = new StringBuilder();
        for (int charCount = binString.length(); charCount < 32; charCount++) {
            leftZeoroes.append("0");
        }
        return  leftZeoroes + binString;
    }

    // Run point
    public static void main(String[] args) {
        // Integer operands in hex format
        int var1 = 0x2AA;
        System.out.println("var1=" + IntToBinary(var1));
        int var2 = 0x155;
        System.out.println("var2=" + IntToBinary(var2));
        // Make some binary operations
        int var3 = var1 | var2;
        System.out.println("OR  =" + IntToBinary(var3));
        var3 = var1 & var2;
        System.out.println("AND =" + IntToBinary(var3));
        var3 = var1 ^ var2;
        System.out.println("XOR =" + IntToBinary(var3));
        var3 = ~var1;
        System.out.println("NOT  " + IntToBinary(var1));
        System.out.println("    =" + Integer.toBinaryString(var3));
    }

}
