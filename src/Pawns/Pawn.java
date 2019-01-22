package Pawns;

import Pawns.IPawn;
import Pawns.PawnType;
import Players.PlayerColor;

public class Pawn implements IPawn {

    private PlayerColor m_color;
    private Engine.Graphics.Image m_image;

    public Pawn(PlayerColor color,Engine.Graphics.Image image) {
        m_color = color;
        m_image = image;
    }

   @Override
    public PawnType GetType()
    {
        return PawnType.PAWN;
    }

    @Override
    public PlayerColor GetColor() {
        return m_color;
    }

    @Override
    public void Render() {
Engine.Graphics.Renderer.getInstance().Push(m_image);
    }
}
