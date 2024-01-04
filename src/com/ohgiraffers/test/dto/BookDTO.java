package com.ohgiraffers.test.dto;

public class BookDTO {

    public int bNo;          //도서 번호
    protected int category;     //도서분류코드
    protected String title;     //도서 제목
    protected String author;    //도서 저자

    public BookDTO(){

    }

    public BookDTO(int category, String title, String author){
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public void setbNo(int bNo){
        this.bNo = bNo;
    }
    public void setCategory(int category){
        this.category = category;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public int getbNo(){
        return this.bNo;
    }
    public int getCategory(){
        return this.category;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }

    @Override
    public String toString() {
        //필드값 문자열 합친 후 리턴. category 분류 별로 출력
        //1 : 인문 / 2 : 자연과학 / 3: 의료 / 4 : 기타
        return "BookDTO{" +
                "bNo=" + bNo +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
