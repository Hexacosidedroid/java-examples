class MinMax2 {
	public static void main(String[] args) {
		int nums[] ={99, -10, 100023, 12, -999, 9534, 99, -99, 287, 49};
		int min, max;

		min = max = nums[0];
		for (int i=1; i<10; i++) {
			if(nums[i]<min) min=nums[i];
			if(nums[i]>max) max=nums[i];
		}
		System.out.println(min + " " + max);
	}
}