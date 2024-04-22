package day09.book;

import day05.StringList;

import static util.SimpleInput.*;

// 역할: 도서관리 프로그램에서 입출력을 담당하는 객체
public class LibraryView {

    private LibraryRepository repository;

    public LibraryView() {
        this.repository = new LibraryRepository();
    }

    // 회원 정보를 입력받는 기능
    public void makeNewBookUser() {
        System.out.println("\n# 회원 정보를 입력해주세요.");
        String name = input("# 이름: ");
        int age = Integer.parseInt(input("# 나이: "));
        Gender gender = inputGender();

        // 입력된 데이터를 저장시켜야 함.
        repository.saveBookUser(new BookUser(name, age, gender, 0));
    }

    // 성별을 정확히 입력할때가지 무한히 입력받고
    // 정확히 입력하면 해당 성별 문자를 리턴
    private Gender inputGender() {
        while (true) {
            String gender = input("# 성별(M/F): ").toUpperCase();
            if (gender.startsWith("M")) return Gender.MALE;
            if (gender.startsWith("F")) return Gender.FEMALE;
            System.out.println("\n# 성별을 잘못 입력했습니다.");
        }
    }

    // 메뉴를 출력하는 기능
    public void showMainScreen() {
        System.out.println("\n============ 도서 메뉴 ==============");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 제목으로 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 9. 프로그램 종료하기");
    }

    // 코드의 흐름을 캡슐화
    public void start() {
        makeNewBookUser();

        while (true) {
            showMainScreen();
            String menuNum = input("- 메뉴 번호 : ");

            switch (menuNum) {
                case "1":
                    displayUserInfo();
                    break;
                case "2":
                    displayAllBooks();
                    break;
                case "3":
                    searchBooksByTitle();
                    break;
                case "4":
                    rentBook();
                    break;
                case "9":
                    System.out.println("# 프로그램을 종료합니다!!");
                    return;
                default:
                    System.out.println("# 올바른 메뉴 번호를 입력하세요!");
            }
        }
    }
    private void displayUserInfo() {
        BookUser user = repository.getBookUser();
        System.out.println("\n******** 회원님 정보 ********");
        System.out.println("# 회원명: " + user.getName());
        System.out.println("# 나이: " + user.getAge());
        System.out.println("# 성별: " + user.getGenderToString());
        System.out.println("# 쿠폰개수: " + user.getCouponCount());
    }

    private void rentBook() {
        displayAllBooks();
        String bookNum = input("- 대여할 도서 번호 입력: ");
        // 저장소에다가 대여가능한지 여부 검증
        RentStatus status = repository.rentBook(Integer.parseInt(bookNum));

        if (status == RentStatus.RENT_SUCCESS_WITH_COUPON) {
            System.out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여되었습니다.");
        } else if (status == RentStatus.RENT_SUCCESS) {
            System.out.println("# 도서가 성공적으로 대여되었습니다.");
        } else {
            System.out.println("# 도서 대여에 실패했습니다.");
        }
    }

    // 책 제목으로 검색어포함된 책 내용 출력하기
    private void searchBooksByTitle() {
        String keyword = input("# 검색어: ");

        Book[] searchBooks = repository.searchBookList(keyword);

        if (searchBooks.length > 0) {
            System.out.printf("\n======== [%s] 검색 결과 =========\n", keyword);
            for (Book searchBook : searchBooks) {
                System.out.println(searchBook.info());
            }
        } else {
            System.out.println("\n# 검색 결과가 없습니다.");
        }
    }

    // 전체 도서 정보를 출력
    private void displayAllBooks() {
        System.out.println("\n=============== 전체 도서 목록 ================");
        Book[] informationList = repository.getAllBooksInfo();

        for (int i = 0; i < informationList.length; i++) {
            Book book = informationList[i];
            System.out.printf("%d. %s\n", i+1, book.info());
        }

    }
}


