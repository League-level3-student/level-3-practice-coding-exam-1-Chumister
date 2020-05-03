package practice;

import java.util.HashMap;
import java.util.Iterator;

public class FishingContest {

	public FishingContest(HashMap<String, double[]> allCatches) {
		int count = 0;
		Iterator<String> wo = allCatches.keySet().iterator();
		while(wo.hasNext()) {
			String key = wo.next();
			if (allCatches.containsKey(key)) {
				count++;				
			}
		}
	}

	public double findBiggestFish(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object findWinner() {
		if ( == ) {
			
		}
		return null;
	}



}
