package Pawns;

import Players.PlayerColor;

public class Queen implements IPawn {

    private PlayerColor m_color;

    public Queen(PlayerColor color)
    {
        m_color = color;
    }

    @Override
    public PawnType GetType() {
        return PawnType.QUEEN;
    }

    @Override
    public PlayerColor GetColor() {
        return m_color;
    }

    @Override
    public void Render() {

    }

}
