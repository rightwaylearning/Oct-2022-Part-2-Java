package stackimp.queueimp.using.ll;

public class Book {

	private String bookName;
	private String author;
	private Integer pages;
	
	public Book() {}

	public Book(String bookName, String author, Integer pages) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.pages = pages;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", pages=" + pages + "]";
	}
	
}
