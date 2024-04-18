package bluetoothnoisegenerator;

import javax.bluetooth.*;
import java.io.IOException;

public class BluetoothNoiseGenerator {

    public static void main(String[] args) {
    try {
        raiseNoiseFloor();
    } catch (BluetoothStateException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}


    public static void raiseNoiseFloor() throws BluetoothStateException, IOException {
        LocalDevice localDevice = LocalDevice.getLocalDevice();
        DiscoveryAgent agent = localDevice.getDiscoveryAgent();

        agent.startInquiry(DiscoveryAgent.GIAC, new DiscoveryListener() {
            @Override
            public void deviceDiscovered(RemoteDevice remoteDevice, DeviceClass deviceClass) {
                // Simulate noise by discovering nearby devices
                System.out.println("Noise packet sent to: " + remoteDevice.getBluetoothAddress());
            }

            @Override
            public void servicesDiscovered(int i, ServiceRecord[] serviceRecords) {
            }

            @Override
            public void serviceSearchCompleted(int i, int i1) {
            }

            @Override
            public void inquiryCompleted(int i) {
            }
        });
    }
}
