package Pawns;

import Players.PlayerColor;

public class Bishop implements IPawn {

private PlayerColor m_color;

    public Bishop(PlayerColor color)
    {
m_color = color;
    }

    @Override
    public PawnType GetType() {
        return PawnType.BISHOP;
    }

    @Override
    public PlayerColor GetColor() {
        return m_color;
    }

    @Override
    public void Render() {

    }

}
