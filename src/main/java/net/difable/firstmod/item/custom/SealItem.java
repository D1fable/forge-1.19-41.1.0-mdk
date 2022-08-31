package net.difable.firstmod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SealItem extends Item {
    public SealItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide && hand == InteractionHand.MAIN_HAND){
            //output a random number (sound)
            //set a cool down
            outputNumber(player);
            player.getCooldowns().addCooldown(this, 20);
        }
        return super.use(level, player, hand);
    }

    private void outputNumber(Player player){
        player.sendSystemMessage(Component.literal("Your number is: " + 69));
    }
}