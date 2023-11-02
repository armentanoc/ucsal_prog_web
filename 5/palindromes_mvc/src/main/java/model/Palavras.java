package model;

public class Palavras {

	private String palavra1, palavra2;

	public Palavras(String palavra1, String palavra2) {
		this.palavra1 = palavra1;
		this.palavra2 = palavra2;
	}
	
	public String getPalavra1() {
		return palavra1;
	}

	public String getPalavra2() {
		return palavra2;
	}
	
	public boolean isPalavraUmPalindrome() {
		return isPalindrome(palavra1);
	}

	public boolean isPalavraDoisPalindrome() {
		return isPalindrome(palavra2);
	}

	public boolean isPalindrome(String palavra) {
		// Remove spaces and convert to lowercase
		palavra = palavra.replaceAll("\\s+", "").toLowerCase();

		int left = 0;
		int right = palavra.length() - 1;

		while (left < right) {
			if (palavra.charAt(left) != palavra.charAt(right)) {
				return false; // Not a palindrome
			}
			left++;
			right--;
		}

		return true; // It's a palindrome
	}
}
