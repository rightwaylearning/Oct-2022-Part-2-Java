package many.to.many;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {

	@Id
	@Column(name="book_id")
	private Integer bookId;
	
	@Column(name="book_name")
	private String bookName;
	
	@ManyToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.EAGER
			)
	@JoinTable(
			 name = "book_author",
			 joinColumns = @JoinColumn(name="fk_book_id" ,  referencedColumnName = "book_id"),
			 inverseJoinColumns = @JoinColumn(name="fk_author_id", referencedColumnName = "author_id")
			)
	private Set<Author> authorList;
	
	public Book() {}
	
	
	public Book(Integer bookId, String bookName, Set<Author> authorList) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorList = authorList;
	}



	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Set<Author> getAuthorList() {
		return authorList;
	}

	public void setAuthorList(Set<Author> authorList) {
		this.authorList = authorList;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorList=" + authorList + "]";
	}
	
	
}
