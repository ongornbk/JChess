
import Engine.Graphics.Image;
import Engine.ResourceImage;
import Engine.ResourceManager;
import Pawns.*;
import Players.PlayerColor;

public class ChessBoard {

private IPawn[][] m_board;

public ChessBoard()
{

    ResourceManager m_resources = Engine.ResourceManager.getInstance();

    Engine.Graphics.Image pawn_black = new Engine.Graphics.Image(((ResourceImage)m_resources.GetResource("pawn_black.png")).Load());



    m_board = new IPawn[8][8];

    m_board[0][0] = new Rook(PlayerColor.WHITE);
    m_board[1][0] = new Knight(PlayerColor.WHITE);
    m_board[2][0] = new Bishop(PlayerColor.WHITE);
    m_board[3][0] = new Queen(PlayerColor.WHITE);
    m_board[4][0] = new King(PlayerColor.WHITE);
    m_board[5][0] = new Bishop(PlayerColor.WHITE);
    m_board[6][0] = new Knight(PlayerColor.WHITE);
    m_board[7][0] = new Rook(PlayerColor.WHITE);

    m_board[0][7] = new Rook(PlayerColor.BLACK);
    m_board[1][7] = new Knight(PlayerColor.BLACK);
    m_board[2][7] = new Bishop(PlayerColor.BLACK);
    m_board[3][7] = new Queen(PlayerColor.BLACK);
    m_board[4][7] = new King(PlayerColor.BLACK);
    m_board[5][7] = new Bishop(PlayerColor.BLACK);
    m_board[6][7] = new Knight(PlayerColor.BLACK);
    m_board[7][7] = new Rook(PlayerColor.BLACK);

    for(int i = 0;i < 8;i++)
    {
        m_board[i][1] = new Pawn(PlayerColor.WHITE,pawn_black);
        m_board[i][2] = new Empty();
        m_board[i][3] = new Empty();
        m_board[i][4] = new Empty();
        m_board[i][5] = new Empty();
        m_board[i][6] = new Pawn(PlayerColor.BLACK,pawn_black);
    }
}

public void Render()
{
    for(int x = 0;x<8;x++)
    {
        for(int y = 0;y<8;y++)
        {
m_board[x][y].Render();
        }
    }
}

}
