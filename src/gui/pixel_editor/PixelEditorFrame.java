package gui.pixel_editor;

import java.awt.BorderLayout;

import gui.StandaloneWindow;

@SuppressWarnings("serial")
public class PixelEditorFrame extends StandaloneWindow{
	
	private static PixelEditorFrame instance;
	/**
	 * 获得主窗口单例实例
	 * @return 主窗口单例
	 */
	public static PixelEditorFrame getInstance() {
		if(instance == null) {
			instance = new PixelEditorFrame();
		}
		return instance;
	}
	
	/**
	 * 主窗口的构造方法
	 */
	protected PixelEditorFrame() {
		super();
		//设置窗口标题
		setTitle("像素编辑器");
		
		add(new PixelCanvas(), BorderLayout.CENTER);
	}
}
