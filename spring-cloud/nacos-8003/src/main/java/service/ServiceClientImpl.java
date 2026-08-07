package service;

import clients.AClient;
import clients.BClilent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClientImpl{
    @Autowired
    private AClient aClient;
    @Autowired
    private BClilent bClilent;

    public String a() {
        return aClient.two();
    }
    public String b() {return bClilent.two();}
}
