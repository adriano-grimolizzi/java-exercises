package com.grimolizzi.GoldenCoin;

import java.util.Arrays;

public class Utils {
	
	static int countCoin(String[] lines) {

		return Arrays.asList(lines)
				.stream()
				.map(Utils::countCoin)
				.mapToInt(Integer::intValue)
				.sum();
	}

	static int countCoin(String line) {
		int result = 0;

		for (char c : line.toCharArray()) {
			if (c == 'o') {
				result++;
			}
		}

		return result;
	}

}
