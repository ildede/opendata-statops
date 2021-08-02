package cloud.happydev.aws;

import java.util.Objects;

public class InputObject {

    private String message;

    public InputObject() {
    }

    public InputObject(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputObject that = (InputObject) o;
        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
