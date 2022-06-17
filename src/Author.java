import java.util.ArrayList;

public class Author {
    private String nationality;
    private String name;
    private char gender;
    // TODO: Add Books once class is completed.
    private int numberOfWrittenBooks;
    private ArrayList<String> genre;
    private String birthDate;
    private ArrayList<String> publisher;
    private int activeYears;

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getNationality() {
        return this.nationality;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
