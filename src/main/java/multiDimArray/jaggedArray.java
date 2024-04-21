package multiDimArray;

public class jaggedArray {

	public static void main(String[] args) {
		String str[][] = {
				{"abc", "bca", "cba"},
				{"123", "321"},
				{"@@@", "###", "$$$", "&&&"}
				
		};
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<str[i].length; j++) {
				System.out.println(str[i][j]);
			}
		}
		

	}

}
