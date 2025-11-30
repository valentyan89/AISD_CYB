import java.awt.Font;

public enum NewFont {
    FiraCode("Fira Code"),
    TimesNewRoman("Times New Roman"),
    SansSerif("SansSerif"),
    CourierNew("Courier New");

    private final String fontName;

    NewFont(String fontName) {
        this.fontName = fontName;
    }

    public Font getFont() {
        return new Font(fontName, Font.PLAIN, 16);
    }

    @Override
    public String toString() {
        return fontName;
    }
}