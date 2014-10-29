package org.peimari.gleaflet.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource.DoNotEmbed;
import com.google.gwt.resources.client.TextResource;

public interface LeafletEditableClientBundle extends ClientBundle {
 
    @Source("Leaflet.Editable.js")
    @DoNotEmbed
    TextResource editableScript();

}
