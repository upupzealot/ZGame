package gui;

import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	
	private static MainFrame instance;
	/**
	 * 获得主窗口单例实例
	 * @return 主窗口单例
	 */
	public static MainFrame getInstance() {
		if(instance == null) {
			instance = new MainFrame();
		}
		return instance;
	}
	
	/**
	 * 主窗口的构造方法
	 */
	private MainFrame() {
		//设置窗口标题
		setTitle("Test");
		//EXIT_ON_CLOSE
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//默认窗口尺寸
		setSize(400, 600);
		setMinimumSize(getSize());
		
		//居中显示窗口
		pack();
		MakeCenter(this);
		setVisible(true);
		
		//可以获取焦点
		setFocusable(true);
	}
	
	/**
	 * 使某个窗口在屏幕可视区域内居中
	 * @param window 要居中的窗口
	 */
	public static void MakeCenter(Window window) {
		Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(window.getGraphicsConfiguration());
		Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		window.setLocation(
			(screenSize.width - screenInsets.left - screenInsets.right - window.getWidth()) / 2,
			(screenSize.height - screenInsets.top - screenInsets.bottom - window.getHeight()) / 2
		);
	}
}