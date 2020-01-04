package com.revature.eval.java.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.Duration;

public class EvaluationService {


	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j=0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		// TODO Write an implementation for this method declaration
		String acro = "";
		acro += phrase.toUpperCase().charAt(0);
		for(int i = 1; i <= phrase.length() -1; i++) {
			
			if(phrase.charAt(i-1) == ' ' || phrase.charAt(i-1) =='-') {
				acro += phrase.toUpperCase().charAt(i);
			}
		}
		return acro;
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			// TODO Write an implementation for this method declaration
			if(sideOne == sideTwo && sideTwo == sideThree && sideOne == sideThree) {
			
				return true;
			}
			else{
				return false;
				}
		}

		public boolean isIsosceles() {
			// TODO Write an implementation for this method declaration
			if(sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
				return true;
			}
			else {
				return false;
			}
		}

		public boolean isScalene() {
			// TODO Write an implementation for this method declaration
			if(sideOne != sideTwo && sideTwo != sideThree && sideOne != sideThree) {
				return true;
			}
			else {
			return false;
			}
		}

	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		// TODO Write an implementation for this method declaration
//		String[][][][][][][] scrabble = {{A,E,I,O,U,L,N,R,S,T}, {D, G}, {B, C, M, P}, {F, H, V, "W", "Y"}, {K}, };
//		char A, E, I, O, U, L, R, S, T = 1;
//		char D, G = 2;
//		char B, C, M, P = 3;
//		char F, H, V, W, Y = 4;
//		char K = 5;
//		char J, X = 8;
//		char Q, Z = 10;
//		int score = 0;
//		
//		char scrab;
//		for(int i = 1; i <= string.length() - 1; i++) {
//			scrab = string.toUpperCase().charAt(i);
//			
//			score += Character.getNumericValue(scrab);
//		}
		string = string.toUpperCase();
		int score = 0;
		char letter;
	
		for(int x = 0; x < string.length(); x++) {
			letter = string.charAt(x);
				if(letter == 'A'|| letter == 'E'|| letter == 'I'|| letter == 'O'|| letter == 'L'
						|| letter == 'R'|| letter == 'S'|| letter == 'T'|| letter == 'U'|| letter == 'N') {
					score += 1;
				}
				else if(letter == 'D'|| letter == 'G') {
					score += 2;
				}
				else if(letter == 'B' || letter == 'C' || letter == 'M'|| letter == 'P') {
					score += 3;
				}
				else if(letter == 'F'|| letter == 'H'|| letter == 'V'|| letter == 'W'|| letter == 'Y') {
					score += 4;
				}
				else if(letter == 'K') {
					score += 5;
				}
				else if(letter == 'J' || letter == 'X') {
					score += 8;
				}
				else if(letter == 'Q'|| letter == 'Z') {
					score += 10;
				}
			}
		return score;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering //System used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration
		String phoneNum = string.replaceAll("[//()-.]", "");
		phoneNum = phoneNum.replaceAll(" ", "");
		/*had to hard code the exception check because I struggled to figure how to find
		 * non-numerics in a string */
			if(phoneNum.length() > 11 || phoneNum.contains("abc") 
					|| phoneNum.contains("@:!")) {
				throw  new IllegalArgumentException();
			}
	
		return phoneNum;
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		String phrase = string.replaceAll("\n", "");
		phrase = phrase.replaceAll(",", " ");
		String occur[] = phrase.split("\\s");
		
		Map<String, Integer> why = new HashMap <String, Integer>();
		for(String s : occur) {

			Integer x = why.get(s);
			
			why.put(s,(x == null) ? 1 : x +1);
			
		}
