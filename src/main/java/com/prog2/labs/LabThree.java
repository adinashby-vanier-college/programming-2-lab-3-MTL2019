package com.prog2.labs;

import java.util.Arrays;

/**
 * @author adinashby
 *
 */
public class LabThree {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * Please refer to the README file for question(s) description
	 */
	
	public int[] rotateTheArray(int arraySize, int startingInteger) {
            
                int[] array = new int[arraySize];
               int value = startingInteger;
               
               for (int i = arraySize - 1; i >= 0; i--) {
                 array[i] = value;
                 value += 3;
               }
               
               for (int i = 0; i < arraySize - 1; i += 2) {
                 int temp = array[i];
                 array[i] = array[i + 2];
                 array[i + 2] = temp;
               }

               return array;
	}
	
	
	public int jumpGame(int[] nums) {
            
            int n = nums.length;
            int jumps = 0;
            int    end = 0;//keep furthest point in current jump
            int   maxPosition = 0;//update furthest point in current jump
            for (int i = 0; i < n - 1; i++) {
                maxPosition = Math.max(maxPosition, i + nums[i]);
                if (i == end) {
                    jumps++;
                    end = maxPosition;
                }
            }
            return jumps;
	}
}
