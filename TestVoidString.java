public class TestVoidString {

    Boolean x = true;

    public static void main(String[] args) {
        // stringMetode() returnere en string

        TestVoidString test = new TestVoidString();
        System.out.println(test.stringMetode());
        // Virker, fordi void returnere ikke en værdi
        // System.out.println(test.voidMetode());

    }
    void voidMetode() {
        String a = "Stationary";
        System.out.println(a);
    }
    String stringMetode() {
        return  "Laptop";

    }
    boolean lukDoeren() {
        boolean slukket = true;
        // HVis døren er lukket, så skal den returnere true

        // hvis ikke den er lukket, pga. en sutsko i klemme, så den returnerer den ikke
        return slukket;
    }
}
