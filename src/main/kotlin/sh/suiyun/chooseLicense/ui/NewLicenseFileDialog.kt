package sh.suiyun.chooseLicense.ui

import com.intellij.openapi.ui.DialogWrapper
import javax.swing.JComponent

/**
 * 新建 License 文件对话框
 */
class NewLicenseFileDialog : DialogWrapper(true) {
  init {
    title = "New License File"
    init()
  }

  /**
   * 创建对话框内容
   */
  override fun createCenterPanel(): JComponent? {
    return null
  }

  /**
   * 点击确定按钮时执行的方法
   */
  override fun doOKAction() {
    super.doOKAction()
  }
}