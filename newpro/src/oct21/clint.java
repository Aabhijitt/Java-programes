package oct21;

public class clint {

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.addwords("are");
		trie.addwords("art");
		trie.addwords("and");
		trie.addwords("an");
		trie.addwords("ant");
		trie.addwords("as");
		trie.addwords("ask");
		trie.addwords("see");
		trie.addwords("sea");
		trie.addwords("seen");
		trie.displayWords();
	System.out.println(trie.searchword("as") + " " + trie.searchword("ask"));
		trie.removewords("as");
		System.out.println(trie.searchword("as") + " " + trie.searchword("ask"));
		trie.displayWords();

		System.out.println(trie.searchword("as") + " " + trie.searchword("ask"));
		trie.removewords("ask");
		System.out.println(trie.searchword("as") + " " + trie.searchword("ask"));
		trie.displayWords();

		System.out.println(trie.searchword("an") + " " + trie.searchword("and"));
		trie.removewords("and");
		System.out.println(trie.searchword("an") + " " + trie.searchword("and"));
		trie.displayWords();

		System.out.println(trie.searchword("an") + " " + trie.searchword("and"));
		trie.removewords("an");
		System.out.println(trie.searchword("an") + " " + trie.searchword("and"));
		trie.displayWords();

	}

}
