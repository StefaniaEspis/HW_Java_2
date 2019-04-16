import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        int sum = 0;
        Random random = new Random();
        String[][] sArray = new String[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sArray[i][j] = String.valueOf(random.nextInt(50));
            }

        }
sArray[2][3] = "asdf";
        try {
            sum = sumArray(sArray);
        }catch (MyArraySizeExeption ex){
            ex.printStackTrace();

        }catch (MyArrayDataExeption ex){
            ex.printStackTrace();
        }
        System.out.println(sum);
    }
    public static int sumArray(String[][] sArray){
        int sum = 0;
        if (sArray.length !=4) throw new MyArraySizeExeption();
        for (int i = 0; i < sArray.length ; i++) {
            if (sArray[i].length !=4) throw new MyArraySizeExeption();
            for (int j = 0; j < sArray[0].length; j++) {
                try {
                    sum += Integer.parseInt(sArray[i][j]);
                }catch (NumberFormatException ex){
                    throw new MyArrayDataExeption(i,j);
                }
            }
        }
return sum;
    }
}
