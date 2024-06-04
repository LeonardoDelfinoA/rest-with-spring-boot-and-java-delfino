package br.com.delfino.mapper.custom;

import org.springframework.stereotype.Service;

import br.com.delfino.data.vo.v1.BookVO;
import br.com.delfino.model.Book;

@Service
public class BookMapper {

	public BookVO convertEntityToVo(Book book) {
		BookVO vo = new BookVO();
		vo.setKey(book.getId());
		vo.setTitle(book.getTitle());
		vo.setAuthor(book.getAuthor());
		vo.setLaunchDate(book.getLaunchDate());
		vo.setPrice(book.getPrice());
		return vo;
	}

	public Book convertVoTOEntity(BookVO book) {
		Book entity = new Book();
		entity.setId(book.getKey());
		entity.setTitle(book.getTitle());
		entity.setAuthor(book.getAuthor());
		entity.setLaunchDate(book.getLaunchDate());
		entity.setPrice(book.getPrice());;
		return entity;
	}
}
