package quest.server.network;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quest.client.model.BeardedGuy;
import quest.protocol.ClientMessage;
import quest.protocol.CommonMessages;
import quest.protocol.GameServerMessage;
import quest.server.dao.InMemoryGameController;

import static quest.client.util.SerializationUtil.serializeGuy;

/**
 * @author Roman K.
 */
public class InputHandler implements Handler
{

	/**
	 * Логгер
	 */
	private static final Logger logger = LoggerFactory.getLogger(InputHandler.class);

	private InMemoryGameController gameController;

	@Override
	public void handle(int clientId, ByteString bodyMessage, Post post)
	{
		ClientMessage.InputOperation op = parseMessage(bodyMessage);

		if(op.getInputCount() > 0)
		{
			//Сейчас обрабатывается только первая кнопка
			BeardedGuy guy = gameController.moveById(clientId, op.getInput(0));

			if( guy != null)
				post.broadcast(serializeGameState(serializeGuy(guy)));
		}

	}

	private Message serializeGameState(CommonMessages.User user)
	{
		return GameServerMessage.GameStateOperation.newBuilder()
		.addUser(user)
		.build();
	}

	private ClientMessage.InputOperation parseMessage(ByteString message)
	{
		try
		{
			return ClientMessage.InputOperation.parseFrom(message);
		}
		catch (InvalidProtocolBufferException e)
		{
			throw new RuntimeException();
		}
	}

	public void setGameController(InMemoryGameController gameController)
	{
		this.gameController = gameController;
	}
}
