package gui.main;

import gui.StandaloneWindow;

@SuppressWarnings("serial")
public class MainFrame extends StandaloneWindow{
	
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
	protected MainFrame() {
		super();
		//设置窗口标题
		setTitle("Test");
	}
}