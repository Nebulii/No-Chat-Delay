package nebuli.no_chat_delay.mixin;

import net.minecraft.client.network.message.MessageHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MessageHandler.class)
public abstract class MessageHandlerMixin {

    @Shadow
    public abstract void processDelayedMessages();

    @Inject(method = "processChatMessageInternal", at = @At("TAIL"))
    private void forceInstantPlayerChat(CallbackInfoReturnable<Boolean> cir) {
        this.processDelayedMessages();
    }

    @Inject(method = "process", at = @At("TAIL"))
    private void forceInstantSystemChat(CallbackInfo ci) {
        this.processDelayedMessages();
    }
}