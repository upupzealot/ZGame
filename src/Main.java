import javax.swing.SwingUtilities;

import com.alee.laf.WebLookAndFeel;

import gui.MainFrame;

public class Main {
	public static void main ( String[] args ) {
		SwingUtilities.invokeLater (
			new Runnable () {
				public void run () {
	                //初始化 WebLaF L&F
	                WebLookAndFeel.install ();
	                
	                //初始化并显示主窗口
	                MainFrame.getInstance();
				}
			}
		);
	}
}
