package Pawns;

import Players.PlayerColor;

public class Empty implements IPawn {

    @Override
    public PawnType GetType() {
        return PawnType.EMPTY;
    }

    @Override
    public PlayerColor GetColor() {
        return PlayerColor.EMPTY;
    }

    @Override
    public void Render() {

    }

}
