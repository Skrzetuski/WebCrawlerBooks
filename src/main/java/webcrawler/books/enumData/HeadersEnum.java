package webcrawler.books.enumData;

public class HeadersEnum {
    public enum Web {
        HEADERS_NAME("X-Requested-With"),
        HEADERS_VALUE("XMLHttpRequest"),
        HTML("html"),
        LIBRARY_WANTED("http://lubimyczytac.pl/profile/getNextBookFromList/json/0/1/1?page=1&amountBooks=200&porzadek=&akcja=&filtr=&kolejnosc=&czas=&ilosc=0&viewType=miniatury&shelf=722909&emptyText=Brak+ksi%C4%85%C5%BCek+na+li%C5%9Bcie.&ajaxUrl=profile%2FgetNextBookFromList%2Fjson%2F0%2F1%2F1&accountId=113175&szukaj="),
        LIBRARY_OWNED("http://lubimyczytac.pl/profile/getNextBookFromList/json/0/1/1?page=1&amountBooks=200&porzadek=&akcja=&filtr=&kolejnosc=&czas=&ilosc=0&viewType=miniatury&shelf=722911&emptyText=Brak+ksi%C4%85%C5%BCek+na+li%C5%9Bcie.&ajaxUrl=profile%2FgetNextBookFromList%2Fjson%2F0%2F1%2F1&accountId=113175&szukaj=");

        final String name;

        Web(String s) {
            name = s;
        }

        public String toString() {
            return this.name;
        }
    }
}
