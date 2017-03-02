package hessian.test.client;

import gacl.hessian.model.User;
import gacl.hessian.service.IService;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;

public class HessianClient {
	public static void main(String[] args) throws MalformedURLException {
		String url = "http://192.168.5.13:8080/HessianTest/ServiceServlet";
		HessianProxyFactory factory = new HessianProxyFactory();
		IService service = (IService) factory.create(IService.class, url);
		User user = service.getUser();
		System.out.println(user.getName());
	}
}
