package cn.com.atech.csp.service;

import java.io.IOException;

import cn.com.atech.csp.service.DataChannel;

public interface IMessageSender {
	// 准备发送的内容
	public void prepare() throws IOException;

	// 利用通道发送部分内容，如果所有内容发送完毕，就返回false
	// 如果还有内容未发送，就返回true
	// 如果内容还没有准备好，就抛出IllegalStateException
	public boolean send(DataChannel dc) throws IOException;

	// 当服务器发送内容完毕，就调用此方法，释放内容占用的资源
	public void release() throws IOException;
}
