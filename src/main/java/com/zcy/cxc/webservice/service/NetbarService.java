package com.zcy.cxc.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by sue on 2019/10/12.
 */
@WebService(name = "NetbarService",targetNamespace = "http://webservice.cxc.zcy.com")
public interface NetbarService {

    @WebMethod
    String sayHello(@WebParam(name = "userName") String name);
}
