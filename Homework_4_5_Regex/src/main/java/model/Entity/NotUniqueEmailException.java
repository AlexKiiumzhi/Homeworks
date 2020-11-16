package model.Entity;

public class NotUniqueEmailException extends Exception {
        private  String Email;

        public NotUniqueEmailException (String Email){
            super("Email is already taken! Try again");
            this.Email = Email;
        }

        public String getEmail() { return Email; }
}
