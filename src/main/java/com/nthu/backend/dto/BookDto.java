package com.nthu.backend.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "書本資料")
public class BookDto {
    @ApiModelProperty(value = "序號", required = true)
    private Integer bookid;
    @ApiModelProperty(value = "書名", required = true)
    private String name;
    @ApiModelProperty(value = "作者", required = true)
    private String author;
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
