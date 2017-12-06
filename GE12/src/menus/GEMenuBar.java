package menus;

import javax.swing.JMenuBar;

import constants.GEConstants;
import frames.GEDrawingPanel;

public class GEMenuBar extends JMenuBar {
	private GEMenuFile fileMenu;
	private GEMenuEdit editMenu;
	private GEMenuColor colorMenu;

	public GEMenuBar() {
		fileMenu = new GEMenuFile(GEConstants.TITLE_FILEMENU);
		this.add(fileMenu);
		editMenu = new GEMenuEdit(GEConstants.TITLE_EDITMENU);
		this.add(editMenu);
		colorMenu = new GEMenuColor(GEConstants.TITLE_COLORMENU);
		this.add(colorMenu);

	}
	
	public void init(GEDrawingPanel drawingPanel) {
		colorMenu.init(drawingPanel);
	}

}
