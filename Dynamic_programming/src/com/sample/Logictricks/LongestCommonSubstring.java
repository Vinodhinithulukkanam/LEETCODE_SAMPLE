package com.sample.Logictricks;

public class LongestCommonSubstring {

	public static void main(String[] args) {
			String s="comcast";
			String s1=	"comcastic";
			String s2=	"broadcaster";
		System.out.println(""+LCStr(s.toCharArray(), s1.toCharArray(),s2.toCharArray(), s.length(), s1.length(),s2.length()));
	}

	
	static int LCStr(char X[], char Y[],char Z[], int s1len, int s2len,int s3len) {
		
		// Create a table to store
		// lengths of longest common
		// suffixes of substrings.
		// Note that LCStuff[i][j][k]
		// contains length of longest
		// common suffix of
		// X[0..i-1] ,Y[0..j-1],[Z0...k-1].
		// The first row and first column entries have no
		// logical meaning, they are
		// used only for simplicity of program
		int LCStuff[][][] = new int[s1len + 1][s2len + 1][s3len+1];

		// To store length of the longest
		// common substring
		int result = 0;

		// Following steps build
		// LCSuff[m+1][n+1][k+1] in bottom up fashion
		for (int i = 0; i <= s1len; i++) {
			for (int j = 0; j <= s2len; j++) {
				for (int k = 0; k <= s3len; k++) {
				if (i == 0 || j == 0 || k==0)
					LCStuff[i][j][k] = 0;
				else if (X[i - 1] == Y[j - 1] && Y[j-1] == Z[k-1]) {
					LCStuff[i][j][k] = LCStuff[i - 1][j - 1][k-1] + 1;
					System.out.println();
					
				} else {																									
					//LCStuff[i][j][k]=max(LCStuff[i-1][j][k],LCStuff[i][j-1][k],LCStuff[i][j][k-1]);
					LCStuff[i][j][k]=max(LCStuff[i-1][j][k],LCStuff[i][j-1][k],LCStuff[i][j][k-1]);
					System.out.println("LCStuff["+i+"]["+j+"]["+k+"]:"+LCStuff[i][j][k]);
				}
				
			
						
				
			}
			}
		}
		return LCStuff[s1len][s2len][s3len];
	}
	
public static int max(int a,int b,int c){
	if(a > b && a > c)
		return a;
	else if(b > c)
		return b;
	else 
		return c;
}
	
}
