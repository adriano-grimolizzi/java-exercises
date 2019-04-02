package com.grimolizzi.GoldenCoin;

public class App {

	static String getPath(String[] lines) {

		String result = "";
		
		HorizontalDirection horizDir = HorizontalDirection.RIGHT;
		
		result += getPath(lines, horizDir, VerticalDirection.DOWN, Item.COIN);
		
		lines = reverse(lines);
		
		if (lines.length %2 != 0) {
			horizDir = HorizontalDirection.LEFT;
		}
		
		result += getPath(lines, horizDir, VerticalDirection.UP, Item.MULTIPLIER);
		
		return result;
	}
	
	static String getPath(String[] lines, HorizontalDirection horizDir, VerticalDirection verticalDir, Item i) {
		
		String result = "";
		
		for (String line : lines) {
			
			result += getPath(line, horizDir, i) + verticalDir.getSymbol();

			horizDir = reverse(horizDir);
		}
		
		return result.substring(0, result.length() - 1);
	}

	static String getPath(String line, HorizontalDirection horizontalDir, Item i) {
		
		if (horizontalDir == HorizontalDirection.LEFT) {
			line = new StringBuilder(line).reverse().toString();
		} 

		String result = "";

		for (char c : line.toCharArray()) {
			if (c == i.getSymbol()) {
				result += "x";
			}
			result += horizontalDir.getSymbol();
		}
		return result;
	}
	
	private static HorizontalDirection reverse(HorizontalDirection dir) {
		if (dir == HorizontalDirection.LEFT) {
			return HorizontalDirection.RIGHT;
		}
		return HorizontalDirection.LEFT;
	}
	
	static String[] reverse(String[] validData) {
		
		for (int i = 0; i < validData.length / 2; i++) {
			String temp = validData[i];
			validData[i] = validData[validData.length - i - 1];
			validData[validData.length - i - 1] = temp;
		}
		
		return validData;
	}
}
