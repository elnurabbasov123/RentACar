package exeption;

import enums.Exceptions;

import java.time.LocalDateTime;

public class InputNotStringException extends RuntimeException{
    int status;
    String message;
    LocalDateTime localDateTime;

    public InputNotStringException(Exceptions exception){
        super(exception.getMessage());
        this.status=exception.getStatus();
        this.message=exception.getMessage();
        this.localDateTime=exception.getLocalDateTime();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
