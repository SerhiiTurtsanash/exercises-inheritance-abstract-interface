package Interfaces_5;

public abstract class GeometricFigure {
    protected int idFigure;

    public GeometricFigure(int idFigure) {
        this.idFigure = idFigure;
    }

    public int getIdFigure() {
        return idFigure;
    }
}