package com.example.binding;

public class Author {
	
	public String authorName;
	public String authorEmail;
	public Long authorPno;
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	public Long getAuthorPno() {
		return authorPno;
	}
	public void setAuthorPno(Long authorPno) {
		this.authorPno = authorPno;
	}
	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", authorEmail=" + authorEmail + ", authorPno=" + authorPno + "]";
	}

}
