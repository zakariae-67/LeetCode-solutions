public class PrimePalindrome {
	
	public int primePalindrome(int n) {

        if(n<=2) return 2;
        if(n<=3) return 3;
        if(n<=5) return 5;
        if(n<=7) return 7;
        if(n<=11) return 11;

        for(int i=10;i<1000000;i++){
            String s=Integer.toString(i);
            String rev=new StringBuilder(s).reverse().toString();
            int pal=Integer.parseInt(s+rev.substring(1));

            if(pal>=n && isPrime(pal)){
                return pal;
            }
        }
        return -1;
    }

    public boolean isPrime(int x){
            
        for(int i=2; i*i <= x ; i++){
            if(x % i == 0) return false;
        }
        return true;
    }

}
