package com.gokhantamkoc.javabootcamp.odevhafta2;


//yardımcı fonksiyonlar
public class Utils {

	  public static float maximum(float[] array) {
	        if (array.length <= 0)
	            throw new IllegalArgumentException("Array is empty");
	        float max = array[0];
	        for (int i = 1; i < array.length; i++)
	            if (array[i] > max)
	                max = array[i];
	        return max;
	    }
	  
	  
	  public static int needAttackToDestroy(int magicPower,float bossHp) {
		  
		  int attack=0;
		  while(bossHp>0) {
			  bossHp-=magicPower;
			  attack++;
		  }
		  
		  return attack;
		  
		}
}
