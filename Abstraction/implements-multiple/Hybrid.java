interface Writer {
    void write();
}

interface Reader {
    void read();
}

class Book implements Writer, Reader {
    public void write() {
        System.out.println("Writing book");
    }

    public void read() {
        System.out.println("Reading book");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Book b = new Book();
        b.write();
        b.read();
    }
}
