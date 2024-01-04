package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.dto.BookDTO;
import com.ohgiraffers.test.view.BookMenu;

import java.util.ArrayList;

public class BookManager {

    ArrayList<BookDTO> bookDTO = new ArrayList<>();

    public BookManager(){
        //기본생성자 //ArrayList<BookDTO> 인스턴스 생성
    }

    public void addBook(BookDTO book){
        //전달받은 BookDTO객체를 생성자 시 선언한 ArrayList객체에 추가
        bookDTO.add(0, new BookDTO(1, "ㅇㅇ", "ㅇㄴㄴ"));
        System.out.println(bookDTO);
        bookDTO.add(book);
    }

    public void deleteBook(int index){
        //전달받은 도서 번호로 ArrayList 안에 있는 정보 삭제
        bookDTO.remove(index);
    }

    public int searchBook(String title){
        // 전달받은 도서 제목으로 도서를 검색하고 결과값 반환
        int result = 0;

        for(int i = 0; i < bookDTO.size(); i++)
        {
            if(bookDTO.contains(title)){
                result = bookDTO.indexOf(title);
            }
        }
        return result;
    }

    public void printBook(int index){
        // 전달받은 인덱스에 있는 도서 정보 출력
        bookDTO.get(index);

    }

    public void displayAll(){
        // 도서목록 전체 출력
        for(int i = 0; i < bookDTO.size(); i++)
        {
            System.out.println(bookDTO.get(i));
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select){
        //전달받은 번호를 기준으로 해당 카테고리순으로 정렬해서 ArrayList<BookDTO>에 담아서 리턴

       return null;
    }

    public void printBookList(ArrayList<BookDTO> br){
        //전달받은 ArrayList<BookDTO>를 향상된 for문을 이용하여 출력
        for(BookDTO bookDTO : bookDTO){
            System.out.println(bookDTO.toString());
        }
    }
}
