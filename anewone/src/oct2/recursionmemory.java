package oct2;

import java.util.ArrayList;

public class recursionmemory {

	public static void main(String[] args) {

		// int[] arr = { 10, 20, 30, 40, 50,60,70,80 };
		// printTargetSubset(arr, 0, 50, " ", 0);
		// printTargetSubset(arr, 0, 50, new ArrayList<>(), 0);
		// printTsetsum(arr, 0, 0, 0, new ArrayList<>(), new ArrayList<>());
		// permutation("abc", "");
		//permutationAn(new StringBuilder("abc"), new StringBuilder(""));
		permutationQues(new StringBuilder("abc"), new StringBuilder(""));
	}

	public static void printTargetSubset(int[] arr, int vidx, int tar, String set, int sos) {
		if (vidx == arr.length) {
			if (sos == tar) {
				System.out.println(set);
			}
			return;
		}

		printTargetSubset(arr, vidx + 1, tar, set + " " + arr[vidx], sos + arr[vidx]);
		printTargetSubset(arr, vidx + 1, tar, set, sos);
	}

	public static void printTargetSubset(int[] arr, int vidx, int tar, ArrayList<Integer> set, int sos) {
		if (vidx == arr.length) {
			if (sos == tar) {
				System.out.println(set);
			}
			return;
		}
		set.add(arr[vidx]);
		printTargetSubset(arr, vidx + 1, tar, set, sos + arr[vidx]);
		set.remove(set.size() - 1);
		printTargetSubset(arr, vidx + 1, tar, set, sos);

	}

	public static void printTsetsum(int[] arr, int vidx, int sum1, int sum2, ArrayList<Integer> set1,
			ArrayList<Integer> set2) {
		if (vidx == arr.length) {
			if (sum1 == sum2) {
				System.out.println(set1 + "& " + set2);
			}
			return;
		}
		set1.add(arr[vidx]);
		printTsetsum(arr, vidx + 1, sum1 + arr[vidx], sum2, set1, set2);
		set1.remove(set1.size() - 1);

		set2.add(arr[vidx]);
		printTsetsum(arr, vidx + 1, sum1, sum2 + arr[vidx], set1, set2);
		set2.remove(set2.size() - 1);
	}

	public static void permutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		String res = ques.substring(1);
		for (int i = 0; i <= ans.length(); i++) {
			String l = ans.substring(0, i);
			String r = ans.substring(i);
			permutation(res, l + ch + r);
		}
	}

	public static void permutationAn(StringBuilder ques, StringBuilder ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		ques.deleteCharAt(0);
		for (int i = 0; i <= ans.length(); i++) {
			ans.insert(i, ch);
			permutationAn(ques, ans);
			ans.deleteCharAt(i);
		}
		ques.insert(0, ch);
	}

	public static void permutationQues(StringBuilder ques, StringBuilder ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			ques.deleteCharAt(i);
			ans.append(ch);
			permutationQues(ques, ans);
			ans.deleteCharAt(ans.length() - 1);
			ques.insert(i, ch);
		}
	}

}
