
package org.peimari.gleaflet.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Matti Tahvonen <matti@vaadin.com>
 */
public class LayerCreatedEvent extends JavaScriptObject {
    
    protected LayerCreatedEvent(){}
    
    public native final AbstractPath getLayer() 
    /*-{
        return this.layer;
    }-*/;

}
