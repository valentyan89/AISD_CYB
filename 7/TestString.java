

public class TestString implements WorkString{
    @Override
    public int countChars(String s) {
        return s.length();
    }

    @Override
    public String newString(String s) {
        String newStr = new String();
        for (int i = 1; i < s.length(); i += 2){
            newStr += s.charAt(i);
        }
        return newStr;
    }

    @Override
    public String reverseString(String s) {
        var revStr = new String();
        for (int i = s.length() - 1; i >= 0; i--){
            revStr += s.charAt(i);
        }
        return revStr;
    }

    
}
