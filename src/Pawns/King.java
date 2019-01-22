package Pawns;

import Players.PlayerColor;

public class King implements IPawn {

    private PlayerColor m_color;

    public King(PlayerColor color)
    {
        m_color = color;
    }

    @Override
    public PawnType GetType() {
        return PawnType.KING;
    }

    @Override
    public PlayerColor GetColor() {
        return m_color;
    }

    @Override
    public void Render() {

    }

}
