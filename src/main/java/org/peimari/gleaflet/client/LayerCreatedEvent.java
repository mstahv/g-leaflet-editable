
package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 */
public class LayerCreatedEvent extends JavaScriptObject {
    
    protected LayerCreatedEvent(){}
    
    public native final AbstractPath getLayer() 
    /*-{
        return this.layer;
    }-*/;

}
