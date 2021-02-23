package generator.prime;

public class GeneratorPrime {


    private static long estimatedTime;
	public static int i,n,p,q,x;

	public static boolean[] s = new boolean[]{};


	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		n= 100000;
		s = new boolean[n+1];

		for (i= 2; i <= n; i++){

			s[i]=true;
			//p=2;

		}
		// Arrays.fill(s, true);
		 p=2;
		 System.out.println(p);
		while (p*p <=n & p*p >0){
			//System.out.println(p);
			q = p;

			while (p*q <=n & p*q >0 ){
				//System.out.println(q);
				x= p*q;

				while (x <= n & x >0){

					s[x]=false;

					x=x*p;

				}
				while (!s[++q]);


			}
			while (!s[++p]);

		}

		estimatedTime = System.currentTimeMillis() - startTime;


		System.out.println(estimatedTime + " Liczba max = "+ n);
	/*	for (i=n; i>=0; i--){

		if (s[i]){

			System.out.println(i);
			return;

		}

	}*/


	}

    
    
}
