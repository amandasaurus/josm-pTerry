// License: GPL. For details, see LICENSE file.
package org.technomancy.openstreetmap.pterry;

import org.openstreetmap.josm.actions.UploadAction;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;


public class pTerryPlugin extends Plugin {

    /**
     * Creates the plugin
     */
    public pTerryPlugin(PluginInformation info) {
        super(info);
        UploadAction.registerUploadHook(new pTerryUploadHook());
    }

}
