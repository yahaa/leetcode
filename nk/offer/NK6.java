public class NK6{
    public static void main(String []args){
        System.out.println(f(39));
    }

    public static int f(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        if(n==2)return 1;
        return f(n-1)+f(n-2);
    }
}
