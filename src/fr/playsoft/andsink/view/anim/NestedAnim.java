package fr.playsoft.andsink.view.anim;

import fr.playsoft.andsink.BaseActivity;
import fr.playsoft.andsink.R;


public class NestedAnim extends BaseActivity {

	@Override
	public void setupMainLayoutId() {
		ACTIVITY_LAYOUT = R.layout.view_anim_07_nested;
	}

	@Override
	public void setupAboutContent() {
		ACTIVITY_INFO = "The first View Animation: Grid Face<br />";

		ACTIVITY_USING_RES = 
			"<b>Java file:</b><br />" +
	 		"- GridFace.java (main)<br />" +
	 		"- BaseActivity.java (parent)<br />" +
	 		"- Constants.java<br />" +
	 		"<b>Layout</b><br />" +
	 		"- anim_01_gridface.xml (main)<br />" +
	 		"<b>Drawable</b><br />" +
	 		"- All images used here is gotten from Android system and defined" +
	 		" in APP_ICON_RES_GRIDVIEW of Constants.java<br />" +
	 		"<b>Anim</b><br />" +
	 		"- anim_gridfade.xml (main)<br />" +
	 		"- anim_fade.xml <br />" +
	 		"<b>Android Manifest</b><br />" ;
		
	}

	@Override
	public void setupOthersInMainLayout() {
		
	}

	@Override
	public void setupOthersInTitleBar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setupTitleBarNameStr() {
//		 ACTIVITY_NAME = "KS Empty"; //Activity name 
		
	}
	
}