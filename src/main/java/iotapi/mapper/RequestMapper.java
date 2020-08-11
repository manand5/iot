package iotapi.mapper;

import java.sql.Time;
import org.springframework.stereotype.Component;
import com.iot.devices.Device;
import iotapi.service.request.DeviceRequest;


/***
*
* @author bharadwaj
* 
* this class is used to map json device request to Device entity class
*
*/

@Component
public class RequestMapper {

    public Device populateDevice(DeviceRequest deviceRequest) {
        Device device = new Device();
        populateName(device, deviceRequest);
        populateTime(device, deviceRequest);
        populateTemp(device, deviceRequest);
        
        return device;

    }

    private void populateName(Device device, DeviceRequest deviceRequest) {
        device.setName("");
    }

    private void populateTime(Device device, DeviceRequest deviceRequest) {
        Time time = null;
        device.setTime(time);
    }

    private void populateTemp(Device device, DeviceRequest deviceRequest) {
        String temparature = null;
        device.setTemparature(temparature);
    }

}
