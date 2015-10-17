package org.peimari.gleaflet.client;

public class EditableFeature extends AbstractPath {

	protected EditableFeature() {
	}

	public native final void enableEdit() 
	/*-{
		this.enableEdit();
	}-*/;

	public native final void disableEdit() 
	/*-{
		this.disableEdit();
	}-*/;
    
    public native final void toggleEdit()
    /*-{
        this.toggleEdit();
    }-*/;  
	
	public native final void addEditListener(FeatureEditedListener listener) 
	/*-{
		this.on("editable:editing", $entry(function(e) {
			listener.@org.peimari.gleaflet.client.FeatureEditedListener::onEdit()();
		}));
	}-*/;
    
    public native final void removeEditListener() 
    /*-{
		this.off("editable:editing");
	}-*/;

	public final void setEnabled(boolean enabled) {
		if(isEnabled() != enabled) {
			if(enabled) {
				enableEdit();
			} else {
				disableEdit();
			}
		}
	}

	public final native boolean isEnabled() 
	/*-{
		return this.editEnabled();
	}-*/;

    public final native void newHole() 
    /*-{
            var self = this;
            var startHole = function(e) {
                self.editor.newHole(e.latlng);
                self.off("click", startHole);
            }
            this.on("click", startHole);
    }-*/;

}
