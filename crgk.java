
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.math.*;
import java.io.*; 
import java.math.BigInteger;
import java.security.SecureRandom;

public class crgk {
  public static void main(String args[]){
		
		BigInteger Data[][]=new BigInteger[5][5];
		
		int node=0;
		BigInteger Z=new BigInteger("1");
		BigInteger C=new BigInteger("1");
		
		BigInteger D=new BigInteger("1");
		

BigInteger[] p = new BigInteger[5];

    int bitLength = 512; // 512 bits
    SecureRandom rnd = new SecureRandom();
	
    int c = 90; // 1 - 1/2(90) certainty
	
	for(int ii=0; ii<2;ii++){
		//c=c-1;
		p[ii] = new BigInteger(bitLength, c, rnd);
	

	}

	for(int j=0; j<2;j++){
		
		Data[j][0]=p[j];
		 
		Data[j][1]=((p[j]).subtract(new BigInteger("1")));
	
  	}

                p[2]=p[0].multiply(p[1]);
		Data[2][1]=Data[0][1].multiply(Data[1][1]);

BigInteger ED=new BigInteger("123457");

double starttime0=System.nanoTime();

			
		BigInteger bb=new BigInteger(""+Data[2][1]);
	        
				
				D=ED.modInverse(bb);

		BigInteger M=new BigInteger("1127675998514764457567873457656787687689567456765677356657567567568678978978907078467346345234534658785685676464574578567856453645765678567567576457457645685678956789568969569789578628542720877207321906796008442116714883976395392846587");
		
                System.out.println("Message is:"+M);

			
					C= M.modPow(ED,p[2]);

                   System.out.println("Encrypted message Through RSA:"+C);

					Z= C.modPow(D,p[2]);
			
			
          System.out.println("Decrypted message Through RSA:"+Z);

		
  }
  }
  
  