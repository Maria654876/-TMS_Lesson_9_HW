package com.lesson9.tms.task0;

import com.lesson9.tms.task0.exception.FigureException;

/**
 * An interface has been created in which two methods are implemented.
 */

public interface IFigure {
    public void squareFigure() throws FigureException;
    public int perimeterFigure() throws FigureException;
}
