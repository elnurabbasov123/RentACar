package enums;

import java.time.LocalDateTime;

public enum Exceptions {
    INPUT_NOT_STRING_EXCEPTION(408,"Input doesn't String", LocalDateTime.now()),
    INPUT_NOT_INTEGER_EXCEPTION(409,"Input doesn't Integer",LocalDateTime.now());

    private final int status;
    private final String message;
    private final LocalDateTime localDateTime;

     Exceptions(int status, String message, LocalDateTime localDateTime) {
        this.status = status;
        this.message = message;
        this.localDateTime = localDateTime;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
