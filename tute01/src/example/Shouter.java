package example;

public class Shouter {
    private String message;

    public Shouter(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public void shout() {
        System.out.println(message.toUpperCase());
    }

    public void printMessage() {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "Shouter message = " + message;
    }

    public static void main(String[] args) {
        Shouter shouter = new Shouter("Welcome!");
        shouter.printMessage();
        shouter.setMessage("Bye!");
        shouter.printMessage();
        shouter.shout();
        System.out.println(shouter.toString());
    }
}
