/*
 * @(#) Context.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package kanbanflow.ui.entities;

/**
 * Class let implement the context for depend injections.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public class Context {
    private BoardEntities boardEntities;

    /**
     * Constructor class.
     */
    public Context() {
        boardEntities = new BoardEntities();
    }

    /**
     * Metod return the class board.
     * @return board clas.
     */
    public BoardEntities getBoardEntities() {
        return boardEntities;
    }
}
