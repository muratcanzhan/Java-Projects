public class AgeCheckException extends Exception{
    public AgeCheckException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "bu AgeCheck sınıfına ait bir exceptiondur !!";
    }
}
