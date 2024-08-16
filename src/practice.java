public class practice {
    public static void main(String[] args) {
        int [] x ={1,2,4,1,2,-4,5,10,3,-10,4,4,1};
        int  n = 0;
        int index = 0;
        int y = 0;
        int count = 0;

        for(int i = 0 ; i < x.length ; i++){
            if(x[i] == 4){
                n++;
                if(n == 2){
                    index = i;
                }
            }
            if(x[i] == 1){
                y++;
            }
            if(x[i] < 0){
                count++;
            }

        }
        System.out.println("index = " + index);
        System.out.println("1 = " + y);
        System.out.println("negative = " + count);
    }
}
