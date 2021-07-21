package com.sample.Logictricks;

import java.util.Queue;

public class PaidStaircase {

	public static void main(String[] args) {
	
		int[] cost={1,100,1,1,1,100,1,1,100,1};
		System.out.println(minCostClimbingStairs(cost));
	}
	
	public static int minCostClimbingStairs(int[] cost) {
        //10,15,20
        //a,b,c
        
        if (cost.length <= 1)
			return cost[0];
        
		int a=cost[0];
       int b=cost[1];
       int c=0;
		
		for (int i = 2; i <= cost.length; i++) {
			int k=i<cost.length ? cost[i] : 0;
			c = min(a ,b)+k;
			a=b;
			b=c;
			
		}
		return c;
        
    }
    
    public static int min(int a,int b){
       if(a < b) 
           return a;
        else
            return b;
    }

}
