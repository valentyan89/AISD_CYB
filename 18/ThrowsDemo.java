public class ThrowsDemo {
    String keyWord;
    public void getDetails(String key) {
        try{
            if(key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            this.keyWord = key;
        }
        catch (NullPointerException e){
            System.err.printf("U give link to the nullPoint of the object, error: %s", e.getMessage());
        }
    }
    public void printDetails(){
        System.out.println(this.toString());
    }
    
    private String getKey(){
        return this.keyWord;
    }

    @Override
    public String toString(){
        return String.format("Ur key-word: %s", this.getKey());
    }
}
