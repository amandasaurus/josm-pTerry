// License: GPL. For details, see LICENSE file.
package org.technomancy.openstreetmap.pterry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.openstreetmap.josm.actions.upload.UploadHook;
import org.openstreetmap.josm.data.APIDataSet;
import org.openstreetmap.josm.data.osm.INode;
import org.openstreetmap.josm.data.osm.IPrimitive;
import org.openstreetmap.josm.data.osm.IRelation;
import org.openstreetmap.josm.data.osm.IWay;
import org.openstreetmap.josm.data.osm.OsmPrimitive;

public class pTerryUploadHook implements UploadHook {
    @Override
    public modifyChangesetTags(Map<String, String> tags) {
        tags.put("clacks_overhead", "GNU Terry Pratchett");
    }
}