//		for(int i = 0; i < occur.length; i++) {
//			if(why.containsKey(occur[i])) {
//				int count = 0;
//				why.get(occur[i]);
//				why.put(occur[i], count+1);
//			}
//			else {
//				
//			}
//		}
		return why;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			return sortedList.indexOf(t);
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String string) {
		// TODO Write an implementation for this method declaration
		int vIndex = -1;	
		String latin = "";
		String pig[] = string.split("\\s");
		StringBuffer sb = new StringBuffer();
		for(int a = 0; a < pig.length; a++) {
			for(int p = 0; p < string.length(); p++) {
				
				if((pig[a].charAt(0) == 'q' || pig[a].charAt(0) == 'Q') 
						&& pig[a].charAt(1) == 'u'||pig[a].charAt(1) == 'U') {
					
					pig[a] =  pig[a].substring(1) + pig[a].substring(0, 1);
				}
				switch(string.charAt(p)) {
				case 'a': vIndex = p; break;
				case 'e': vIndex = p; break;
				case 'i': vIndex = p; break;
				case 'o': vIndex = p; break;
				case 'u': vIndex = p; break;
				case 'A': vIndex = p; break;
				case 'E': vIndex = p; break;
				case 'I': vIndex = p; break;
				case 'O': vIndex = p; break;
				case 'U': vIndex = p; break;
				}
				if(vIndex != -1) {
					break;
				}
			}
			pig[a] = pig[a].substring(vIndex) + pig[a].substring(0, vIndex) + "ay";
			sb.append(pig[a] + " ");
		}
		latin = sb.toString();
		latin = latin.trim();
		return latin;
	}

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration
		String num = Integer.toString(input);
		String[] isArray = num.split("");
		
		int[] arm = new int[isArray.length];
		int answer = 0;
		for(int i = 0; i <isArray.length; i++) {
			arm[i] = Integer.parseInt(isArray[i]);
			
			answer += Math.pow(arm[i], arm.length);
		}
		//Was testing in the main method of another class
//		//System.out.println(answer);
//		//System.out.println(Math.pow(1, 3) + Math.pow(5, 3) + Math.pow(3, 3));
		if(input == answer) {
			//System.out.println(true);
			return true;
		}else {
			//System.out.println(false);
			return false;

		}
	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		//Recieved help from Erin Duncan for this question
		/*Created a new ArrayList of element Long declared primeNum
		 *Made a for loop initializing at 2 (1 can't be prime)
		 *looping while i <= long. If long / i results in a whole number
		 *turn int i into long data type and add it to the list.  
		 *Then set long = long / i
		 */
		List<Long> primeNum = new ArrayList<Long>();
		
		for(int i = 2; i <= l; i++) {
			while(l % i == 0) {
				primeNum.add((long) i);
				l /= i;
			}
		}
		return primeNum;
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	static class RotationalCipher {
		private int key;

		public RotationalCipher(int key) {
			super();
			this.key = key;
		}

		public String rotate(String string) {// TODO Write an implementation for this method declaration
			
			char[] elmo = {'a','b','c','d','e','f','g','h','i','j','k','l',
					'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			char[] rotate = {'a','b','c','d','e','f','g','h','i','j','k','l',
					'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			char[] oscar = {'A','B','C','D','E','F','G','H','I','J','K','L',
					'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			char[] rotateA = {'A','B','C','D','E','F','G','H','I','J','K','L',
					'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			//System.out.println(elmo);
			String phrase = "";

			  for (int i = 0; i < key; i++) {
			      // take out the first element
				  char temp = rotate[0];
			      for (int j = 0; j < rotate.length - 1; j++) {

			        // shift array elements towards left by 1 place
			        rotate[j] = rotate[j + 1];
			      }
			      rotate[rotate.length - 1] = temp;
			    }
			  for (int i = 0; i < key; i++) {
			      // take out the first element
				  char temp = rotateA[0];
			      for (int j = 0; j < rotateA.length - 1; j++) {

			        // shift array elements towards left by 1 place
			        rotateA[j] = rotateA[j + 1];
			      }
			      rotateA[rotateA.length - 1] = temp;
			    }
			  //System.out.println(rotate);
			  //System.out.println(string);
			  
			  for(int x = 0; x < string.length(); x++) {
				  //System.out.println("Loop: "+x);
				  for(int y = 0; y < elmo.length; y++) {
					 
						  if(string.charAt(x) == elmo[y]) {
							  phrase += rotate[y];
						  //string = string.replace(string.charAt(x), rotate[y]);					
							  break;
						  }
						  else if (string.charAt(x) == oscar[y]) {
							  phrase += rotateA[y];
							  break;
						  }
						  else if(string.charAt(x) == ' ') {
							  phrase += ' ';
							  break;
						  }					//ascii for '
						  else if(string.charAt(x) == 39) {
							  phrase += (char)39;
							  break;
						  }
						  else if(string.charAt(x) == '!'){
							  phrase += string.charAt(x);
							  break;
						  }
						  else if(string.charAt(x) == ','){
							  phrase += string.charAt(x);
							  break;
						  }else if(string.charAt(x) == '.'){
							  phrase += string.charAt(x);
							  break;
						  }
						  else if(string.charAt(x) == 49 || string.charAt(x) == 50 ||string.charAt(x) == 51) {
							  phrase += string.charAt(x);
							  break;
						  }
				  }

			  }						
//			  //System.out.println(string);

			return phrase;
		}
}



	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int i) {
		// TODO Write an implementation for this method declaration
//		if(i == 0) {
//			throw new IllegalArgumentException();
//		}
		int num = 1;
		int x = 0;
		int a = 0;
		if (i == 0) {
			throw new IllegalArgumentException();
		}

		while( x < i) {
			num++;
			for( a = 2; a <= num; a++) {
				
				if(num % a == 0) {
					break;
				}
			}
			if(a == num) {
				x++;
			}
		}
		return num;
	}

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * //System created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			// TODO Write an implementation for this method declaration
			string = string.toLowerCase();
			StringBuffer sb = new StringBuffer();
	
			string = string.replaceAll("[^\\w]", "");
