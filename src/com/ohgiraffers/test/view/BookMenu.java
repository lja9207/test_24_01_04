package com.ohgiraffers.test.view;

import com.ohgiraffers.test.dto.BookDTO;
import com.ohgiraffers.test.controller.BookManager;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc;
    private BookManager bm;


    public BookMenu(){

    }

    public void menu(){                 //메뉴
        //도서관리프로그램에 해당하는 메인 메뉴 출력.
        //각 메뉴에 해당하는 BookManager 클래스의 메소드 실행 -> 반복 출력되게 한다
        BookManager bookManager = new BookManager();
        ArrayList<BookDTO> bookDTO = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        menu :
        while(true)
        {
            System.out.println("메뉴를 골라주세요.");

            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 검색");
            System.out.println("3. 도서 목록");
            System.out.println("9. 종료");


            int menu = sc.nextInt();
            switch (menu)
            {
                case 1 :
                    inputBook();
                    break;
                case 2 :
                    inputBookTitle();
                    break;
                case 3 :
                    bm.printBookList(bookDTO);
                case 9 :
                    System.out.println("메뉴를 종료합니다.");
                    break menu;
                default :
                    System.out.println("잘못된 메뉴를 선택하였습니다. 다시 선택해주세요.");
                    break;
            }
        }


    }

    public BookDTO inputBook(){

        //BookDTO 객체의 필드값을 키보드로 입력받아 초기화하고 객체 리턴
        System.out.println("도서를 등록합니다.");

        Scanner  sc = new Scanner(System.in);
        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();

        System.out.print("도서 분류 코드 : ");
        int category = sc.nextInt();

        System.out.print("도서 제목 : ");
        String title = sc.nextLine();
        title = sc.nextLine();

        System.out.print("도서 저자 : ");
        String author = sc.nextLine();


        BookDTO bookDTO = new BookDTO(category, title, author);     //도서번호?
        bookDTO.setbNo(bNo);

        try{
            bm.addBook(bookDTO);    // BookManager 의 addBook    //  왜 null

        }catch(NullPointerException e)
        {
            e.printStackTrace();
        }


        return bookDTO;
    }

    public String inputBookTitle(){
        //검색할 도서제목을 키보드로 입력 받아 리턴
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 도서 제목 : ");
        String title = sc.nextLine();
        bm.searchBook(title);

        return title;
    }

}
