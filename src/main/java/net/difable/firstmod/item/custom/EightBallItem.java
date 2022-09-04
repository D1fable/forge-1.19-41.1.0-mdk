package net.difable.firstmod.item.custom;

import net.difable.firstmod.sound.ModSounds;
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

public class EightBallItem extends Item {
    public EightBallItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(hand == InteractionHand.MAIN_HAND){
            //player.sendSystemMessage(Component.literal("Your number is: " + 69));

            player.playSound(ModSounds.EIGHT_BALL_SOUND.get(), 6f, 1f);

            player.getCooldowns().addCooldown(this, 20);
        }

        return super.use(level, player, hand);
    }

    /*
    //Working
    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide()){
            pContext.getLevel().playSound(pContext.getPlayer(), pContext.getClickedPos(), ModSounds.EIGHT_BALL_SOUND.get(),
                    SoundSource.BLOCKS, 6f, 1f);
        }
        return super.useOn(pContext);
    }
     */
}
