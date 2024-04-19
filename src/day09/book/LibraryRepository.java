package day09.book;

// 역할: 도서관리 앱에서 사용하는 데이터들을 관리하는 객체
// 관리할 데이터: 우리 회원이 누구?  우리는 어떤책들을 갖고 있는가?
public class LibraryRepository {

    private static BookUser user; // 회원은 한명
    private static BookList bookList;  // 책은 여러개

    // 정적 초기화자 : static필드 초기값 설정
    static {
        bookList = new BookList();

        bookList.push(new CookBook("기적의 집밥책", "김해진", "청림라이프", true));
        bookList.push(new CartoonBook("떨어지면 끝장맨", "스에노부 케이코", "대원씨아이", 18));
        bookList.push(new CartoonBook("원펀맨", "One", "대원씨아이", 15));
        bookList.push(new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false));
        bookList.push(new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true));
        bookList.push(new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12));
    }

    // 저장소에 user를 저장
    public void saveBookUser(BookUser bookUser) {
        user = bookUser;
    }

    // 책 정보가 들어 있는 배열을 리턴
    public Book[] getAllBooksInfo() {
        return bookList.getbArr();
    }

    public Book[] searchBookList(String keyword) {

        // 검색어에 걸린 책들을 모아두는 리스트
        BookList filteredList = new BookList();

        for (Book book : bookList.getbArr()) {
            if (book.getTitle().contains(keyword)) {
                filteredList.push(book);
            }
        }
        return filteredList.getbArr();
    }

    /**
     * 주어진 책 번호에 맞는 책이 대여 가능한지에 대한 상태상수를 리턴
     * @param bookNum - 주어진 책 번호
     * @return - 대여 가능 상태를 반환
     */
    public RentStatus rentBook(int bookNum) {

        // 1. 책번호에 해당하는 책 정보 가져오기
        Book wishBook = bookList.get(bookNum - 1);
        // 2. 이 책을 대여할 수 있는지 검증
        // 2-1. 요리책일 경우
        if (wishBook instanceof CookBook) {
            // 3. 쿠폰 유무를 확인
            CookBook cookBook = (CookBook) wishBook;
            if(cookBook.isCoupon()) {
                // 회원의 쿠폰개수를 업데이트
                user.setCouponCount(user.getCouponCount() + 1);
                return RentStatus.RENT_SUCCESS_WITH_COUPON;
            } else {
                return RentStatus.RENT_SUCCESS;
            }
        }
        // 2-2. 만화책일 경우
        else if (wishBook instanceof CartoonBook) {
            // 3. 회원의 연령이 만화책의 제한연령보다 높은지 확인
            CartoonBook cartoonBook = (CartoonBook) wishBook;
            if (user.getAge() >= cartoonBook.getAccessAge()) {
                return RentStatus.RENT_SUCCESS;
            } else {
                return RentStatus.RENT_FAIL;
            }
        }
        return RentStatus.RENT_FAIL;
    }

    public BookUser getBookUser() {

        return user;
    }
}