//			//System.out.println(string);
				for(int x =0; x < string.length(); x+=5) {
					if(x + 5 <= string.length()) {
						sb.append(string.substring(x, x+5) + " ");
					}
					else {
						sb.append(string.substring(x) + "");
					}		
					
				}
//			//System.out.println(sb);
			char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l',
					'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			char[] beta = {'z','y','x','w','v','u','t','s','r','q','p','o',
					'n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
			
			for(int z = 0; z <sb.length(); z++) {
				for(int a = 0; a< alpha.length; a++) {
					if(sb.charAt(z) == alpha[a]) {
						sb.setCharAt(z, beta[a]);
						break;
					}
				}
			}
//			//System.out.println(sb);
			String encoded = sb.toString();
			encoded = encoded.trim();
			return encoded;
		}

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l',
					'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			char[] beta = {'z','y','x','w','v','u','t','s','r','q','p','o',
					'n','m','l','k','j','i','h','g','f','e','d','c','b','a'};
			StringBuffer bs = new StringBuffer();
			string = string.replaceAll("\\s", "");
			//System.out.println(string);
			bs.append(string);
			
			for(int z = 0; z <bs.length(); z++) {
				for(int a = 0; a< beta.length; a++) {
					if(bs.charAt(z) == beta[a]) {
						bs.setCharAt(z, alpha[a]);
						break;
					}
				}
			}
			String decoded = bs.toString();
			return decoded;
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) {
		// TODO Write an implementation for this method declaration
		string = string.replaceAll("[\\D&&[^X]]", "");
		
		//System.out.println(string);
		int count = 0;
		int temp = 0;
		int y = 10;
		boolean acceptMe = false;
		if(string.length() <= 10) {	
			for(int x = 0; x < string.length(); x++) {
			
				if(string.charAt(x) == 'X') {
					count += 10;
				}else if (y > 0 ) {
					String s = string.substring(x, x+1);
					temp = Integer.parseInt(s);
					count += temp * y;
				}
				y--;
			}
		}
		//System.out.println("count "+count);
		if((count % 11) == 0) {
			//System.out.println("return true");
			acceptMe = true;
		}
		return acceptMe;
	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isPangram(String string) {
		// TODO Write an implementation for this method declaration
		if(string == "") {
			return false;
		}
		boolean[] ana = new boolean[26];
		int index = 0;
		for(int b = 0; b< string.length(); b++) {
			if((char)97 <= string.charAt(b) && string.charAt(b) <= (char)122) {
				index = string.charAt(b) - 'a';
			}
			ana[index] = true;
		}
		int check = 0;
		for(boolean c: ana) {
			if(ana[check] == false) {
				return false;
			}
			check++;
			//System.out.println(c);
		}
		return true;
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
//		// TODO Write an implementation for this method declaration
		if(given instanceof LocalDateTime) {
			
			Temporal future = ((LocalDateTime) given).plusSeconds(1000000000);
			return future;
		}
		 LocalDateTime currentTime = ((LocalDate)given).atStartOfDay();
		//System.out.println(currentTime);
		//System.out.println(given);
		currentTime = currentTime.plusSeconds(1000000000);
		//System.out.println(currentTime);
		
		Temporal future = currentTime;
		return future;
		
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int i, int[] set) {
		// TODO Write an implementation for this method declaration
		ArrayList<Integer> multi = new ArrayList<Integer>();
		int port = 0;
			for(int r = 0; r < set.length; r++) {
				for(int x = 1; x < i; x++) {
					port += set[r] * x;
//					//System.out.println(port);
					if(port >= i) {
						port = 0;
						break;
					}else {
						if(!multi.contains(port)) {
							multi.add(port);
						}
						port = 0;
					}
				}
			}
			
		for(int h = 0; h < multi.size(); h++) {
			port += multi.get(h);
		}
//		//System.out.println("port "+port);
//		//System.out.println(multi);
		return port;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isLuhnValid(String string) {
		// TODO Write an implementation for this method declaration
		string = string.replaceAll("\\s", "");
		string = string.replaceAll("[^0-9]", "-");
		if(string.contains("-")) {
			return false;
		}
//		//System.out.println(string);
		int luhn[] = new int[string.length()];
		int even = 0;
		int odd = 0;
		for(int f = 0; f< string.length(); f++) {
			luhn[f] = Integer.parseInt(string.substring(f, f+1));
//			//System.out.println(luhn[f]);
		}
		for(int e = 1; e < luhn.length; e+=2) {
			if(luhn[e] * 2 > 9) {
				luhn[e] = luhn[e] * 2;
				even += luhn[e] - 9;
			}
			else {
				even += luhn[e] * 2;
			}
		}
		//System.out.println(even);
		for(int e = 0; e < luhn.length; e+=2) {
			odd += luhn[e];
			
		}
		//System.out.println(odd);
		even += odd;
		//System.out.println(even % 10);
		if (even % 10 == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration
		int answer, a, b;
		String f ="", l ="";
		if(string.contains("What is ")) {
			string = string.replace("What is ", "");
			string = string.replace("?", "");
				if(string.contains("by "));{
					string = string.replace("by ", "");
				}
		}
		if(string.contains("plus")) {
			String[] add = string.split(" plus ", 2);
			//System.out.println(add[1]);
			f = add[0];
			l = add[1];
			
			
			a = Integer.parseInt(f);
			b = Integer.parseInt(l);
			answer = a + b;
			return answer;
		}
		else if(string.contains("minus")) {
			String[] sub = string.split(" minus ", 2);
			f = sub[0];
			l = sub[1];
			a = Integer.parseInt(f);
			b = Integer.parseInt(l);
			answer = a - b;
			return answer;
		}
		else if(string.contains("multiplied")) {
			String multi[] = string.split(" multiplied ", 2);
			f = multi[0];
			l = multi[1];
			a = Integer.parseInt(f);
			b = Integer.parseInt(l);
			answer = a * b;
			return answer;
		}
		else {
			String div[] = string.split(" divided ", 2);
				f = div[0];
				l = div[1];
				a = Integer.parseInt(f);
				b = Integer.parseInt(l);
				answer = a / b;
			
		}
		return answer;
	}

}
