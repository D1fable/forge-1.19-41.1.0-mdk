package net.difable.firstmod.item.custom;

import net.difable.firstmod.item.ModItems;
import net.difable.firstmod.item.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class SealItem extends Item {
    public SealItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        BlockPos positionClicked = pContext.getClickedPos();
        Player player = pContext.getPlayer();

        pContext.getLevel().playSound(player, positionClicked, ModSounds.SEAL_AHHH.get(),
                SoundSource.BLOCKS, 1f, 1f);

        return super.useOn(pContext);
    }

    private void outputNumber(Player player){
        player.sendSystemMessage(Component.literal("Your number is: " + 69));
    }
}
