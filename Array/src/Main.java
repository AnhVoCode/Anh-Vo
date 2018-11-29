public class Main {
    //Add values at the end of an array
    static int[] arrayAdd(int[]a,int b){
        int[] c = new int[a.length+1];
        for (int i=0; i<a.length;i++){
            c[i]=a[i];
        }
        c[a.length]= b;
        return c;
    }
    //Remove values at the end of an array
    static int[] arrayRemove(int[]a){
        int[] c = new int[a.length-1];
        for (int i = 0; i<a.length-1;i++){
            c[i]=a[i];
        }
        return c;
    }
    //Add values to an array using index
    static int[] addIndex(int[]a,int index,int value){
        int[] b = new int[a.length+1];
        for (int i=0; i<a.length;i++){
            b[i]=a[i];
        }
        for (int i=b.length-1; i>index;i--){
            b[i]=b[i-1];
        }
        b[index]=value;
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Add values to the end of an array:");
        int[] num = {1,2,3};
        int[] addnum = arrayAdd(num,4);
        for (int i=0; i<addnum.length;i++){
            System.out.println(addnum[i]);
        }
        System.out.println("Remove a value from the end of an array");
        int[] Rnum = arrayRemove(num);
        for (int i =0; i<Rnum.length;i++){
            System.out.println(Rnum[i]);
        }
        System.out.println("Add values using index position");
        int[]addnum2 = addIndex(num,2,1);
        for (int i=0; i<addnum2.length;i++){
            System.out.println(addnum2[i]);
        }

    }

}//class
