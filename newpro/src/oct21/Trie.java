package oct21;

import java.util.ArrayList;
import java.util.HashMap;

public class Trie {
	private class Node {
		char data;
		HashMap<Character, Node> children = new HashMap<>();
		boolean eow;
	}

	Node root;
	int size;
	int words;

	public Trie() {
		root = new Node();
		root.data = '$';
		size = 1;
	}

	public void addwords(String word) {
		addword(root, word);
	}

	private void addword(Node node, String word) {
		if (word.length() == 0) {
			node.eow = true;
			words++;
			return;
		}
		char ch = word.charAt(0);
		String sb = word.substring(1);

		Node child = node.children.get(ch);
		if (child == null) {
			child = new Node();
			size++;
			child.data = ch;
			node.children.put(ch, child);
			addword(child, sb);
		} else {
			addword(child, sb);
		}

	}

	public void removewords(String word) {
		removeword(root, word);
	}

	private void removeword(Node node, String word) {
		if (word.length() == 0) {
			node.eow = false;
			words--;
			return;
		}
		char ch = word.charAt(0);
		String sb = word.substring(1);

		Node child = node.children.get(ch);
		removeword(child, sb);
		if (child.eow == false && child.children.size() == 0) {
			node.children.remove(ch);
			size--;

		}

	}

	public boolean searchword(String word) {
		return searchword(root, word);

	}

	private boolean searchword(Node node, String word) {
		if (word.length() == 0) {
			return node.eow;
		}
		char ch = word.charAt(0);
		String sb = word.substring(1);

		Node child = node.children.get(ch);
		if (child == null) {
			return false;

		} else {
			return searchword(child, sb);

		}
	}

	public void displayWords() {
		displaywords(root, "");
	}

	private void displaywords(Node node, String wsf) {
		if (node.eow) {
			System.out.println(wsf);
		}

		ArrayList<Character> keys = new ArrayList<>(node.children.keySet());

		for (Character key : keys) {
			Node child = node.children.get(key);
			displaywords(child, wsf + child.data);
		}

	}
}
