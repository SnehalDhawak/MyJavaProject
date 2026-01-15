package ExceptionProgram;

    public class CustomeException extends Exception {

        public CustomeException() {
            super();
        }
        public CustomeException(String message) {
            super(message);
        }
        public CustomeException(String message, Throwable cause) {
            super(message, cause);
        }
        public void registerUser(String name, int age) throws CustomeException {
            if (age < 18) {
                throw new CustomeException("Age must be at least 18");
            }
        }
        public static void main(String args[]){
            Exception e=  new CustomeException("rtert");
            e.getMessage();

        }
    }
