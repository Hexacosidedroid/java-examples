package bookpackext;
import bookpack.*;

class UseBook {
	public static void main(String[] args) {
		Book books[] = new Book[5];

		books[0]=new Book("a","b",2014);
		books[1]=new Book("b","c",2015);
		books[2]=new Book("c","d",2016);
		books[3]=new Book("d","e",2017);
		books[4]=new Book("e","g",2018);

		for (int i=0; i<books.length; i++) books[i].show(); 
	}
}