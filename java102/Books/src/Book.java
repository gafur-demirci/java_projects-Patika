public class Book {

    private String name;
    private int pageNumber;

    public Book(String name , int pageNumber){
        this.name = name;
        this.pageNumber = pageNumber;
    }
    // private degiskene erişim izni.
    public String getshowName(){
        return this.name;
    }
    // private degiskeni degistirme izni.
    public void  setchangeName(String name){
        this.name = name;
    }
    // private degiskene erişim izni.
    public int getshowPageNumber(){
        return this.pageNumber;
    }
    // private degiskeni kontrol ve değişim izni.
    public void setchangePageNumber(int pageNumber){
        if (pageNumber < 0){
            pageNumber = 0;
        }
        this.pageNumber = pageNumber;
    }
}
