package pps_12;

import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-largest-element-in-a-stream/

public class PPS_12_3 {
	PriorityQueue<Integer> minHeap; 
	 int k;

	 public void KthLargest(int k, int[] nums) {
		minHeap = new PriorityQueue<>();
		this.k = k;
		
		for(int val: nums) {
			if(minHeap.size()<k||val>minHeap.peek()) minHeap.add(val);
			if(minHeap.size()>k) minHeap.poll();
		}
	 }

	 public int add(int val) {
		 if(minHeap.size()<k||val>minHeap.peek()) minHeap.add(val);
		 if(minHeap.size()>k) minHeap.poll();
		 
		 return minHeap.peek();
	 }
}
