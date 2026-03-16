package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.sbeans.Book;
@Component
public class BookDAOImpl implements IBookDAO {
	private final String INSERT_BOOK = "insert into Book values (?, ?, ?, ?)";
	private final String GET_BOOK = "select * from Book";
	private final String UPDATE_BOOK = "update Book set TITLE=?, AUTHOR=?, PRICE=? where BOOKID=?";
	private final String DELETE_BOOK = "delete from Book where BOOKID=?";
	
	@Autowired
	DataSource ds;

	@Override
	public void insertBook(Book book) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(INSERT_BOOK);
			ps.setInt(1, book.getBookId());
			ps.setString(2, book.getTitle());
			ps.setString(3, book.getAuthor());
			ps.setDouble(4, book.getPrice());
			int rowCount = ps.executeUpdate();
			if (rowCount > 0) {
				IO.println("Book id: " + book.getBookId() + " Added Sucessfully!!!");
			} else {
				IO.println("Book id: " + book.getBookId() + "Already exists.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> bookList = new ArrayList<Book>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(GET_BOOK);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setBookId(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setPrice(rs.getDouble(4));
				bookList.add(book);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookList;
	}

	@Override
	public void deleteBook(int bookId) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(DELETE_BOOK);
			ps.setInt(1, bookId);
			int rowCount = ps.executeUpdate();
			if (rowCount > 0) {
				IO.println("Book id: " + bookId + " Deleted Sucessfully!!!");
			} else {
				IO.println("Book id: " + bookId + "Not Found...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateBook(Book book) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(UPDATE_BOOK);
			ps.setString(1, book.getTitle());
			ps.setString(2, book.getAuthor());
			ps.setDouble(3, book.getPrice());
			ps.setInt(4, book.getBookId());
			
			int rowCount = ps.executeUpdate();
			if (rowCount > 0) {
				IO.println("Book id: " + book.getBookId() + " Updated Sucessfully!!!");
			} else {
				IO.println("Book id: " + book.getBookId() + "Not Found...");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
