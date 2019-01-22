package Pawns;

import Players.PlayerColor;

public class Rook implements IPawn {

    private PlayerColor m_color;

    public Rook(PlayerColor color)
    {
        m_color = color;
    }

    @Override
    public PawnType GetType() {
        return PawnType.ROOK;
    }

    @Override
    public PlayerColor GetColor() {
        return m_color;
    }

    @Override
    public void Render() {

    }

}
