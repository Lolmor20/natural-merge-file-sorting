package pg.eti;

public class Rekord {
    private Pieciokat pieciokat;

    public Rekord(Pieciokat pieciokat) {
        this.pieciokat = pieciokat;
    }

    public Pieciokat getPieciokat() {
        return pieciokat;
    }

    public void setPieciokat(Pieciokat pieciokat) {
        this.pieciokat = pieciokat;
    }
}
