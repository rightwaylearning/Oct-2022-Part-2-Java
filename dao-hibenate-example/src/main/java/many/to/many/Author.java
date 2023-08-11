package many.to.many;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {

	@Id
	@Column(name = "author_id")
	private Integer authorId;
	
	@Column(name = "author_name")
	private String authorName;
	
	@ManyToMany(
			cascade = CascadeType.ALL,
			mappedBy = "authorList"
			)
	private Set<Book> books;
	
	public Author() {}

	public Author(Integer authorId, String authorName, Set<Book> books) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.books = books;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", books=" + books + "]";
	}
	
	
}
