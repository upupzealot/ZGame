import java.awt.Font;
import java.io.Console;
import java.util.Enumeration;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.alee.laf.WebLookAndFeel;

import gui.pixel_editor.PixelEditorFrame;

public class Main {
	public static void main ( String[] args ) {
		SwingUtilities.invokeLater (
			new Runnable () {
				public void run () {
	                //初始化 WebLaF L&F
	                WebLookAndFeel.install ();
	                WebLookAndFeel.setDecorateFrames (true);
	                
	                //设置全局的字体 
	                Enumeration<Object> keys = UIManager.getDefaults().keys();  
	                Object key = null;  
	                Object value = null;  
	                while (keys.hasMoreElements()) {  
	                    key = keys.nextElement();  
	                    value = UIManager.get(key);   
	                      
	                    if(value instanceof Font) {
	                        UIManager.put(key, new Font("微软雅黑", ((Font) value).getStyle(), ((Font) value).getSize()));  
	                    }  
	                }
	                
	                //初始化并显示主窗口
	                //MainFrame.getInstance();
	                //初始化并显示像素编辑器窗口
	                PixelEditorFrame.getInstance ();
				}
			}
		);
	}
}
