public class Exercise5 {
    public static void main(String[] args) {
        int[] array = new int[20];

        System.out.println("＜並べ替え前＞");
        for (int i = 0; i < array.length; i++) {
            int rdm = (int) (Math.random()*100);
            System.out.print(rdm+" ");
            array[i]=rdm;
        }
        System.out.println();


        System.out.println("＜並べ替え後＞");
        for(int i = 0; i< array.length-1; i++){
            int min = i;
            for(int j = i+1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
