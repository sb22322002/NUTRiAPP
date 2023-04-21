public class CommandListener{
    public CommandListener(String command){
        switch(command.toLowerCase()){
            case "help":
                Help help = new Help();
                break;
            case "addingredient":
                System.out.println(command);
                break;
            case "addrecipe":
                System.out.println(command);
                break;
            case "addmeal":
                System.out.println(command);
                break;
            case "preparemeal":
                System.out.println(command);
                break;
            case "trackworkout":
                System.out.println(command);
                break;
            case "createshoppinglist":
                System.out.println(command);
                break;
            case "viewhistory":
                System.out.println(command);
                break;
            case "quit":
                System.exit(0);
                break;
            default:
                System.out.println("Error - Unknown command. Type \"help\" for a list of commands.");
                break;
        }
    }
}