package iotapi.service.implementations;

import org.springframework.stereotype.Component;
import com.iot.devices.Device;
import iotapi.dao.DeviceDAO;
import iotapi.mapper.RequestMapper;
import iotapi.service.request.DeviceRequest;
import iotapi.services.IDevice;



@Component
public class DeviceImplementation implements IDevice {

    // @Inject
    RequestMapper requestMapper;

    // @Inject
    DeviceDAO deviceDAO;

    @Override
    public void post(DeviceRequest deviceRequest) throws Exception {
        Device device = requestMapper.populateDevice(deviceRequest);

        try {
            if (device != null) {
                deviceDAO.saveDevice(device);
            }
        }

        catch (Exception e) {
            // log exception using log4j
        }
    }

    @Override
    public Device get(String id) throws Exception {

        try {
            if (id != null && !id.isEmpty()) {
                return deviceDAO.getDeviceById("id");

            }

        } catch (Exception e) {
            // log exception using log4j
        }

        return null;
    }

    @Override
    public void filter(DeviceRequest devicerequest) throws Exception {

        try {
            Device device = requestMapper.populateDevice(devicerequest);
            if (device != null) {
                deviceDAO.applyFilter(device);
            }
        } catch (Exception e) {
            // log exception using log4j

        }

    }

}
