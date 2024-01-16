public class Main {
    public static void main(String[] args) throws Exception {
        Forma cerchio = FormaFactory.getForma(EnumForma.CERCHIO);
        Forma rettangolo = FormaFactory.getForma(EnumForma.RETTANGOLO);

        cerchio.draw();
        rettangolo.draw();
    }
}
