package service;

import clients.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClientImpl{
    @Autowired
    private ServiceClient serviceClient;

    public String two() {
        return serviceClient.two();
    }
}
