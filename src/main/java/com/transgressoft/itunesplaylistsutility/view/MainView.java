/*
 * This file is part of ItunesPlaylistsUtility software.
 *
 * ItunesPlaylistsUtility software is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * at your option) any later version.
 *
 * ItunesPlaylistsUtility code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ItunesPlaylistsUtility. If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2018 Octavio Calleya
 */

package com.transgressoft.itunesplaylistsutility.view;

import com.worldsworstsoftware.itunes.ItunesPlaylist;
import de.felixroske.jfxsupport.*;
import javafx.application.Platform;

import java.util.List;

/**
 * @author Octavio Calleya
 */
@FXMLView(value = "/view/MainView.fxml", title = "Itunes Playlists Copier", stageStyle = "DECORATED")
public class MainView extends AbstractFxmlView {

    public void updateProgress(double progress) {
        Platform.runLater(() -> ((MainViewController) getPresenter()).updateProgress(progress));
    }

    public void log(String message) {
        ((MainViewController) getPresenter()).log(message);
    }

    public void setItunesPlaylists(List<ItunesPlaylist> itunesPlaylists) {
        Platform.runLater(() -> ((MainViewController) getPresenter()).setItunesPlaylists(itunesPlaylists));
    }
}
