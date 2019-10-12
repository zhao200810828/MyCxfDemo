package com.zcy.cxc.webservice.service;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * Created by sue on 2019/10/12.
 */
@WebService(serviceName = "NetbarService",targetNamespace = "http://webservice.cxc.zcy.com",endpointInterface = "com.zcy.cxc.webservice.service.NetbarService")
@Component
public class NetbarServiceImpl implements NetbarService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
