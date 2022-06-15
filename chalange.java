public class AA{
    
    public static int dizi(int dizi[]){
       return 0;
    }
    public static void method(int dizi[]){
        dizi[0]=0;
        dizi[1]=dizi;
    }

   public static void main(String[] args) {
    int dizi[]=new int[2];

        dizi(dizi);
    }
}