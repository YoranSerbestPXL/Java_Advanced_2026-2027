package be.pxl.festival.exception;



public class ActNotFoundException extends RuntimeException {

    public ActNotFoundException(long id) {
        super("Act met id " + id + " bestaat niet");
    }
}
