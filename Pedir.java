package javaapplication13;

import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortList;

public class Pedir {

    private DualDataReceiver dataReceiver;

    public Pedir(DualDataReceiver dataReceiver) {
        this.dataReceiver = dataReceiver;
    }

    class LecturaSerial implements SerialPortEventListener {

        SerialPort sp;

        public LecturaSerial(SerialPort sp) {
            this.sp = sp;
        }

        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                String msg1 = readUntilDelimiter(sp, 'C');
                String msg2 = readUntilDelimiter(sp, '%');

                System.out.println(msg1);
                System.out.println(msg2);

                // Envía los datos a través de la interfaz
                dataReceiver.receiveData(msg1, msg2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private String readUntilDelimiter(SerialPort sp, char delimiter) throws Exception {
            StringBuilder message = new StringBuilder();
            while (true) {
                char nextChar = (char) sp.readBytes(1)[0];
                if (nextChar == delimiter) {
                    break;
                }
                message.append(nextChar);
            }
            return message.toString();
        }
    }

    public void pedir() {
        String puertos[] = SerialPortList.getPortNames();

        SerialPort sp = new SerialPort("COM4");
        try {
            sp.openPort();
            sp.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
            Thread.sleep(2000);
            sp.addEventListener(new LecturaSerial(sp), SerialPort.MASK_RXCHAR);
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
