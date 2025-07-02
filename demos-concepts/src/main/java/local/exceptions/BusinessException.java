package local.exceptions;

public class BusinessException extends Exception{

    ErrorCodes code;

    private static String generateMessage(ErrorCodes codes, String message) {
        return codes + " - " + message;
    }
    
    public BusinessException(ErrorCodes codes, String message) {
        super(generateMessage(codes, message));
    }
    
    public BusinessException(ErrorCodes codes, String message, Throwable cause) {
        super(generateMessage(codes, message), cause);
        this.code = codes;
    }
    
} 
