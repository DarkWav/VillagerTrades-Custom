package io.github.flemmli97.simplequests.forge;

import io.github.flemmli97.villagertrades.LoaderHandler;
import io.github.flemmli97.villagertrades.VillagerTrades;
import java.nio.file.Path;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.fml.loading.FMLPaths;

public class LoaderImpl implements LoaderHandler {

    @Override
    public Path getConfigPath()
    {
        return FMLPaths.CONFIGDIR.get();
    }

    @Override
    public boolean hasPerm(CommandSourceStack src, String perm, boolean adminCmd)
    {
        return src.hasPermission(!adminCmd ? 0 : 2);
    }

    @Override
    public boolean hasPerm(ServerPlayer player, String perm, boolean adminCmd)
    {
        return player.hasPermissions(!adminCmd ? 0 : 2);
    }
}
