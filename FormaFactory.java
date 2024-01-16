public class FormaFactory {
    public static Forma getForma(EnumForma enumForma) throws Exception{
        switch (enumForma) {
            case CERCHIO:
                return new Cerchio();
            case RETTANGOLO:
                return new Rettangolo();
            default :
                throw new Exception("Forma non supportata!");
        }
    }
}
