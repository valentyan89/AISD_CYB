public class ThrowsDemoMilana {
    public void printMessage(String key) {
        try{
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (NullPointerException e){
            System.err.printf("U give link to the nullPoint of the object, error: %s", e.getMessage());
        }
    }
    private String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key; 
    }
}
