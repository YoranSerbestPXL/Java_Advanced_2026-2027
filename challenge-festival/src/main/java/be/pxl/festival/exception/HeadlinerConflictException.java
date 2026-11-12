package be.pxl.festival.exception;


public class HeadlinerConflictException extends RuntimeException {

    public HeadlinerConflictException() {
        super("Er bestaat al een headliner op deze dag en dit podium");
    }
}