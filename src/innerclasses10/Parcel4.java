package innerclasses10;

public class Parcel4 {
    private static class PContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected static class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }

} ///:~

class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();

        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
    }
}