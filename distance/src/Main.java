public class Main {
    public static void main(String[] args) {
        int[] distance = {3,10,12,5};
        int d=0;
        for (int i=0; i<distance.length;i++){
            for (int j=0;j<distance.length;j++){
                if (j==i){
                    d=0;
                    System.out.print(d+" ");
                }
                if (j<i) {
                    for (int k = 0; k > -1; k--) {
                        d += distance[k];
                        System.out.print(d + " ");
                    }
                }
                else {
                    d+=distance[j];
                    System.out.print(d+" ");
                }
            }
            System.out.println();

        }

    }
}
