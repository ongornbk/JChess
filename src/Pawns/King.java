package Pawns;

import Players.PlayerColor;

public class King implements IPawn {

    private PlayerColor m_color;
    private Engine.Graphics.Image m_image;

    public King(PlayerColor color,Engine.Graphics.Image image,Engine.Core.Point2D<Integer> position) {
        m_color = color;
        m_image = new Engine.Graphics.Image(image,position);
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
        Engine.Graphics.Renderer.getInstance().Push(m_image);
    }

}
