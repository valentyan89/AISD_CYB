public class TINException extends RuntimeException{
    public TINException(String errMessage, Throwable err){
        super(errMessage, err);
    }
    public TINException(String errMessage){
        super(errMessage);
    }
}
