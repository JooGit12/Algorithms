import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			int inputLen = Integer.parseInt(br.readLine());
			int[] inputs = new int[inputLen];

			for (int i = 0; i < inputLen; i++) {
				inputs[i] = Integer.parseInt(br.readLine());
			}
			
			Arrays.sort(inputs);

			bw.write(Integer.toString(getMean(inputs, inputLen)));
			bw.newLine();
			bw.write(Integer.toString(getMedian(inputs, inputLen)));
			bw.newLine();
			bw.write(Integer.toString(getMode(inputs)));
			bw.newLine();
			bw.write(Integer.toString(getRange(inputs, inputLen)));
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int getMean(int[] inputs, int inputLen) {
		int sum = 0;
		for (int i : inputs) {
			sum += i;
		}
		return (sum == 0) ? 0 : (int)Math.round(sum * 1.0 / inputLen);
	}

	private static int getMedian(int[] inputs, int inputLen) {
		return inputs[inputLen / 2];
	}

	private static int getMode(int[] inputs) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		int maxFrequency = 0;
	    for (int num : inputs) {
	        int frequency = frequencyMap.getOrDefault(num, 0) + 1;
	        frequencyMap.put(num, frequency);
	        maxFrequency = Math.max(maxFrequency, frequency);
	    }
	    
	    List<Integer> modes = new ArrayList<>();
	    for (Map.Entry<Integer, Integer> frequencyEntry : frequencyMap.entrySet()) {
			if (frequencyEntry.getValue() == maxFrequency) {
				modes.add(frequencyEntry.getKey());
			}
		}
		
	    Collections.sort(modes);
	    
		return (modes.size() == 1) ? modes.get(0) : modes.get(1); 
	}
	
	private static int getRange(int[] inputs, int inputLen) {
		return inputs[inputLen - 1] - inputs[0];
	}
}
