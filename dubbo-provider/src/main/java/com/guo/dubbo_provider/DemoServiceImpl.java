package com.guo.dubbo_provider;

import com.guo.dubbo_api.DemoService;

public class DemoServiceImpl  implements DemoService{

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Service sayHello"+name;
	}

}
