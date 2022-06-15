public class AA{
    
    public static int dizi(int dizi[]){
        
       return 0;
    }
    public static int[] method(int dizi[]){
        dizi[0]=0;
        dizi[1]=dizi;
        return dizi;
    }

   public static void main(String[] args) {
    int dizi[]=new int[2];

        dizi(dizi);
    }
}