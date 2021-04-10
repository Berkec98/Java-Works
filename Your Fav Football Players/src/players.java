import java.util.ArrayList;
public class players {
    private ArrayList<String> football_players = new ArrayList<String>();
    
    public void print_players() {
        
        System.out.println("Your list has " + football_players.size() + " football players.");
        for (int i = 0; i < football_players.size();i++) {
            System.out.println((i+1) + " Players : " + football_players.get(i));  
        }
    }
    public void add_player(String name) {
    	 football_players.add(name);
        System.out.println("We added your fav player!");
    }
      public void delete_player(int priority) {
        
        String name = football_players.get(priority);  
        football_players.remove(priority);
        System.out.println("We deleted " + name); 
    }
    public void update_player(String new_name,int priority) {
        
    	football_players.set(priority,new_name);
        System.out.println("We updated your player!");
    }
    
  
    public void search_player(String player_name) {
        
        int priority = football_players.indexOf(player_name);
        if (priority >= 0) {
            System.out.println("We found! ");
            System.out.println(player_name + " is " + (priority+1) + ".");
            
        }
        else {
            System.out.println("Who is this player? We don't know.");
        }
    }
}
