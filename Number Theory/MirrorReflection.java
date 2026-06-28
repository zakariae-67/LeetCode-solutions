public class MirrorReflection {
	
	// The idea: unfold the room, the laser path becomes a straight line
	public int mirrorReflection(int p, int q) {

        int r=0,a=p,b=q;
        
        //pgcd(p,q) calculation
        while(b!=0){
            r=a%b;
            a=b;
            b=r;
        }

        int p1=p/a, q1=q/a;

        if(p1%2==0) return 2;
        if(q1%2==0){
            return 0;
        }else{
            return 1;
        }
        
    }

}
