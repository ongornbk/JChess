package Pawns;

import Pawns.IPawn;
import Pawns.PawnType;
import Players.PlayerColor;

public class Knight implements IPawn {

    private PlayerColor m_color;

    public Knight(PlayerColor color)
    {
        m_color = color;
    }

    @Override
    public PawnType GetType() {
        return PawnType.KNIGHT;
    }

    @Override
    public PlayerColor GetColor() {
        return m_color;
    }

    @Override
    public void Render() {

    }

}
