package entity;

public abstract class Piece {
    protected PieceType type;
    protected Color color;
    protected char[][] position;

    public abstract void move(char[][] fromPosition, char[][] toPosition);
}

