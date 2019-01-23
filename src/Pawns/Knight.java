package Pawns;

import Pawns.IPawn;
import Pawns.PawnType;
import Players.PlayerColor;

public class Knight implements IPawn {

    private PlayerColor m_color;
    private Engine.Graphics.Image m_image;

    public Knight(PlayerColor color,Engine.Graphics.Image image,Engine.Core.Point2D<Integer> position) {
        m_color = color;
        m_image = new Engine.Graphics.Image(image,position);
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
Engine.Graphics.Renderer.getInstance().Push(m_image);
    }

}
