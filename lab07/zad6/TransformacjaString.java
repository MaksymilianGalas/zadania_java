package zad6;

public class TransformacjaString {

    public static String usunZnaki(String tekst, Znak znak) {
        String regex = "";
        switch (znak) {
            case SPOLGLOSKA:
                regex = "[^bcćdfghjklłmnńpqrsśtvwxyzBCĆDFGHJKLMNŃPQRSŚTVWXYZ]";
                break;
            case SAMOGLOSKA:
                regex = "[^aeiouyąęóAEIOUYĄĘÓ]";
                break;
            case SPACJA:
                regex = "[^ ]";
                break;
            case LICZBA:
                regex = "[^0-9]";
                break;
            case ZNAK_SPECJALNY:
                regex = "[^\\p{Punct}]";
                break;
        }
        return tekst.replaceAll(regex, "");
    }

    public static String podmienZnaki(String tekst, Znak znak, String podmien) {
        String regex = "";
        switch (znak) {
            case SPOLGLOSKA:
                regex = "[bcćdfghjklłmnńpqrsśtvwxyzBCĆDFGHJKLMNŃPQRSŚTVWXYZ]";
                break;
            case SAMOGLOSKA:
                regex = "[aeiouyąęóAEIOUYĄĘÓ]";
                break;
            case SPACJA:
                regex = "[ ]";
                break;
            case LICZBA:
                regex = "[0-9]";
                break;
            case ZNAK_SPECJALNY:
                regex = "[\\p{Punct}]";
                break;
        }
        return tekst.replaceAll(regex, podmien);
    }

    public static String pozostawZnaki(String tekst, Znak znak) {
        String regex = "";
        switch (znak) {
            case SPOLGLOSKA:
                regex = "[bcćdfghjklłmnńpqrsśtvwxyzBCĆDFGHJKLMNŃPQRSŚTVWXYZ]";
                break;
            case SAMOGLOSKA:
                regex = "[aeiouyąęóAEIOUYĄĘÓ]";
                break;
            case SPACJA:
                regex = "[ ]";
                break;
            case LICZBA:
                regex = "[0-9]";
                break;
            case ZNAK_SPECJALNY:
                regex = "[\\p{Punct}]";
                break;
        }
        return tekst.replaceAll("[^" + regex + "]", "");
    }
}
