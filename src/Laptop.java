public class Laptop {
    int id;
    int ozu;
    int ssd;
    String os;
    String color;

    public Laptop(int id, int ozu, int ssd, String os, String color){
        this.id = id;
        this.ozu = ozu;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    public String toString() {
        return String.format("id: %d, ram: %d ГБ, ssd: %d ГБ, OS: %s, color: %s", id, ozu, ssd, os, color);
    }

    public boolean equals(Object o) {
        Laptop t = (Laptop) o;
        return id == t.id;
    }
}