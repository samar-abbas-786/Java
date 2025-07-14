public class insert {

public static void main(String args[]) {
    int i;
int[] arr=new int[5];
int[] brr=new int[6];
arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
arr[4]=50;
// for(i=0; i<5; i++){
//     System.out.println(arr[i]);
// }

for(i=0; i<6; i++){
    if(i<1){
        brr[i]=arr[i];

    }
    else if(i==1){
        brr[i]=100;
    }
    else {
     brr[i]=arr[i-1];
    }
}
for(i=0;i<6;i++){
System.out.println(brr[i]);
}


}

}
