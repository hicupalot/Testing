package Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class calculator implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player || sender instanceof ConsoleCommandSender) {
            if (args.length < 3) {
                sender.sendMessage("You need to supply two numbers and an operation");
                return false;
            }
            if (!args[2].equals("+") || !args[2].equals("/") || !args[2].equals("*") || !args[2].equals("-")){
                sender.sendMessage(ChatColor.RED+"Invalid Operator!");
                return false;
            }
            if (args.length>3){
                sender.sendMessage(ChatColor.RED+"You can only divide/multiply/add/minus 2 numbers from eachother at the moment!");
                return false;
            }
            String number1 = args[1];
            String operator = args[2];
            String number2 = args[3];
            long a = Integer.parseInt(number1);
            long b = Integer.parseInt(number2);
            if (args[2].equals("+")){
            long sum = a+b;
            sender.sendMessage(ChatColor.GREEN+number1+" + "+number2+" = "+sum);
            return false;
            }
            if (args[2].equals("*")){
                long multiple=a*b;
                sender.sendMessage(ChatColor.GREEN+number1+" * "+number2+" = "+multiple);
                return false;
            }
            if (args[2].equals("/")){
                long divide=a/b;
                sender.sendMessage(ChatColor.GREEN+number1+" / "+number2+" = "+divide);
                return false;
            }
            long minus=a-b;
            sender.sendMessage(ChatColor.GREEN+number1+" - "+number2+" = "+minus);
            return false;
        }
    return false;
    }
}
