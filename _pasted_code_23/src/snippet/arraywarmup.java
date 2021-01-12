package snippet;

public class arraywarmup {
	
	public void average(int[] nums) {
		
		double sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			sum += nums[i];
			
		}
		
		System.out.println(sum/nums.length);
		
		
	}
	
	public void trim(int[] nums) {
		
		int max = nums[0];
		int min = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
			min = Math.min(min, nums[i]);
		}
		
		int[] trimmeda = new int[] {nums.length-2};
		
		int j = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != min && nums[i] != max) {
				trimmeda[j] = nums[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(trimmeda));
		
	}
	
	public void fib(int n) {
		
		int[]sequence = new int[n];
		sequence[0] = 1;
		sequence[1] = 1;
		
		for (int i = 2; i < sequence.length; i++) {
			sequence[i] = sequence[i-1] + sequence[i-2];
		}
		
		System.out.println(Arrays.toString(sequence));
		
	}
	
	public void printwords(String[] word) {
		
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
		
	}
	
	public void oneton(int n) {
		int[]finals = new int[n];
		
		for(int i = 0; i < finals.length; i++) {
			finals[i] = i+1;
		}
		
		display(oneton);
		
	}
	
	public void doublenum(int[] random) {
		for (int i = 0; i < random.length; i++) {
			random[i] = random[i] * 2;
		}
	}
	
	public void arraydivide(int[] divisa) {
		
		String[] arr2 = new String[divisa.length];
		for (int i = 1; i < divisa.length; i++) {
			if (divisa[i] % divisa[i-1] == 0) {
				arr2[i] = "true";
			}
			else {
				arr2[i] = "false";
			}
		}
		
	}
	
	
	
	

	
	
}

