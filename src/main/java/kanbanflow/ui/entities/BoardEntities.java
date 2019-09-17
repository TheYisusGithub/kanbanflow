/*
 * @(#) BoardEntities.java Copyright (c) 2019 Jala Foundation.
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

import kanbanflow.ui.pages.Board;
import kanbanflow.ui.pages.PageTransporter;

/**
 * Class le save some values.
 *
 * @author Jesus Menacho
 * @version 1.0
 */
public class BoardEntities {
    private PageTransporter pageTransporter = new PageTransporter();
    private Board board = new Board();

    /**
     * Return the page transporte..
     * @return pageTransporte.
     */
    public PageTransporter getPageTransporter() {
        return pageTransporter;
    }

    /**
     * Return the board class type.
     * @return board is a class.
     */
    public Board getBoard() {
        return board;
    }
}
