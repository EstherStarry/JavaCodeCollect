package DesignPattern.Proxy;

/**
 * 代理客户端
 * 
 * @author Hongyue Wang
 *
 */
public class ProxyClient {
    public static void main(String[] args) {
	Proxy proxy = new Proxy();
	proxy.request();
    }
}
