package iotapi.dao;

import org.springframework.stereotype.Component;
import com.iot.devices.Device;
import com.iot.devicesrepository.DeviceRepository;

/***
*
* @author bharadwaj
* 
* this class is used to make dao calls
*
*/



@Component
public class DeviceDAO {
    
  //@Inject
    DeviceRepository deviceRepository;

    public void saveDevice(Device device) {
        
       deviceRepository.save(device);

    }

    public void updateDevice(Device device) {
        deviceRepository.save(device);
    }

    public Device getDeviceById(String id) {
        
        return deviceRepository.get();
    }

    public void applyFilter(Device device) {
    }

}
