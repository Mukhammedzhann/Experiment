package Practika.Practika_1_1;

public class Reader {
    private String name;
    private String readerId;

    public Reader(String name, String readerId) {
        this.name = name;
        this.readerId = readerId;
    }

    public String getReader() {
        return readerId;
    }

    @Override
    public String toString() {
        return name + " (ID: " + readerId + ")";
    }
}


