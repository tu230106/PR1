package TUT5;

public class EX3_Decimal {
    public static String dec(int n){
        if ( n < 0){
            return "Error";
        }
        else if (n == 0){
            return "0";
        }
        if (n == 1){
            return "1";
        }
        return dec(n/2) + dec(n%2);

    }

    public static void main(String[] args) {
        int[] testcase = {0, 1, 10, 15, 16, 32, 255, 4095, 2048, 8192, 1048575, Integer.MAX_VALUE, -1};

                for(int number : testcase){
                    String hex = dec(number);
                    System.out.println("Decimal:" + number + " -> Hex: " + hex  );
                }
    }
}
