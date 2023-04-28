import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String texto = scanner.nextLine();
            System.out.println("Você digitou: " + texto);
            if (texto.compareTo("exit") == 0){
                break;
            }
        }
        scanner.close();
    }
}
