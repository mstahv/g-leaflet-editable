package org.peimari.gleaflet.client;

public class EditableMap extends Map implements ILayer {

	protected EditableMap() {
	}

	public native final void stopDrawing() 
	/*-{
		this.editTools.stopDrawing();
	}-*/;
	
	public native final void startMarker() 
	/*-{
		this.editTools.startMarker();
	}-*/;
	
	public native final void startPolyline() 
	/*-{
		this.editTools.startPolyline();
	}-*/;
	
	public native final void startPolygon() 
	/*-{
		this.editTools.startPolygon();
	}-*/;
    
    public native final void addCreatedListener(FeatureCreatedListener listener) 
	/*-{
		this.on("editable:drawing:commit", $entry(function(e) {
			listener.@org.peimari.gleaflet.client.FeatureCreatedListener::onCreated(Lorg/peimari/gleaflet/client/LayerCreatedEvent;)(e);
		}));
	}-*/;
    
    public native final void removeCreatedListeners() 
	/*-{
		this.off("editable:drawing:commit");
	}-*/;

    public native final LayerGroup getNewFeatureLayer() 
    /*-{
        return this.editTools.featuresLayer;
    }-*/;

}
