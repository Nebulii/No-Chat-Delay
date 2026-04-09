package nebuli.no_chat_delay;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoChatDelay implements ModInitializer {
	public static final String MOD_ID = "no-chat-delay";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("No Chat Delay initialized! Chat queue bypass active.");
	}
}