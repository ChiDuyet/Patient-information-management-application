package cuoi_ky;

import java.io.*;
import java.util.List;

public interface Serializable {
    public static void serialize(List<KhamBenh> danhSachBenhNhanBanDau, String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(danhSachBenhNhanBanDau);
            oos.close();
            fos.close();
            System.out.println("Serialized data is saved in " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<KhamBenh> deserialize(String filePath) {
        List<KhamBenh> danhSachBenhNhanBanDau = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            danhSachBenhNhanBanDau = (List<KhamBenh>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return danhSachBenhNhanBanDau;
    }
}
