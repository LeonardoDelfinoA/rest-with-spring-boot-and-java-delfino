package br.com.delfino.integrationtests.vo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BookVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private String title;

	private String author;

	private LocalDate launch_date;

	private Double price;

	public BookVO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getLaunch_date() {
		return launch_date;
	}

	public void setLaunch_date(LocalDate launch_date) {
		this.launch_date = launch_date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, launch_date, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookVO other = (BookVO) obj;
		return Objects.equals(id, other.id) && Objects.equals(launch_date, other.launch_date)
				&& Objects.equals(price, other.price) && Objects.equals(title, other.title);
	}
	
}
