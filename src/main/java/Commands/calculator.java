package Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class calculator implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player || sender instanceof ConsoleCommandSender) {
            if (args.length<3){
                sender.sendMessage("You need to supply at least two numbers and an operation");
                return false;
            }
            String number1= args[1];
            String operator = args[2];
            String number2=args[3];
            String operator2 = args[3];
            String number3=args[4];
            String operator3 = args[5];
            String number4=args[6];
            String operator4 = args[7];
            String number5=args[8];
            String operator6 = args[9];
            String number7=args[10];
            String operator7 = args[11];
        }
}
