import java.util.Scanner;

public class fotest {
    private static players players = new players();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void show_process() {
        
        System.out.println(" 0- What can I do?");
        System.out.println(" 1- Show My Players");
        System.out.println(" 2- Add Player");
        System.out.println(" 3- Delete Player");
        System.out.println(" 4- Update Player");
        System.out.println(" 5- Search Player");
        System.out.println(" 6- Exit Application");
        
    }
    public static void show_my_players() {
        players.print_players();
        
    }
    public static void add_player(){
        
        System.out.println("Who do you want to add?");
        String name = scanner.nextLine();
        players.add_player(name);
        
    }
    
public static void delete_player() {
        
        System.out.println("Which player will you delete?");
        int name = scanner.nextInt();
        players.delete_player(name);
  
    }
    public static void update_player() {
        
        System.out.println("Which priority player will you update?");
        int priority = scanner.nextInt();
        scanner.nextLine();
        String new_name = scanner.nextLine();
        players.update_player(new_name, priority - 1);
        
    }
    
    public static void search_player() {
        
        System.out.println("Who do you want to search?");
        String name = scanner.nextLine();
        players.search_player(name);

    }
    public static void main(String[] args) {
        
        System.out.println(" Welcome! Your players missed you.");
        show_process();
        boolean exit = false;
        int process;
        
        while(!exit) {
            System.out.println("Choose a process:");
            process = scanner.nextInt();
            scanner.nextLine();
            
            switch(process) {
                case 0:
                    show_process();
                    break;
                case 1:
                    show_my_players();
                    break;
                case 2:
                    add_player();
                    break;
                case 3:
                    delete_player();
                    break;
                case 4:
                    update_player();
                    break;
                case 5:
                    search_player();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Good bye!");
                    break;

            }} }  }
