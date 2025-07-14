public class largestarray {
    public static void main(String args[]) {
        int i;
        int[] array = new int[6];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        array[5] = 5;

        for(i=0; i<6;i++){
            if(array[0]>array[i])
            array[0]=array[i];

        }
        System.out.println(array[i]);

    }

}
