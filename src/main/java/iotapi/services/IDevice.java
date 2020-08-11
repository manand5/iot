package iotapi.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.stereotype.Component;
import com.iot.devices.Device;
import iotapi.service.request.DeviceRequest;

@Endpoint
@Component
public interface IDevice {

    
    @Consumes
    @Produces
    public void post(DeviceRequest devicerequest) throws Exception;

    @Produces
    public Device get(String id) throws Exception;

   
    
    @Consumes
    @Produces
    public void filter(DeviceRequest devicerequest) throws Exception;

}
