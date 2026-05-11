import java.util.List;

public interface IGame
{
    Figure getPiece(Pos pos);
    List<Pos> getPossibleMoves(Pos pos);
    void setPiece(Pos pos);
}
