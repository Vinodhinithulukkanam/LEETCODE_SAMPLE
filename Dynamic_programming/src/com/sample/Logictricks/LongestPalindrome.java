package com.sample.Logictricks;

import java.util.ArrayList;
import java.util.List;

/* [a,b,a,c,d,e,f,f,e]
 we gone move from center to left and right and compare them
 
 Even Character length
 ******************
 if string is of even we do not have a center at all that time we take 2 char ex: abccba -> we take cc as center 
 if both are same character expand outwards
 
 Odd Character length
 **********************
 We gone take the single char and expand left and right then compare them
 
 even and odd compare are done in a loop
 
 Time Complexity : O(n^2)
 Space Complexity : O(1)
 */
public class LongestPalindrome {
public static void main(String[] args){
		
	System.out.println(new LongestPalindrome().longestPalindrome("abacdeffes"));
	}

int resultStart;
int resultLen;
public  String longestPalindrome(String s){
	
	int slen=s.length();
	if(slen <2){
		return s;
	}
	for(int i=0 ;i<(slen-1);i++){
		
		expandrange(s, i, i);	
		expandrange(s, i, i+1);	
	}
	System.out.println("resultStart :"+resultStart);
	System.out.println("resultLen :"+resultLen);
	return s.substring(resultStart, resultStart+resultLen);
}

public  void expandrange(String s,int L,int R){
	
	while (L>=0 && R<s.length() && (s.charAt(L)== s.charAt(R))){
		L--;
		R++;
	}
	
	if(resultLen < R-L-1){
		resultLen=R-L-1;
		resultStart=L+1;
	}
}
	

//This method checks whether a string is palindrome are not
public static boolean palCheck(String str1){
	
	
	char[] arraList=str1.toCharArray();
	
	int low=0;
	int high=arraList.length - 1;
	boolean flg=true;
	while(low<high){
		if(arraList[low]==arraList[high])
		{
			low++;
			high--;
		}else{
			flg=false;
			break;
		}
			
	}
	return flg;
}
}
