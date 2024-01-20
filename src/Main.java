public class Main {
    public static void main(String[] args) {
        int[] intArray;
        intArray = new int[5];
        intArray[0] = 9;
        intArray[1] = 23;
        intArray[2] = 8;
        intArray[3] = -12;
        intArray[4] = 7;

        System.out.println("su dung for loop : ");
        for(int i=0;i < intArray.length;i++){
            System.out.println(intArray[i] + "\t");
        }
        System.out.println();

        System.out.println("su dung while loop : ");
        int j=0;
        while (j<intArray.length){
            System.out.println(intArray[j] + "\t");
            j++;
        }

        System.out.println();

        System.out.println(intArray[0]);

        float[] floatArray = new float[3];

        String[] strArray = {"Java","JS","PHP","C/C++"};
        System.out.println("kich thuoc mang : " + strArray.length);
        System.out.println("phan tu cuoi cung : " + strArray[strArray.length - 1]);

    }
}