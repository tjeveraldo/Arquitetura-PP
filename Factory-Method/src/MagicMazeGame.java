
public class MagicMazeGame extends MazeGame {

	@Override
	protected Room makeRoom() {
		// TODO Auto-generated method stub
		return new MagicRoom();
	}

}
