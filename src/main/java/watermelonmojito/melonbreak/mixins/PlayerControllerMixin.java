package watermelonmojito.melonbreak.mixins;

import net.minecraft.client.player.controller.PlayerController;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = PlayerController.class, remap = false)
public class PlayerControllerMixin {
	@Shadow
	protected int blockHitDelay;

	@Inject(method = "continueDestroyBlock", at = @At("HEAD"))
	private void BlockHitDelay(CallbackInfo callbackInfo) {
		blockHitDelay = 0;
	}
}
