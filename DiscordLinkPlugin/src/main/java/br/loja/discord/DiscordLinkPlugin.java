package br.loja.discord;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordLinkPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("DiscordLink Plugin ativado com sucesso!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Somente jogadores podem usar este comando.");
            return true;
        }

        if (command.getName().equalsIgnoreCase("vincular")) {
            if (args.length != 1) {
                sender.sendMessage("Use: /vincular <codigo>");
                return true;
            }

            String code = args[0];
            sender.sendMessage("Código recebido: " + code);
            sender.sendMessage("Integração Supabase será feita aqui.");
            return true;
        }
        return false;
    }
}
