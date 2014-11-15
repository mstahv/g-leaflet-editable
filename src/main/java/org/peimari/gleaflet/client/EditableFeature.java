package org.peimari.gleaflet.client;

public class EditableFeature extends AbstractPath implements ILayer {

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
        this.editor.newHole();
    }-*/;

}
